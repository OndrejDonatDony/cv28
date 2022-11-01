/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cv28;

/**
 *
 * @author ondre
 */
import java.util.Scanner;
public class Cv28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
           
            int a = 0;
            int cislo = 1;
            
            //cyklus while funguje pouze pro kladna cisla
            while(cislo>0){ 
            cislo = sc.nextInt();
            
            //hledani a soucet vsech delitelu vypsaneho cisla
            for(int delitel=1; delitel<cislo; delitel++){
                if(cislo%delitel == 0){
                    a += delitel;
                }
                //podminka pro urceni dokonaleho cisla
                if((cislo==a)&&(delitel==cislo-1)){
                    System.out.println("cislo "+ cislo + " je dokonale");
                    //ukonceni programu
                    cislo = 0;                                    
            }
        }       
      }
    }
}
