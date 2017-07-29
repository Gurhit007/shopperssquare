
package products;

import java.util.List;

public interface ProductsDAO {
    public abstract void insert(Products p);
    public abstract void update(Products p);
    public abstract void delete(int pid);
    public abstract Products getProducts(int pid);
    public abstract List<Products> getProducts();
}
