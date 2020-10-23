package com.Matteo.sudoku;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.MatteBorder;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

public class Principale extends JFrame {

	private static final long serialVersionUID = -1954713752674312623L;
	private JPanel display;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principale frame = new Principale();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Principale() {
		setTitle("SUDOKU");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 365, 610);
		display = new JPanel();
		display.setBackground(new Color(235, 255, 238));
		display.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(display);
		display.setLayout(null);

		Action action = new Action();

// ********************************* PANNELLI A *****************************************
		JPanel a_1 = new JPanel();
		action.mouse1(a_1, display);
		a_1.setBounds(6, 64, 40, 40);
		a_1.setBorder(new MatteBorder(4, 4, 1, 1, (Color) Color.BLACK));

		JLabel lbl_a_1 = new JLabel("");
		action.labelBody1(lbl_a_1, a_1);

		JPanel a_2 = new JPanel();
		action.mouse1(a_2, display);
		a_2.setBounds(45, 64, 40, 40);
		a_2.setBorder(new MatteBorder(4, 1, 1, 1, (Color) Color.BLACK));

		JLabel lbl_a_2 = new JLabel("");
		action.labelBody1(lbl_a_2, a_2);

		JPanel a_3 = new JPanel();
		action.mouse1(a_3, display);
		a_3.setBounds(84, 64, 40, 40);
		a_3.setBorder(new MatteBorder(4, 1, 1, 3, (Color) Color.BLACK));

		JLabel lbl_a_3 = new JLabel("");
		action.labelBody1(lbl_a_3, a_3);

		JPanel a_4 = new JPanel();
		action.mouse2(a_4, display);
		a_4.setBounds(123, 64, 40, 40);
		a_4.setBorder(new MatteBorder(4, 3, 1, 1, (Color) Color.BLACK));

		JLabel lbl_a_4 = new JLabel("");
		action.labelBody2(lbl_a_4, a_4);

		JPanel a_5 = new JPanel();
		action.mouse2(a_5, display);
		a_5.setBounds(162, 64, 40, 40);
		a_5.setBorder(new MatteBorder(4, 1, 1, 1, (Color) Color.BLACK));

		JLabel lbl_a_5 = new JLabel("");
		action.labelBody2(lbl_a_5, a_5);

		JPanel a_6 = new JPanel();
		action.mouse2(a_6, display);
		a_6.setBorder(new MatteBorder(4, 1, 1, 3, (Color) new Color(0, 0, 0)));
		a_6.setBounds(201, 64, 40, 40);

		JLabel lbl_a_6 = new JLabel("");
		action.labelBody2(lbl_a_6, a_6);

		JPanel a_7 = new JPanel();
		action.mouse1(a_7, display);
		a_7.setBorder(new MatteBorder(4, 3, 1, 1, (Color) Color.BLACK));
		a_7.setBounds(240, 64, 40, 40);

		JLabel lbl_a_7 = new JLabel("");
		action.labelBody1(lbl_a_7, a_7);

		JPanel a_8 = new JPanel();
		action.mouse1(a_8, display);
		a_8.setBorder(new MatteBorder(4, 1, 1, 1, (Color) new Color(0, 0, 0)));
		a_8.setBounds(279, 64, 40, 40);

		JLabel lbl_a_8 = new JLabel("");
		action.labelBody1(lbl_a_8, a_8);

		JPanel a_9 = new JPanel();
		action.mouse1(a_9, display);
		a_9.setBorder(new MatteBorder(4, 1, 1, 4, (Color) new Color(0, 0, 0)));
		a_9.setBounds(318, 64, 40, 40);

		JLabel lbl_a_9 = new JLabel("");
		action.labelBody1(lbl_a_9, a_9);
// ******************************* FINE PANNELLI A **************************************

// ********************************* PANNELLI B *****************************************
		JPanel b_1 = new JPanel();
		action.mouse1(b_1, display);
		b_1.setBorder(new MatteBorder(1, 4, 1, 1, (Color) new Color(0, 0, 0)));
		b_1.setBounds(6, 103, 40, 40);

		JLabel lbl_b_1 = new JLabel("");
		action.labelBody1(lbl_b_1, b_1);

		JPanel b_2 = new JPanel();
		action.mouse1(b_2, display);
		b_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		b_2.setBounds(45, 103, 40, 40);

		JLabel lbl_b_2 = new JLabel("");
		action.labelBody1(lbl_b_2, b_2);

		JPanel b_3 = new JPanel();
		action.mouse1(b_3, display);
		b_3.setBorder(new MatteBorder(1, 1, 1, 3, (Color) new Color(0, 0, 0)));
		b_3.setBounds(84, 103, 40, 40);

		JLabel lbl_b_3 = new JLabel("");
		action.labelBody1(lbl_b_3, b_3);

		JPanel b_4 = new JPanel();
		action.mouse2(b_4, display);
		b_4.setBorder(new MatteBorder(1, 3, 1, 1, (Color) new Color(0, 0, 0)));
		b_4.setBounds(123, 103, 40, 40);

		JLabel lbl_b_4 = new JLabel("");
		action.labelBody2(lbl_b_4, b_4);

		JPanel b_5 = new JPanel();
		action.mouse2(b_5, display);
		b_5.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		b_5.setBounds(162, 103, 40, 40);

		JLabel lbl_b_5 = new JLabel("");
		action.labelBody2(lbl_b_5, b_5);

		JPanel b_6 = new JPanel();
		action.mouse2(b_6, display);
		b_6.setBorder(new MatteBorder(1, 1, 1, 3, (Color) new Color(0, 0, 0)));
		b_6.setBounds(201, 103, 40, 40);

		JLabel lbl_b_6 = new JLabel("");
		action.labelBody2(lbl_b_6, b_6);

		JPanel b_7 = new JPanel();
		action.mouse1(b_7, display);
		b_7.setBorder(new MatteBorder(1, 3, 1, 1, (Color) new Color(0, 0, 0)));
		b_7.setBounds(240, 103, 40, 40);

		JLabel lbl_b_7 = new JLabel("");
		action.labelBody1(lbl_b_7, b_7);

		JPanel b_8 = new JPanel();
		action.mouse1(b_8, display);
		b_8.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		b_8.setBounds(279, 103, 40, 40);

		JLabel lbl_b_8 = new JLabel("");
		action.labelBody1(lbl_b_8, b_8);

		JPanel b_9 = new JPanel();
		action.mouse1(b_9, display);
		b_9.setBorder(new MatteBorder(1, 1, 1, 4, (Color) new Color(0, 0, 0)));
		b_9.setBounds(318, 103, 40, 40);

		JLabel lbl_b_9 = new JLabel("");
		action.labelBody1(lbl_b_9, b_9);
// ******************************* FINE PANNELLI B **************************************

// ********************************* PANNELLI C *****************************************
		JPanel c_1 = new JPanel();
		action.mouse1(c_1, display);
		c_1.setBorder(new MatteBorder(1, 4, 3, 1, (Color) new Color(0, 0, 0)));
		c_1.setBounds(6, 142, 40, 40);

