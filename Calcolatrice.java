import java.awt.Button;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Calcolatrice extends JFrame {

	private Queue<String> coda;
	private List<MyButton> bottoni;

	public Calcolatrice() {
		setTitle("Calcolatrice");
		ImageIcon icon = new ImageIcon("icon.png");
		setIconImage(icon.getImage());
		;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		getContentPane().setBackground(new Color(0x550000));
		setLayout(new GridLayout(5, 4));
		setResizable(false);

		bottoni = new ArrayList<MyButton>();

		int i = 9;
		bottoni.add(new MyButton(i--, 100, 100));
		bottoni.add(new MyButton(i--, 100, 100));
		bottoni.add(new MyButton(i--, 100, 100));
		bottoni.add(new MyButton('/', 100, 100));
		bottoni.add(new MyButton(i--, 100, 100));
		bottoni.add(new MyButton(i--, 100, 100));
		bottoni.add(new MyButton(i--, 100, 100));
		bottoni.add(new MyButton('x', 100, 100));
		bottoni.add(new MyButton(i--, 100, 100));
		bottoni.add(new MyButton(i--, 100, 100));
		bottoni.add(new MyButton(i--, 100, 100));
		bottoni.add(new MyButton('+', 100, 100));
		bottoni.add(new MyButton(100, 100));
		bottoni.add(new MyButton(i--, 100, 300));
		bottoni.add(new MyButton(100, 100));
		bottoni.add(new MyButton('-', 100, 100));
		bottoni.add(new MyButton(100, 100));
		bottoni.add(new MyButton('=', 100, 100));

		for (int j = 0; j < bottoni.size(); j++) {
			add(bottoni.get(j));
		}

		coda = new LinkedList<String>();

		setVisible(true);

	}

	public void actionPerformed(ActionEvent e) {
		for (int i = 0; i < bottoni.size(); i++) {
			if(bottoni.get(i).isClickato() == true) {
				coda.add(bottoni.get(i).getText());
				bottoni.get(i).setClickato(false);
			}
		}
	}

	public void calcolo() {
		for (int i = 0; i < coda.size(); i++) {
			System.out.println(coda.remove());
		}
	}

	public static void main(String[] args) {
		Calcolatrice calcolatrice = new Calcolatrice();
	}

}
