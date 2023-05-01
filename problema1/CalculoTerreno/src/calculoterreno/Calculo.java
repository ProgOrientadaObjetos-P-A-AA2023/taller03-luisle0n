package calculoterreno;

public class Calculo {

    private int ancho;
    private int largo;
    private int area;
    private double costo_terreno;
    private int valorMetroCuadrado;
    // Metodo para estbalecer cada atributo
    public void establecerAncho(int n) {
        ancho = n;
    }

    public void establecerLargo(int n) {
        largo = n;
    }

    public void establecervalorMetroCuadrado(int n) {
        valorMetroCuadrado = n;
    }
    // Atributo para calcular el area 
    public void calcularArea() {
        area = largo * ancho;
    }
    // Atributo para calcular el costo del terreno 
    public void calcularcosto_terreno() {
        costo_terreno = valorMetroCuadrado * area;
    }
    // Metodo para obtener cada atributo
    public int obtenerAncho() {
        return ancho;
    }

    public int obtenerLargo() {
        return largo;
    }

    public int obtenervalorMetroCuadrado() {
        return valorMetroCuadrado;
    }

    public int obtenerArea() {
        return area;
    }

    public double obtenercosto_terreno() {
        return costo_terreno;
    }
}