		JLabel lbl_c_1 = new JLabel("");
		action.labelBody1(lbl_c_1, c_1);

		JPanel c_2 = new JPanel();
		action.mouse1(c_2, display);
		c_2.setBorder(new MatteBorder(1, 1, 3, 1, (Color) new Color(0, 0, 0)));
		c_2.setBounds(45, 142, 40, 40);

		JLabel lbl_c_2 = new JLabel("");
		action.labelBody1(lbl_c_2, c_2);

		JPanel c_3 = new JPanel();
		action.mouse1(c_3, display);
		c_3.setBorder(new MatteBorder(1, 1, 3, 3, (Color) new Color(0, 0, 0)));
		c_3.setBounds(84, 142, 40, 40);

		JLabel lbl_c_3 = new JLabel("");
		action.labelBody1(lbl_c_3, c_3);

		JPanel c_4 = new JPanel();
		action.mouse2(c_4, display);
		c_4.setBorder(new MatteBorder(1, 3, 3, 1, (Color) new Color(0, 0, 0)));
		c_4.setBounds(123, 142, 40, 40);

		JLabel lbl_c_4 = new JLabel("");
		action.labelBody2(lbl_c_4, c_4);

		JPanel c_5 = new JPanel();
		action.mouse2(c_5, display);
		c_5.setBorder(new MatteBorder(1, 1, 3, 1, (Color) new Color(0, 0, 0)));
		c_5.setBounds(162, 142, 40, 40);

		JLabel lbl_c_5 = new JLabel("");
		action.labelBody2(lbl_c_5, c_5);

		JPanel c_6 = new JPanel();
		action.mouse2(c_6, display);
		c_6.setBorder(new MatteBorder(1, 1, 3, 3, (Color) new Color(0, 0, 0)));
		c_6.setBounds(201, 142, 40, 40);

		JLabel lbl_c_6 = new JLabel("");
		action.labelBody2(lbl_c_6, c_6);

		JPanel c_7 = new JPanel();
		action.mouse1(c_7, display);
		c_7.setBorder(new MatteBorder(1, 3, 3, 1, (Color) new Color(0, 0, 0)));
		c_7.setBounds(240, 142, 40, 40);

		JLabel lbl_c_7 = new JLabel("");
		action.labelBody1(lbl_c_7, c_7);

		JPanel c_8 = new JPanel();
		action.mouse1(c_8, display);
		c_8.setBorder(new MatteBorder(1, 1, 3, 1, (Color) new Color(0, 0, 0)));
		c_8.setBounds(279, 142, 40, 40);

		JLabel lbl_c_8 = new JLabel("");
		action.labelBody1(lbl_c_8, c_8);

		JPanel c_9 = new JPanel();
		action.mouse1(c_9, display);
		c_9.setBorder(new MatteBorder(1, 1, 3, 4, (Color) new Color(0, 0, 0)));
		c_9.setBounds(318, 142, 40, 40);

		JLabel lbl_c_9 = new JLabel("");
		action.labelBody1(lbl_c_9, c_9);
// ******************************* FINE PANNELLI C **************************************

// ********************************* PANNELLI D *****************************************
		JPanel d_1 = new JPanel();
		action.mouse2(d_1, display);
		d_1.setBorder(new MatteBorder(3, 4, 1, 1, (Color) Color.BLACK));
		d_1.setBounds(6, 180, 40, 40);

		JLabel lbl_d_1 = new JLabel("");
		action.labelBody2(lbl_d_1, d_1);

		JPanel d_2 = new JPanel();
		action.mouse2(d_2, display);
		d_2.setBorder(new MatteBorder(3, 1, 1, 1, (Color) new Color(0, 0, 0)));
		d_2.setBounds(45, 180, 40, 40);

		JLabel lbl_d_2 = new JLabel("");
		action.labelBody2(lbl_d_2, d_2);

		JPanel d_3 = new JPanel();
		action.mouse2(d_3, display);
		d_3.setBorder(new MatteBorder(3, 1, 1, 3, (Color) new Color(0, 0, 0)));
		d_3.setBounds(84, 180, 40, 40);

		JLabel lbl_d_3 = new JLabel("");
		action.labelBody2(lbl_d_3, d_3);

		JPanel d_4 = new JPanel();
		action.mouse1(d_4, display);
		d_4.setBorder(new MatteBorder(3, 3, 1, 1, (Color) Color.BLACK));
		d_4.setBounds(123, 180, 40, 40);

		JLabel lbl_d_4 = new JLabel("");
		action.labelBody1(lbl_d_4, d_4);

		JPanel d_5 = new JPanel();
		action.mouse1(d_5, display);
		d_5.setBorder(new MatteBorder(3, 1, 1, 1, (Color) new Color(0, 0, 0)));
		d_5.setBounds(162, 180, 40, 40);

		JLabel lbl_d_5 = new JLabel("");
		action.labelBody1(lbl_d_5, d_5);

		JPanel d_6 = new JPanel();
		action.mouse1(d_6, display);
		d_6.setBorder(new MatteBorder(3, 1, 1, 3, (Color) new Color(0, 0, 0)));
		d_6.setBounds(201, 180, 40, 40);

		JLabel lbl_d_6 = new JLabel("");
		action.labelBody1(lbl_d_6, d_6);

		JPanel d_7 = new JPanel();
		action.mouse2(d_7, display);
		d_7.setBorder(new MatteBorder(3, 3, 1, 1, (Color) Color.BLACK));
		d_7.setBounds(240, 180, 40, 40);

		JLabel lbl_d_7 = new JLabel("");
		action.labelBody2(lbl_d_7, d_7);

		JPanel d_8 = new JPanel();
		action.mouse2(d_8, display);
		d_8.setBorder(new MatteBorder(3, 1, 1, 1, (Color) new Color(0, 0, 0)));
		d_8.setBounds(279, 180, 40, 40);

		JLabel lbl_d_8 = new JLabel("");
		action.labelBody2(lbl_d_8, d_8);

		JPanel d_9 = new JPanel();
		action.mouse2(d_9, display);
		d_9.setBorder(new MatteBorder(3, 1, 1, 4, (Color) new Color(0, 0, 0)));
		d_9.setBounds(318, 180, 40, 40);

		JLabel lbl_d_9 = new JLabel("");
		action.labelBody2(lbl_d_9, d_9);
// ******************************* FINE PANNELLI D **************************************

// ********************************* PANNELLI E *****************************************
		JPanel e_1 = new JPanel();
		action.mouse2(e_1, display);
		e_1.setBorder(new MatteBorder(1, 4, 1, 1, (Color) new Color(0, 0, 0)));
		e_1.setBounds(6, 219, 40, 40);

		JLabel lbl_e_1 = new JLabel("");
		action.labelBody1(lbl_e_1, e_1);

		JPanel e_2 = new JPanel();
		action.mouse2(e_2, display);
		e_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		e_2.setBounds(45, 219, 40, 40);

		JLabel lbl_e_2 = new JLabel("");
		action.labelBody2(lbl_e_2, e_2);

