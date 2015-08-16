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
        int x = scanner.nextInt();
        System.out.print("Please enter the value of 'y':");
        int y = scanner.nextInt();
        System.out.print("Please enter the value of 'z':");
        int z = scanner.nextInt();
        
        int n;
        if (x>y){
            n=x;
            x=y;
            y=n;
        };
        if (y>z){
            n=y;
            y=z;
            z=n;
        };
        if (x>y){
            n=x;
            x=y;
            y=n;
        };
        
        System.out.println("arry x,y,z from min to max is:"+" "+x+" "+y+" "+z);
    }
    
}
