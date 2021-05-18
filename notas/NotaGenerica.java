import java.util.Date;

public abstract class NotaGenerica{
    private TipoID ID;
    private String titulo;
    private String detalles;
    private Date fechaCreado;
    private Date fechaModificado;

    public NotaGenerica(String titulo) {
        setFechaCreado(new Date());
        setFechaModificado(getFechaCreado());
        setID(new Clave(this));
        setTitulo(titulo);
    }

    public TipoID getId() { // Implementa a TipoID.getValor()
        return ID;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDetalles() {
        return detalles;
    }

    public Date getFechaCreado() {
        return fechaCreado;
    }

    public Date getFechaModificado() {
        return fechaModificado;
    }

    private void setID(TipoID ID) {
        this.ID = ID;
    }

    private void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    private void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    private void setFechaCreado(Date fechaCreado) {
        this.fechaCreado = fechaCreado;
    }

    private void setFechaModificado(Date fechaModificado) {
        this.fechaCreado = fechaModificado;
    }
}
