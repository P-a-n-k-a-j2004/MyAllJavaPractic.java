import java.util.*;
public class MyMain {
    public static void main(String[] args) {
        Multithreading myThread = new Multithreading();
        myThread.start();

        try {
            myThread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Main thread is running");
/*        Set<String> names=new HashSet<>();
        names.add("walter");
        names.add("Ajaypal");
        names.add("saul");
        names.add("pankaj");
        names.add("Sunil");
        names.add("Ramswaroop");
        System.out.println(names);
        for(String name: names){
            System.out.println(name);
        }*/


    }
}