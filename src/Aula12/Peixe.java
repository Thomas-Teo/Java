package Aula12;

public class Peixe extends Animal
{
	// Atributos
	private String corEscama;

	// Get Set
	public String getCorEscama()
	{
		return corEscama;
	}

	public void setCorEscama(String corEscama)
	{
		this.corEscama = corEscama;
	}

	// Metodos
	public void soltarBolha()
	{
		System.out.println("OOoo...");
	}

	@Override
	public void locomover()
	{
		System.out.println("Nadando");
	}

	@Override
	public void alimentar()
	{
		System.out.println("Comendo algas");
	}

	@Override
	public void emitirSom()
	{
		System.out.println("Peixe não faz som");
	}
}
