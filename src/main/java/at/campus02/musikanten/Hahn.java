package at.campus02.musikanten;

public class Hahn extends Musikant{

	protected int FlugWeite;

	public Hahn(int anzahlBeine, Instrument instrument, int FlugWeite) {
		super(anzahlBeine, instrument);
		this.FlugWeite = FlugWeite;
	}

	public int getFlugWeite() {
		return FlugWeite;
	}

	@Override
	public int verscheucheRaeuber() {
		if(FlugWeite < 2){
			return (int)instrument.getLautstaerke();
		}
		switch(FlugWeite){
			case 2:
				return 6;
			case 3:
				return 5;
			case 4:
				return 4;
			case 5:
				return 3;
			case 6:
				return 2;
		}
		return 1;
	}

	@Override
	public double spieleMusik() {
		return (instrument.getLautstaerke() + 2) / FlugWeite;
	}

	@Override
	public String toString() {
		return "Hahn " + FlugWeite + super.toString();
	}

}
