package menschaergerdichnicht;

public class anfangsdialog {
	private anfangsdialogGUI view;
	private anfangsdialogDATA daten;

	public anfangsdialog()
	{
		view = new anfangsdialogGUI();
		daten = new anfangsdialogDATA();
	}
	
	public void aktivieren()
	{
		view.setVisible(true);
	}
}
