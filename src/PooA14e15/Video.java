package PooA14e15;

public class Video implements AcoesVideo
{
	// Atributos
	private String titulo;
	private int avaliacao, views, curtidas;
	private boolean reproduzindo;

	// Get Set
	public String getTitulo()
	{
		return titulo;
	}

	public void setTitulo(String titulo)
	{
		this.titulo = titulo;
	}

	public int getAvaliacao()
	{
		return avaliacao;
	}

	public void setAvaliacao(int a)
	{
		this.avaliacao = this.getViews() > 0 ? ((this.getAvaliacao() + a)/this.getViews()) : 0;
	}

	public int getViews()
	{
		return views;
	}

	public void setViews(int views)
	{
		this.views = views;
	}

	public int getCurtidas()
	{
		return curtidas;
	}

	public void setCurtidas(int curtidas)
	{
		this.curtidas = curtidas;
	}

	public boolean getReproduzindo()
	{
		return reproduzindo;
	}

	public void setReproduzindo(boolean reproduzindo)
	{
		this.reproduzindo = reproduzindo;
	}

	// Metodos
	public Video(String titulo)
	{
		this.setTitulo(titulo);
		this.setViews(0);
		this.setAvaliacao(0);
		this.setCurtidas(0);
		this.setReproduzindo(false);
	}

	@Override
	public void playPause()
	{
		this.setReproduzindo(!reproduzindo);
		this.setViews(this.getViews() + 1);
	}

	@Override
	public void like()
	{
		this.setCurtidas(this.getCurtidas() + 1);
	}

	@Override
	public String toString()
	{
		return "Video [titulo=" + titulo + ", avaliacao=" + avaliacao + ", views=" + views + ", curtidas=" + curtidas
				+ ", reproduzindo=" + reproduzindo + "]";
	}

}
