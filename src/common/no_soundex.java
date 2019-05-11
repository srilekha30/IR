
package common;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import common.textDisplay;


import common.LuceneWriteIndexFromFileExample;

public class no_soundex {

	private JFrame frame;
	private JTextField textField;
	
	/**
	 * Launch the application.
	 */
	public static void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					no_soundex window = new no_soundex();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public no_soundex() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(102, 204, 102));
		frame.setBounds(100, 100, 1000, 650);
		frame.setLocation(200, 100);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		JLabel lblNewLabel = new JLabel("WITHOUT SOUNDEX");
		lblNewLabel.setBackground(new Color(0, 0, 0));
		lblNewLabel.setBounds(338, 41, 309, 100);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		frame.getContentPane().add(lblNewLabel);
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		
		
		JButton btnClick = new JButton("Search\r\n");
		btnClick.setForeground(Color.BLACK);
		btnClick.setBounds(437, 308, 84, 34);
		btnClick.setBackground(new Color(240, 128, 128));
		btnClick.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		btnClick.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) 
			{	
	    		String t6=textField.getText();
	    		textField.setText("");
	    		String ans1 = null;
	    		int a=0;
				//LuceneReadIndexFromFileExample Obj1= new LuceneReadIndexFromFileExample();
				try {
					LuceneWriteIndexFromFileExample.main(a);
					ans1 = LuceneReadIndexFromFileExample.main(t6,a);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				textDisplay.main(ans1);
			}
		});
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(btnClick);
		
		textField = new JTextField();
		textField.setBounds(360, 239, 234, 34);
		textField.setBackground(new Color(245, 222, 179));
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel label_1 = new JLabel("");
		Image images = new ImageIcon(mainpage.class.getResource("/112.jpg")).getImage();
		label_1.setIcon(new ImageIcon(images));
		label_1.setBounds(0, 0, 982, 603);
		frame.getContentPane().add(label_1);
		
	}

}
