import java.util.Scanner;

public class Aula 
{
	static Scanner in = new Scanner(System.in);
	protected String Nome;
	protected String Piano;
	
	Aula()
	{
		System.out.println("inserisci il nome");
		this.Nome=in.nextLine();
		System.out.println("inserisci il piano");
		this.Piano=in.nextLine();
	}
	
	Aula(String Nome, String Piano)
	{
		this.Nome=Nome;
		this.Piano=Piano;
	}
	@Override
	public String toString()
	{
		return Nome;
	}
}
