package menschaergerdichnicht;

import java.awt.BorderLayout;
import java.util.Random;
import javax.swing.*;

public class MaednGUI extends JFrame{
	private Maedndata daten;
	private JButton [] felder;
	private JButton wuerfeln;
	private JTextArea ergebnis;
	private JLabel hintergrundbild;
	private int rundenindex;
	private JLabel haha;
	private JButton [] hausrot;
	private JButton [] hausgelb;
	private JButton [] hausschwarz;
	private JButton [] hausgruen;
	private JButton [] zielrot;
	private JButton [] zielgelb;
	private JButton [] zielschwarz;
	private JButton [] zielgruen;
	
	public MaednGUI()
	{
		this.setLocation(20, 20);
		this.setSize(800,800);
		this.setTitle("Mensch Ärger Dich Nicht");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);

		ergebnis = new JTextArea();
		this.add(ergebnis);
		ergebnis.setBounds(60, 15, 40, 40);
		
		wuerfeln = new JButton("W");
		this.add(wuerfeln);
		wuerfeln.setBounds(15, 15, 40, 40);
//		wuerfeln.addActionListener(e->wuerfeln());	
		felder = new JButton[40];
	
		Icon icon1 = new ImageIcon( "/Users/jonasholfeld/Desktop/Bildschirmfoto 2019-07-08 um 16.48.23.png" );
		for (int i = 0; i<40; i++)
		{
		felder[i] = new JButton(icon1); 
		this.add(felder[i]);
		}
		felder[0].setBounds(320,10,70,70);
		felder[1].setBounds(320,90,70,70);
		felder[2].setBounds(320,170,70,70);
		felder[3].setBounds(320,250,70,70);
		felder[4].setBounds(320,330,70,70);
		felder[5].setBounds(240,330,70,70);
		felder[6].setBounds(160,330,70,70);
		felder[7].setBounds(80,330,70,70);
		felder[8].setBounds(0,330,70,70);
		felder[9].setBounds(0,410,70,70);
		felder[10].setBounds(0,490,70,70);
		felder[11].setBounds(80,490,70,70);
		felder[12].setBounds(160,490,70,70);
		felder[13].setBounds(240,490,70,70);
		felder[14].setBounds(320,490,70,70);
		felder[15].setBounds(320,570,70,70);
		felder[16].setBounds(320,650,70,70);
		felder[17].setBounds(320,730,70,70);
		felder[18].setBounds(320,810,70,70);
		felder[19].setBounds(400,810,70,70);
		felder[20].setBounds(480,810,70,70);
		felder[21].setBounds(480,730,70,70);
		felder[22].setBounds(480,650,70,70);
		felder[23].setBounds(480,570,70,70);
		felder[24].setBounds(480,490,70,70);
		felder[25].setBounds(560,490,70,70);
		felder[26].setBounds(640,490,70,70);
		felder[27].setBounds(720,490,70,70);
		felder[28].setBounds(800,490,70,70);
		felder[29].setBounds(800,410,70,70);
		felder[30].setBounds(800,330,70,70);
		felder[31].setBounds(720,330,70,70);
		felder[32].setBounds(640,330,70,70);
		felder[33].setBounds(560,330,70,70);
		felder[34].setBounds(480,330,70,70);
		felder[35].setBounds(480,250,70,70);
		felder[36].setBounds(480,170,70,70);
		felder[37].setBounds(480,90,70,70);
		felder[38].setBounds(480,10,70,70);
		felder[39].setBounds(400,10,70,70);
		
		hausrot = new JButton[4];
		for (int i = 0; i<4; i++)
		{
			hausrot[i] = new JButton (new ImageIcon("/Users/jonasholfeld/Desktop/Bildschirmfoto 2019-07-15 um 13.29.49.png"));
			this.add(hausrot[i]);
		}
		hausrot[0].setBounds(730, 650, 70, 70);
		hausrot[1].setBounds(730, 570, 70, 70);
		hausrot[2].setBounds(810,650,70,70);
		hausrot[3].setBounds(810,570,70,70);
		hausgruen = new JButton[4];
		for (int i = 0; i<4; i++)
		{
			hausgruen[i] = new JButton (new ImageIcon("/Users/jonasholfeld/Desktop/Bildschirmfoto 2019-07-15 um 13.29.33.png"));
			this.add(hausgruen[i]);
		}
		hausgruen[0].setBounds(600, 10, 70, 70);
		hausgruen[1].setBounds(680, 10, 70, 70);
		hausgruen[2].setBounds(680,90,70,70);
		hausgruen[3].setBounds(600,90,70,70);
		hausgelb = new JButton[4];
		for (int i = 0; i<4; i++)
		{
			hausgelb[i] = new JButton (new ImageIcon("/Users/jonasholfeld/Desktop/Bildschirmfoto 2019-07-15 um 13.29.25.png"));
			this.add(hausgelb[i]);
		}
		hausgelb[0].setBounds(0,150,70,70);
		hausgelb[1].setBounds(80,150,70,70);
		hausgelb[2].setBounds(80,230,70,70);
		hausgelb[3].setBounds(0,230,70,70);
		hausschwarz = new JButton[4];
		for (int i = 0; i<4; i++)
		{
			hausschwarz[i] = new JButton (new ImageIcon("/Users/jonasholfeld/Desktop/Bildschirmfoto 2019-07-15 um 13.29.36.png"));
			this.add(hausschwarz[i]);
		}
		hausschwarz[0].setBounds(120,810,70,70);
		hausschwarz[1].setBounds(40,810,70,70);
		hausschwarz[2].setBounds(120,730,70,70);
		hausschwarz[3].setBounds(40,730,70,70);
		
