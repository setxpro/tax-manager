package entities;

// Se a class tiver um metodo abstrato -> por padrão ela deve ser abstrata.
public abstract class TaxPayer {
	private String name;
	private Double anualIncome;
	
	public TaxPayer() {}

	public TaxPayer(String name, Double anualIncome) {
		super();
		this.name = name;
		this.anualIncome = anualIncome;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnualIncome() {
		return anualIncome;
	}

	public void setAnualIncome(Double anualIncome) {
		this.anualIncome = anualIncome;
	}
	
	
	// Não vai ter implementação aqui.
	// Não tem como dizer a regra de imposto na class generica.
	public abstract double tax();
	
}