		JPanel e_3 = new JPanel();
		action.mouse2(e_3, display);
		e_3.setBorder(new MatteBorder(1, 1, 1, 3, (Color) new Color(0, 0, 0)));
		e_3.setBounds(84, 219, 40, 40);

		JLabel lbl_e_3 = new JLabel("");
		action.labelBody2(lbl_e_3, e_3);

		JPanel e_4 = new JPanel();
		action.mouse1(e_4, display);
		e_4.setBorder(new MatteBorder(1, 3, 1, 1, (Color) new Color(0, 0, 0)));
		e_4.setBounds(123, 219, 40, 40);

		JLabel lbl_e_4 = new JLabel("");
		action.labelBody1(lbl_e_4, e_4);

		JPanel e_5 = new JPanel();
		action.mouse1(e_5, display);
		e_5.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		e_5.setBounds(162, 219, 40, 40);

		JLabel lbl_e_5 = new JLabel("");
		action.labelBody1(lbl_e_5, e_5);

		JPanel e_6 = new JPanel();
		action.mouse1(e_6, display);
		e_6.setBorder(new MatteBorder(1, 1, 1, 3, (Color) new Color(0, 0, 0)));
		e_6.setBounds(201, 219, 40, 40);

		JLabel lbl_e_6 = new JLabel("");
		action.labelBody1(lbl_e_6, e_6);

		JPanel e_7 = new JPanel();
		action.mouse2(e_7, display);
		e_7.setBorder(new MatteBorder(1, 3, 1, 1, (Color) new Color(0, 0, 0)));
		e_7.setBounds(240, 219, 40, 40);

		JLabel lbl_e_7 = new JLabel("");
		action.labelBody2(lbl_e_7, e_7);

		JPanel e_8 = new JPanel();
		action.mouse2(e_8, display);
		e_8.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		e_8.setBounds(279, 219, 40, 40);

		JLabel lbl_e_8 = new JLabel("");
		action.labelBody2(lbl_e_8, e_8);

		JPanel e_9 = new JPanel();
		action.mouse2(e_9, display);
		e_9.setBorder(new MatteBorder(1, 1, 1, 4, (Color) new Color(0, 0, 0)));
		e_9.setBounds(318, 219, 40, 40);

		JLabel lbl_e_9 = new JLabel("");
		action.labelBody2(lbl_e_9, e_9);
// ******************************* FINE PANNELLI E **************************************

// ********************************* PANNELLI F *****************************************
		JPanel f_1 = new JPanel();
		action.mouse2(f_1, display);
		f_1.setBorder(new MatteBorder(1, 4, 3, 1, (Color) new Color(0, 0, 0)));
		f_1.setBounds(6, 258, 40, 40);

		JLabel lbl_f_1 = new JLabel("");
		action.labelBody2(lbl_f_1, f_1);

		JPanel f_2 = new JPanel();
		action.mouse2(f_2, display);
		f_2.setBorder(new MatteBorder(1, 1, 3, 1, (Color) new Color(0, 0, 0)));
		f_2.setBounds(45, 258, 40, 40);

		JLabel lbl_f_2 = new JLabel("");
		action.labelBody2(lbl_f_2, f_2);

		JPanel f_3 = new JPanel();
		action.mouse2(f_3, display);
		f_3.setBorder(new MatteBorder(1, 1, 3, 3, (Color) new Color(0, 0, 0)));
		f_3.setBounds(84, 258, 40, 40);

		JLabel lbl_f_3 = new JLabel("");
		action.labelBody2(lbl_f_3, f_3);

		JPanel f_4 = new JPanel();
		action.mouse1(f_4, display);
		f_4.setBorder(new MatteBorder(1, 3, 3, 1, (Color) new Color(0, 0, 0)));
		f_4.setBounds(123, 258, 40, 40);

		JLabel lbl_f_4 = new JLabel("");
		action.labelBody1(lbl_f_4, f_4);

		JPanel f_5 = new JPanel();
		action.mouse1(f_5, display);
		f_5.setBorder(new MatteBorder(1, 1, 3, 1, (Color) new Color(0, 0, 0)));
		f_5.setBounds(162, 258, 40, 40);

		JLabel lbl_f_5 = new JLabel("");
		action.labelBody1(lbl_f_5, f_5);

		JPanel f_6 = new JPanel();
		action.mouse1(f_6, display);
		f_6.setBorder(new MatteBorder(1, 1, 3, 3, (Color) new Color(0, 0, 0)));
		f_6.setBounds(201, 258, 40, 40);

		JLabel lbl_f_6 = new JLabel("");
		action.labelBody1(lbl_f_6, f_6);

		JPanel f_7 = new JPanel();
		action.mouse2(f_7, display);
		f_7.setBorder(new MatteBorder(1, 3, 3, 1, (Color) new Color(0, 0, 0)));
		f_7.setBounds(240, 258, 40, 40);

		JLabel lbl_f_7 = new JLabel("");
		action.labelBody2(lbl_f_7, f_7);

		JPanel f_8 = new JPanel();
		action.mouse2(f_8, display);
		f_8.setBorder(new MatteBorder(1, 1, 3, 1, (Color) new Color(0, 0, 0)));
		f_8.setBounds(279, 258, 40, 40);

		JLabel lbl_f_8 = new JLabel("");
		action.labelBody2(lbl_f_8, f_8);

		JPanel f_9 = new JPanel();
		action.mouse2(f_9, display);
		f_9.setBorder(new MatteBorder(1, 1, 3, 4, (Color) new Color(0, 0, 0)));
		f_9.setBounds(318, 258, 40, 40);

		JLabel lbl_f_9 = new JLabel("");
		action.labelBody2(lbl_f_9, f_9);
// ******************************* FINE PANNELLI F **************************************

// ********************************* PANNELLI G *****************************************
		JPanel g_1 = new JPanel();
		action.mouse1(g_1, display);
		g_1.setBorder(new MatteBorder(3, 4, 1, 1, (Color) Color.BLACK));
		g_1.setBounds(6, 296, 40, 40);

		JLabel lbl_g_1 = new JLabel("");
		action.labelBody1(lbl_g_1, g_1);

		JPanel g_2 = new JPanel();
		action.mouse1(g_2, display);
		g_2.setBorder(new MatteBorder(3, 1, 1, 1, (Color) new Color(0, 0, 0)));
		g_2.setBounds(45, 296, 40, 40);

		JLabel lbl_g_2 = new JLabel("");
		action.labelBody1(lbl_g_2, g_2);

		JPanel g_3 = new JPanel();
		action.mouse1(g_3, display);
		g_3.setBorder(new MatteBorder(3, 1, 1, 3, (Color) new Color(0, 0, 0)));
		g_3.setBounds(84, 296, 40, 40);

		JLabel lbl_g_3 = new JLabel("");
		action.labelBody1(lbl_g_3, g_3);

		JPanel g_4 = new JPanel();
		action.mouse2(g_4, display);
		g_4.setBorder(new MatteBorder(3, 3, 1, 1, (Color) Color.BLACK));
		g_4.setBounds(123, 296, 40, 40);

		JLabel lbl_g_4 = new JLabel("");
		action.labelBody2(lbl_g_4, g_4);

