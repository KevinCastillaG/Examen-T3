/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author kevin
 */
public class CatalogoProductos {
    
    private List<Producto> productos;
    
        public CatalogoProductos() {
        productos = new ArrayList<>();
    }
        
        public void agregarProducto(Producto producto) {
        productos.add(producto);
    }
        
        public double obtenerPrecio(String nombreProducto) {
        for (Producto producto : productos) {
            if (producto.getNombre().equalsIgnoreCase(nombreProducto)) {
                return producto.getPrecio();
            }
        }
        return -1; // Si no se encuentra el producto, retorna -1
    }
}
