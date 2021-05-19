public class Clave implements TipoID{
    private int valor;

    public Clave(NotaGenerica nota) {
        setValor(nota.getFechaCreada().hashCode());
    }

    @Override
    public TipoID getValor() {
        return this;
    }

    private void setValor(int valor) {
        this.valor = valor;
    }
}
