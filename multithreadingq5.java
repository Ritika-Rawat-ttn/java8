

interface parent {
    default void display() {
        System.out.println("this is parent class");

    }
}
interface child1 extends parent {
        default void display() {
            System.out.println("*****This is child1*****");
        }
    }

interface child2 extends parent {
            default void display() {
                System.out.println("*****This is child2*****");
            }

        }

public class multithreadingq5 implements child1,child2{
    public void display(){
        child1.super.display();
        child2.super.display();
    }
        public static void main(String[] args) {
            new multithreadingq5().display();
        }
        
    }
