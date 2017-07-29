
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Log Details</title>
    </head>
    <body>
        <%@ page language="java" %>
        <%@ page import="java.sql.*" %>
         <%@ page import="java.sql.DriverManager.*" %>
         
         <% 
       PreparedStatement ps;
        Connection conn;
        ResultSet rs= null;
       Class.forName("org.apache.derby.jdbc.ClientDriver");
        conn=DriverManager.getConnection("jdbc:derby://localhost:1527/Shop_Square;create=true;user=luke;password=luke;");
      
         Statement st=conn.createStatement();
%> 
<% 
boolean flag = false; 

String adminid = request.getParameter ("adid"); 
String adminpass = request.getParameter("adpass");
%>

        
<% String sql = "SELECT firstname from profiles where id=? And password=?"; 

try {  
ps = conn.prepareStatement (sql); 
ps.setString (1,adminid); 
ps.setString (2,adminpass); 
rs = ps.executeQuery (); 
if (rs.next ()) { 
out.println (rs.getString ("firstname")); 
flag = true; 
session.setAttribute("aname", rs.getString ("firstname")); 
} else { 
request.setAttribute("err", "user name or password error!"); 
}

rs.close (); 
ps.close (); 
conn.close ();

} catch (Exception e) { 
out.println (e); 
} 
%>

<% 

if (flag) { 

%>

<jsp:forward page="AdminLogInSuccess.jsp" />

<%

} 
else { 
%>

<jsp:forward page="AdminLogInFail.jsp"/> 
<% 
} 
%>
    </body>
</html>
