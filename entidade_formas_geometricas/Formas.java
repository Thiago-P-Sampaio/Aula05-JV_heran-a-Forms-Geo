package entidade_formas_geometricas;

public class Formas {
	
	protected double base ,altura;
	protected int largura;

	public Formas(double base, int largura) {
		this.base = base;
		this.largura = largura;

	}
	
	public Formas(double base,  double altura) {
		this.base = base;
		this.altura = altura;
	}

	
	public double calcularArea() {
		return base * largura;
	}
	
	public String mostrarInfoT() {
		return "\nÁrea do Triângulo:" 
	    + "\nDados: \nBase: " + base +
	    "\nAltura: " + altura + "\nÁrea: " + calcularArea();
		}
	
	public String mostrarInfoR() {
		return "\nÁrea do Retângulo:" 
	    + "\nDados: \nBase: " + base +
	    "\nlargura: " + largura + "\nÁrea: " + calcularArea();
		}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public int getLargura() {
		return largura;
	}

	public void setLargura(int largura) {
		this.largura = largura;
	}
	

	


	
	
	

}
