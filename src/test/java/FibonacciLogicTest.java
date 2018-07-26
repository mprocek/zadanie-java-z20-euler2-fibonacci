import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class FibonacciLogicTest {

    private FibonacciLogic fibonacciLogic;

    @Before
    public void init(){
        fibonacciLogic = new FibonacciLogic();
    }

    @Test
    public void shouldReturnFor10(){
        //given
        int a=10;

        //when
        int result = fibonacciLogic.fibonacciCalc(a);

        //then
        assertThat(result, is(2));
    }

    @Test
    public void shouldReturnFor90(){
        //given
        int a=90;

        //when
        int result = fibonacciLogic.fibonacciCalc(a);

        //then
        assertThat(result, is(44));
    }

    @Test
    public void shouldReturnFor200(){
        //given
        int a=200;

        //when
        int result = fibonacciLogic.fibonacciCalc(a);

        //then
        assertThat(result, is(188));
    }
}
