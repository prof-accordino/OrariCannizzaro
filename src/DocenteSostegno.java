import java.util.Scanner;

public class DocenteSostegno extends Docente
{
	static Scanner in = new Scanner(System.in);
	private int numSostituti;
	DocenteSostegno()
	{
		super();
		System.out.println("inserisci il numero dei sostituti");
		this.numSostituti=Integer.parseInt(in.nextLine());;
	}
	
	DocenteSostegno(String Nome, String Cognome,String ClasseDiConcorso,int numSostituti)
	{
		super(Nome, Cognome,ClasseDiConcorso);
		this.numSostituti=numSostituti;
	}
	
	@Override
	public String toString()
	{
		return this.Nome + " " + this.Cognome + " - sostegno";
	}
	
}
