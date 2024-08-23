package entidade_formas_geometricas;

public class Triangulo extends Formas{
	

	public Triangulo(double base, double altura) {
		super(base, altura);
		
	}
	
	@Override
	public double calcularArea() {
		return (base * altura)/2;
	}
	
}
