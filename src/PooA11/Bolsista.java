package PooA11;

public class Bolsista extends Aluno
{
	// Atributos
	private double bolsa;
	
	// Get Set

	public double getBolsa()
	{
		return bolsa;
	}

	public void setBolsa(double bolsa)
	{
		this.bolsa = bolsa;
	}

	// Metodos
	public void renovarBolsa(double novaBolsa)
	{
		this.setBolsa(novaBolsa);
	}

	@Override
	public void pagarMensalidade()
	{
		System.out.println("Mensalidade paga, desconto de bolsa aplicada");
	}
}
