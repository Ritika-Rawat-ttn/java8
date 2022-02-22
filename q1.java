import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

interface compare{
    boolean greater(int a, int b);
}
interface increment{
    int incrementBy(int a);
}

interface toUppercase{
    String toUppercase(String str);
}

public class q1{

    public static void main(String[] args) {

        System.out.println("&&& comparing &&&");
        compare cap=(a,b)->{return a > b;} ;
        System.out.println(cap.greater(4,1));
        
        System.out.println("&&& icrement &&&");
        increment in=(a)-> a+1;
        System.out.println(in.incrementBy(8));



        System.out.println("****Conacatenation****");
        List<String> name = Arrays.asList("Ritika","vritika");
        System.out.println(name.stream().collect(Collectors.joining(",")));


        System.out.println("*****Strig to uppercase****");
        toUppercase str=(a) -> a.toUpperCase();
        System.out.println(str.toUppercase("ritika rawat"));

    }
    
}
