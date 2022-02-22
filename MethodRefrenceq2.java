interface myclass{
    int performOperation(int a, int b);
}


public class MethodRefrenceq2 {
    public static int multiply(int a,int b){
        System.out.println("***performing multiply***");
        return a*b;

    }
    int add(int a ,int b){
        System.out.println("***performing addition");
        return a+b;
    }
    int subtract(int a,int b){
        System.out.println("***performing subtract***");
        return a-b;
    }
    public static void main(String[] args) {
        myclass arthmetic = MethodRefrenceq2::multiply;
        System.out.println(arthmetic.performOperation(7,2));


        myclass plus =new MethodRefrenceq2()::add;
        System.out.println(plus.performOperation(1,2));

        myclass minus =new MethodRefrenceq2()::subtract;
        System.out.println(minus.performOperation(5,2));

       


    }
}
