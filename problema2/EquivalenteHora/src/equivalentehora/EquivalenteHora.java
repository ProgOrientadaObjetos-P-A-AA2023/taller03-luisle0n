package equivalentehora;

import java.util.Scanner;

public class EquivalenteHora {

    public static void main(String[] args) {
        // Crear un objeto de tipo Ejecutor 
        Ejecutor di = new Ejecutor();
        // Valores de entrada
        int hora = 24;
        // Uso de los métodos para establecer y darle valores a los 
        // atributos del objeto.
        di.establecerHoras(hora);
        // Hasta aqui cada objeto ya tiene su valor correspondiente para cada atributo
        // Hora la cual tendra q mostrar su equivalencia en segundos minutos y dias.}
        //que ya los tiene el 
        // objeto.
        di.calculoSegundos();
        // LLamo al método calcularSegundos, no se envía parámetros,
        // pues trabaja con los valores de los atributos: Horas y se los multiplica por 3600
        //que ya los tiene el 
        // objeto.
        di.calucloMinutos();
        // LLamo al método calcularMinutos , no se envía parámetros,
        // pues trabaja con los valores de los atributos: Horas y se los multiplica por 60
        //que ya los tiene el 
        // objeto.
        di.calculoDias();
        // LLamo al método calcularDias, no se envía parámetros,
        // pues trabaja con los valores de los atributos: Horas y se divide por 24.
        //que ya los tiene el 
        // objeto.

        // Se hace uso de los métodos obtener para presentar en pantalla lo 
        // Representacion del problema 
        System.out.println("Equivalente de " + di.obtenerHoras() + " horas:");
        System.out.printf(" %d Minutos\n %d segundos\n %d Dias\n", di.obtenerMinutos(),
                di.obtenerSegundos(), di.obtenerDias());

    }

}
