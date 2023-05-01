package equivalentehora;

public class Ejecutor {
    
    private int Hora;
    private int minutos;
    private int segundos;
    private int dias;
    // Metodos para establecer cada atributo
    public void establecerHoras(int hora) {
        Hora = hora;       
    }
    // Atributo para calcular los minutos 
    public void calucloMinutos() {
        minutos = Hora * 60;
    }
    // Atributo para calcular los segundos 
    public void calculoSegundos() {
        segundos = Hora* 3600;
    }
    // Atributo para calcular el dia 
    public void calculoDias() {
        dias = Hora / 24;
    }
    //Metodos para obtener cada atributo
    public int obtenerHoras() {
        return Hora;
    }
    public int obtenerMinutos() {
        return minutos;
    }
    public int obtenerSegundos() {
        return segundos;
    }
    public int obtenerDias() {
        return dias;
    }

}
