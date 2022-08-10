package PooA10;

public class Aluno extends Pessoa
{
	// Atributos
	private String curso;
	private int matr;

	// Get Set
	public String getCurso()
	{
		return curso;
	}

	public void setCurso(String curso)
	{
		this.curso = curso;
	}

	public int getMatr()
	{
		return matr;
	}

	public void setMatr(int matr)
	{
		this.matr = matr;
	}

	// Metodos
	public void cancelarMatr()
	{
		this.matr = 0;
		System.out.println("Matricula cancelada");
	}
}
