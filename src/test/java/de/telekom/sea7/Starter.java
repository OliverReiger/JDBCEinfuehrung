package de.telekom.sea7;

public class Starter {

	public static void main(String[] args) {
		
		Personen personen = new Personen();

		personen.personenEintragen("Peggy", "Nikolaus", 22);
		
		personen.personenAusgeben();

	}

}
