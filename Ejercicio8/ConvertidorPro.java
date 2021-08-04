package Ejercicio8;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ConvertidorPro extends JFrame {

	private JPanel contentPane;
	private JButton cambiar;
	private JButton pesetas;
	private JButton euros;
	private JButton borrar;
	private JLabel texto;
	private JLabel texto2;
	private JLabel respuesta;
	private JTextField num1;

	private double resultado = 0;
	private int num = 0;
	
	public ConvertidorPro() {
		setTitle("Indice de masa corporal");
		setBounds(100, 100, 550, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		cambiar = new JButton("Cambiar");
		cambiar.setBounds(237,69,97,20);
		contentPane.add(cambiar);
		cambiar.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent e) {
				if (num % 2 == 0) {
					contentPane.remove(euros);
					pesetas = new JButton("Pesetas a Euros");
					pesetas.setBounds(218, 100, 143, 20);
					contentPane.add(pesetas);
					pesetas.addActionListener(new ActionListener(){
						public void actionPerformed (ActionEvent e) {
							resultado = Double.parseDouble(num1.getText()) * 0.006;
							resultado = Math.round(resultado*100.0) /100.0;
							
							respuesta.setText("" + resultado);
						}
					});
				}
				else {
					contentPane.remove(pesetas);
					euros = new JButton("Euros a Pesetas");
					euros.setBounds(218, 100, 143, 20);
					contentPane.add(euros);
					euros.addActionListener(new ActionListener(){
						public void actionPerformed (ActionEvent e) {
							resultado = Double.parseDouble(num1.getText()) * 166.386;
							resultado = Math.round(resultado*100.0) /100.0;
							
							respuesta.setText("" + resultado);
						}
					});
				}
				num++;
			}
		});
		
		texto = new JLabel("Cantidad a convertir");
		texto.setBounds(58, 35, 126, 20);
		contentPane.add(texto);
		
		texto2 = new JLabel("Total");
		texto2.setBounds(58, 100, 81, 20);
		contentPane.add(texto2);
		
		euros = new JButton("Euros a Pesetas");
		euros.setBounds(218, 100, 143, 20);
		contentPane.add(euros);
		euros.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent e) {
				resultado = Double.parseDouble(num1.getText()) * 166.386;
				resultado = Math.round(resultado*100.0) /100.0;
				
				respuesta.setText("" + resultado);
			}
		});
		
		borrar = new JButton("Borrar");
		borrar.setBounds(218, 127, 143, 20);
		contentPane.add(borrar);
		borrar.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent e) {
				num1.setText("");
				respuesta.setText("");
			}
		});
		
		respuesta = new JLabel();
		respuesta.setBounds(58,194,81,10);
		contentPane.add(respuesta);
		
		num1 = new JTextField();
		num1.setBounds(58, 66, 143, 20);
		contentPane.add(num1);

	}

}