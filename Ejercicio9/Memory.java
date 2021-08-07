package Ejercicio9;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class Memory extends JFrame {

	Random rnd = new Random();

	private JPanel contentPane;
	private JToggleButton[][] ficha = new JToggleButton[4][4];
	private Color[][] colores = new Color[4][4];
	private int i, j, x, y, seleccion = 0, aciertos = 0;;

	public Memory() {
		// contenedor
		setTitle("Memory");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// cerrar
		setBounds(100, 100, 450, 289);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);

		// Generamos colores randoms
		for (i = 0; i < colores.length; i++, i++) { // i se incrementa 2 veces para saltarnos una fila
			for (j = 0; j < colores[i].length; j++) {
				int r = rnd.nextInt(256), g = rnd.nextInt(256), b = rnd.nextInt(256);
				colores[i][j] = new Color(r, g, b); // Guardamos el color random en la matriz
				// Guardamos en mismo color en la siguiente fila
				// Esto es asi para tener 2 colores iguales y luego randomizarlos
				colores[i + 1][j] = new Color(r, g, b); 
			}
		}

		// Para randomizar la matriz de los colores (no tiene mas misterio)
		for (i = 0; i < colores.length; i++, i++) {
			for (j = 0; j < colores[i].length; j++) {
				int indexI = rnd.nextInt(colores.length), indexJ = rnd.nextInt(colores.length);
				Color temp = colores[i][j];
				colores[i][j] = colores[indexI][indexJ];
				colores[indexI][indexJ] = temp;
			}
		}

		// Creo las 16 fichas con el objeto Ficha (no dejan de ser JToggleButtons)
		for (i = 0, x = 26; i < ficha.length; i++, x += 90) {
			for (j = 0, y = 24; j < ficha[i].length; j++, y += 40) {
				Ficha fichas = new Ficha();
				ficha[i][j] = fichas; // Todos los buttons se guardan en una matriz de buttons
				ficha[i][j].setOpaque(true);
				ficha[i][j].setBounds(x, y, 83, 30);
				contentPane.add(ficha[i][j]);
			}
		}

		// Para cada boton su correspondiente MouseListener
		/* Alguien dira que lo meta dentro del bucle anterior pero nope
		 * Si lo metes en el bucle anterior lo unico que haras es generar un error
		 * Ya lo prove, se que no es lo mas optimo pero tampoco se me ha ocurrido otra opcion (si es que la hay)
		 */
		ficha[0][0].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// Si se selecciona un botomn...
				if (ficha[0][0].isSelected()) {
					seleccion++; // incrementamos seleccion
					// Si hay mas de 2 seleccionados no nos mostrara nada (nos lo dejara pulsar pero no mostrara nada)
					if (seleccion <= 2) {
						ficha[0][0].setText("███"); // Mostramos este texto (alt + 219, codigo ascii)
						ficha[0][0].setForeground(colores[0][0]); // Le decimos que el texto tenga el color de la matrix
					}
				// Si no se selecciona...
				} else {
					seleccion--; // Le quitamos uno a seleccion
					ficha[0][0].setText(""); // Y le "borramos" el texto
				}
				// Despues que compruebe cuantos hay seleccionados, en caso que solo haya 2...
				if (numSeleccion(seleccion)) {
					comprobarColores(ficha, colores); // Comprueba los colores dichos
				}
			}
		});
		ficha[0][1].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				if (ficha[0][1].isSelected()) {
					seleccion++;
					if (seleccion <= 2) {
						ficha[0][1].setText("███");
						ficha[0][1].setForeground(colores[0][1]);
					}
				} else {
					seleccion--;
					ficha[0][1].setText("");
				}
				if (numSeleccion(seleccion)) {
					comprobarColores(ficha, colores);
				}

			}
		});
		ficha[0][2].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				if (ficha[0][2].isSelected()) {
					seleccion++;if (seleccion <= 2) {
						ficha[0][2].setText("███");
						ficha[0][2].setForeground(colores[0][2]);
					}
				} else {
					seleccion--;
					ficha[0][2].setText("");
				}
				if (numSeleccion(seleccion)) {
					comprobarColores(ficha, colores);
				}
			}
		});
		ficha[0][3].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				if (ficha[0][3].isSelected()) {
					seleccion++;
					if (seleccion <= 2) {
						ficha[0][3].setText("███");
						ficha[0][3].setForeground(colores[0][3]);
					}
				} else {
					seleccion--;
					ficha[0][3].setText("");
				}
				if (numSeleccion(seleccion)) {
					comprobarColores(ficha, colores);
				}
			}
		});
		ficha[1][0].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				if (ficha[1][0].isSelected()) {
					seleccion++;
					if (seleccion <= 2) {
						ficha[1][0].setText("███");
						ficha[1][0].setForeground(colores[1][0]);
					}
				} else {
					seleccion--;
					ficha[1][0].setText("");
				}
				if (numSeleccion(seleccion)) {
					comprobarColores(ficha, colores);
				}
			}
		});
		ficha[1][1].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				if (ficha[1][1].isSelected()) {
					seleccion++;
					if (seleccion <= 2) {
						ficha[1][1].setText("███");
						ficha[1][1].setForeground(colores[1][1]);
					}
				} else {
					seleccion--;
					ficha[1][1].setText("");
				}
				if (numSeleccion(seleccion)) {
					comprobarColores(ficha, colores);
				}
			}
		});
		ficha[1][2].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				if (ficha[1][2].isSelected()) {
					seleccion++;
					if (seleccion <= 2) {
						ficha[1][2].setText("███");
						ficha[1][2].setForeground(colores[1][2]);
					}
				} else {
					seleccion--;
					ficha[1][2].setText("");
				}
				if (numSeleccion(seleccion)) {
					comprobarColores(ficha, colores);
				}
			}
		});
		ficha[1][3].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				if (ficha[1][3].isSelected()) {
					seleccion++;
					if (seleccion <= 2) {
						ficha[1][3].setText("███");
						ficha[1][3].setForeground(colores[1][3]);
					}
				} else {
					seleccion--;
					ficha[1][3].setText("");
				}
				if (numSeleccion(seleccion)) {
					comprobarColores(ficha, colores);
				}
			}
		});
		ficha[2][0].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				if (ficha[2][0].isSelected()) {
					seleccion++;
					if (seleccion <= 2) {
						ficha[2][0].setText("███");
						ficha[2][0].setForeground(colores[2][0]);
					}
				} else {
					seleccion--;
					ficha[2][0].setText("");
				}
				if (numSeleccion(seleccion)) {
					comprobarColores(ficha, colores);
				}
			}
		});
		ficha[2][1].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				if (ficha[2][1].isSelected()) {
					seleccion++;
					if (seleccion <= 2) {
						ficha[2][1].setText("███");
						ficha[2][1].setForeground(colores[2][1]);
					}
				} else {
					seleccion--;
					ficha[2][1].setText("");
				}
				if (numSeleccion(seleccion)) {
					comprobarColores(ficha, colores);
				}
			}
		});
		ficha[2][2].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				if (ficha[2][2].isSelected()) {
					seleccion++;
					if (seleccion <= 2) {
						ficha[2][2].setText("███");
						ficha[2][2].setForeground(colores[2][2]);
					}
				} else {
					seleccion--;
					ficha[2][2].setText("");
				}
				if (numSeleccion(seleccion)) {
					comprobarColores(ficha, colores);
				}
			}
		});
		ficha[2][3].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				if (ficha[2][3].isSelected()) {
					seleccion++;
					if (seleccion <= 2) {
						ficha[2][3].setText("███");
						ficha[2][3].setForeground(colores[2][3]);
					}
				} else {
					seleccion--;
					ficha[2][3].setText("");
				}
				if (numSeleccion(seleccion)) {
					comprobarColores(ficha, colores);
				}
			}
		});
		ficha[3][0].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (ficha[3][0].isSelected()) {
					seleccion++;
					if (seleccion <= 2) {
						ficha[3][0].setText("███");
						ficha[3][0].setForeground(colores[3][0]);
					}
				} else {
					seleccion--;
					ficha[3][0].setText("");
				}
				if (numSeleccion(seleccion)) {
					comprobarColores(ficha, colores);
				}
			}
		});
		ficha[3][1].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				if (ficha[3][1].isSelected()) {
					seleccion++;
					if (seleccion <= 2) {
						ficha[3][1].setText("███");
						ficha[3][1].setForeground(colores[3][1]);
					}
				} else {
					seleccion--;
					ficha[3][1].setText("");
				}
				if (numSeleccion(seleccion)) {
					comprobarColores(ficha, colores);
				}
			}
		});
		ficha[3][2].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				if (ficha[3][2].isSelected()) {
					seleccion++;
					if (seleccion <= 2) {
						ficha[3][2].setText("███");
						ficha[3][2].setForeground(colores[3][2]);
					}
				} else {
					seleccion--;
					ficha[3][2].setText("");
				}
				if (numSeleccion(seleccion)) {
					comprobarColores(ficha, colores);
				}
			}
		});
		ficha[3][3].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				if (ficha[3][3].isSelected()) {
					seleccion++;
					if (seleccion <= 2) {
						ficha[3][3].setText("███");
						ficha[3][3].setForeground(colores[3][3]);
					}
				} else {
					seleccion--;
					ficha[3][3].setText("");
				}
				if (numSeleccion(seleccion)) {
					comprobarColores(ficha, colores);
				}

			}
		});

	}

	// Para comprobar que haya 2 seleccionados
	private boolean numSeleccion(int seleccion) {
		if (seleccion >= 2) {
			return true;
		} else {
			return false;
		}
	}

	private void comprobarColores(JToggleButton[][] ficha, Color[][] colores) {
		Color color1 = null, color2 = null;
		int i, j = 0, f1 = 0, c1 = 0, f2 = 0, c2 = 0;

		// Bucle para guardar los 2 colores seleccionados y sus coordenadas en la matriz
		for (i = 0; i < colores.length; i++) {
			for (j = 0; j < colores.length; j++) {
				// Miramos si ese boton de la matriz esta seleccionado
				if (ficha[i][j].isSelected()) {
					// Si esta seleccionado miramos si color1 es null
					if (color1 == null) {
						color1 = colores[i][j];
						f1 = i;
						c1 = j;
					// En caso de que color1 no este a null lo guardamos en el color2
					} else {
						color2 = colores[i][j];
						f2 = i;
						c2 = j;
					}
				}
			}
		}
		// Comparamos los RGB de los 2 colores, si son iguales...
		if (color1.getRGB() == color2.getRGB()) {
			// Los hacemos no visibles y los deseleccionamos (sino daria problemas para el bucle anterior)
			ficha[f1][c1].setVisible(false);
			ficha[f2][c2].setVisible(false);
			ficha[f1][c1].setSelected(false);
			ficha[f2][c2].setSelected(false);
			seleccion = 0; // Dejamos los seleccionados a 0
			aciertos++; // Contamos un acierto
			// Si los aciertos llegan a 8 ha ganado
			if(aciertos == 8) {
				JOptionPane.showMessageDialog(null, "Has ganado UwU");
				System.exit(0);
			}
		}

	}

}
