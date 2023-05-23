public class Dog extends Animal{
    public void eat(int timeToRun){

        for(int i=1; i<=timeToRun; i++) {

            System.out.println("chum chum chum");
            if(i==timeToRun){
                System.out.println("your loop is over , your limit is equal to your given\n condition");
            }
        }
    }
}
