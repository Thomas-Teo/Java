package PooA14e15;

public class Visualizacao
{
	// Atributos
	private Gafanhoto espectador;
	private Video filme;

	// Get Set
	public Gafanhoto getEspectador()
	{
		return espectador;
	}

	public void setEspectador(Gafanhoto espectador)
	{
		this.espectador = espectador;
	}

	public Video getFilme()
	{
		return filme;
	}

	public void setFilme(Video filme)
	{
		this.filme = filme;
	}

	// Metodos
	public Visualizacao(Gafanhoto espectador, Video filme)
	{
		this.espectador = espectador;
		this.filme = filme;
		this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1);
		this.filme.setViews(this.filme.getViews() + 1);
	}

	@Override
	public String toString()
	{
		return "Visualizacao [espectador=" + espectador + ", filme=" + filme + "]";
	}

	public void avaliar()
	{
		this.filme.setAvaliacao(5);
	}

	public void avaliar(int nota)
	{
		this.filme.setAvaliacao(nota);
	}

	public void avaliar(double porc)
	{
		this.filme.setAvaliacao(porc <= 20 ? 3 : (porc <= 50 ? 5 : (porc <= 90 ? 8 : 10)));
	}
}
