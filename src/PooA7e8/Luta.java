package PooA7e8;

import java.util.Random;

public class Luta
{
	// Atributos
	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;

	// Metodos
	public Luta(Lutador L1, Lutador L2)
	{
		this.aprovada = L1.getCategoria() == L2.getCategoria() && L1 != L2;
		this.setDesafiado(L1);
		this.setDesafiante(L2);
	}

	public void lutar()
	{
		if (this.aprovada)
		{
			System.out.println("---- DESAFIADO ----\n");
			this.desafiado.apresentar();
			System.out.println("---- DESAFIANTE ---\n");
			this.desafiante.apresentar();

			Random aleatorio = new Random();
			int vencedor = aleatorio.nextInt(3);
			switch (vencedor)
			{
			case 0:
				System.out.println("---- EMPATE ----\n");
				this.desafiado.empatarLuta();
				this.desafiante.empatarLuta();
				break;
			case 1:
				System.out.printf("----- VECEDOR -----\n     %s\n-------------------\n", desafiado.getNome());
				this.desafiado.ganharLuta();
				this.desafiante.perderLuta();
				break;
			case 2:
				System.out.printf("----- VECEDOR ----- \n     %s\n-------------------\n", desafiante.getNome());
				this.desafiante.ganharLuta();
				this.desafiado.perderLuta();
				break;
			}
		}
		else
		{
			System.out.println("A luta não pode acontecer!");
		}
	}

	// Get Set
	public Lutador getDesafiado()
	{
		return desafiado;
	}

	public void setDesafiado(Lutador nome)
	{
		this.desafiado = nome;
	}

	public Lutador getDesafiante()
	{
		return desafiante;
	}

	public void setDesafiante(Lutador nome)
	{
		this.desafiante = nome;
	}

	public int getRounds()
	{
		return rounds;
	}

	public void setRounds(int rounds)
	{
		this.rounds = rounds;
	}

	public boolean getAprovada()
	{
		return aprovada;
	}

	public void setAprovada(boolean aprovada)
	{
		this.aprovada = aprovada;
	}
}
