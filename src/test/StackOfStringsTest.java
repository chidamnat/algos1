package test;

import com.algos1.ResizingArrayStackOfStrings;
import com.algos1.StackOfStrings;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by chidam on 11/4/17.
 */

public class StackOfStringsTest {

    @Test
    public void stackTest() {
        StackOfStrings stack = new StackOfStrings();
        String input = "to be or not to - be - - that - - - is";
        String[] inp = input.split(" ");
        for (int i = 0; i < inp.length; i++) {
            String s = inp[i];
            if (s.equals("-")) System.out.println(stack.pop());
            else stack.push(s);
        }
        Assert.assertEquals(false, stack.isEmpty());
    }

    @Test
    public void stackTest2() {
        ResizingArrayStackOfStrings stack = new ResizingArrayStackOfStrings();
        String input = "to be or not to - be - - that - - - is";
        String[] inp = input.split(" ");
        for (int i = 0; i < inp.length; i++) {
            String s = inp[i];
            if (s.equals("-")) System.out.println(stack.pop());
            else stack.push(s);
        }
        Assert.assertEquals(false, stack.isEmpty());
    }

}
