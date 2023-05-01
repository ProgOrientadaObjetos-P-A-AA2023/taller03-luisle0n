package institucioneseducativas;

public class InstitucionesEducativas {
    
    public static void main(String[] args) {
        // Crear un objeto de tipo Institucion
        Institucion ie = new Institucion();
        // Valores de entrada
         String nEducativa = "La Doloroza";       
        String tInstitucion = "Publica";
        int nAlumnos=500;
        int nDocentes=50;
        int nSedes=2;
        double gEstudiante= 25.50;
        // Uso de los métodos para establecer y darle valores a los 
        // atributos del objeto.       
        ie.establecerNombre(nEducativa);
        ie.establecerTipoInstitucion(tInstitucion);
        ie.establecerNumAlumnos(nAlumnos);
        ie.establecerNumDocentes(nDocentes);
        ie.establecerNumSedes(nSedes);
        ie.establecerGastoEstudiantes(gEstudiante);
        // Hasta aqui cada objeto ya tiene su valor correspondiente para cada atributo
        // nombre de la intitucion Educativa, Tipo de Institucion, numero de Alumnos
        // numero de Docenetes, numero de Ssdes, Gasto proyectado del estduiante. 
        // LLamo al método calcularValorPresupuesto, no se envía parámetros,
        // pues trabaja con los valores de los atributos: número de alumnos
        // gasto del estudiante; que ya los tiene el 
        // objeto.
        ie.calcularPresupuesto();               
        // Se hace uso de los métodos obtener para presentar en pantalla lo 
        // Representacion del problema 
        System.out.printf("Nombre de la Institucion: %s\nTipo Institucion: %s\nNumero Alumnos: %d\n"
                + "Numero Docentes: %d\nNumero Sedes: %d\nGasto por Estudiante: %.2f\n"
                + "Presupuesto %.2f\n"
                , ie.obtenerNombre(),ie.obtenerTipoInstitucion(), ie.obtenerNumAlumnos(),
                ie.obtenerNumDocentes(), ie.obtenerNumSedes(), ie.obtenerGastoEstudiante(),
                ie.obtenerPresupuesto());
    }
    
}
