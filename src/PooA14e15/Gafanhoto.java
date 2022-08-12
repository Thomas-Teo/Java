package PooA14e15;

public class Gafanhoto extends Pessoa
{
	// Atributos
	private String login;
	private int totAssistido;

	// Get Set
	public String isLogin()
	{
		return login;
	}

	public void setLogin(String login)
	{
		this.login = login;
	}

	public int getTotAssistido()
	{
		return totAssistido;
	}

	public void setTotAssistido(int totAssistido)
	{
		this.totAssistido = totAssistido;
	}

	// Metodos
	public Gafanhoto(String nome, String sexo, int idade, String login)
	{
		super(nome, sexo, idade);
		this.login = login;
		this.totAssistido = 0;
	}

	@Override
	public String toString()
	{
		return "Gafanhoto [" + super.toString() + "login=" + login + ", totAssistido=" + totAssistido + "]";
	}

	public void viuMaisUm()
	{

	}
}
