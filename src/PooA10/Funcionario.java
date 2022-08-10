package PooA10;

public class Funcionario extends Pessoa
{
	// Atributos
	private String setor;
	private boolean trabalhando;

	// Get Set
	public String getSetor()
	{
		return setor;
	}

	public void setSetor(String setor)
	{
		this.setor = setor;
	}

	public boolean isTrabalhando()
	{
		return trabalhando;
	}

	public void setTrabalhando(boolean trabalhando)
	{
		this.trabalhando = trabalhando;
	}

	// Metodos
	public void mudarTrabalho()
	{
		this.trabalhando = !this.trabalhando;
	}
}