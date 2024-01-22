import java.util.Scanner;

public class Laboratorio  extends Aula
{
	static Scanner in = new Scanner(System.in);
	private String Tipo;
	
	Laboratorio()
	{
		super();
		System.out.println("inserisci il tipo");
		this.Tipo=in.nextLine();
	}
	
	Laboratorio(String Nome, String Piano, String Tipo)
	{
		super(Nome, Piano);
		this.Tipo=Tipo;
	}
	
	@Override
	public String toString()
	{
		return Nome + " - Laboratorio";
	}
	
}
