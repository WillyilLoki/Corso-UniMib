import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Queue;

import javax.swing.JButton;

public class MyButton extends JButton implements ActionListener {

	private boolean clickato = false;
	
	public MyButton(int width, int heigth) {
		this(' ', width, heigth);
	}

	protected void setClickato(boolean clickato) {
		this.clickato = clickato;
	}

	public boolean isClickato() {
		return clickato;
	}

	public MyButton(int i, int width, int heigth) {
		String s = "" + i;
		setText(s);
		setForeground(Color.WHITE);
		Font newButtonFont = new Font(getFont().getName(), getFont().getStyle(), 30);
		setFont(newButtonFont);
		setFocusPainted(false);
		setOpaque(false);
		setContentAreaFilled(false);
		setBorderPainted(false);
		addActionListener(this);

	}

	public MyButton(char c, int width, int heigth) {
		this(0, width, heigth);
		setText("" + c);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		setBorderPainted(true);
		clickato = true;
	}

}
