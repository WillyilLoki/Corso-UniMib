import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class Calculator implements MouseListener {

	private JFrame frame;
	private JLabel label;
	private JButton b9;
	private JButton b8;
	private JButton b7;
	private JButton bDiv;
	private JButton b6;
	private JButton b5;
	private JButton b4;
	private JButton bTimes;
	private JButton b3;
	private JButton b2;
	private JButton b1;
	private JButton bMinus;
	private JButton b0;
	private JButton bSum;
	private JButton bEquals;

	public Calculator() {

		frame = new JFrame();

		frame.setTitle("Calculator");
		ImageIcon icon = new ImageIcon("icon.png");
		frame.setIconImage(icon.getImage());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 600);
		frame.setLayout(null);

		label = new JLabel();
		setLabel();

		frame.add(label);

		JPanel CenterToBotPanel = new JPanel();
		CenterToBotPanel.setLayout(null);
		CenterToBotPanel.setBackground(new Color(0x550000));
		CenterToBotPanel.setBounds(0, 100, 484, 461);

		b9 = new JButton();
		MyButton(9, 0, 0, 121, 92, b9);
		CenterToBotPanel.add(b9);

		b8 = new JButton();
		MyButton(8, 121, 0, 121, 92, b8);
		CenterToBotPanel.add(b8);

		b7 = new JButton();
		MyButton(7, 242, 0, 121, 92, b7);
		CenterToBotPanel.add(b7);

		bDiv = new JButton();
		MyButton('/', 360, 0, 121, 92, bDiv);
		CenterToBotPanel.add(bDiv);

		b6 = new JButton();
		MyButton(6, 0, 92, 121, 92, b6);
		CenterToBotPanel.add(b6);

		b5 = new JButton();
		MyButton(5, 121, 92, 121, 92, b5);
		CenterToBotPanel.add(b5);

		b4 = new JButton();
		MyButton(4, 242, 92, 121, 92, b4);
		CenterToBotPanel.add(b4);

		bTimes = new JButton();
		MyButton('x', 360, 92, 121, 92, bTimes);
		CenterToBotPanel.add(bTimes);

		b3 = new JButton();
		MyButton(3, 0, 184, 121, 92, b3);
		CenterToBotPanel.add(b3);

		b2 = new JButton();
		MyButton(2, 121, 184, 121, 92, b2);
		CenterToBotPanel.add(b2);

		b1 = new JButton();
		MyButton(1, 242, 184, 121, 92, b1);
		CenterToBotPanel.add(b1);

		bMinus = new JButton();
		MyButton('-', 360, 184, 121, 92, bMinus);
		CenterToBotPanel.add(bMinus);

		b0 = new JButton();
		MyButton(0, 0, 276, 363, 92, b0);
		CenterToBotPanel.add(b0);

		bSum = new JButton();
		MyButton('+', 360, 276, 121, 92, bSum);
		CenterToBotPanel.add(bSum);

		bEquals = new JButton();
		MyButton('=', 0, 368, 484, 92, bEquals);
		CenterToBotPanel.add(bEquals);

		frame.add(CenterToBotPanel);

		frame.setResizable(true);
		frame.setVisible(true);
	}

	public void setLabel() {
		label.setOpaque(true);
		label.setForeground(Color.WHITE);
		label.setBackground(new Color(0xa9588));
		label.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 35));
		label.setText("Label");
		Border border = BorderFactory.createLineBorder(new Color(0xd35b17), 2);
		label.setBorder(border);
		label.setBounds(0, 0, 484, 100);
	}

	public void MyButton(int i, int x, int y, int width, int height, JButton b) {
		String s = "" + i;
		b.setText(s);
		b.setForeground(Color.WHITE);
		b.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 30));
		b.setBounds(x, y, width, height);
		b.setFocusPainted(false);
		b.setOpaque(false);
		b.setContentAreaFilled(false);
		b.setBorderPainted(false);
		b.addMouseListener(this);
	}

	public void MyButton(char c, int x, int y, int width, int height, JButton b) {
		MyButton(0, x, y, width, height, b);
		b.setText("" + c);
	}

	public static void main(String[] args) {
		Calculator calcolatrice = new Calculator();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println(b9.getText());
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent evt) {
		b9.setBorderPainted(true);
		b8.setBorderPainted(true);
		/*b7.setBorderPainted(true);
		bDiv.setBorderPainted(true);
		b6.setBorderPainted(true);
		b5.setBorderPainted(true);
		b4.setBorderPainted(true);
		bTimes.setBorderPainted(true);
		b3.setBorderPainted(true);
		b2.setBorderPainted(true);
		b1.setBorderPainted(true);
		bMinus.setBorderPainted(true);
		b0.setBorderPainted(true);
		bSum.setBorderPainted(true);
		bEquals.setBorderPainted(true);*/
	}

	@Override
	public void mouseExited(MouseEvent evt) {
		b9.setBorderPainted(false);
		b8.setBorderPainted(false);
		/*b7.setBorderPainted(false);
		bDiv.setBorderPainted(false);
		b6.setBorderPainted(false);
		b5.setBorderPainted(false);
		b4.setBorderPainted(false);
		bTimes.setBorderPainted(false);
		b3.setBorderPainted(false);
		b2.setBorderPainted(false);
		b1.setBorderPainted(false);
		bMinus.setBorderPainted(false);
		b0.setBorderPainted(false);
		bSum.setBorderPainted(false);
		bEquals.setBorderPainted(false);*/
	}

}
