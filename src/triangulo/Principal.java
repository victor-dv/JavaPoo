package triangulo;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args ) {
		
		double aX, bX, cX, aY, bY, cY;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite os lados do primeiro Triangulo");
		
		aX = scanner.nextDouble();
        bX = scanner.nextDouble();
        cX = scanner.nextDouble();
		
    	System.out.println("Digite os lados do segundo Triangulo");
        
        aY = scanner.nextDouble();
        bY = scanner.nextDouble();
        cY = scanner.nextDouble();
        
        double p = aX + bX + cX / 2;
        double areaX = Math.sqrt(p * (p - aX) * (p - bX) * (p - cX));
        
         p = aY + bY + cY / 2;
         double areaY = Math.sqrt(p * (p - aY) * (p - bY) * (p - cY));
         
     
         System.out.println("A area do triangulo é  igual:" + areaX);
        System.out.println("A area do triangulo 2 é  igual:" + areaX);
        
        if(areaX > areaY) {
        	System.out.println("A area do triangulo x é maior");
        }else {
        	System.out.println("A area do triangulo y é maior");
        }
        
        
		
		scanner.close(); // Fecha o scanenr
	}
}
