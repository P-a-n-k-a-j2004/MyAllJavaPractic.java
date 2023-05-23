import java.util.Scanner;

public class functionOverlading {

    public static void main(String[] args){


        Scanner sc=new Scanner(System.in);
        connectFunction over=new connectFunction();
          over.massage();
          int x,y;
          x=10; y=10;
          float m,n;
          m=10; n=10;
          double a,s;
          a=10; s=10;
          short i,j;
          i=10; j=10;
          long k,h;
          k= 1500000000000000000L;
          h= 1500000000000000000L;

          over.Sum(x,y);
        over.Sum(m,n);
        over.Sum(a,s);
        over.Sum(i,j);
        over.Sum(k,h);
    }
}
class connectFunction{
    void massage(){
        System.out.println(" This class is connected with main class and preform task::");
    }
    void Sum(int a, int b){
        System.out.println(" Sum of integer number "+a+" and "+b+"  is = "+(a+b));
    }
    void Sum(float a, float b){
        System.out.println(" Sum of  float number  "+a+" and "+b+"  is = "+(a+b));
    }
    void Sum(double a, double b){
        System.out.println(" Sum of "+a+" and  "+b+"  is = " +(a + b));
    }
    void Sum(long a, long b){
        System.out.println(" Sum of short number  "+a+" and  "+b+"  is = "+(a+b));
    }
    void Sum(short a, short b){
        System.out.println(" Sum of long number  "+a+" and  "+b+"  is = "+(a+b));
    }
}