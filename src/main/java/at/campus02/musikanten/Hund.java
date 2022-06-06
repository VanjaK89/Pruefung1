package at.campus02.musikanten;

public class Hund extends  Musikant{

	protected double BellLautstaerke;

	public Hund(int anzahlBeine, Instrument instrument, double BellLautstaerke) {
		super(anzahlBeine, instrument);
		this.BellLautstaerke = BellLautstaerke;
	}

	public double getBellLautstaerke() {
		return BellLautstaerke;
	}

	@Override
	public int verscheucheRaeuber() {
		if(BellLautstaerke > instrument.getLautstaerke()){
			return (int) BellLautstaerke;
		}

		return (int)instrument.getLautstaerke();
	}

	@Override
	public double spieleMusik() {
		return (BellLautstaerke + instrument.getLautstaerke()) / 2;
	}

	@Override
	public String toString() {
		return "Hund " + BellLautstaerke + super.toString() ;
	}
}
