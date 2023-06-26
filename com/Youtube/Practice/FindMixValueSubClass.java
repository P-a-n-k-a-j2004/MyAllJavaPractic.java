package com.Youtube.Practice;

public class FindMixValueSubClass {
    private int Value;
    FindMixValueSubClass(int value){
        this.Value=value;
    }
    public int isPrime(){
        int counter=0;//here counter value is 0 after that counter value is 1 and again run then 2 then next condition
    for(int i=1; i<=Value;i++) {//here loop is running many times as user want two checking value
        if (Value % i == 0) {
            counter++;//here counter is count value how many times value is divide if two times then
                        //last condition is work and give result
        }

    }//when number are two times divisible by 1 and itself then counter is work
        //counter count value how many times divisible value after this condition is work
    if(counter==2){
        System.out.println("Number is prime");
    }
    else{
        System.out.println("Number is not prime");
    }
    return Value;
    }



    public int sumUpToNumber(){
        int sum=0;
        for(int value=1; value<=Value; value++){

                sum=sum+value;
                System.out.println(sum);
        }
        return sum;
    }

    public int AngleOfNumber(){
        for(int value=1; value<=Value;value++){
            for(int values=1;values<=value; values++){

                   System.out.print(values);
            }
            System.out.println();
        }
        return Value;
    }

}
