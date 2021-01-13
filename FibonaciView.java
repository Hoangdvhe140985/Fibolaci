/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ChungNG
 */
public class FibonaciView {   
    public static int fibonacci(int count, int f0, int f1) {
        if (count > 45) {
            return 0;
        } else if (count < 45) {
            System.out.print(f0 + ", ");
        } else {
            System.out.println(f0 + "");
        }
        return fibonacci(count+1, f0 + f1, f0);
    }
}
