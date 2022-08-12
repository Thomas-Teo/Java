package PooA12;

public class Main
{

	public static void main(String[] args)
	{
		// Animal a = new Animal(); Nao pode ser instanciado pois e uma classe abstrata
		Mamifero m = new Mamifero();
		Canguru can = new Canguru();
		Cachorro cac = new Cachorro();
		Reptil r = new Reptil();
		Tartaruga tar = new Tartaruga();
		Peixe p = new Peixe();
		Ave v = new Ave();

		m.setPeso(50);
		m.setIdade(5);
		m.setMembros(5);
		m.locomover();
		m.alimentar();
		m.emitirSom();

		can.locomover();
		can.alimentar();
		can.emitirSom();
		
		cac.locomover();
		cac.alimentar();
	  cac.emitirSom();
	  cac.abanarRabo();
	  cac.enterrarOsso();
		
		r.setPeso(40);
		r.setIdade(8);
		r.setMembros(5);
		r.locomover();
		r.alimentar();
		r.emitirSom();
		
		tar.locomover();
		tar.alimentar();
		tar.emitirSom();

		p.setPeso(2);
		p.setIdade(1);
		p.setMembros(0);
		p.locomover();
		p.alimentar();
		p.emitirSom();
		p.soltarBolha();

		v.setPeso(6);
		v.setIdade(2);
		v.setMembros(4);
		v.locomover();
		v.alimentar();
		v.emitirSom();
		v.fazerNinho();
		
		
	}

}
