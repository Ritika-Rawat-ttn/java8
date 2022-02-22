public class threadq3 {
    public static void main(String[] args) {  
      
      
        //Threads with lambda  
        Runnable r1=()->{  
                System.out.println(".....Thread1 is running...");  
        };  
        Thread t1=new Thread(r1);  
        t1.start();  

        Runnable r2 = () -> {
            System.out.println(".....Thread2 is running...");
        };
        Thread t2 = new Thread(r2);
        t2.start();
    }

    
}
