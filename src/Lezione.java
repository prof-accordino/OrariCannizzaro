import java.util.Scanner;

public class Lezione 
{
	static Scanner in = new Scanner(System.in);
	private Docente[] ArrayDocenti= new Docente[3];
	private int ora;
	private String giorno;
	private Classe classe;
	private Aula aula;
	
	Lezione(Docente[]Docenti, Aula aula, Classe classe, int ora, String giorno)
	{
		this.ArrayDocenti=Docenti;
		this.aula=aula;
		this.classe=classe;
		this.ora=ora;
		this.giorno=giorno;
	}
	
	@Override
	public String toString()
	{
		String output;
		output = giorno + " " + ora + aula + classe;
		for(Docente d : ArrayDocenti)
			output += d;
		
		return output;
	}

	
//	Lezione()
//	{
//		
//		System.out.println("inserisci l'ora");
//		this.Ora=Integer.parseInt(in.nextLine());
//		System.out.println("inserisci il giorno");
//		this.giorno=in.nextLine();
//		System.out.println("inserisci la classe");
//		this.classe=new Classe();
//		System.out.println("inserisci l'aula");
//		this.aula=new Aula();
//	}
}
