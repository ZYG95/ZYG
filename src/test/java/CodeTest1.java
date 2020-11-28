import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CodeTest1 {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void addstring() {
        Code code = new Code();
        String s;
        s=code.addstring("abcd","qwer");
        assertEquals("abcdqwer",s);
    }

    @Test
    public void stringcount() {
        Code code = new Code();
        int n;
        n=code.stringcount("abbcadsa","a");
        assertEquals(3,n);
    }

    @Test
    public void deletestring() {
        Code code = new Code();
        String s;
        s=code.deletestring("aabcada","a");
        assertEquals("bcd",s);
    }

    @Test
    public void deletestring2() {
        Code code = new Code();
        String s;
        s=code.deletestring("aabcada","abc");
        assertEquals("d",s);
    }

}