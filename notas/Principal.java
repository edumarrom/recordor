public class Principal {
    public static void main(String[] args) {
        Nota primeraNota = new Nota("Primera nota!");
        System.out.println(primeraNota);

        Tarea primeraTarea = new Tarea("Primera tarea!");
        System.out.println(primeraTarea);
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        primeraTarea.completar();
        System.out.println(primeraTarea);

        // System.out.println("ID de la primeraNota : " + primeraNota.getID().getValor()); // Como obtengo el valor entero de mi ID?

    }
}
