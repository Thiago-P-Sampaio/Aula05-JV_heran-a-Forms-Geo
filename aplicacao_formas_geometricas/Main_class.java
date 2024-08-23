package aplicacao_formas_geometricas;

import java.util.Scanner;

import entidade_formas_geometricas.Formas;
import entidade_formas_geometricas.Retangulo;
import entidade_formas_geometricas.Triangulo;


public class Main_class {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//
		//
	 Formas r = new Retangulo(0,0);
	 Formas t = new Triangulo(0, 0);
	 
		System.out.print("\nInforme a Base Retângulo:   ");
		r.setBase(sc.nextDouble());
		System.out.print("\nInforme a Largura do Retângulo:  ");
		r.setLargura(sc.nextInt());
		System.out.print("\nInforme a  a Base do Triângulo: ");
		t.setBase(sc.nextDouble());
		System.out.print("\nInforme a Altura do Triângulo: ");
		t.setAltura(sc.nextDouble());
		
	 
	 
	 System.out.print(t.mostrarInfoT());
	 System.out.print(r.mostrarInfoR());
	
	 
	}

}
