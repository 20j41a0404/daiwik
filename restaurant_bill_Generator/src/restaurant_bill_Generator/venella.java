package restaurant_bill_Generator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class venella {

	private JFrame frame;
	private JTextField t1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					venella window = new venella();
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
	public venella() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.ORANGE);
		frame.setBounds(100, 100, 927, 608);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("RESTAURANT BILL ");
		lblNewLabel.setForeground(new Color(178, 34, 34));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 34));
		lblNewLabel.setBounds(272, 28, 567, 41);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("MENU");
		lblNewLabel_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_1.setBounds(161, 140, 130, 30);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("QUANTITY");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_2.setBounds(161, 239, 153, 41);
		frame.getContentPane().add(lblNewLabel_2);
		
		JComboBox c1 = new JComboBox();
		c1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "CHICKEN 65----200/-", "HYDERABADI DUM BIRYANI----190/-", "PANNER BUTTER MASALA------200/-", "BUTTER ROTI---50/-"}));
		c1.setBounds(452, 140, 239, 31);
		frame.getContentPane().add(c1);
		
		t1 = new JTextField();
		t1.setBounds(452, 239, 239, 28);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		JButton btnNewButton = new JButton("ORDER");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String item=(String) c1.getSelectedItem();
				String qnty=t1.getText();
				int q=Integer.parseInt(qnty);
				int bill=0;
				if(item.equals("CHICKEN 65----200/-")) {
					bill=q*200;
					JOptionPane.showMessageDialog(btnNewButton,"hello \n Selected item is:"+item+ "\n Qnty: "+q+" \n yourbill:"+bill);
				
				}
				else if(item.equals("HYDERABADI DUM BIRYANI----190/-")){
					bill=q*190;
					JOptionPane.showMessageDialog(btnNewButton,"hello \n Selected item is:"+item+ "\n Qnty: "+q+" \n yourbill:"+bill);

				}
				else if(item.equals("PANNER BUTTER MASALA------200/-")){
					bill=q*200;
					JOptionPane.showMessageDialog(btnNewButton,"hello \n Selected item is:"+item+ "\n Qnty: "+q+" \n yourbill:"+bill);

				}
				else if(item.equals("BUTTER ROTI---50/-")) {
				      bill=q*50;
					  JOptionPane.showMessageDialog(btnNewButton,"hello \n Selected item is:"+item+ "\n Qnty: "+q+" \n yourbill:"+bill);

			}
			}
		});
		btnNewButton.setBounds(382, 339, 130, 23);
		frame.getContentPane().add(btnNewButton);
	}}

