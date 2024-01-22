import java.util.Scanner;

public class MainClass
{
	static Scanner in = new Scanner(System.in);
	static Docente [] arrayDocenti = new Docente[200];

	static Classe [] arrayClassi =
	{
		new Classe (4, "D", "informatica"),
		new Classe (5, "A", "chimica"),
		new Classe (2, "B", "grafica")
		// Aggiungere altre classi a piacere
	};

	static Aula [] arrayAule =
	{
		new Aula ("A212", "2"),
		new Aula ("A303", "3"),
		new Aula ("A105", "1"),
		new Aula ("magna", "0"),
		new Laboratorio ("S22", "S", "internet")
		// Aggiungere altre aule a piacere
	};
	static Lezione [] arrayLezioni = new Lezione[1000];

	public static void main(String[] args)
	{		
		arrayDocenti[0] = new DocenteComune("Andrea", "Accordino", "A041", "informatica", false);
		arrayDocenti[1]	= new DocenteComune("Silvia", "Pizzi", "B016", "informatica", true);
		arrayDocenti[2]	= new DocenteSostegno("Lucrezia", "Comparetto", "ADSS", 2);
		// Aggiungere altri docenti a piacere
		
		while(true)
		{
			stampaMenu();
			int scelta = Integer.parseInt(in.nextLine());
			switch(scelta)
			{
			case 1:
				inserisciDocente();
				break;
			case 2:
				eliminaDocente();
				break;
			case 3:
				inserisciClasse();
				break;
			case 4:
				eliminaClasse();
				break;
			case 5:
				inserisciLezione();
				break;
			default:
				System.out.println("Scelta errata, riprova!");

			}
		}
	}

	static void stampaMenu()
	{
		// Se presente si può sostituire "esercizio *" con il nome dell'esercizio
		System.out.println("Esercizio 1");
		System.out.println("Esercizio 2");
		System.out.println("Esercizio 3");
		System.out.println("Esercizio 4");
		System.out.println("Esercizio 5");
	}

	static void inserisciLezione()
	{
		int IndiceVuoto = checkVuotoLezione();
		if(IndiceVuoto != -1)
		{
			System.out.println("Quanti docenti?");
			int nDocenti = Integer.parseInt(in.nextLine());
			stampaDocenti();
			Docente[] docentiLezione = new Docente[nDocenti];
			for(int i = 0; i < nDocenti; i++)
			{
				System.out.println("Inserire l'indice del docente");
				docentiLezione[i] = arrayDocenti[Integer.parseInt(in.nextLine())];
			}
			System.out.println("Quale aula?");
			stampaAule();
			int iAula = Integer.parseInt(in.nextLine());
			
			System.out.println("Quale classe?");
			stampaClasse();
			int iClasse = Integer.parseInt(in.nextLine());
			
			System.out.println("Quale giorno? [lun - mar - mer ...]");
			String giorno = in.nextLine();
			
			System.out.println("Quale ora? 1, 2, ... 8");
			int ora = Integer.parseInt(in.nextLine());
			arrayLezioni[IndiceVuoto] = new Lezione(
					docentiLezione, 
					arrayAule[iAula],
					arrayClassi[iClasse],
					ora,giorno);		
		}
	}
	static void stampaClasse()
	{
		for (int i = 0; i < arrayClassi.length; i++)
			if(arrayClassi[i] != null)
			{
				System.out.println(i + " - " + arrayClassi[i]);
			}
	}
	
	static void stampaDocenti()
	{
		for (int i = 0; i < arrayDocenti.length; i++)
			if(arrayDocenti[i] != null)
			{
				System.out.println(i + " - " + arrayDocenti[i]);
			}
	}

	static void stampaAule()
	{
		for (int i = 0; i < arrayAule.length; i++)
			if(arrayAule[i] != null)
			{
				System.out.println(i + " - " + arrayAule[i]);
			}
	}
	
	static void inserisciDocente()
	{
		int IndiceVuoto = checkVuotoDocente();
		if(IndiceVuoto != -1)
		{
			System.out.println("Vuoi inserire un docente Comune o uno di sostegno");
			switch(in.nextLine())
			{
			case "comune":
				arrayDocenti[IndiceVuoto]= new DocenteComune();
				break;
			case "sostegno":
				arrayDocenti[IndiceVuoto]= new DocenteSostegno();
				break;
			}

		}
	}

	static int checkVuotoDocente()
	{
		for (int i = 0; i < arrayDocenti.length; i++)
			if(arrayDocenti[i] == null)
			{
				return i;
			}
		return -1;			
	}
	
	static int checkVuotoLezione()
	{
		for (int i = 0; i < arrayLezioni.length; i++)
			if(arrayLezioni[i] == null)
			{
				return i;
			}
		return -1;			
	}

	static void eliminaDocente()	
	{
		System.out.println("inserisci il cognome del docente da eliminare");
		int IndiceDelDocenteCheVogliamoEliminare= cercaInArrayDocente(in.nextLine());
		if(IndiceDelDocenteCheVogliamoEliminare != -1)
			arrayDocenti[IndiceDelDocenteCheVogliamoEliminare] = null;
	}


	static int cercaInArrayDocente (String Cognome)
	{
		for (int i = 0; i < arrayDocenti.length; i++)
			if(arrayDocenti[i] != null && arrayDocenti[i].getCognome().equals(Cognome))
				return i;
		return -1;			
	}

	static void inserisciClasse()
	{
		int IndiceVuoto = checkVuotoClasse();
		if(IndiceVuoto != -1)
		{	
			arrayClassi[IndiceVuoto] = new Classe();
		}
	}

	static int checkVuotoClasse()
	{
		for (int i = 0; i < arrayClassi.length; i++)
			if(arrayClassi[i] == null)
			{
				return i;
			}
		return -1;			
	}

	static void eliminaClasse()	
	{
		System.out.println("inserisci l'anno");
		int Indicevuoto= cercaInArrayClasseanno(Integer.parseInt(in.nextLine()));
		if(Indicevuoto != -1)
		{
			System.out.println("inserisci la sezione");
			int Indicevuoto2= cercaInArrayClassesezione(in.nextLine());
			arrayClassi[Indicevuoto2] = null;
		}
	}


	static int cercaInArrayClasseanno (int anno)
	{
		for (int i = 0; i < arrayClassi.length; i++)
			if(arrayClassi[i] != null && arrayClassi[i].getanno() == anno)
				return i;
		return -1;			
	}
	
	static int cercaInArrayClassesezione (String sezione)
	{
		for (int i = 0; i < arrayClassi.length; i++)
			if(arrayClassi[i] != null && arrayClassi[i].getsezione().equals(sezione))
				return i;
		return -1;			
	}

	/*
	 * Cominciare guardando questo metodo!
	 */
	static void stampaOrarioSettinale()
	{
		System.out.println("Quale classe?");
		// Scegliere classe
		for(int i = 0; i < arrayLezioni.length; i++)
		{
			if(arrayLezioni[i]. /* Cosa devo mettere qui?*/)

			for(int j = 0; j < arrayLezioni.length; j++)
			{
				// Completare aggiungendo anche qualche metodo nelle 
				// classi in modo di poter scegliere con degli
				// opportuni if quale giorno e ora stampare e dove
			}
			
		}
	}

	static void es5()
	{
		// Inserire codice es. 5	
	}



}

