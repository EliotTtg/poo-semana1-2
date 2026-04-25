public class App {
    public static void main(String[] args) {

        Estudiante est1 = new Estudiante("Juan", 101, 15.5);
        Estudiante est2 = new Estudiante("Maria", 102, 18.0);

        est1.mostrarInfo();
        est2.mostrarInfo();

        System.out.println("Nombre: " + est1.getNombre());
        System.out.println("Nota: " + est1.getNota());

        est1.setNota(17.5);
        System.out.println("Nueva nota de Juan: " + est1.getNota());

        System.out.println("Total de estudiantes: " + Estudiante.getTotalEstudiantes());
    }
}