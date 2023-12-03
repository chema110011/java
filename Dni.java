/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dni;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class Dni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        char letra[]={'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        Scanner sc =new Scanner(System.in);
        int dni;
        
        System.out.println("Introduce tu numero de dni :");
        dni=sc.nextInt();
        
           System.out.println("tu letra es  :"+letra[(int) dni%23]);
        
        
        
        
        
        
        
    }
    
}
