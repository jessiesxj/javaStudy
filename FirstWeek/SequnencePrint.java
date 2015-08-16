/**
 * Created by jessie on 15-8-14.
 */

/**
 * print
 * 1 2 3 4
 * 5 6 7 8
 * 9 10 11 12
 * 13 14 15 16
 *
 */
public class SequnencePrint {
    public static void main(String[] args){
        for (int i=1;i<=4;i++){
            if (i==1) {
                for (int j = 1; j <= 4; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
            else if (i==2){
                for (int j = 5; j <= 8; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
            else if (i==3){
                for (int j = 9; j <= 12; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
            else if (i==4){
                for (int j = 13; j <= 16; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }
    }
}
