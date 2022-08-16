package heranca_polimorfismo;

public class Animais {

	public String nome;
	public int idade;
	public String som;
	public String ação;
	
	public Animais(String nome, int idade, String som, String ação) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.som = som;
		this.ação = ação;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}

	public String getAção() {
		return ação;
	}

	public void setAção(String ação) {
		this.ação = ação;
	}
	
		
	
	}


