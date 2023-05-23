//public class Multithreading extends Threads {
//
//
//        public void run(){
//            for(int i=1; i<=5; i++){
//                System.out.println(i);
//                try {
//                Thread.sleep(1000);
//                }catch (InterruptedException e){
//                }
//            }
//        }
//}

public class Multithreading extends Thread {
    @Override
//    public void run() {
//        // code to be executed in this thread
//        System.out.println("Thread is running");
//    }
            public void run(){
            for(int i=1; i<=5; i++){
                System.out.println(i);
                System.out.println("In thread ");}

            }

}


