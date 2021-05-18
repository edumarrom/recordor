public class Principal {
    public static void main(String[] args) {
        Nota primeraNota = new Nota("Primera nota!");
        System.out.println(primeraNota.getTitulo());

        Tarea primeraTarea = new Tarea("Primera tarea!");
        System.out.println(primeraTarea.getTitulo());
        System.out.println("¿Completada?: " + primeraTarea.getCompletada());
        primeraTarea.completar();
        System.out.println("¿Completada?: " + primeraTarea.getCompletada());
    }
}
