package main.database;

import java.util.List;
import main.models.*;

public interface ProductDataAccessObject {

    List<Product> getSearchResult(String keyword);

    List<Product> getProductList();

    Product getProductById(int id);

    void save(Product product);

    void delete(Product product);
}