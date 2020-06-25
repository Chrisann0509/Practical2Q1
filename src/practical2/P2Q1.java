/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical2;
import java.lang.Math;

/**
 *
 * @author Chrisann Lee
 */
public class P2Q1 {

    public static void main(String []args) {
    	double sqrtNum;
    	System.out.println("Number    SquareRoot");
    	for(int i=0;i<=20;i+=2){
    		sqrtNum=sqrtNumber(i);
    		System.out.printf("%d \t  %.4f \n",i,sqrtNum); //System.out.printf("%d \t %.4f\n",i,Math.sqrt(i));
    		
    	}
    	
    }
    
    public static double sqrtNumber(int a){
    	
    	return Math.sqrt(a);
    }
    
    
}