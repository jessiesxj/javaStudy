/**
 * Created by jessie on 15-8-14.
 */

/**
 * enter 3 integers x,y,z
 * array them from min to max
 */

import java.util.Scanner;

public class NumberComparer {

    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Please enter the value of 'x':");
        Integer x = scanner.nextInt();
        System.out.print("Please enter the value of 'y':");
        Integer y = scanner.nextInt();
        System.out.print("Please enter the value of 'z':");
        Integer z = scanner.nextInt();
        
        Integer tmp;
        if (x>y){
            tmp=x;
            x=y;
            y=tmp;
        }
        if (y>z){
            tmp=y;
            y=z;
            z=tmp;
        }
        if (x>y){
            tmp=x;
            x=y;
            y=tmp;
        }
        
        System.out.println("arry x,y,z from min to max is:"+" "+x+" "+y+" "+z);
    }
}
