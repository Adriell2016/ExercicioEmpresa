
public class Pessoa {
	private String name;
	private double peso;
	private double altura;
	private double imc;
	
	public Pessoa(String nome, double peso, double altura){
		this.name = nome;
		this.peso = peso;
		this.altura = altura;
		this.setImc(0);
	}
	
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getName() {
		return name;
	}
	
	public double getImc() {
		return imc;
	}

	public void setImc(double imc) {
		this.imc = imc;
	}
	
	public String indiceMassaCorporal(){
		String retorno = null;
		double imc = this.peso/(this.altura*this.altura);
		setImc(imc);
		
		if(imc < 16){
			retorno = "Magreza grave";
		}else if(imc >= 16 && imc < 17){
			retorno = "Magreza moderada";
		}else if(imc >= 17 && imc < 18.5){
			retorno = "Magreza leve";
		}else if(imc >= 18.5 && imc < 25){
			retorno = "Saudavel";
		}else if(imc >= 25 && imc < 30){
			retorno = "Sobrepeso";
		}else if(imc >= 30 && imc < 35){
			retorno = "Obesidade Grau I";
		}else if(imc >= 35 && imc < 40){
			retorno = "Obesidade Grau II (severa)";
		}else{
			retorno = "Obesidade Grau III (mórbida)";
		}
		
		return retorno;
		
	}
	
	
	@Override
	public String toString(){
		return "Este é " + this.name;
	}
	
	@Override
	public boolean equals(Object obj){
		if(obj instanceof Pessoa){
			Pessoa outro = (Pessoa) obj;
			if(outro.getName().equals(this.name) && outro.getPeso() == this.peso){
				return true;
			}
		}
		return false;
	}

	
	
	

}
