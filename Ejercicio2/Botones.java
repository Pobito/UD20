package Ejercicio2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Botones extends JFrame {

	private JPanel contentPane;
	private JButton boton1;
	private JButton boton2;
	private JLabel texto;

	private String respuesta;
	
	public Botones() {
		setTitle("Ventana con interaccion");
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
				respuesta = "Has pulsado: Boton 1";
				texto.setText(respuesta);
			}
		});
		
		boton2 = new JButton("Boton 2");
		boton2.setBounds(218,109,89,37);
		contentPane.add(boton2);
		boton2.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent e) {
				respuesta = "Has pulsado: Boton 2";
				texto.setText(respuesta);
				
			}
		});
		
		texto = new JLabel();
		texto.setBounds(58, 105, 181, 20);
		contentPane.add(texto);
	}

}