public class Estudiante {
 
    private String nombre;
    private int codigo;
    private double nota;
 
    private static int totalEstudiantes = 0;
 
    public Estudiante(String _nombre, int _codigo, double _nota) {
        this.nombre = _nombre;
        this.codigo = _codigo;
        this.nota   = _nota;
        totalEstudiantes++;
    }
    public int getcodigo() { 
        return codigo; 
    }

    public String getNombre() { 
        return nombre; 
    }

    public double getNota()   { 
        return nota; 
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

     public void setNota(double nota){
        this.nota = nota;
    }

    public static int getTotalEstudiantes() { 
        return totalEstudiantes; 
    }

     public static void setTotalEstudiantes(int totalEstudiantes) { 
        Estudiante.totalEstudiantes = totalEstudiantes; 
    }

    public void mostrarInfo() {
        System.out.println("Estudiante: " + nombre + " | Nota: " + nota);
    }
}
