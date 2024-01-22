import java.util.Scanner;

public class Classe 
{
	static Scanner in = new Scanner(System.in);
	private String nome;
	private String sezione;
	private int anno;
	private String indirizzo;
	
	Classe()
	{
		System.out.println("inserisci l'anno");
		this.anno=Integer.parseInt(in.nextLine());
		System.out.println("inserisci la sezione");
		this.sezione=in.nextLine();
		System.out.println("inserisci l'indirizzo");
		this.indirizzo=in.nextLine();
		nome = anno + sezione + indirizzo;
	}
	
	Classe(int anno, String sezione, String indirizzo)
	{
		this.anno=anno;
		this.sezione=sezione;
		this.indirizzo=indirizzo;
	}
	@Override
	public String toString()
	{
		String d = anno + sezione + " " + indirizzo;
		return d;
	}
	
	public int getanno()
	{
		return anno;
	}
	
	public int getNome()
	{
		return  Name;
	}
	
	public String getsezione()
	{
		return sezione;
	}
	
	public String getindirizzo()
	{
		return indirizzo;
	}
}
