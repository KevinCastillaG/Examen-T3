/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exament3;

import Entidades.CatalogoProductos;
import Entidades.Producto;
import Entidades.Ropa;

/**
 *
 * @author kevin
 */
public class Exament3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     CatalogoProductos catalogo = new CatalogoProductos();
     
     catalogo.agregarProducto(new Ropa("Camisa", 29.99, "M", "Algodón"));
     catalogo.agregarProducto(new Ropa("Pantalón", 49.99, "L", "Denim"));
     catalogo.agregarProducto(new Producto("Zapatos", 79.99));
     catalogo.agregarProducto(new Ropa("Vestido", 59.99, "S", "Seda"));
     catalogo.agregarProducto(new Ropa("Chaqueta", 69.99, "L", "Cuero"));
     catalogo.agregarProducto(new Producto("Bolso", 39.99));
     catalogo.agregarProducto(new Ropa("Falda", 34.99, "XS", "Algodón"));
     catalogo.agregarProducto(new Ropa("Traje de baño", 44.99, "M", "Poliéster"));
     catalogo.agregarProducto(new Producto("Gafas de sol", 19.99));
     catalogo.agregarProducto(new Ropa("Calcetines", 9.99, "Única", "Algodón"));
     catalogo.agregarProducto(new Ropa("Sombrero", 24.99, "Única", "Paja"));
     catalogo.agregarProducto(new Producto("Cinturón", 14.99));
     catalogo.agregarProducto(new Ropa("Blusa", 29.99, "S", "Algodón"));
     catalogo.agregarProducto(new Ropa("Sudadera", 39.99, "M", "Poliéster"));
     catalogo.agregarProducto(new Producto("Bufanda", 19.99));
     catalogo.agregarProducto(new Ropa("Gorra", 19.99, "Única", "Algodón"));
     catalogo.agregarProducto(new Ropa("Shorts", 24.99, "L", "Denim"));

   

    }
    
}
