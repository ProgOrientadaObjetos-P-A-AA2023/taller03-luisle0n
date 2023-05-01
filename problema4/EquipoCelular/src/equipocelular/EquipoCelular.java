package equipocelular;

public class EquipoCelular {

    public static void main(String[] args) {
        // Crear un objeto de tipo Calculo
        Calculo ec = new Calculo();
        // Valores de entrada
        String sOperativo = "Android";
        double tPantalla = 5.5;
        double cInicial = 32;
        int iPorcentaje = 12;
        String dMac = "00-1B-44-11-3A-B7";
        String IMEI = "175684235794522";
        // Uso de los métodos para establecer y darle valores a los 
        // atributos del objeto.
        ec.estableberSistemaOperativo(sOperativo);
        ec.estableberTamañoPantalla(tPantalla);
        ec.establecerCostoIncial(cInicial);
        ec.estableberIvaPorcentaje(iPorcentaje);
        // Hasta aqui cada objeto ya tiene su valor correspondiente para cada atributo
        // sistema Operativo, tamaño de la Pantalla , Costo Inicial, iva Porcentaje 
        // direccion MAC, Direccion IMEI.
        // LLamo al método calcularivaCostoInicial, no se envía parámetros,
        // pues trabaja con los valores de los atributos: costoInicial y IvaPorcentaje 
        //que ya los tiene el 
        // objeto.
        ec.calcularIvaCostoInicial();
        // LLamo al método calcularivaCostoFinal, no se envía parámetros,
        // pues trabaja con los valores de los atributos:ivaCostoInicial y Costo Inicial  
        //que ya los tiene el 
        // objeto.
        ec.calcularCostoFinal();
        ec.estableberDireccionMac(dMac);
        ec.estableberInformacionIMEI(IMEI);

        // Se hace uso de los métodos obtener para presentar en pantalla lo 
        // requerido
        System.out.printf("Sistema Operativo: %s\nTamaño de Patalla: %.1f Pulgadas\n"
                + "Costo Inicial: %.2f\nIva: %.2f\nIva Costo Inicial: %.2f\n"
                + "Direccion Mac: %s\nInformacion IMEI: %s\nCosto Final: %.2f", ec.obtenerSistemaOperativo(),
                ec.obtenerTamañoPantalla(), ec.obtenerCostoInicial(), ec.obtenerIvaPorcentaje(),
                ec.obtenerIvaCostoInicial(), ec.obtenerDireccionMac(), ec.obtenerInformacionIMEI(),
                ec.obtenerCostoFinal());

    }

}
