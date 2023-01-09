import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveConverterParaDolar(){
        Cliente cliente = new Cliente();
        cliente.setValorReais(100f);
        cliente.setCotacao(5f);
        assertEquals(500f, cliente.calcularConversao());
    }

    @Test
    void deveConverterParaLibra(){
        Cliente cliente = new Cliente();
        cliente.setValorReais(100f);
        cliente.setCotacao(6f);
        assertEquals(600f, cliente.calcularConversao());
    }

}