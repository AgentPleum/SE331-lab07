package camt.se331.shoppingcart.dao;

import camt.se331.shoppingcart.entity.Product;
import camt.se331.shoppingcart.repository.ProductRepository;

import java.util.List;

/**
 * Created by AgentP on 3/27/2016.
 */
public class DbProductDao implements ProductDao {
    @Override
    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    @Override
    public List<Product> getProductByName(String name) {
        return null;
    }

    @Override
    public List<Product> getProductByDescription(String description) {
        return null;
    }

    @Override
    public Product getProduct(Long id) {
        return productRepository.findOne(id);
    }

    @Override
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product deleteProduct(Product product) {
        productRepository.delete(product);
        product.setId(null);
        return product;
    }

    @Override
    public Product updateProduct(Product product) {
        return productRepository.save(product);
    }
}
