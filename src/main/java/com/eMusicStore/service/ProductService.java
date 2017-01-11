package com.eMusicStore.service;

import com.eMusicStore.model.Product;

import java.util.List;

/**
 * Created by heriberto on 10/01/17.
 */
public interface ProductService {

    /**
     * Método que obtiene la lista de productos
     * @return Lista con los productos
     */
    List<Product> getProductList();

    /**
     * Método que obtiene un producto por id del producto
     * @param id Es el id del producto a buscar
     * @return Product
     */
    Product getProductById(int id);

    /**
     * Método que agrega un producto
     * @param product Es el producto a agregar
     */
    void addProduct(Product product);

    /**
     * Metodo que edita el contenido de un productp
     * @param product Es el producto a editar
     */
    void editProduct(Product product);

    /**
     * Método que elimina un producto
     * @param product Es el producto a eliminar
     */
    void deleteProduct(Product product);

}
