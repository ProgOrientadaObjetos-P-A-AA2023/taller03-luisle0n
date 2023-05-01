package equipocelular;

public class Calculo {

    private String sistemaOperativo;
    private double tamanoPantalla;
    private double costoInicial;
    private double ivaPorcentaje;
    private double ivaCostoInicial;
    private double CostoFinal;
    private String direccionMAC;
    private String informacionIMEI;
    // Metodo para establecer atributos 
    public void estableberSistemaOperativo(String n) {
        sistemaOperativo = n;
    }

    public void estableberTamañoPantalla(double n) {
        tamanoPantalla = n;
    }

    public void establecerCostoIncial(double n) {
        costoInicial = n;
    }

    public void estableberIvaPorcentaje (double n) {
        ivaPorcentaje = n;
    }
    // Atributo para calcular el iva del costo inical 
    public void calcularIvaCostoInicial() {
        ivaCostoInicial = costoInicial * (ivaPorcentaje/100);
    }
    // Atributo para calcular el costo final 
    public void calcularCostoFinal(){
        CostoFinal=costoInicial+ivaCostoInicial;
    }
    
    public void estableberDireccionMac(String n) {
        direccionMAC = n;
    }

    public void estableberInformacionIMEI(String n) {
        informacionIMEI = n;
    }
    // Metodos para obetner los atributos 
    public String obtenerSistemaOperativo() {
        return sistemaOperativo;
    }

    public double obtenerTamañoPantalla() {
        return tamanoPantalla;
    }

    public double obtenerCostoInicial() {
        return costoInicial;

    }

    public double obtenerIvaPorcentaje() {
        return ivaPorcentaje;
    }

    public double obtenerIvaCostoInicial() {
        return ivaCostoInicial;
    }
    public double obtenerCostoFinal() {
        return CostoFinal;
    }
    public String obtenerDireccionMac() {
        return direccionMAC;
    }

    public String obtenerInformacionIMEI() {
        return informacionIMEI;
    }
}
