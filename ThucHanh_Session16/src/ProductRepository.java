import java.util.*;

public class ProductRepository implements IRepository<Product> {
    private List<Product> products = new ArrayList<>();
    private Map<String, Product> productsMap = new HashMap<>();

    @Override
    public boolean add(Product item) {
        if (item == null || productsMap.containsKey(item.getId()))
            return false;
        products.add(item);
        productsMap.put(item.getId(), item);
        return true;
    }

    @Override
    public boolean removeById(String id) {
        Product p = productsMap.remove(id);
        if (p != null){
            products.remove(p);
            return true;
        }
        return false;
    }

    @Override
    public Product findById(String id) {
        return productsMap.get(id);
    }

    @Override
    public List<Product> findAll() {
        return products;
    }
}
