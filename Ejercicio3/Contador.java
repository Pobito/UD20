package Ejercicio3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Contador extends JFrame {

	private JPanel contentPane;
	private JButton boton1;
	private JButton boton2;
	private JLabel texto1;
	private JLabel texto2;

	private String respuesta;
	private int cont1 = 0;
	private int cont2 = 0;
	
	public Contador() {
		respuesta = "";
//		double resultado = 0;
		setTitle("Ventana con mas interaccion");
		setBounds(100, 100, 550, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		boton1 = new JButton("Boton 1");
		boton1.setBounds(218,66,89,37);
		contentPane.add(boton1);
		boton1.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent e) {
				cont1++;
				respuesta = "Boton 1: " + cont1;
				texto1.setText(respuesta);
			}
		});
		
		boton2 = new JButton("Boton 2");
		boton2.setBounds(218,109,89,37);
		contentPane.add(boton2);
		boton2.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent e) {
				cont2++;
				respuesta = "Boton 2: " + cont2;
				texto2.setText(respuesta);
				
			}
		});
		
		texto1 = new JLabel();
		texto1.setBounds(58, 105, 181, 20);
		contentPane.add(texto1);
		texto2 = new JLabel();
		texto2.setBounds(58, 105, 181, 60);
		contentPane.add(texto2);
	}

}