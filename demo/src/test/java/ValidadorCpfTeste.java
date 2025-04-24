import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import com.example.ValidadorCpf;

public class ValidadorCpfTeste {
    public ValidadorCpf valcpf;
    
    @Before
    public void setUp() {
        valcpf = new ValidadorCpf();
    }

    @Test
    public void testeValidaCpf() {
        assertTrue(valcpf.ValidaCpf("12345678901"));
    }

    @Test
    public void testeValidaCpfComLetras() {
        assertFalse(valcpf.ValidaCpf("abc45678901"));
    }

    @Test
    public void testeValidaCpfNulo() {
        assertFalse(valcpf.ValidaCpf(null));
    }

    @Test
    public void testeValidaCpfCurto() {
        assertFalse(valcpf.ValidaCpf("123"));
    }

    @Test
    public void testeValidaCpfMaior() {
        assertFalse(valcpf.ValidaCpf("1234567890123"));
    }

    @Test
    public void testeValidaCpfComCaracteres() {
        assertFalse(valcpf.ValidaCpf("123.456.789-01"));
    }
}
