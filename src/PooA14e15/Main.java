package PooA14e15;

public class Main
{

	public static void main(String[] args)
	{
		Video html = new Video("Html basico");
		Video java = new Video("Java");
		Gafanhoto g = new Gafanhoto("Thomas", "Masculino", 18, "thomasthomas");
		Gafanhoto gg = new Gafanhoto("Joanzinho", "Masculino", 20, "jojoanzinho");

		System.out.println(g.toString());
		System.out.println(gg.toString());

		Visualizacao vis = new Visualizacao(g, java);
		vis.avaliar();
		System.out.println(vis.toString());

		Visualizacao visu = new Visualizacao(gg, java);
		visu.avaliar(87);
		System.out.println(visu.toString());
		System.out.println(java.toString());
	}

}
