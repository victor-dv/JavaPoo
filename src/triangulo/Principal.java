package triangulo;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args ) {
		
		//double aX, bX, cX, aY, bY, cY;
		Triangulo triangleX, triangleY;
		
		triangleX = new Triangulo();
		triangleY = new Triangulo();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite os lados do primeiro Triangulo");
		
		triangleX.sideA = scanner.nextDouble();
		triangleX.sideB = scanner.nextDouble();
		triangleX.sideC = scanner.nextDouble();
		
    	System.out.println("Digite os lados do segundo Triangulo");
        
    	triangleY.sideA = scanner.nextDouble();
		triangleY.sideB = scanner.nextDouble();
		triangleY.sideC = scanner.nextDouble();
        
        //double p = (triangleX.sideA + triangleX.sideB + triangleX.sideC ) / 2;
       // double areaX = Math.sqrt(p * (p - triangleX.sideA) * (p - triangleX.sideB) * (p - triangleX.sideC));
        
         //p = (triangleY.sideA + triangleY.sideB + triangleY.sideC ) / 2;
       // double areaY = Math.sqrt(p * (p - triangleY.sideA) * (p - triangleY.sideB) * (p - triangleY.sideC));
         
         double areaX = triangleX.area();
         double areaY = triangleY.area();

         System.out.println("A area do triangulo é  igual:" + areaX);
         System.out.println("A area do triangulo 2 é  igual:" + areaY);
        
        if(areaX > areaY) {
        	System.out.println("A area do triangulo x é maior");
        }else {
        	System.out.println("A area do triangulo y é maior");
        }
        
        
		
		scanner.close(); // Fecha o scanenr
	}
}
