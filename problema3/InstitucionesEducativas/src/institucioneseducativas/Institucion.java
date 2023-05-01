
package institucioneseducativas;

class Institucion {

    private String nombre;
    private String tipoInstitucion;
    private int numAlumnos;
    private int numDocentes;
    private int numSedes;
    private double gastoEstudiante;
    private double presupuesto;
    // Metodo para establecer atributos 
    public void establecerNombre(String n) {
        nombre = n;

    }

    public void establecerTipoInstitucion(String n) {
        tipoInstitucion = n;
    }

    public void establecerNumAlumnos(int n) {
        numAlumnos = n;
    }

    public void establecerNumDocentes(int n) {
        numDocentes = n;
    }

    public void establecerNumSedes(int n) {
        numSedes = n;
    }

    public void establecerGastoEstudiantes(double n) {
        gastoEstudiante = n;
 
    }
    // Atributo para calcular el presupuesto
    public void calcularPresupuesto() {
        presupuesto = numAlumnos * gastoEstudiante;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerTipoInstitucion() {
        return tipoInstitucion;
    }

    public int obtenerNumAlumnos() {
        return numAlumnos;
    }

    public int obtenerNumDocentes() {
        return numDocentes;
    }

    public int obtenerNumSedes() {
        return numSedes;
    }

    public double obtenerGastoEstudiante() {
        return gastoEstudiante;
    }

    public double obtenerPresupuesto() {
        return presupuesto;
    }
}
