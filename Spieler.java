package menschaergerdichnicht;

public class Spieler {
	String farbe;
	String name; 
	boolean computer;
	int startindex;
	Figur[] haus;
	Figur[] ziel;
	int[] figurenindizes;
	
	public Spieler (String farbe, boolean istComputer, String name)
	{
		this.farbe = farbe;
		this.computer = istComputer;
		this.name = name;
		this.haus = new Figur[4];
		for (int i = 0; i < 4; i++)
		{
			haus[i] = new Figur (farbe);
		}
		switch(farbe) {
		case ("schwarz"):{this.startindex = 0;break;}
		case ("gelb"):{this.startindex = 10;break;}
		case ("gruen"):{this.startindex = 20;break;}
		case ("rot"):{this.startindex = 30;break;}		
		}
		this.figurenindizes = new int[4];
		this.ziel = new Figur[4];
	}
}