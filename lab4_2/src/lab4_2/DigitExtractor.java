/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_2;

/**
 *
 * @author thamolwan
 */
public class DigitExtractor 
{
    private int anInteger;
    public DigitExtractor(int anInteger)
    {
        this.anInteger = anInteger;
    }
    public int nextDigit()
    {
        int digit = anInteger%10;
        anInteger = (int) Math.floor(anInteger/10);
        return digit;
    }   
}
