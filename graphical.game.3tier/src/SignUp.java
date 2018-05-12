

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class SignUp {

 JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	Socket socket;

	
	public SignUp(Socket socket) {
		this.socket = socket;
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setUndecorated(true);
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(350, 150, 637, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Sign Up");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(236, 11, 244, 33);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("UserName : ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(158, 96, 131, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPassword.setBounds(158, 145, 131, 14);
		frame.getContentPane().add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(260, 95, 192, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(260, 144, 192, 20);
		frame.getContentPane().add(passwordField);
		
		JButton btnCreateMyAccount = new JButton("Create My Account");
		btnCreateMyAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				try {
					DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
					dataOutputStream.writeUTF("create");
					dataOutputStream.writeUTF(textField.getText());
					dataOutputStream.writeUTF(passwordField.getText());
					
					JOptionPane.showMessageDialog(null, new DataInputStream(socket.getInputStream()).readUTF());
					
				
					frame.dispose();
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		btnCreateMyAccount.setBounds(217, 203, 179, 23);
		frame.getContentPane().add(btnCreateMyAccount);
	}
}
