public class Tarea extends NotaGenerica implements Completable{
    private boolean completada;

    public Tarea(String titulo) {
        super(titulo);
        setCompletada(false);
    }

    public boolean getCompletada() {
        return completada;
    }

    private void setCompletada(boolean completada) {
        this.completada = completada;
    }

    public void completar() {
        setCompletada(true);
    }

    public void desmarcar() {
        setCompletada(false);
    }
}
