package no.hvl.dat100.oppgave3;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;

import java.net.Inet4Address;

public class Blogg {

	// TODO: objektvariable
	Innlegg[] innleggtabell;
	int nesteledig;

	public Blogg() {
		innleggtabell = new Innlegg[20];
	}

	public Blogg(int lengde) {
		innleggtabell = new Innlegg[lengde];
	}

	public int getAntall() {
		int antall = 0;
		for (Innlegg i : innleggtabell) {
			if ( i != null ) {
				antall++;
			}
		}
		return antall;
	}
	
	public Innlegg[] getSamling() {
		return innleggtabell;
	}
	
	public int finnInnlegg(Innlegg innlegg) {
		int index = -1;
		for ( int i = 0; i < innleggtabell.length; i++ ) {
			if (innleggtabell[i] == null) {
				continue;
			} else if (innleggtabell[i].erLik(innlegg)) {
				index = i;
				break;
			}
		}
		return index;
	}

	public boolean finnes(Innlegg innlegg) {
		for ( Innlegg i : innleggtabell ) {
			if (i == null) {
				continue;
			} else if (innlegg.getId() == i.getId() ) {
				return true;
			}
		}
		return false;
	}

	public boolean ledigPlass() {
		for ( int i = 0; i < innleggtabell.length; i++ ) {
			if ( innleggtabell[i] == null ) {
				return true;
			}
		}
		return false;
	}
	
	public boolean leggTil(Innlegg innlegg) {
		if (finnes(innlegg)) {
			return false;
		}
		if (!ledigPlass()) {
			return false;
		}
		for ( int i = 0; i < innleggtabell.length; i++ ) {
			if (innleggtabell[i] == null) {
				innleggtabell[i] = innlegg;
				break;
			}
		}
		return true;
	}

	@Override
	public String toString() {
		String string = getAntall() + "\n";
		for (Innlegg i : innleggtabell) {
			string += i;
		}
		return string;
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}