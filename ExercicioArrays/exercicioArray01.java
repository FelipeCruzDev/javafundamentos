package repeticoes;
import java.util.*;
public class array {
    /*
Para cada conjunto de
valores abaixo, escreva o código
Java, usando laço(s), que preencha
um array com os valores.
a) 10 9 8 7 6 5 4 3 2 1
b) 0 1 4 9 16 25 36 49 64 81 100
c) 1 2 3 4 5 10 20 30 40 50
d) 3 4 7 12 19 28 39 52 67 84
     */
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	
    	int [] num1 = new int[5];
    	int [] num2 = new int[5];
    	int [] num3 = new int[5];
    	int [] num4 = new int[5];
    	
    	
    	for (int i = 0; i < num1.length;i++ ) {
    	
    	System.out.print("DIGITE OS VALORES: ");
    	num1[i] = input.nextInt();
    	}

    	for (int x = 0;x < num2.length; x++) {
    		System.out.print("DIGITE OS VALORES: ");
        	num2[x] = input.nextInt();
  
    	}
    	for (int y = 0;y < num3.length; y++) {
    		System.out.print("DIGITE OS VALORES: ");
        	num3[y] = input.nextInt();
        
        
    	}
    	for (int z = 0;z < num4.length; z++) {
    		System.out.print("DIGITE OS VALORES: ");
        	num4[z] = input.nextInt();
        	 
    }	
    	 for (int i : num1) {
             System.out.print(i + " ");
         }
         System.out.println();
         for (int i : num2) {
             System.out.print(i + " ");
         }
         System.out.println();
         for (int i : num3) {
             System.out.print(i + " ");
         }
         System.out.println();
         for (int i : num4) {
             System.out.print(i + " ");

    }
}
}
