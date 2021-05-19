import java.util.Date;

public class Tarea extends NotaGenerica implements Completable{
    private boolean completada;

    public Tarea(String titulo) {
        super(titulo);
        setCompletada(false);
    }

    @Override
    public String toString() {
        String completada = getCompletada()?"Sí":"No";
        return super.toString() + " - ¿Completada?: " + completada;
    }

    public boolean getCompletada() {
        return completada;
    }

    private void setCompletada(boolean completada) {
        this.completada = completada;
    }

    public void completar() {
        setCompletada(true);
        setFechaModificada(new Date());
    }

    public void desmarcar() {
        setCompletada(false);
    }
}
