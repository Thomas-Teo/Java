package PooA6;
public class ControleRemoto implements Controlador {
	private int volume;
	private boolean ligado;
	private boolean tocando;

	public ControleRemoto() {
		this.volume = 50;
		this.ligado = false;
		this.tocando = false;
	}
	
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	
	public void setTocando(boolean tocando) {
		this.tocando = tocando;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public boolean getLigado() {
		return ligado;
	}

	public boolean getTocando() {
		return tocando;
	}
	
	@Override
	public void ligar() {
		this.setLigado(true);
	}
	
	@Override
	public void desligar() {
		this.setLigado(false);
	}
	
	@Override
	public void abrirMenu() {
		System.out.println("---- MENU ----");
		System.out.println("Está ligado? " + this.getLigado());
		System.out.println("Está tocando? " + this.getTocando());
		System.out.println("Volume: " + this.getVolume());
		for (int i = 0; i <= this.getVolume(); i += 10) {
			System.out.print("|");
		}
	}
	
	@Override
	public void fecharMenu() {
		System.out.println("Fechar Menu...");
	}
	
	@Override
	public void maisVolume() {
		this.volume = this.getLigado() ? this.getVolume()+1 : 0;
		if (!getLigado()) { 
			System.out.println("Verifique se está ligado");
		}
	}
	
	@Override
	public void menosVolume() {
		this.volume = this.getLigado() ? this.getVolume()-1 : getVolume();
		if (!getLigado()) { 
			System.out.println("Verifique se está ligado");	
		}
	}
	
	@Override
	public void ligarMudo() {
		this.volume = this.getLigado() && this.getVolume() > 0 ? 0 : getVolume(); 
	}
	
	@Override
	public void desligarMudo() {
		this.volume = this.getLigado() && this.getVolume() == 0 ? 50 : getVolume();
	}
	
	@Override
	public void playPause() {
		this.tocando = this.getLigado() && !(this.getTocando()) ? true : false;
	}
}