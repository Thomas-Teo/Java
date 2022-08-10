package PooA9;

public class Main
{

	public static void main(String[] args)
	{
	Pessoa Thomas = new Pessoa("Thomas", 18, 'M');
	Pessoa Joanzinho = new Pessoa("Joanzinho", 15, 'M');
	Pessoa Mariazinha = new Pessoa("Mariazinha", 17, 'F');
	
	Livro l1 = new Livro("Joao e Maria", "Joanzinho", Joanzinho, 100);
	Livro l2 = new Livro("POO na pratica", "Thomas", Thomas, 200);
	Livro l3 = new Livro("Java", "Mariazinha", Mariazinha, 150);
	
	l1.abrir();
	l1.voltarPag();
	System.out.println(l1.detalhes());
	System.out.println(l2.detalhes());
	System.out.println(l3.detalhes());
	}
}