		JPanel g_5 = new JPanel();
		action.mouse2(g_5, display);
		g_5.setBorder(new MatteBorder(3, 1, 1, 1, (Color) new Color(0, 0, 0)));
		g_5.setBounds(162, 296, 40, 40);

		JLabel lbl_g_5 = new JLabel("");
		action.labelBody2(lbl_g_5, g_5);

		JPanel g_6 = new JPanel();
		action.mouse2(g_6, display);
		g_6.setBorder(new MatteBorder(3, 1, 1, 3, (Color) new Color(0, 0, 0)));
		g_6.setBounds(201, 296, 40, 40);

		JLabel lbl_g_6 = new JLabel("");
		action.labelBody2(lbl_g_6, g_6);

		JPanel g_7 = new JPanel();
		action.mouse1(g_7, display);
		g_7.setBorder(new MatteBorder(3, 3, 1, 1, (Color) Color.BLACK));
		g_7.setBounds(240, 296, 40, 40);

		JLabel lbl_g_7 = new JLabel("");
		action.labelBody1(lbl_g_7, g_7);

		JPanel g_8 = new JPanel();
		action.mouse1(g_8, display);
		g_8.setBorder(new MatteBorder(3, 1, 1, 1, (Color) new Color(0, 0, 0)));
		g_8.setBounds(279, 296, 40, 40);

		JLabel lbl_g_8 = new JLabel("");
		action.labelBody1(lbl_g_8, g_8);

		JPanel g_9 = new JPanel();
		action.mouse1(g_9, display);
		g_9.setBorder(new MatteBorder(3, 1, 1, 4, (Color) new Color(0, 0, 0)));
		g_9.setBounds(318, 296, 40, 40);

		JLabel lbl_g_9 = new JLabel("");
		action.labelBody1(lbl_g_9, g_9);
// ******************************* FINE PANNELLI G **************************************

// ********************************* PANNELLI H *****************************************
		JPanel h_1 = new JPanel();
		action.mouse1(h_1, display);
		h_1.setBorder(new MatteBorder(1, 4, 1, 1, (Color) new Color(0, 0, 0)));
		h_1.setBounds(6, 335, 40, 40);

		JLabel lbl_h_1 = new JLabel("");
		action.labelBody1(lbl_h_1, h_1);

		JPanel h_2 = new JPanel();
		action.mouse1(h_2, display);
		h_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		h_2.setBounds(45, 335, 40, 40);

		JLabel lbl_h_2 = new JLabel("");
		action.labelBody1(lbl_h_2, h_2);

		JPanel h_3 = new JPanel();
		action.mouse1(h_3, display);
		h_3.setBorder(new MatteBorder(1, 1, 1, 3, (Color) new Color(0, 0, 0)));
		h_3.setBounds(84, 335, 40, 40);

		JLabel lbl_h_3 = new JLabel("");
		action.labelBody1(lbl_h_3, h_3);

		JPanel h_4 = new JPanel();
		action.mouse2(h_4, display);
		h_4.setBorder(new MatteBorder(1, 3, 1, 1, (Color) new Color(0, 0, 0)));
		h_4.setBounds(123, 335, 40, 40);

		JLabel lbl_h_4 = new JLabel("");
		action.labelBody2(lbl_h_4, h_4);

		JPanel h_5 = new JPanel();
		action.mouse2(h_5, display);
		h_5.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		h_5.setBounds(162, 335, 40, 40);

		JLabel lbl_h_5 = new JLabel("");
		action.labelBody2(lbl_h_5, h_5);

		JPanel h_6 = new JPanel();
		action.mouse2(h_6, display);
		h_6.setBorder(new MatteBorder(1, 1, 1, 3, (Color) new Color(0, 0, 0)));
		h_6.setBounds(201, 335, 40, 40);

		JLabel lbl_h_6 = new JLabel("");
		action.labelBody2(lbl_h_6, h_6);

		JPanel h_7 = new JPanel();
		action.mouse1(h_7, display);
		h_7.setBorder(new MatteBorder(1, 3, 1, 1, (Color) new Color(0, 0, 0)));
		h_7.setBounds(240, 335, 40, 40);

		JLabel lbl_h_7 = new JLabel("");
		action.labelBody1(lbl_h_7, h_7);

		JPanel h_8 = new JPanel();
		action.mouse1(h_8, display);
		h_8.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		h_8.setBounds(279, 335, 40, 40);

		JLabel lbl_h_8 = new JLabel("");
		action.labelBody1(lbl_h_8, h_8);

		JPanel h_9 = new JPanel();
		action.mouse1(h_9, display);
		h_9.setBorder(new MatteBorder(1, 1, 1, 4, (Color) new Color(0, 0, 0)));
		h_9.setBounds(318, 335, 40, 40);

		JLabel lbl_h_9 = new JLabel("");
		action.labelBody1(lbl_h_9, h_9);
// ******************************* FINE PANNELLI H **************************************

// ********************************* PANNELLI I *****************************************
		JPanel i_1 = new JPanel();
		action.mouse1(i_1, display);
		i_1.setBorder(new MatteBorder(1, 4, 4, 1, (Color) new Color(0, 0, 0)));
		i_1.setBounds(6, 374, 40, 40);

		JLabel lbl_i_1 = new JLabel("");
		action.labelBody1(lbl_i_1, i_1);

		JPanel i_2 = new JPanel();
		action.mouse1(i_2, display);
		i_2.setBorder(new MatteBorder(1, 1, 4, 1, (Color) new Color(0, 0, 0)));
		i_2.setBounds(45, 374, 40, 40);

		JLabel lbl_i_2 = new JLabel("");
		action.labelBody1(lbl_i_2, i_2);

		JPanel i_3 = new JPanel();
		action.mouse1(i_3, display);
		i_3.setBorder(new MatteBorder(1, 1, 4, 3, (Color) new Color(0, 0, 0)));
		i_3.setBounds(84, 374, 40, 40);

		JLabel lbl_i_3 = new JLabel("");
		action.labelBody1(lbl_i_3, i_3);

		JPanel i_4 = new JPanel();
		action.mouse2(i_4, display);
		i_4.setBorder(new MatteBorder(1, 3, 4, 1, (Color) new Color(0, 0, 0)));
		i_4.setBounds(123, 374, 40, 40);

		JLabel lbl_i_4 = new JLabel("");
		action.labelBody2(lbl_i_4, i_4);

		JPanel i_5 = new JPanel();
		action.mouse2(i_5, display);
		i_5.setBorder(new MatteBorder(1, 1, 4, 1, (Color) new Color(0, 0, 0)));
		i_5.setBounds(162, 374, 40, 40);

		JLabel lbl_i_5 = new JLabel("");
		action.labelBody2(lbl_i_5, i_5);

		JPanel i_6 = new JPanel();
		action.mouse2(i_6, display);
		i_6.setBorder(new MatteBorder(1, 1, 4, 3, (Color) new Color(0, 0, 0)));
		i_6.setBounds(201, 374, 40, 40);

		JLabel lbl_i_6 = new JLabel("");
		action.labelBody2(lbl_i_6, i_6);

