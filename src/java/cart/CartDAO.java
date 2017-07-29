
package cart;

import java.util.List;

public interface CartDAO {
    
    public abstract void insert(Cart p);
    public abstract void update(Cart p);
    public abstract void delete(int pid);
    public abstract Cart getCart(int pid);
    public abstract List<Cart> getCart();
    
}
