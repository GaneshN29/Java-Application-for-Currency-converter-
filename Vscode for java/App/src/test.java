import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class test {
    /**
     * 
     */
    @Test
    public void Test1(){
        App a=new App(); 
        assertEquals("8253.0",a.floatoutput("100","1.0","82.53"));
    }
    @Test
    public void Test2(){
        App a=new App();
        assertEquals("212100",a.intoutput("150","1.0","1414.03"));
    }
    @Test
    public void Test3(){
        App a=new App(); 
        assertEquals("1694942.6",a.floatoutput("10000","0.87","147.46"));
    }
    @Test
    public void Test4(){
        App a=new App();
        assertEquals("5248",a.intoutput("1234","19.72","82.53"));
    }
    @Test
    public void Test5(){
        App a=new App();
        assertEquals("52",a.intoutput("12","0.87","1414.03"));
    }
    @Test
    public void Test6(){
        App a=new App(); 
        assertEquals("169",a.floatoutput("100","19.72","147.46"));
    }
    @Test
    public void Test7(){
        App a=new App(); 
        assertEquals("Error",a.intoutput("100","0.87","147.46"));
    }
}
