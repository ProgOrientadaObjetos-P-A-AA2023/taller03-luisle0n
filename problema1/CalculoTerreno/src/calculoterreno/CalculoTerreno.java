package calculoterreno;

public class CalculoTerreno {

    public static void main(String[] args) {

        // Crear un objeto de tipo Calculo
        Calculo ct = new Calculo();
        // Valores de entrada
        // Uso de los métodos para establecer y darle valores a los 
        // atributos del objeto.
        int vMetroCuadrado = 100;
        int ancho = 40;
        int largo = 20;
        // Hasta aqui cada objeto ya tiene su valor correspondiente para cada atributo
        // valorMetroCuadrado, Anchoque ya los tiene el objeto.
        ct.establecervalorMetroCuadrado(vMetroCuadrado);
        ct.establecerAncho(ancho);
        ct.establecerLargo(largo);
        // LLamo al método calcularArea, no se envía parámetros,
        // pues trabaja con los valores de los atributos: Ancho y Largo que ya los tiene el 
        // objeto.
        ct.calcularArea();
        // LLamo al método calcularArea, no se envía parámetros,
        // pues trabaja con los valores de los atributos: Area y valorMetroCuadrado que ya los tiene el 
        // objeto.
        ct.calcularcosto_terreno();
        // Se hace uso de los métodos obtener para presentar en pantalla lo 
        // Representacion del problema 
        System.out.printf("Ancho: %d\nLargo: %d\nValo Metro Cuadrado: %d\nArea: %d\n"
                + "Costo Del Terreo: %.2f\n", ct.obtenerAncho(), ct.obtenerLargo(), ct.obtenervalorMetroCuadrado(),
                 ct.obtenerArea(), ct.obtenercosto_terreno());

    }

}
