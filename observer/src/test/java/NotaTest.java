import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NotaTest {
    @Test
    void deveNotificarUmCliente() {
        Nota nota = new Nota(2021, "Algoritmos");
        Cliente cliente = new Cliente("Fulano");
        cliente.aguardarEmissao(nota);
        nota.emitirNota();
        assertEquals("nota fiscal emitida", cliente.getNotaFiscal());
    }
}
