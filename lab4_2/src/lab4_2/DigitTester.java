/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_2;
import java.util.Scanner;
/**
 *
 * @author thamolwan
 */
public class DigitTester {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a positive number: ");
        int num = in.nextInt();
        DigitExtractor digit = new DigitExtractor(num);
        System.out.println(digit.nextDigit());
        System.out.println(digit.nextDigit());
        System.out.println(digit.nextDigit());
        System.out.println(digit.nextDigit());
        System.out.println(digit.nextDigit());
    }
}