		zielrot = new JButton[4];
		for (int i = 0; i<4; i++)
		{
			zielrot[i] = new JButton ( new ImageIcon ("/Users/jonasholfeld/Desktop/Bildschirmfoto 2019-07-15 um 13.48.21.png"));
			this.add(zielrot[i]);
		}
		zielrot[0].setBounds(720,410,50,50);
		zielrot[1].setBounds(640,410,50,50);
		zielrot[2].setBounds(560,410,50,50);
		zielrot[3].setBounds(480,410,50,50);
		
		zielgruen = new JButton [4];
		for (int i = 0; i<4; i++)
		{
			zielgruen[i] = new JButton( new ImageIcon ("/Users/jonasholfeld/Desktop/Bildschirmfoto 2019-07-15 um 13.48.26.png"));
			this.add(zielgruen[i]);
		}
		zielgruen[0].setBounds(400,90,50,50);
		zielgruen[1].setBounds(400,170,50,50);
		zielgruen[2].setBounds(400,250,50,50);
		zielgruen[3].setBounds(400,330,50,50);
		
		
		zielgelb = new JButton [4];
		for (int i = 0; i<4; i++)
		{
			zielgelb[i] = new JButton( new ImageIcon ("/Users/jonasholfeld/Desktop/Bildschirmfoto 2019-07-15 um 13.48.17.png"));
			this.add(zielgelb[i]);
		}
		zielgelb[0].setBounds(80,410,50,50);
		zielgelb[1].setBounds(160,410,50,50);
		zielgelb[2].setBounds(240,410,50,50);
		zielgelb[3].setBounds(320,410,50,50);
		
		zielschwarz = new JButton [4];
		for (int i = 0; i<4; i++)
		{
			zielschwarz[i] = new JButton( new ImageIcon ("/Users/jonasholfeld/Desktop/Bildschirmfoto 2019-07-15 um 13.48.30.png"));
			this.add(zielschwarz[i]);
		}
		zielschwarz[0].setBounds(400,730,50,50);
		zielschwarz[1].setBounds(400,650,50,50);
		zielschwarz[2].setBounds(400,570,50,50);
		zielschwarz[3].setBounds(400,490,50,50);


//
//		hintergrundbild = new JLabel(new ImageIcon("/Users/jonasholfeld/Desktop/HTWK/2. semester/AOP II/CePdjZtWQAAL2wm.jpg_large"));
//		this.add(hintergrundbild);
//		hintergrundbild.setBounds(0, 0, 1000, 1000);


	}

//	private void wuerfeln() {
//		if ((rundenindex%2) == 0 )
//		{
//		haha.setVisible(false);
//		Icon icon1 = new ImageIcon( "/Users/jonasholfeld/Desktop/Bildschirmfoto 2019-07-08 um 16.49.17.png" );
//		Icon icon2 = new ImageIcon( "/Users/jonasholfeld/Desktop/Bildschirmfoto 2019-07-08 um 16.49.14.png" );
//		Icon icon3 = new ImageIcon( "/Users/jonasholfeld/Desktop/Bildschirmfoto 2019-07-09 um 11.50.50.png" );
//		Random zufall = new Random();
//		int ergebniszahl = zufall.nextInt(6)+1;
//		String ergebniswort =  new String();
//		ergebniswort = Integer.toString(ergebniszahl);
//		this.ergebnis.setText(ergebniswort);
//		felder[figurindexgruen].setIcon(icon2);
//		figurindexgruen = (figurindexgruen + ergebniszahl) % 39;
//		felder[figurindexgruen].setIcon(icon1);
//		if (figurindexgruen == figurindexgelb)
//		{
//			haha.setVisible(true);
//			System.out.println("geschmissen");
//			figurindexgelb = 0;
//			haha.setIcon(new ImageIcon("/Users/jonasholfeld/Desktop/HTWK/2. semester/AOP II/hqdefault.jpg"));
//			felder[0].setIcon(icon3);
//		}
//		}
//		else
//		{
//			Icon icon1 = new ImageIcon( "/Users/jonasholfeld/Desktop/Bildschirmfoto 2019-07-09 um 11.50.50.png" );
//			Icon icon2 = new ImageIcon( "/Users/jonasholfeld/Desktop/Bildschirmfoto 2019-07-08 um 16.49.14.png" );
//			Random zufall = new Random();
//			int ergebniszahl = zufall.nextInt(6)+1;
//			String ergebniswort =  new String();
//			ergebniswort = Integer.toString(ergebniszahl);
//			this.ergebnis.setText(ergebniswort);
//			felder[figurindexgelb].setIcon(icon2);
//			figurindexgelb = (figurindexgelb + ergebniszahl) % 39;
//			felder[figurindexgelb].setIcon(icon1);
//			if (figurindexgelb == figurindexgruen)
//			{
//				haha.setVisible(true);
//				System.out.println("geschmissen");
//				figurindexgruen = 0;
//				felder[0].setIcon(new ImageIcon ("/Users/jonasholfeld/Desktop/Bildschirmfoto 2019-07-08 um 16.49.17.png"));
//				haha.setIcon(new ImageIcon("/Users/jonasholfeld/Desktop/HTWK/2. semester/AOP II/hqdefault.jpg"));
//			}
//		}
//		rundenindex = rundenindex+1;
//	}
//	



	public void setDaten(Maedndata data) {
		this.daten = data;
	}

}
