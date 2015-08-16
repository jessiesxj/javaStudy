/**
 * Created by jessie on 15-8-15.
 */

/**
 * sum=1!+2!+...+20!
 * */

public class FactorialCalculator {
    public static void main(String[] args){
        long sum=0;
        long factorial=1;
        for(int i=1;i<=20;i++){
            factorial=factorial*i;
            sum+=factorial;
        }
        System.out.println("1!+2!+...+20!="+sum);
    }
}
