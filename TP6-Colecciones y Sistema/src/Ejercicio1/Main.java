/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author facun
 */
public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        // Crear productos
        Producto p1 = new Producto("A1", "Manzanas", 500, 50, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("B2", "Televisor", 2000, 10, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("C3", "Remera", 1500, 25, CategoriaProducto.ROPA);
        Producto p4 = new Producto("D4", "Silla", 3000, 8, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("E5", "Auriculares", 2500, 15, CategoriaProducto.ELECTRONICA);

        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);

        // Listar productos
        System.out.println("=== LISTA DE PRODUCTOS ===");
        inventario.listarProductos();

        // Buscar productos
        System.out.println("\n=== BÚSQUEDA POR ID 'C3' ===");
        Producto buscado = inventario.buscarProductoPorId("C3");
        if (buscado != null) buscado.mostrarInfo();

        // Filtrar por categoria
        inventario.filtrarPorCategoria(CategoriaProducto.ELECTRONICA);

        // Eliminar producto
        System.out.println("\n=== ELIMINAR PRODUCTO 'A1' ===");
        inventario.eliminarProducto("A1");
        inventario.listarProductos();

        // Actualizar stock
        inventario.actualizarStock("E5", 20);

        // Total de stock
        System.out.println("\nTotal de stock: " + inventario.obtenerTotalStock());

        // Producto con mayor stock
        System.out.println("\nProducto con mayor stock:");
        System.out.println(inventario.obtenerProductoConMayorStock());

        // Filtrar por precio
        inventario.filtrarProductosPorPrecio(1000, 3000);

        // Categorias disponibles
        inventario.mostrarCategoriasDisponibles();
    }
}
