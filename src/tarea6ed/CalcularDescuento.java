/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea6ed;

/**
 *
 * @author CRISTHIAN
 */
public class CalcularDescuento {
    private static final int LIMITE_PRODUCTOS_PARA_DESCUENTO = 3;
    private static final int DESCUENTO_FIJO_MAYOR_TRES_PRODUCTOS = 5;
    private static final double DESCUENTO_MENOR = 0.95;
    private static final double DESCUENTO_GRANDE = 0.8;
    
    public void aplicarDescuento(double precioProducto, int numProductos) {
        double Total;
        if (numProductos > LIMITE_PRODUCTOS_PARA_DESCUENTO) {
            precioProducto -= DESCUENTO_FIJO_MAYOR_TRES_PRODUCTOS;
        }
        if (numProductos != 0) {
            Total = precioProducto * DESCUENTO_GRANDE;
            imprimirTotal(Total);
        } else {
            Total = precioProducto * DESCUENTO_MENOR;
            imprimirTotal(Total);
        }

    }


    private void imprimirTotal(double Total) {
        System.out.println("El total a pagar es:" + Total);
        System.out.println("Enviado");
    }
    
}
