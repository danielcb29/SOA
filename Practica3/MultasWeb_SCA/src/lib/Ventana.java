package lib;
import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class Ventana extends JFrame {
		JScrollPane scrollPane;
		JTextArea textArea;
		public Ventana(String name){
			BorderLayout bl = new BorderLayout();
			this.getContentPane().setLayout(bl);
			scrollPane = new JScrollPane();
			this.getContentPane().add(scrollPane, BorderLayout.CENTER);
			textArea = new JTextArea();
			scrollPane.setViewportView(textArea);
			setSize(400, 300);
			setTitle(name);
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			setVisible(true);
		}
        public void addText(String str) {
        	textArea.append(str);
        }
}