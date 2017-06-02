public class Menu 
{
	private void show ()
	{
		System.out.println();
		System.out.println("=== MENIU ===");
		System.out.println("1. Prideti nauja preke.");
		System.out.println("2. Perziureti prekes ir ju bendra kaina.");
		System.out.println("3. Uzregistruoti nauja pirkeja.");
		System.out.println("4. Perziureti pirkeju sarasa.");
		System.out.println("5. Parduoti preke pirkejui.");
		System.out.println("0. Iseiti.");
	}
	
	private int getMenuItem ()
	{
		// todo 2.4.2.
		return 0;
	}
	
	public void start ()
	{
		show ();
		// todo 2.4.3.
	}

	private void doAddWare() throws Exception
	{
		System.out.println("1. Prideti nauja preke.");
		// todo 4.2.3
	}

	private void doShowWares() throws Exception 
	{
		System.out.println("2. Perziureti prekes likucius.");
		// todo 4.3.2
	}

	private void doAddUser() throws Exception
	{
		System.out.println("3. Uzregistruoti nauja pirkeja.");
		// todo 5.2.3.
	}

	private void doShowUsers() throws Exception 
	{
		System.out.println("4. Perziureti pirkeju sarasa.");
		// todo 5.3.2.
	}

	private void doSell() 
	{
		System.out.println("5. Parduoti preke pirkejui.");
		// todo 6.3.
	}
	
	private String getErrorText (String error)
	{
		switch (error)
		{
			case "ware not found" : return "Preke nerasta"; 
			case "user not found" : return "Pirkejas nerastas";
			case "not enough"     : return "Nepakankamas prekiu likutis";
			case "ok"             : return "Pardavimas sekmingas";
			default               : return "Nepazistama klaida";
		}
	}
}
