package poo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class TesteDivisao {

    @Parameterized.Parameters(name = "{index}: divisão({0},{1}) = {2}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { 0, 1, 0 },
                { -1, -1, 1 },
                { 1, -1, -1 },
                { -1, 1, -1 },
                { 0, 0, 0 },
                { 1, 0, 0 }
        });
    }

    @Parameterized.Parameter(0)
    public int operandoUm;

    @Parameterized.Parameter(1)
    public int operandoDois;

    @Parameterized.Parameter(2)
    public int resultado;

    @Test
    public void teste(){
        DivideInteiros obj = new DivideInteiros();
        assertEquals("resultado errado.",resultado, obj.divisao(operandoUm, operandoDois), 0);  //Delta é a quantidade de casas após a vígula
    }
}
