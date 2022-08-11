package Aula12;

public class Ave extends Animal
{
	// Atributos
	private String corPena;

	// Get Set
	public String getCorPena()
	{
		return corPena;
	}

	public void setCorPena(String corPena)
	{
		this.corPena = corPena;
	}

	// Metodos
	public void fazerNinho()
	{
		System.out.println("Ninho feito");
	}

	@Override
	public void locomover()
	{
		System.out.println("Voando");
	}

	@Override
	public void alimentar()
	{
		System.out.println("Comendo frutas");
	}

	@Override
	public void emitirSom()
	{
		System.out.println("Som de ave");
	}

}
