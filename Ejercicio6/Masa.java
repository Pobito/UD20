package Ejercicio6;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Masa extends JFrame {

	private JPanel contentPane;
	private JButton calcular;
	private JLabel texto;
	private JLabel texto2;
	private JLabel respuesta;
	private JTextField num1;
	private JTextField num2;

	private double resultado = 0;
	
	public Masa() {
		setTitle("Indice de masa corporal");
		setBounds(100, 100, 550, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		calcular = new JButton("Calcular");
		calcular.setBounds(248,83,92,37);
		contentPane.add(calcular);
		calcular.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent e) {
				resultado = Double.parseDouble(num2.getText()) / Math.pow(Double.parseDouble(num1.getText()) , 2);
				resultado = Math.round(resultado*100.0) /100.0;
				
				String text = "" + resultado;
				respuesta = new JLabel(text);
				respuesta.setBounds(58,194,81,10);
				contentPane.add(respuesta);
			}
		});
		
		texto = new JLabel("Altura (metros)");
		texto.setBounds(58, 35, 100, 20);
		contentPane.add(texto);
		
		texto2 = new JLabel("Peso (kg)");
		texto2.setBounds(58, 100, 81, 20);
		contentPane.add(texto2);
		
		num1 = new JTextField();
		num1.setBounds(58, 66, 143, 20);
		contentPane.add(num1);

		num2 = new JTextField();
		num2.setBounds(58, 131, 143, 20);
		contentPane.add(num2);
	}

}

