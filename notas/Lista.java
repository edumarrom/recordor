import java.util.ArrayList;

public class Lista {
    private String nombre;
    private ArrayList<NotaGenerica> notas = new ArrayList<NotaGenerica>();

    public Lista(String nombre){
        setNombre(nombre);
    }

    public String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private ArrayList<NotaGenerica> getNotas() {
        return notas;
    }

    public NotaGenerica getNota(NotaGenerica nota) {
        int indice = getNotas().indexOf(nota);
        return getNotas().get(indice);
    }

    public NotaGenerica getNota(int indice) {
        return getNotas().get(indice);
    }

    public void mostrarNota(NotaGenerica nota) {
        System.out.println(nota);
        if (nota.getCuerpo() != null) {
            System.out.println("-------------------------\n");
            System.out.println(nota.getCuerpo());
        }
        System.out.println("\n=========================\n");
    }

    public void mostrarNota(int indice) {
        NotaGenerica nota  = getNotas().get(indice);
        System.out.println(nota);
        if (nota.getCuerpo() != null) {
            System.out.println("-------------------------\n");
            System.out.println(nota.getCuerpo());
        }
        System.out.println("\n=========================\n");
    }

    public void mostrarNotas() {
        for (NotaGenerica nota : notas) {
            mostrarNota(nota);
        }
    }

    public void crearNota(String titulo) {
        getNotas().add(new Nota(titulo));
    }

    public void crearTarea(String titulo) {
        getNotas().add(new Tarea(titulo));
    }

    public void borrarNota(NotaGenerica nota) {
        getNotas().remove(nota);
    }

    public void borrarNota(int indice) {
        getNotas().remove(indice);
    }
}
