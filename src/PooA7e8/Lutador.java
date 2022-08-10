package PooA7e8;

public class Lutador
{
	// Atributos
	private String nome, nacionalidade, categoria;
	private int idade, vitorias, derrotas, empate;
	private float altura, peso;

	public Lutador(
			String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empate
	)
	{
		setNome(nome);
		setNacionalidade(nacionalidade);
		setIdade(idade);
		setAltura(altura);
		setPeso(peso);
		setVitorias(vitorias);
		setDerrotas(derrotas);
		setEmpate(empate);
	}

	// Metodos
	public void status()
	{
		System.out.printf(
				"---- Lutador ----\n" + "Nome: %s " + "\nNacionalidade: %s " + "\nIdade: %s " + "\nAltura: %s m"
						+ "\nPeso: %s Kg" + "\nCategoria: %s " + "\nVitorias: %s " + "\nDerrotas: %s " + "\nEmpate: %s\n",
				getNome(), getNacionalidade(), getIdade(), getAltura(), getPeso(), getCategoria(), getVitorias(), getDerrotas(),
				getEmpate()
		);
	}

	public void apresentar()
	{
		System.out.printf(
				"---- Lutador ------\n     %s \n---- Categoria ---- \n      %s \n---- Vitórias ----- \n        %s \n---- Derrotas ----- \n        %s \n---- Empates ------ \n        %s \n-------------------\n\n",
				getNome(), getCategoria(), getVitorias(), getDerrotas(), getEmpate()
		);
	}

	public void ganharLuta()
	{
		this.setVitorias(this.getVitorias() + 1);
	}

	public void perderLuta()
	{
		this.setDerrotas(this.getDerrotas() + 1);
	}

	public void empatarLuta()
	{
		this.setEmpate(this.getEmpate() + 1);
	}

	// Get Set
	public String getNome()
	{
		return nome;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public String getNacionalidade()
	{
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade)
	{
		this.nacionalidade = nacionalidade;
	}

	public int getIdade()
	{
		return idade;
	}

	public void setIdade(int idade)
	{
		this.idade = idade;
	}

	public float getAltura()
	{
		return altura;
	}

	public void setAltura(float altura)
	{
		this.altura = altura;
	}

	public float getPeso()
	{
		return peso;
	}

	public void setPeso(float peso)
	{
		this.peso = peso;
		this.setCategoria();
	}

	public String getCategoria()
	{
		return categoria;
	}

	private void setCategoria()
	{
		this.categoria = getPeso() < 52.2f ? "Inválido"
				: (getPeso() <= 70.3f ? "Leve" : (getPeso() <= 83.9f ? "Médio" : (getPeso() <= 120.2 ? "Pesado" : "Inválido")));
	}

	public int getVitorias()
	{
		return vitorias;
	}

	public void setVitorias(int vitorias)
	{
		this.vitorias = vitorias;
	}

	public int getDerrotas()
	{
		return derrotas;
	}

	public void setDerrotas(int derrotas)
	{
		this.derrotas = derrotas;
	}

	public int getEmpate()
	{
		return empate;
	}

	public void setEmpate(int empate)
	{
		this.empate = empate;
	}
}