		JPanel i_7 = new JPanel();
		action.mouse1(i_7, display);
		i_7.setBorder(new MatteBorder(1, 3, 4, 1, (Color) new Color(0, 0, 0)));
		i_7.setBounds(240, 374, 40, 40);

		JLabel lbl_i_7 = new JLabel("");
		action.labelBody1(lbl_i_7, i_7);

		JPanel i_8 = new JPanel();
		action.mouse1(i_8, display);
		i_8.setBorder(new MatteBorder(1, 1, 4, 1, (Color) new Color(0, 0, 0)));
		i_8.setBounds(279, 374, 40, 40);

		JLabel lbl_i_8 = new JLabel("");
		action.labelBody1(lbl_i_8, i_8);

		JPanel i_9 = new JPanel();
		action.mouse1(i_9, display);
		i_9.setBorder(new MatteBorder(1, 1, 4, 4, (Color) new Color(0, 0, 0)));
		i_9.setBounds(318, 374, 40, 40);

		JLabel lbl_i_9 = new JLabel("");
		action.labelBody1(lbl_i_9, i_9);
// ******************************* FINE PANNELLI I **************************************

// ******************************** AZIONI PANNELLI *************************************
		action.mouseClickPannel(a_1, lbl_a_1);
		action.mouseClickPannel(a_2, lbl_a_2);
		action.mouseClickPannel(a_3, lbl_a_3);
		action.mouseClickPannel(a_4, lbl_a_4);
		action.mouseClickPannel(a_5, lbl_a_5);
		action.mouseClickPannel(a_6, lbl_a_6);
		action.mouseClickPannel(a_7, lbl_a_7);
		action.mouseClickPannel(a_8, lbl_a_8);
		action.mouseClickPannel(a_9, lbl_a_9);

		action.mouseClickPannel(b_1, lbl_b_1);
		action.mouseClickPannel(b_2, lbl_b_2);
		action.mouseClickPannel(b_3, lbl_b_3);
		action.mouseClickPannel(b_4, lbl_b_4);
		action.mouseClickPannel(b_5, lbl_b_5);
		action.mouseClickPannel(b_6, lbl_b_6);
		action.mouseClickPannel(b_7, lbl_b_7);
		action.mouseClickPannel(b_8, lbl_b_8);
		action.mouseClickPannel(b_9, lbl_b_9);

		action.mouseClickPannel(c_1, lbl_c_1);
		action.mouseClickPannel(c_2, lbl_c_2);
		action.mouseClickPannel(c_3, lbl_c_3);
		action.mouseClickPannel(c_4, lbl_c_4);
		action.mouseClickPannel(c_5, lbl_c_5);
		action.mouseClickPannel(c_6, lbl_c_6);
		action.mouseClickPannel(c_7, lbl_c_7);
		action.mouseClickPannel(c_8, lbl_c_8);
		action.mouseClickPannel(c_9, lbl_c_9);

		action.mouseClickPannel(d_1, lbl_d_1);
		action.mouseClickPannel(d_2, lbl_d_2);
		action.mouseClickPannel(d_3, lbl_d_3);
		action.mouseClickPannel(d_4, lbl_d_4);
		action.mouseClickPannel(d_5, lbl_d_5);
		action.mouseClickPannel(d_6, lbl_d_6);
		action.mouseClickPannel(d_7, lbl_d_7);
		action.mouseClickPannel(d_8, lbl_d_8);
		action.mouseClickPannel(d_9, lbl_d_9);

		action.mouseClickPannel(e_1, lbl_e_1);
		action.mouseClickPannel(e_2, lbl_e_2);
		action.mouseClickPannel(e_3, lbl_e_3);
		action.mouseClickPannel(e_4, lbl_e_4);
		action.mouseClickPannel(e_5, lbl_e_5);
		action.mouseClickPannel(e_6, lbl_e_6);
		action.mouseClickPannel(e_7, lbl_e_7);
		action.mouseClickPannel(e_8, lbl_e_8);
		action.mouseClickPannel(e_9, lbl_e_9);

		action.mouseClickPannel(f_1, lbl_f_1);
		action.mouseClickPannel(f_2, lbl_f_2);
		action.mouseClickPannel(f_3, lbl_f_3);
		action.mouseClickPannel(f_4, lbl_f_4);
		action.mouseClickPannel(f_5, lbl_f_5);
		action.mouseClickPannel(f_6, lbl_f_6);
		action.mouseClickPannel(f_7, lbl_f_7);
		action.mouseClickPannel(f_8, lbl_f_8);
		action.mouseClickPannel(f_9, lbl_f_9);

		action.mouseClickPannel(g_1, lbl_g_1);
		action.mouseClickPannel(g_2, lbl_g_2);
		action.mouseClickPannel(g_3, lbl_g_3);
		action.mouseClickPannel(g_4, lbl_g_4);
		action.mouseClickPannel(g_5, lbl_g_5);
		action.mouseClickPannel(g_6, lbl_g_6);
		action.mouseClickPannel(g_7, lbl_g_7);
		action.mouseClickPannel(g_8, lbl_g_8);
		action.mouseClickPannel(g_9, lbl_g_9);

		action.mouseClickPannel(h_1, lbl_h_1);
		action.mouseClickPannel(h_2, lbl_h_2);
		action.mouseClickPannel(h_3, lbl_h_3);
		action.mouseClickPannel(h_4, lbl_h_4);
		action.mouseClickPannel(h_5, lbl_h_5);
		action.mouseClickPannel(h_6, lbl_h_6);
		action.mouseClickPannel(h_7, lbl_h_7);
		action.mouseClickPannel(h_8, lbl_h_8);
		action.mouseClickPannel(h_9, lbl_h_9);

