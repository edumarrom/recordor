public class Clave implements TipoID{
    private int valor;

    public Clave(NotaGenerica nota) {
        setValor(nota.getFechaCreado().hashCode());
    }

    @Override
    public TipoID getValor() {
        return this;
    }

    private void setValor(int valor) {
        this.valor = valor;
    }
}
