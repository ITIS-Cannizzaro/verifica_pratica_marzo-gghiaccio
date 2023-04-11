import java.util.Scanner;

// Chiamare la classe col proprio cognome
public class Donizetti
{
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args)
	{
		while(true)
		{
			stampaMenu();
			int scelta = Integer.parseInt(in.nextLine());
			switch(scelta)
			{

			case 1:
				MinimodiArray();
				break;
			case 2:
				ParoleMisteriose();
				break;
			case 3:
				StampaPari();
				break;
			case 4:
				ArrayDivisori();
				break;

			case 5:
				break;

			case 6 :
				LancioRisiko();
				break;
			default:
				System.out.println("Scelta errata, riprova!");

			}
		}
	}
	static void stampaMenu()
	{

		System.out.println("1 - Es n. 1 - Minimo di Array");
		System.out.println("2 - Es n. 2 - Parole misteriose *");
		System.out.println("3 - Es n. 3 - Stampa di Pari");
		System.out.println("4 - Es n. 4 - Array divisori");
		System.out.println("5 - Es n. 5 - Stampa a zigzag");
		System.out.println("6 - Es n. 6 - Lancio risiko");
		System.out.println("7 - Es n. 7 - Uguali consecutivi");
	}

	public static void MinimodiArray()
	{
		int [] Numeri = new int [10];
		int Minimo = 0;
		int Indice = 0;

		for(int i=0; i<Numeri.length; i++)
		{
			Numeri[i] = (int) ((Math.random()*11)-5);
		}

		for(int i=0; i<Numeri.length; i++)
		{
			System.out.print(Numeri[i] + ";");
		}

		if (Numeri[0] < Numeri[1])
		{
			Minimo = Numeri[0];
			Indice = 0;
		}

		else if (Numeri[0] > Numeri[1])
		{
			Minimo=Numeri[1];
			Indice=1;
		}


		for(int i=2; i<Numeri.length -1; i++)
		{
			if (Minimo > Numeri[i])
			{
				Minimo = Numeri[i];
				Indice = i;
			}
		}

		System.out.println(Indice);
	}


	public static void ParoleMisteriose()
	{
		String [] Array = {"ciao", "cheneso", "faniente", "mistero", "non"};
		System.out.println("Indovinare una delle parole inserite");

		System.out.println("Inserire prima parola");
		String A = in.nextLine();

		int Tentativo=0;

		for(int i=0; i<Array.length; i++)
		{
			if (A.equals(Array[i]))
			{
				System.out.println("Hai indovinato!");
				break;
			}
			else if(A!=Array[i])
			{
				System.out.println("Riprovare, inserire altra parola");
				Tentativo+=1;
				String B = in.nextLine();
				if (B.equals(Array[i]))
				{
					System.out.println("Hai indovinato!");
					System.out.println("Numero tentativi:" + Tentativo);
				}
				else if(B!=Array[i])
				{
					System.out.println("Riprovare, inserire altra parola");
					Tentativo+=1;
					String C = in.nextLine();
					if (C.equals(Array[i]))
					{
						System.out.println("Hai indovinato!");
						System.out.println("Numero tentativi:" + Tentativo);
					}
					else if(C!=Array[i])
					{
						Tentativo +=1;
						if (Tentativo == 3)
						{
							System.out.println("Mi dispiace, riprovare dall'inizio");
						}
					}
				}
			}
		}

	}

	public static void StampaPari()
	{
		int [] Numeri = new int [20];
		int [] NumeriPari = new int [20];
		int IndicePari=0;
		int Temp=0;
		for (int i=0; i<Numeri.length; i++)
		{
			Numeri[i] = (int)((Math.random()* 100)+1);
		}


		for(int i=0; i<Numeri.length; i++)
		{
			System.out.print(Numeri[i] + "; ");
		}

		for(int i=0; i<Numeri.length; i++)
		{
			if(Numeri[i]%2 == 0)
			{
				NumeriPari[IndicePari] = Numeri[i];
				IndicePari+=1;
			}
		}

		for(int i=0; i<NumeriPari.length; i++)
		{
			for (int j=1; j<NumeriPari.length -1; j++)
				if (NumeriPari[i] < NumeriPari[j])
				{
					Temp=NumeriPari[i];
					NumeriPari[i] = NumeriPari[j];
					NumeriPari[j] = Temp;
				}
		}
		for (int i=0; i<NumeriPari.length; i++)
		{
			System.out.println(NumeriPari[i] +";");
		}
	}

	public static void ArrayDivisori()
	{
		int [] Numeri = new int [50];
		int [] NonhoFantasia = new int[8];
		int Indice=0; 
		int Quantita=0;
		for (int i = 0; i< Numeri.length; i++)
		{
			Numeri[i] = (int) ((Math.random()*100)+1);
		}

		for(int i=2; i<=9; i++)
		{
			for(int j=0; j<Numeri.length; j++)
			{
				if(Numeri[j] % i == 0)
				{
					Quantita+=1;
				}
				NonhoFantasia[Indice] = Quantita;
				Indice +=1;

			}
		}

		for(int i=0; i<NonhoFantasia.length; i++)
		{
			System.out.println(NonhoFantasia[i] + ";");
		}
	}

	public static void LancioRisiko()
	{
		int [] Attaccante = new int [3];
		int [] Difensore = new int [3];
		int temp=0;
		int CAAtt=0;
		int CADif=0;

		for(int i=0; i<Attaccante.length; i++)
		{
			Attaccante[i] = (int) ((Math.random()* 6) +1);
		}
		for(int i=0; i<Difensore.length; i++)
		{
			Difensore[i] = (int) ((Math.random()* 6) +1);
		}

		System.out.println("Stampa arrays non ordinati");

		for (int i=0; i<Attaccante.length; i++)
		{
			System.out.print(Attaccante[i] + " ;");
		}

		for (int i=0; i<Difensore.length; i++)
		{
			System.out.print(Difensore[i] + " ;");
		}



		for(int i=0; i<Attaccante.length; i++)
		{
			for(int j=1; j<Attaccante.length; j++)
			{
				if(Attaccante[i]<Attaccante[j])
				{
					temp=Attaccante[i];
					Attaccante[i] = Attaccante[j];
					Attaccante[j] = temp;
				}
			}
		}

		for(int i=0; i<Difensore.length; i++)
		{
			for(int j=1; j<Difensore.length; j++)
			{
				if(Difensore[i]<Difensore[j])
				{
					temp=Difensore[i];
					Difensore[i] = Difensore[j];
					Difensore[j] = temp;
				}
			}
		}
		System.out.println("Stampa arrays ordinati");

		for (int i=0; i<Attaccante.length; i++)
		{
			System.out.print(Attaccante[i] + " ;");
		}
		for (int i=0; i<Difensore.length; i++)
		{
			System.out.print(Difensore[i] + " ;");
		}




		for(int i=0; i < Difensore.length; i++)
		{
			if(Attaccante[i] > Difensore[i])
			{
				CAAtt+=1;
			}
			if(Attaccante[i] < Difensore[i])
			{
				CADif+=1;
			}
			if(Attaccante[i] == Difensore[i])
			{
				CADif+=1;
			}
		}

		System.out.println("Punteggio attaccante:" + CAAtt);
		System.out.println("Punteggio difensore:" + CADif);

		if(CAAtt > CADif)
		{
			System.out.println("Il vincitore è l'attaccante");
		}
		else if(CAAtt < CADif)
		{
			System.out.println("Il vincitore è il difensore");
		}
	}
}
