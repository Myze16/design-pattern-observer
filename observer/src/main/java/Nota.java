import java.util.Observable;

public class Nota extends Observable {
    private String cod;
    private Integer valor;

    public Nota(Integer valor, String cod) {
        this.valor = valor;
        this.cod = cod;
    }

    public void emitirNota() {
        setChanged();
        notifyObservers();
    }

    @Override
    public String toString() {
        return "Nota{" +
                "valor=" + valor +
                ", codigo=" + cod +
                '}';
    }
}
