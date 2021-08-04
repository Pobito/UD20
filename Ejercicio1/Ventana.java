package Ejercicio1;

import javax.swing.*;

public class Ventana extends JFrame {

	private JPanel contentPane;
	private JLabel etiqueta;
	
	public Ventana() {
		setTitle("Ventana");
		setBounds(100, 100, 550, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		etiqueta = new JLabel("Se puede cambiar el tamaño de la ventana en los bordes");
		etiqueta.setBounds(10, 11, 350, 20);
		contentPane.add(etiqueta);
		
	}

	
}
