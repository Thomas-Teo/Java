package PooA9;

public class Livro implements Publicacao
{
	// Atributos
	private String titulo, autor;
	private Pessoa leitor;
	private int totPaginas, pagAtual;
	private boolean aberto;

	// Get Set
	public Livro(String titulo, String autor, Pessoa leitor, int totPaginas)
	{
		this.titulo = titulo;
		this.autor = autor;
		this.leitor = leitor;
		this.aberto = false;
		this.pagAtual = 0;
		this.totPaginas = totPaginas;
	}

	public String getTitulo()
	{
		return titulo;
	}

	public void setTitulo(String titulo)
	{
		this.titulo = titulo;
	}

	public String getAutor()
	{
		return autor;
	}

	public void setAutor(String autor)
	{
		this.autor = autor;
	}

	public Pessoa getLeitor()
	{
		return leitor;
	}

	public void setLeitor(Pessoa leitor)
	{
		this.leitor = leitor;
	}

	public int getTotPaginas()
	{
		return totPaginas;
	}

	public void setTotPaginas(int totPaginas)
	{
		this.totPaginas = totPaginas;
	}

	public int getPagAtual()
	{
		return pagAtual;
	}

	public void setPagAtual(int pagAtual)
	{
		this.pagAtual = pagAtual;
	}

	public boolean isAberto()
	{
		return aberto;
	}

	public void setAberto(boolean aberto)
	{
		this.aberto = aberto;
	}

	// Metodos
	public String detalhes()
	{
		return "Livro [titulo=" + titulo + ",\n autor=" + autor + ",\n leitor=" + leitor.getNome() + ",\n totPaginas=" + totPaginas
				+ ",\n pagAtual=" + pagAtual + ",\n aberto=" + aberto + "]";
	}

	// Metodos Abstratos

	@Override
	public void abrir()
	{
		this.aberto = true;
	}

	@Override
	public void fechar()
	{
		this.aberto = false;
	}

	@Override
	public void folhear(int p)
	{
		this.pagAtual = this.aberto && p < this.totPaginas ? p : this.pagAtual;
	}

	@Override
	public void avancarPag()
	{
		this.pagAtual = this.aberto && this.pagAtual + 1 < this.totPaginas ? this.pagAtual + 1: this.pagAtual;
	}

	@Override
	public void voltarPag()
	{
		this.pagAtual = this.aberto && this.pagAtual - 1 > 0 ? this.pagAtual - 1 : this.pagAtual;
	}

}
