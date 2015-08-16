/**
 * Created by jessie on 15-8-15.
 */

/**
 * sum=1!+2!+...+20!
 * */

public class Factorial {
    public static void main(String[] args){
        int i;
        long sum=0;
        long x=1;
        for(i=1;i<=20;i++){
            x=x*i;
            sum+=x;
        }
        System.out.println("1!+2!+...+20!="+sum);
    }
}