		action.mouseClickPannel(i_1, lbl_i_1);
		action.mouseClickPannel(i_2, lbl_i_2);
		action.mouseClickPannel(i_3, lbl_i_3);
		action.mouseClickPannel(i_4, lbl_i_4);
		action.mouseClickPannel(i_5, lbl_i_5);
		action.mouseClickPannel(i_6, lbl_i_6);
		action.mouseClickPannel(i_7, lbl_i_7);
		action.mouseClickPannel(i_8, lbl_i_8);
		action.mouseClickPannel(i_9, lbl_i_9);
// ***************************** FINE AZIONI PANNELLI  **********************************

// ******************************* PANNELLI SELECT **************************************
		JPanel select_1 = new JPanel();
		action.mouseSelection(select_1, display);
		select_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				action.setNumeroSelezionato(1);
				action.staticColor(select_1);
			}
		});

		JLabel lblSelect_1 = new JLabel("1");
		action.labelSelection(lblSelect_1, select_1);

		JPanel select_2 = new JPanel();
		action.mouseSelection(select_2, display);
		select_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				action.setNumeroSelezionato(2);
				action.staticColor(select_2);
			}
		});

		JLabel lblSelect_2 = new JLabel("2");
		action.labelSelection(lblSelect_2, select_2);

		JPanel select_3 = new JPanel();
		action.mouseSelection(select_3, display);
		select_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				action.setNumeroSelezionato(3);
				action.staticColor(select_3);
			}
		});

		JLabel lblSelect_3 = new JLabel("3");
		action.labelSelection(lblSelect_3, select_3);

		JPanel select_4 = new JPanel();
		action.mouseSelection(select_4, display);
		select_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				action.setNumeroSelezionato(4);
				action.staticColor(select_4);
			}
		});

		JLabel lblSelect_4 = new JLabel("4");
		action.labelSelection(lblSelect_4, select_4);

		JPanel select_5 = new JPanel();
		action.mouseSelection(select_5, display);
		select_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				action.setNumeroSelezionato(5);
				action.staticColor(select_5);
			}
		});

		JLabel lblSelect_5 = new JLabel("5");
		action.labelSelection(lblSelect_5, select_5);

		JPanel select_6 = new JPanel();
		action.mouseSelection(select_6, display);
		select_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				action.setNumeroSelezionato(6);
				action.staticColor(select_6);
			}
		});

		JLabel lblSelect_6 = new JLabel("6");
		action.labelSelection(lblSelect_6, select_6);

		JPanel select_7 = new JPanel();
		action.mouseSelection(select_7, display);
		select_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				action.setNumeroSelezionato(7);
				action.staticColor(select_7);
			}
		});

		JLabel lblSelect_7 = new JLabel("7");
		action.labelSelection(lblSelect_7, select_7);

		JPanel select_8 = new JPanel();
		action.mouseSelection(select_8, display);
		select_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				action.setNumeroSelezionato(8);
				action.staticColor(select_8);
			}
		});

		JLabel lblSelect_8 = new JLabel("8");
		action.labelSelection(lblSelect_8, select_8);

		JPanel select_9 = new JPanel();
		action.mouseSelection(select_9, display);
		select_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				action.setNumeroSelezionato(9);
				action.staticColor(select_9);
			}
		});

		JLabel lblSelect_9 = new JLabel("9");
		action.labelSelection(lblSelect_9, select_9);
// **************************************** FINE SELECT ********************************

// ****************************** POSIZIONE TASTI SELECT *******************************
		select_1.setBounds(202, 421, 50, 50);
		select_2.setBounds(254, 421, 50, 50);
		select_3.setBounds(306, 421, 50, 50);
		
		select_4.setBounds(202, 473, 50, 50);
		select_5.setBounds(254, 473, 50, 50);
		select_6.setBounds(306, 473, 50, 50);
		
		select_7.setBounds(202, 525, 50, 50);
		select_8.setBounds(254, 525, 50, 50);
		select_9.setBounds(306, 525, 50, 50);
// **************************** FINE POSIZIONE TASTI SELECT ****************************

		
// ************************** PANNELLI PICCOLI SELECT ***********************************
		JPanel sel_1 = new JPanel();
		action.mouseSelection(sel_1, display);
		sel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				action.setSmall(true);
				action.setNumeroSelezionato(1);
				action.staticColor(sel_1);
			}
		});

		JLabel lbl_sel_1 = new JLabel("1");
		action.labelSelectionSmall(lbl_sel_1, sel_1);

		JPanel sel_2 = new JPanel();
		action.mouseSelection(sel_2, display);
		sel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				action.setSmall(true);
				action.setNumeroSelezionato(2);
				action.staticColor(sel_2);
			}
		});

		JLabel lbl_sel_2 = new JLabel("2");
		action.labelSelectionSmall(lbl_sel_2, sel_2);

		JPanel sel_3 = new JPanel();
		action.mouseSelection(sel_3, display);
		sel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				action.setSmall(true);
				action.setNumeroSelezionato(3);
				action.staticColor(sel_3);
			}
		});

		JLabel lbl_sel_3 = new JLabel("3");
		action.labelSelectionSmall(lbl_sel_3, sel_3);

		JPanel sel_4 = new JPanel();
		action.mouseSelection(sel_4, display);
		sel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				action.setSmall(true);
				action.setNumeroSelezionato(4);
				action.staticColor(sel_4);
			}
		});

		JLabel lbl_sel_4 = new JLabel("4");
		action.labelSelectionSmall(lbl_sel_4, sel_4);

		JPanel sel_5 = new JPanel();
		action.mouseSelection(sel_5, display);
		sel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				action.setSmall(true);
				action.setNumeroSelezionato(5);
				action.staticColor(sel_5);
			}
		});

		JLabel lbl_sel_5 = new JLabel("5");
		action.labelSelectionSmall(lbl_sel_5, sel_5);

		JPanel sel_6 = new JPanel();
		action.mouseSelection(sel_6, display);
		sel_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				action.setSmall(true);
				action.setNumeroSelezionato(6);
				action.staticColor(sel_6);
			}
		});

		JLabel lbl_sel_6 = new JLabel("6");
		action.labelSelectionSmall(lbl_sel_6, sel_6);

		JPanel sel_7 = new JPanel();
		action.mouseSelection(sel_7, display);
		sel_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				action.setSmall(true);
				action.setNumeroSelezionato(7);
				action.staticColor(sel_7);
			}
		});

		JLabel lbl_sel_7 = new JLabel("7");
		action.labelSelectionSmall(lbl_sel_7, sel_7);

		JPanel sel_8 = new JPanel();
		action.mouseSelection(sel_8, display);
		sel_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				action.setSmall(true);
				action.setNumeroSelezionato(8);
				action.staticColor(sel_8);
			}
		});

		JLabel lbl_sel_8 = new JLabel("8");
		action.labelSelectionSmall(lbl_sel_8, sel_8);

		JPanel sel_9 = new JPanel();
		action.mouseSelection(sel_9, display);
		sel_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				action.setSmall(true);
				action.setNumeroSelezionato(9);
				action.staticColor(sel_9);
			}
		});

		JLabel lbl_sel_9 = new JLabel("9");
		action.labelSelectionSmall(lbl_sel_9, sel_9);
// *********************** FINE PANNELLI PICCOLI SELECT *********************************

// ********************** POSIZIONE TASTI SELECT PICCOLI ********************************
		sel_1.setBounds(6, 421, 50, 50);
		sel_2.setBounds(58, 421, 50, 50);
		sel_3.setBounds(110, 421, 50, 50);
//				
		sel_4.setBounds(6, 473, 50, 50);
		sel_5.setBounds(58, 473, 50, 50);
		sel_6.setBounds(110, 473, 50, 50);
//				
		sel_7.setBounds(6, 525, 50, 50);
		sel_8.setBounds(58, 525, 50, 50);
		sel_9.setBounds(110, 525, 50, 50);
