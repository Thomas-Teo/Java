package PooA11;

public abstract class Pessoa
{
	// Atributos
	private String nome, sexo;
	private int idade;

	// Get Set
	public String getNome()
	{
		return nome;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public String getSexo()
	{
		return sexo;
	}

	public void setSexo(String sexo)
	{
		this.sexo = sexo;
	}

	public int getIdade()
	{
		return idade;
	}

	public void setIdade(int idade)
	{
		this.idade = idade;
	}

	// Metodos
	public final void fazerAniv()
	{
		this.setIdade(getIdade() + 1);
	}

	@Override
	public String toString()
	{
		return "Pessoa [nome=" + nome + ", sexo=" + sexo + ", idade=" + idade + "]";
	}
}
