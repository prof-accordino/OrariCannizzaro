import java.util.Scanner;

public class DocenteComune extends Docente
{
	static Scanner in = new Scanner(System.in);
	private String Materia;
	private boolean Pratico;

	DocenteComune()
	{
		super();
		System.out.println("se è pratico scrivere p, altrimenti scrivere qualsiasi altra cosa.");
		if( in.nextLine().equals("p"))
		{
			Pratico = true;
		}
		Pratico = false;
	}

	DocenteComune(String Nome, String Cognome,String ClasseDiConcorso, String Materia, boolean Pratico)
	{
		super(Nome, Cognome,ClasseDiConcorso);
		this.Materia=Materia;
		this.Pratico=Pratico;
	}
	
	@Override
	public String toString()
	{
		return this.Nome + " " + this.Cognome + " - " + this.Materia;
	}


}
