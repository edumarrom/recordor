import java.util.Date;
import java.util.Scanner;

public abstract class NotaGenerica{
    private TipoID ID;
    private String titulo;
    private String cuerpo;
    private Date fechaCreada;
    private Date fechaModificada;

    public NotaGenerica(String titulo) {
        setFechaCreada(new Date());
        setFechaModificada(getFechaCreada());
        setID(new Clave(this));
        setTitulo(titulo);
    }

    public String toString() {
        return getTitulo() + " - Creada: " + getFechaCreada().toString() + " - Última modificación: " + getFechaModificada().toString();
    }

    public TipoID getID() { // Implementa a TipoID.getValor()
        return ID;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public Date getFechaCreada() {
        return fechaCreada;
    }

    public Date getFechaModificada() {
        return fechaModificada;
    }

    private void setID(TipoID ID) {
        this.ID = ID;
    }

    private void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    private void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    private void setFechaCreada(Date fechaCreada) {
        this.fechaCreada = fechaCreada;
    }

    protected void setFechaModificada(Date fechaModificada) {
        this.fechaModificada = fechaModificada;
    }

    public Nota crearNota(String titulo) {
        return new Nota(titulo);
    }

    public void modificarCuerpo(Scanner sc) {
        System.out.println("Introduce nuevo texto: ");
        String nuevoCuerpo = sc.nextLine();
        setCuerpo(nuevoCuerpo);
        setFechaModificada(new Date());
    }
}
