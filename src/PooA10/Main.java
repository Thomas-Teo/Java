package PooA10;

public class Main
{

	public static void main(String[] args)
	{
		Pessoa p1 = new Pessoa();
		Aluno p2 = new Aluno();
		Professor p3 = new Professor();
		Funcionario p4 = new Funcionario();
		
		p1.setNome("Thomas");
		p2.setNome("Joanzinho");
		p3.setNome("Mariazinha");
		p4.setNome("Pedrinho");
		
		p1.setIdade(18);
		
		p2.setCurso("ADS");
		p3.setEspecialidade("Analista");
		p4.setSetor("informatica");
	}

}
