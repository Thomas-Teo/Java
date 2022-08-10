package PooA7e8;

public class PooA7
{

	public static void main(String[] args)
	{
		Lutador prettyBoy = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 2, 1);
		Lutador putscript = new Lutador("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
		Lutador snapshadow = new Lutador("Snapshadow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
		Lutador deadCode = new Lutador("Dead Code", "Austrália", 28, 1.93f, 81.6f, 13, 0, 2);
		Lutador ufocobol = new Lutador("UFOCobol", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3);
		Lutador nerdaard = new Lutador("Nerdaard", "EUA", 30, 1.21f, 105.7f, 12, 2, 4);

		/*
		 * prettyBoy.status(); putscript.status(); snapshadow.status();
		 * deadCode.status(); ufocobol.status(); nerdaard.status();
		 */

		/*
		 * prettyBoy.apresentar(); putscript.apresentar(); snapshadow.apresentar();
		 * deadCode.apresentar(); ufocobol.apresentar(); nerdaard.apresentar();
		 */

		Luta UEC01 = new Luta(prettyBoy, putscript);
		Luta UEC02 = new Luta(prettyBoy, snapshadow);
		Luta UEC03 = new Luta(prettyBoy, deadCode);
		Luta UEC04 = new Luta(prettyBoy, ufocobol);
		Luta UEC05 = new Luta(prettyBoy, nerdaard);
		Luta UEC06 = new Luta(putscript, snapshadow);
		Luta UEC07 = new Luta(putscript, deadCode);
		Luta UEC08 = new Luta(putscript, ufocobol);
		Luta UEC09 = new Luta(putscript, nerdaard);
		UEC01.lutar();
		UEC02.lutar();
		UEC03.lutar();
		UEC04.lutar();
		UEC05.lutar();
		UEC06.lutar();
		UEC07.lutar();
		UEC08.lutar();
		UEC09.lutar();

	}
}
