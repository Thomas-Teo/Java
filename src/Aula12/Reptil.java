package Aula12;

public class Reptil extends Animal
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
	@Override
	public void locomover()
	{
		System.out.println("Rastejando");
	}

	@Override
	public void alimentar()
	{
		System.out.println("Comendo vegetais");
	}

	@Override
	public void emitirSom()
	{
		System.out.println("Som de reptil");
	}

}
