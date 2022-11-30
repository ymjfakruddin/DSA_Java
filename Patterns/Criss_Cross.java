package Patterns;

/**
 * Criss_Cross
 */
public class Criss_Cross {
    
    public static void main(String[] args) {
        int n =6;
        int i =1;
        while(i<=n){
            int j=0;
            while(j<i){
                System.out.print(" ");
                j++;
            }
            
            j=0;
            while(j<=i){
                if(i==j){
                    System.out.print("*");
                }
                j++;
            }
            
            i++;
            System.out.println();
        }             
    }
}