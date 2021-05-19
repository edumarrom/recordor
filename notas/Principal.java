import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Lista listaNotas = new Lista("Principal");

        listaNotas.crearNota("Primera nota!");
        listaNotas.mostrarNota(0);

        listaNotas.crearTarea("Primera tarea!");
        listaNotas.mostrarNotas();
        // try {
        //     Thread.sleep(3000);
        // } catch (InterruptedException e) {
        //     e.printStackTrace();
        // }

        listaNotas.getNota(0).modificarCuerpo(sc);
        Tarea tarea = (Tarea) listaNotas.getNota(1);
        tarea.completar();

        listaNotas.mostrarNotas();

        // System.out.println("ID de la primeraNota : " + primeraNota.getID().getValor()); // Como obtengo el valor entero de mi ID?

    }
}
