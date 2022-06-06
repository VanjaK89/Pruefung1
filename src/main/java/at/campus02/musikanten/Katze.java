package at.campus02.musikanten;

public class Katze extends Musikant{

	protected double KratzKraft;

	public Katze(int anzahlBeine, Instrument instrument,double KratzKraft ) {
		super(anzahlBeine, instrument);
		this.KratzKraft = KratzKraft;
	}

	public double getKratzKraft() {
		return KratzKraft;
	}

	@Override
	public int verscheucheRaeuber() {
		if(anzahlBeine >= 4){
			return (int) KratzKraft;
		}
		else if( anzahlBeine == 3){
			return (int) KratzKraft /2;
		}
		else
		return 1;
	}

	@Override
	public double spieleMusik() {
		return instrument.getLautstaerke();
	}

	@Override
	public String toString() {
		return "Katze " + KratzKraft + super.toString();
	}
}
