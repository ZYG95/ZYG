import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;


public class mock {
    @Test
    public void test(){
        Code code = mock(Code.class);
//        when(code.addstring(anyString(),anyString())).thenReturn("111");
//        String ret = (String) code.addstring("s1","s1");
//        System.out.println(code.addstring("s1","s1"));
//        Assert.assertEquals(ret,"111");
        when(code.stringcount("s1","s1")).thenReturn(111);

        Integer ret =code.stringcount("s1","s1");
        Assert.assertEquals((Integer)111,ret);
    }

}
