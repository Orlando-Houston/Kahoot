package Apr;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<Character>x=new ArrayList<> (Arrays.asList ('J','a','v','a'));
        for (int i=0;i<x.size ();i++){
            if (!(x.get (i) > 65&& x.get (i) < 92)){
                x.remove (i);
            }
        }
        System.out.println (x);
    }
}
