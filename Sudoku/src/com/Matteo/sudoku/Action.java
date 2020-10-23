package com.Matteo.sudoku;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class Action {

	private int numeroSelezionato = 0;
	private boolean cancell = false;
	private boolean small = false;

	public void setColor(JPanel panel) {
		panel.setBackground(new java.awt.Color(186, 255, 198));
	}

	public void resetColor1(JPanel panel) {
		panel.setBackground(new java.awt.Color(208, 208, 208));
	}

	public void resetColor2(JPanel panel) {
		panel.setBackground(new java.awt.Color(252, 252, 252));
	}
	
	public void staticColor(JPanel panel) {
		panel.setBackground(new java.awt.Color(30, 255, 67));
	}
	
	public void labelBody1(JLabel label, JPanel panel) {
		label.setBackground(new java.awt.Color(208, 208, 208));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		label.setBounds(6, 6, 28, 28);
		panel.add(label);
	}
	
	public void labelBody2(JLabel label, JPanel panel) {
		label.setBackground(new java.awt.Color(252, 252, 252));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		label.setBounds(6, 6, 28, 28);
		panel.add(label);
	}


	public void mouse1(JPanel panel1, JPanel panel2) {
		panel1.setBackground(new java.awt.Color(208, 208, 208));
		panel2.add(panel1);
		panel1.setLayout(null);
		
		panel1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				Action action = new Action();
				action.setColor(panel1);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				Action action = new Action();
				action.resetColor1(panel1);
			}
		});
	}

	public void mouse2(JPanel panel1, JPanel panel2) {
		panel1.setBackground(new java.awt.Color(255, 255, 255));
		panel2.add(panel1);
		panel1.setLayout(null);
		
		panel1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				Action action = new Action();
				action.setColor(panel1);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				Action action = new Action();
				action.resetColor2(panel1);
			}
		});
	}
	
	public void mouseClickPannel(JPanel panel, JLabel label) {
		panel.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (isCancell() == true) {
					label.setText("");
					setCancell(false);
				} else {
					if (isSmall() == true) {
						if (getNumeroSelezionato() == 0) {
						} else {
							// scrivi piccolo... appunti...
							label.setFont(new Font("Lucida Grande", Font.PLAIN, 8));
							label.setText(label.getText() + " " + Integer.toString(getNumeroSelezionato()));
						}
					} else {
						if (getNumeroSelezionato() == 0) {
						} else {
							label.setText(Integer.toString(getNumeroSelezionato()));
						}
					}
				}
			}
		});
	}
	
	public void mouseSelection(JPanel panel1, JPanel panel2) {
		panel1.setForeground(Color.BLACK);
		panel1.setBackground(Color.WHITE);
		panel1.setBorder(new LineBorder(Color.BLACK, 3));
		panel2.add(panel1);
		panel1.setLayout(null);
		
		panel1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				Action action = new Action();
				action.setColor(panel1);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				Action action = new Action();
				action.resetColor2(panel1);
			}
		});
	}
	
	public void labelSelection(JLabel label, JPanel panel) {
		label.setForeground(Color.BLACK);
		label.setFont(new Font("Lucida Grande", Font.BOLD, 45));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(6, 6, 38, 38);
		panel.add(label);
	}
	
	public void labelSelectionSmall(JLabel label, JPanel panel) {
		label.setForeground(Color.BLACK);
		label.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(6, 6, 38, 38);
		panel.add(label);
	}
	
	public void iconColor(JPanel panel) {
		panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panel.setBackground(new java.awt.Color(186, 255, 198));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				panel.setBackground(new java.awt.Color(235, 255, 238));
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				Action action = new Action();
				action.staticColor(panel);
			}
		});
	}
	
	public void iconLabel(JLabel label, JPanel panel) {
		label.setBounds(6, 6, 28, 28);
		panel.add(label);
		label.setHorizontalAlignment(SwingConstants.CENTER);
	}
	
	public int getNumeroSelezionato() {
		return numeroSelezionato;
	}

	public void setNumeroSelezionato(int numeroSelezionato) {
		this.numeroSelezionato = numeroSelezionato;
	}

	public boolean isCancell() {
		return cancell;
	}

	public void setCancell(boolean cancell) {
		this.cancell = cancell;
	}

	public boolean isSmall() {
		return small;
	}

	public void setSmall(boolean small) {
		this.small = small;
	}
	
}
