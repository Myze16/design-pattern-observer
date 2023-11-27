import java.util.Observable;
import java.util.Observer;

public class Cliente implements Observer {

    private String nome;
    private String notaFiscal;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNotaFiscal() {
        return this.notaFiscal;
    }

    public void aguardarEmissao(Nota nota) {
        nota.addObserver(this);
    }

    public void update(Observable nota, Object arg1) {
        this.notaFiscal = "nota fiscal emitida";
    }
}
