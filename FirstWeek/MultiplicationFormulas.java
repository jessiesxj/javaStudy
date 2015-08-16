/**
 * Created by jessie on 15-8-15.
 */

/**
 * multiplication
 * 1x1=1
 * 1x2=2
 * .....
 * 9x9=81
 *
 */


public class MultiplicationFormulas {
    public static void main(String[] args){
        for(int i=1;i<=9;i++){
            for(int j=1;j<=i;j++){
                int x=i*j;
                System.out.print(j + "x" + i + "=" + x+" ");
            }
            System.out.println();
        }

    }
}
