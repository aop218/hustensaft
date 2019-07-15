package menschaergerdichnicht;

public class Maednspiel {
	private MaednGUI view;
	private Maedndata data;
	
	public Maednspiel()
	{
		view = new MaednGUI();
		data = new Maedndata();
		view.setDaten(data);
	}

	public static void main(String[] args) {
//		anfangsdialog deranfang = new anfangsdialog();
//		deranfang.aktivieren();
		
		Maednspiel Menschaergerdichnicht = new Maednspiel();
		Menschaergerdichnicht.aktivieren();
	}

	private void aktivieren() {
		view.setVisible(true);
	}

}
