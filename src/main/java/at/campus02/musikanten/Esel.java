package at.campus02.musikanten;

public class Esel extends Musikant{

	protected double Trittkraft;

	public Esel(int anzahlBeine, Instrument instrument, double trittKraft) {
		super(anzahlBeine, instrument);
		this.Trittkraft = trittKraft;
	}

	public double getTrittkraft() {
		return Trittkraft;
	}

	@Override
	public int verscheucheRaeuber() {

		return (int) Trittkraft * anzahlBeine;
	}

	@Override
	public double spieleMusik() {

		return instrument.getLautstaerke();
	}

	@Override
	public String toString() {
		return "Esel " + Trittkraft + super.toString();

	}
}