// ******************** FINE POSIZIONE TASTI SELECT PICCOLI *****************************
		
				
		JButton btnCancella = new JButton("Cancella Tutto");
		btnCancella.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbl_a_1.setText("");
				lbl_a_2.setText("");
				lbl_a_3.setText("");
				lbl_a_4.setText("");
				lbl_a_5.setText("");
				lbl_a_6.setText("");
				lbl_a_7.setText("");
				lbl_a_8.setText("");
				lbl_a_9.setText("");

				lbl_b_1.setText("");
				lbl_b_2.setText("");
				lbl_b_3.setText("");
				lbl_b_4.setText("");
				lbl_b_5.setText("");
				lbl_b_6.setText("");
				lbl_b_7.setText("");
				lbl_b_8.setText("");
				lbl_b_9.setText("");

				lbl_c_1.setText("");
				lbl_c_2.setText("");
				lbl_c_3.setText("");
				lbl_c_4.setText("");
				lbl_c_5.setText("");
				lbl_c_6.setText("");
				lbl_c_7.setText("");
				lbl_c_8.setText("");
				lbl_c_9.setText("");

				lbl_d_1.setText("");
				lbl_d_2.setText("");
				lbl_d_3.setText("");
				lbl_d_4.setText("");
				lbl_d_5.setText("");
				lbl_d_6.setText("");
				lbl_d_7.setText("");
				lbl_d_8.setText("");
				lbl_d_9.setText("");

				lbl_e_1.setText("");
				lbl_e_2.setText("");
				lbl_e_3.setText("");
				lbl_e_4.setText("");
				lbl_e_5.setText("");
				lbl_e_6.setText("");
				lbl_e_7.setText("");
				lbl_e_8.setText("");
				lbl_e_9.setText("");

				lbl_f_1.setText("");
				lbl_f_2.setText("");
				lbl_f_3.setText("");
				lbl_f_4.setText("");
				lbl_f_5.setText("");
				lbl_f_6.setText("");
				lbl_f_7.setText("");
				lbl_f_8.setText("");
				lbl_f_9.setText("");

				lbl_g_1.setText("");
				lbl_g_2.setText("");
				lbl_g_3.setText("");
				lbl_g_4.setText("");
				lbl_g_5.setText("");
				lbl_g_6.setText("");
				lbl_g_7.setText("");
				lbl_g_8.setText("");
				lbl_g_9.setText("");

				lbl_h_1.setText("");
				lbl_h_2.setText("");
				lbl_h_3.setText("");
				lbl_h_4.setText("");
				lbl_h_5.setText("");
				lbl_h_6.setText("");
				lbl_h_7.setText("");
				lbl_h_8.setText("");
				lbl_h_9.setText("");

				lbl_i_1.setText("");
				lbl_i_2.setText("");
				lbl_i_3.setText("");
				lbl_i_4.setText("");
				lbl_i_5.setText("");
				lbl_i_6.setText("");
				lbl_i_7.setText("");
				lbl_i_8.setText("");
				lbl_i_9.setText("");
			}
		});
		btnCancella.setBounds(121, 22, 118, 29);
		display.add(btnCancella);

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "Livello", "1", "2", "3", "4", "5" }));
		comboBox.setBounds(238, 23, 118, 27);
		display.add(comboBox);
				
		JButton btnNuovaPartita = new JButton("Nuova Partita");
		btnNuovaPartita.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				lbl_a_1.setText("");
				lbl_a_2.setText("");
				lbl_a_3.setText("");
				lbl_a_4.setText("");
				lbl_a_5.setText("");
				lbl_a_6.setText("");
				lbl_a_7.setText("");
				lbl_a_8.setText("");
				lbl_a_9.setText("");

				lbl_b_1.setText("");
				lbl_b_2.setText("");
				lbl_b_3.setText("");
				lbl_b_4.setText("");
				lbl_b_5.setText("");
				lbl_b_6.setText("");
				lbl_b_7.setText("");
				lbl_b_8.setText("");
				lbl_b_9.setText("");

				lbl_c_1.setText("");
				lbl_c_2.setText("");
				lbl_c_3.setText("");
				lbl_c_4.setText("");
				lbl_c_5.setText("");
				lbl_c_6.setText("");
				lbl_c_7.setText("");
				lbl_c_8.setText("");
				lbl_c_9.setText("");

				lbl_d_1.setText("");
				lbl_d_2.setText("");
				lbl_d_3.setText("");
				lbl_d_4.setText("");
				lbl_d_5.setText("");
				lbl_d_6.setText("");
				lbl_d_7.setText("");
				lbl_d_8.setText("");
				lbl_d_9.setText("");

				lbl_e_1.setText("");
				lbl_e_2.setText("");
				lbl_e_3.setText("");
				lbl_e_4.setText("");
				lbl_e_5.setText("");
				lbl_e_6.setText("");
				lbl_e_7.setText("");
				lbl_e_8.setText("");
				lbl_e_9.setText("");

				lbl_f_1.setText("");
				lbl_f_2.setText("");
				lbl_f_3.setText("");
				lbl_f_4.setText("");
				lbl_f_5.setText("");
				lbl_f_6.setText("");
				lbl_f_7.setText("");
				lbl_f_8.setText("");
				lbl_f_9.setText("");

				lbl_g_1.setText("");
				lbl_g_2.setText("");
				lbl_g_3.setText("");
				lbl_g_4.setText("");
				lbl_g_5.setText("");
				lbl_g_6.setText("");
				lbl_g_7.setText("");
				lbl_g_8.setText("");
				lbl_g_9.setText("");

				lbl_h_1.setText("");
				lbl_h_2.setText("");
				lbl_h_3.setText("");
				lbl_h_4.setText("");
				lbl_h_5.setText("");
				lbl_h_6.setText("");
				lbl_h_7.setText("");
				lbl_h_8.setText("");
				lbl_h_9.setText("");

				lbl_i_1.setText("");
				lbl_i_2.setText("");
				lbl_i_3.setText("");
				lbl_i_4.setText("");
				lbl_i_5.setText("");
				lbl_i_6.setText("");
				lbl_i_7.setText("");
				lbl_i_8.setText("");
				lbl_i_9.setText("");

				switch (comboBox.getSelectedIndex()) {
				case 0:
					JOptionPane.showMessageDialog(display, "Selezionare un livello\n"
							+ "per iniziare la partita");
					break;
				case 1:
					lbl_a_1.setText("3");
					lbl_a_4.setText("7");
					lbl_a_8.setText("6");

					lbl_b_3.setText("1");
					lbl_b_5.setText("5");
					lbl_b_8.setText("3");
					lbl_b_9.setText("9");

					lbl_c_2.setText("9");
					lbl_c_4.setText("3");
					lbl_c_5.setText("2");
					lbl_c_6.setText("6");

					lbl_d_1.setText("1");
					lbl_d_3.setText("3");
					lbl_d_6.setText("2");
					lbl_d_7.setText("9");

					lbl_e_2.setText("8");
					lbl_e_3.setText("5");
					lbl_e_7.setText("4");
					lbl_e_8.setText("1");

					lbl_f_3.setText("7");
					lbl_f_4.setText("6");
					lbl_f_7.setText("3");
					lbl_f_9.setText("5");

					lbl_g_4.setText("8");
					lbl_g_5.setText("9");
					lbl_g_6.setText("7");
					lbl_g_8.setText("5");

					lbl_h_1.setText("5");
					lbl_h_2.setText("3");
					lbl_h_5.setText("6");
					lbl_h_7.setText("7");

					lbl_i_2.setText("1");
					lbl_i_6.setText("5");
					lbl_i_9.setText("8");
					break;
				case 2:
					lbl_a_1.setText("1");
					lbl_a_2.setText("2");
					lbl_a_3.setText("3");
					lbl_a_9.setText("8");

					lbl_b_1.setText("4");
					lbl_b_4.setText("2");
					lbl_b_7.setText("1");

					lbl_c_1.setText("7");
					lbl_c_5.setText("3");
					lbl_c_6.setText("6");
					lbl_c_7.setText("2");
					lbl_c_8.setText("4");

					lbl_d_2.setText("4");
					lbl_d_4.setText("5");
					lbl_d_5.setText("8");
					lbl_d_7.setText("3");

					lbl_e_3.setText("1");
					lbl_e_4.setText("3");
					lbl_e_6.setText("4");
					lbl_e_7.setText("8");

					lbl_f_3.setText("8");
					lbl_f_5.setText("1");
					lbl_f_6.setText("7");
					lbl_f_8.setText("2");

					lbl_g_2.setText("7");
					lbl_g_3.setText("2");
					lbl_g_4.setText("8");
					lbl_g_5.setText("4");
					lbl_g_9.setText("1");

					lbl_h_3.setText("5");
					lbl_h_6.setText("1");
					lbl_h_9.setText("3");

					lbl_i_1.setText("3");
					lbl_i_7.setText("7");
					lbl_i_8.setText("8");
					lbl_i_9.setText("2");
					break;
				case 3:
					lbl_a_2.setText("1");
					lbl_a_3.setText("6");
					lbl_a_6.setText("4");

					lbl_b_1.setText("2");
					lbl_b_6.setText("3");
					lbl_b_7.setText("1");
					lbl_b_8.setText("5");

					lbl_c_1.setText("9");
					lbl_c_5.setText("6");
					lbl_c_7.setText("4");
					lbl_c_8.setText("7");

					lbl_d_5.setText("4");
					lbl_d_6.setText("7");
					lbl_d_8.setText("9");
					lbl_d_9.setText("1");

					lbl_e_3.setText("9");
					lbl_e_4.setText("1");
					lbl_e_6.setText("6");
					lbl_e_7.setText("3");

					lbl_f_1.setText("6");
					lbl_f_2.setText("7");
					lbl_f_4.setText("3");
					lbl_f_5.setText("8");

					lbl_g_2.setText("9");
					lbl_g_3.setText("2");
					lbl_g_5.setText("3");
					lbl_g_9.setText("5");

					lbl_h_2.setText("8");
					lbl_h_3.setText("4");
					lbl_h_4.setText("9");
					lbl_h_9.setText("3");

					lbl_i_4.setText("4");
					lbl_i_7.setText("9");
					lbl_i_8.setText("1");
					break;
				case 4:
					lbl_a_1.setText("3");
					lbl_a_2.setText("2");
					lbl_a_3.setText("4");
					lbl_a_7.setText("1");
					lbl_a_9.setText("7");

					lbl_b_1.setText("6");
					lbl_b_3.setText("7");
					lbl_b_7.setText("5");

					lbl_c_1.setText("8");
					lbl_c_2.setText("9");
					lbl_c_5.setText("6");
					lbl_c_8.setText("3");
					lbl_c_9.setText("4");

					lbl_d_5.setText("7");
					lbl_d_6.setText("2");

					lbl_e_3.setText("8");
					lbl_e_4.setText("6");
					lbl_e_6.setText("3");
					lbl_e_7.setText("4");

					lbl_f_4.setText("8");
					lbl_f_5.setText("9");

					lbl_g_1.setText("7");
					lbl_g_2.setText("4");
					lbl_g_5.setText("2");
					lbl_g_8.setText("9");
					lbl_g_9.setText("5");

					lbl_h_3.setText("1");
					lbl_h_7.setText("6");
					lbl_h_9.setText("3");

					lbl_i_1.setText("5");
					lbl_i_3.setText("9");
					lbl_i_7.setText("7");
					lbl_i_8.setText("2");
					lbl_i_9.setText("1");
					break;
				case 5:
					lbl_a_1.setText("2");
					lbl_a_2.setText("1");
					lbl_a_8.setText("8");

					lbl_b_1.setText("3");
					lbl_b_5.setText("8");
					lbl_b_6.setText("9");
					lbl_b_9.setText("1");

					lbl_c_3.setText("9");
					lbl_c_4.setText("4");

					lbl_d_3.setText("1");
					lbl_d_5.setText("3");
					lbl_d_6.setText("5");
					lbl_d_8.setText("7");

					lbl_e_2.setText("3");
					lbl_e_4.setText("2");
					lbl_e_6.setText("8");
					lbl_e_8.setText("4");

					lbl_f_2.setText("9");
					lbl_f_4.setText("1");
					lbl_f_5.setText("4");
					lbl_f_7.setText("3");

					lbl_g_6.setText("1");
					lbl_g_7.setText("8");

					lbl_h_1.setText("8");
					lbl_h_4.setText("6");
					lbl_h_5.setText("9");
					lbl_h_9.setText("4");

					lbl_i_2.setText("7");
					lbl_i_8.setText("9");
					lbl_i_9.setText("3");
					break;
				}
			}
		});
		btnNuovaPartita.setBounds(6, 22, 118, 29);
		display.add(btnNuovaPartita);
		
		JPanel pnlRubber = new JPanel();
		pnlRubber.setBackground((new Color(235, 255, 238)));
		action.iconColor(pnlRubber);
		pnlRubber.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				action.setCancell(true);
			}
		});
		pnlRubber.setBounds(161, 425, 40, 40);
		display.add(pnlRubber);
		pnlRubber.setLayout(null);
		
		JLabel lblRubber = new JLabel("");
		action.iconLabel(lblRubber, pnlRubber);
		lblRubber.setIcon(new ImageIcon("/Users/matteomariani/DEVELOPER/Workspace/eclipse-workspace/Sudoku/src/image/pencil.png"));
		
		JPanel pnlQuit = new JPanel();
		pnlQuit.setBackground((new Color(235, 255, 238)));
		action.iconColor(pnlQuit);
		pnlQuit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(1);
			}
		});
		pnlQuit.setLayout(null);
		pnlQuit.setBounds(161, 529, 40, 40);
		display.add(pnlQuit);
		
		JLabel lblQuit = new JLabel("");
		action.iconLabel(lblQuit, pnlQuit);
		lblQuit.setIcon(new ImageIcon("/Users/matteomariani/DEVELOPER/Workspace/eclipse-workspace/Sudoku/src/image/spegnimento.png"));
		
		JPanel pnlReturn = new JPanel();
		action.iconColor(pnlReturn);
		pnlReturn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		pnlReturn.setLayout(null);
		pnlReturn.setBackground(new Color(235, 255, 238));
		pnlReturn.setBounds(161, 477, 40, 40);
		display.add(pnlReturn);
		
		JLabel lblReturn = new JLabel("");
		action.iconLabel(lblReturn, pnlReturn);
		lblReturn.setIcon(new ImageIcon("/Users/matteomariani/DEVELOPER/Workspace/eclipse-workspace/Sudoku/src/image/sostituire.png"));
	}
}