package at.campus02.musikanten;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class Quartett {

	private ArrayList<Musikant> musikants = new ArrayList<>();

	public Quartett() {
		this.musikants = musikants;
	}

	public void add(Musikant m) {
		musikants.add(m);
	}
	public boolean istQuartett()
	{
			if( musikants.size() == 4){
				return true;
		}
		return false;
	}
	
	public int gemeinsamRaeuberVerscheucht()
	{
		int erg = 0;
		Iterator<Musikant> it = musikants.iterator();

		while(it.hasNext())
		{
			erg += it.next().verscheucheRaeuber();
		}
		return erg;

	}
	public double durchschnittlicheLautstaerke()
	{
		double erg = 0;
		for(Musikant m: musikants){

			erg = erg + m.spieleMusik();
		}

		return erg / musikants.size();
	}
	
	public ArrayList<Musikant> getMusikantenInLautstaerkeBereich(double von, double bis)
	{
		ArrayList<Musikant> mk = new ArrayList<>();

		for(Musikant m: musikants){
			double laut = m.spieleMusik();
			if(laut > von && laut < bis){
				mk.add(m);
			}
		}
		return mk;
	}
	public HashMap<Integer, Integer> getAnzahlMusikantenMitBeinAnzahl()
	{
		HashMap<Integer, Integer> erg = new HashMap<Integer, Integer>();
		for(Musikant m: musikants){
			int beine = m.getAnzahlBeine();
			if(erg.containsKey(beine)){
				erg.put(beine, erg.get(beine) + 1);
			}
			else
			{
				erg.put(beine, 1);
			}
		}
		return erg;
	}
	public void printLautStaerkeAbsteigend()
	{
		Collections.sort(musikants, new LautstaerkeComparator());
		System.out.println(musikants);
	}
}
