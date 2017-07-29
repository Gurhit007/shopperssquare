
package AdminProduct;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import products.Products;
import products.ProductsDAOImpl;

import com.cloudinary.*;
import com.cloudinary.utils.ObjectUtils;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Map;

@MultipartConfig(fileSizeThreshold = 1024*1024*2, maxFileSize = 1024*1024*10,maxRequestSize = 1024*1024*50)
public class addProduct extends HttpServlet {

    public static final String SAVE_DIR = "upload_files";
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        String params [] = req.getParameterValues("products");
        
        for( String s : params )
            System.out.println( s );
        
        
        String appPath = req.getServletContext().getRealPath("");
        
        System.out.println( appPath );
        
        String savePath = appPath + File.separator + SAVE_DIR;
        
        File fileSaveDir = new File(savePath);
        
        if( !fileSaveDir.exists() )
        {
            fileSaveDir.mkdir();
        }
        
        System.out.println( savePath + File.separator + "sample.jpg" );
        
        File f = new File( savePath + File.separator + "sample.jpg" );
      
        FileOutputStream fos = new FileOutputStream(f);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        
        Part part = req.getPart("abc");
        {
            
            String filename = "sample.jpg";
            
            byte b[] = new byte[part.getInputStream().available()];
            
            part.getInputStream().read(b);
            
            bos.write(b);
            
        }
        bos.close();
        fos.close();
        
//byte[] b = new byte[ part.getInputStream().available() ];
        
        //part.getInputStream();
        
        //System.out.println( b );

        
        Cloudinary cloudinary = new Cloudinary(ObjectUtils.asMap(
  "cloud_name", "jinks",
  "api_key", "569314711827539",
  "api_secret", "Qu_Udo0H83exv3ax87EYsjqut8g"));
        
//        File toUpload = new FileInputStream( part.getInputStream() );
        Map uploadResult = cloudinary.uploader().upload( f , ObjectUtils.emptyMap());
        
        System.out.println( uploadResult );
        
        System.out.println(uploadResult.get("secure_url"));
        
        Products p = new Products();
        
        p.setLink(uploadResult.get("secure_url").toString());
//
//        String picture = (req.getParameter("abc"));
//        
//        System.out.println( picture );
//        
       for(int i=0; i<params.length; i++)
       {
           switch(i)
           {
                case 0: p.setProductname(params[i]); break;
                case 1: p.setDescription(params[i]); break;
                case 2: p.setDiscount(params[i]); break;
                case 3: p.setPrice(Integer.parseInt(params[i])); break;
                //case 4: p.setLink(params[i]); break;
                case 4: p.setCategory(params[i]); break;
                case 5: p.setSpecification(params[i]); break;
                case 6: p.setColor(params[i]); break;
                case 7: p.setAccessories(params[i]); break;
           }
       }
       
       ProductsDAOImpl pdao = new ProductsDAOImpl();
       pdao.insert(p);
       //pdao.update(p);
      
      RequestDispatcher rd = req.getRequestDispatcher("/ViewProducts.jsp");
      rd.forward(req, resp);
        
      List<Products> list = pdao.getProducts();
      
      req.setAttribute("productData", list);
    // RequestDispatcher rd = req.getRequestDispatcher("/ViewProducts.jsp");
    // rd.forward(req, resp);
    }
    
    
    
}
