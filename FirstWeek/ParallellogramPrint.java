/**
 * Created by jessie on 15-8-14.
 */

/**
 * print
 *     *****
 *    *****
 *   *****
 *  *****
 */
public class ParallellogramPrint {
    public static void main(String[] args){
        for (int i=1;i<5;i++) {
            for (int k = 1; k <= 5 - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}

