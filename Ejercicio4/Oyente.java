package Ejercicio4;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

public class Oyente extends JFrame {

	private JPanel contentPane;
	private JLabel mensj;
	private JTextArea textArea;
	private JScrollPane scroll;

	private String resp = "";
	
	public Oyente() {
		setTitle("Operaciones cont");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 456, 375);
        setVisible(true);
        contentPane = new JPanel();
        contentPane.setLayout(null);
        setContentPane(contentPane);

        mensj = new JLabel("Eventos: ");
        mensj.setBounds(10, 144, 75, 13);
        contentPane.add(mensj);
		
        textArea = new JTextArea();
        textArea.setBounds(73, 36, 332, 241);
        contentPane.add(textArea);
        textArea.addMouseListener(new MouseAdapter(){
        	public void mouseEntered(MouseEvent e) {
        		resp += "Has entrado\n";
        		textArea.setText(resp);
        	}
        });
        textArea.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                resp += "Has clicado\n";
                textArea.setText(resp);
            }

        });
        
        textArea.addMouseListener(new MouseAdapter(){
        	public void mouseExited(MouseEvent e) {
        		resp += "Has salido\n";
        		textArea.setText(resp);
        	}
        });
        
        scroll = new JScrollPane(textArea);
        scroll.setBounds(73, 36, 332, 241);
        contentPane.add(scroll);
	}

}