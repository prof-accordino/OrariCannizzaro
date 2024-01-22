import java.util.Scanner;

public abstract class Docente 
{
	static Scanner in = new Scanner(System.in);
	protected String Nome, Cognome, ClasseDiConcorso;
	
	Docente()
	{
		System.out.println("inserisci il nome");
		this.Nome=in.nextLine();
		System.out.println("inserisci il cognome");
		this.Cognome=in.nextLine();
		System.out.println("inserisci la classe di concorso");
		this.ClasseDiConcorso=in.nextLine();
	}
	
	Docente(String Nome, String Cognome,String ClasseDiConcorso)
	{
		this.Nome=Nome;
		this.Cognome=Cognome;
		this.ClasseDiConcorso=ClasseDiConcorso;
	}
	
	@Override
	public String toString()
	{
		String output;
		output = Nome + Cognome + ClasseDiConcorso;
		return output;
	}

	public String getnome()
	{
		return this.Nome;
	}	
	
	public String getCognome()
	{
		return this.Cognome;
	}
}
