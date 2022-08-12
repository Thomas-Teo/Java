package PooA13;

public class Cachorro extends Lobo
{
	// Metodos
	@Override
	public void emitirSom()
	{
		System.out.println("Au! Au! Au!");
	}

	public void reagir(String fala)
	{
		String reacao = fala == "toma comida" || fala == "ola" ? "Abanando o rabo e latindo" : "Rosnando";
		System.out.println(reacao);
	}

	public void reagir(int hora)
	{
		String reacao = hora < 12 ? "Abanando o rabo" : (hora < 18 ? "Abanando o rabo e latindo" : "Ignrando");
		System.out.println(reacao);
	}

	public void reagir(boolean dono)
	{
		String reacao = dono ? "Abanando o rabo" : "Rosnando e latindo";
		System.out.println(reacao);
	}

	public void reagir(int idade, double peso)
	{
		String reacao = idade < 5 && peso < 10 ? "Abanando o rabo"
				: (idade < 5 && peso > 10 ? "Latindo" : (peso > 10 ? "Ignorando" : "Rosnando"));
	}
}
