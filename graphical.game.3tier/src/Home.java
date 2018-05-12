import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;

import org.jaudiotagger.audio.AudioFile;
import org.jaudiotagger.audio.AudioFileIO;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

public class Home {
Socket socket;
JPanel panel_2 = new JPanel();
JPanel panel = new JPanel();
	private JFrame frame_1;

	/**
	 * Launch the application.
	 */
JLabel lblNewLabel_2 = new JLabel("");
JLabel label_10 = new JLabel("");
	JLabel label = new JLabel("");
	JLabel lblNewLabel = new JLabel("");
	JLabel label_1 = new JLabel("");
	JLabel label_2 = new JLabel("");
	JLabel lblNewLabel_1 = new JLabel("");
	JLabel lblNewLabel_5 = new JLabel("");
	JLabel label_4 = new JLabel("");
	JLabel label_5 = new JLabel("");
	JLabel lblNewLabel_3 = new JLabel("");
	JLabel label_3 = new JLabel("");
	JLabel lblNewLabel_4 = new JLabel("");
	JLabel label_7 = new JLabel("");
	JLabel label_6 = new JLabel("");
	JLabel lblNewLabel_6 = new JLabel("");
	
String name ;
	
 int count=0;
Thread thread;
	final int random = new Random().nextInt(100);
	private JTextField textField;
	private JPasswordField passwordField;
	private JButton button_99;
	private JButton btnNewButton_1;
	private int credit=0;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home window = new Home();
					window.frame_1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Home() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void setEnableRec(Component container, boolean enable){
	    container.setEnabled(enable);

	    try {
	        Component[] components= ((Container) container).getComponents();
	        for (int i = 0; i < components.length; i++) {
	            setEnableRec(components[i], enable);
	        }
	    } catch (ClassCastException e) {

	    }
	}
	
	private void initialize() {

	
		try {
			socket = new Socket("localhost", 10);
		} catch (UnknownHostException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		frame_1 = new JFrame();
		frame_1.setBounds(-7, -5, 1430, 748);
		frame_1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame_1.getContentPane().setLayout(null);
		
		
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(0, 209, 960, 540);
		frame_1.getContentPane().add(panel);
		panel.setLayout(null);
		
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if (random>Integer.parseInt(btnNewButton.getText()))
				{
					count++;
					btnNewButton.setBackground(Color.YELLOW);
					draw();
				}
			
				else	if (random<Integer.parseInt(btnNewButton.getText()))
				{
					count++;
					btnNewButton.setBackground(Color.RED);
					draw();
				}
				else
				{
					System.out.println("daw");
					
					try {DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
					dataOutputStream.writeUTF("addscore");dataOutputStream.writeUTF(name);dataOutputStream.writeUTF(name);
					JOptionPane.showMessageDialog(null, "You Got 10 Score");	}
					catch (IOException e) {e.printStackTrace();btnNewButton.setBackground(Color.GREEN);					}
					try {DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());dataOutputStream.writeUTF("addscore");dataOutputStream.writeUTF(name);JOptionPane.showMessageDialog(null, "You Got 10 Score");	} catch (IOException e11) {e11.printStackTrace();btnNewButton.setBackground(Color.GREEN);					}JOptionPane.showMessageDialog(null, "Congrats You Won !!!!");System.exit(0);;  
					
					
					
				
				}
			}
		});
		
		
		lblNewLabel_6.setBounds(609, 170, 330, 114);
		panel.add(lblNewLabel_6);
		
		label_6.setBounds(855, 132, 46, 14);
		panel.add(label_6);
		
		label_7.setBounds(786, 148, 46, 14);
		panel.add(label_7);
		
		lblNewLabel_4.setBounds(766, 173, 69, 23);
		panel.add(lblNewLabel_4);
		
		label_3.setBounds(809, 123, 46, 14);
		panel.add(label_3);
		
		lblNewLabel_3.setBounds(766, 123, 46, 14);
		panel.add(lblNewLabel_3);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setFocusable(false);
		btnNewButton.setBounds(0, 46, 51, 23);
		panel.add(btnNewButton);
		
		JButton button = new JButton("2");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				if (random>Integer.parseInt(button.getText()))
				{
					count++;
					button.setBackground(Color.YELLOW);
					draw();
				}
			
				else	if (random<Integer.parseInt(button.getText()))
				{
					count++;
					button.setBackground(Color.RED);
					draw();
				}
				else
				{
					button.setBackground(Color.GREEN);
					try {DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());dataOutputStream.writeUTF("addscore");dataOutputStream.writeUTF(name);JOptionPane.showMessageDialog(null, "You Got 10 Score");	} catch (IOException e11) {e11.printStackTrace();btnNewButton.setBackground(Color.GREEN);					}try {DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());dataOutputStream.writeUTF("addscore");dataOutputStream.writeUTF(name);JOptionPane.showMessageDialog(null, "You Got 10 Score");	} catch (IOException e11) {e11.printStackTrace();btnNewButton.setBackground(Color.GREEN);					}JOptionPane.showMessageDialog(null, "Congrats You Won !!!!");System.exit(0);;  
				}
				
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 11));
		button.setFocusable(false);
		button.setBackground(Color.WHITE);
		button.setBounds(49, 46, 51, 23);
		panel.add(button);
		panel.setEnabled(false);
		panel_2.setEnabled(false);
		JButton button_1 = new JButton("3");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (random>Integer.parseInt(button_1.getText()))
				{
					count++;
					button_1.setBackground(Color.YELLOW);
					draw();
				}
			
				else	if (random<Integer.parseInt(button_1.getText()))
				{
					count++;
					button_1.setBackground(Color.RED);
					draw();
				}
				else
				{
					button_1.setBackground(Color.GREEN);
					try {DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());dataOutputStream.writeUTF("addscore");dataOutputStream.writeUTF(name);JOptionPane.showMessageDialog(null, "You Got 10 Score");	} catch (IOException e11) {e11.printStackTrace();btnNewButton.setBackground(Color.GREEN);					}try {DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());dataOutputStream.writeUTF("addscore");dataOutputStream.writeUTF(name);JOptionPane.showMessageDialog(null, "You Got 10 Score");	} catch (IOException e11) {e11.printStackTrace();btnNewButton.setBackground(Color.GREEN);					}JOptionPane.showMessageDialog(null, "Congrats You Won !!!!");System.exit(0);;System.exit(0);;   
				}
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_1.setFocusable(false);
		button_1.setBackground(Color.WHITE);
		button_1.setBounds(98, 46, 51, 23);
		panel.add(button_1);
		
		JButton button_2 = new JButton("4");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				if (random>Integer.parseInt(button_2.getText()))
				{
					count++;
					button_2.setBackground(Color.YELLOW);
					draw();
				}
			
				else	if (random<Integer.parseInt(button_2.getText()))
				{
					count++;
					button_2.setBackground(Color.RED);
					draw();
				}
				else
				{
					button_2.setBackground(Color.GREEN);
					try {DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());dataOutputStream.writeUTF("addscore");dataOutputStream.writeUTF(name);JOptionPane.showMessageDialog(null, "You Got 10 Score");	} catch (IOException e11) {e11.printStackTrace();btnNewButton.setBackground(Color.GREEN);					}JOptionPane.showMessageDialog(null, "Congrats You Won !!!!");System.exit(0);;  
				}
			
			}
		});
		button_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_2.setFocusable(false);
		button_2.setBackground(Color.WHITE);
		button_2.setBounds(147, 46, 51, 23);
		panel.add(button_2);
		
		JButton button_3 = new JButton("5");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (random>Integer.parseInt(button_3.getText()))
				{
					count++;
					button_3.setBackground(Color.YELLOW);
					draw();
				}
			
				else	if (random<Integer.parseInt(button_3.getText()))
				{
					count++;
					button_3.setBackground(Color.RED);
					draw();
				}
				else
				{
					button_3.setBackground(Color.GREEN);
					try {DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());dataOutputStream.writeUTF("addscore");dataOutputStream.writeUTF(name);JOptionPane.showMessageDialog(null, "You Got 10 Score");	} catch (IOException e11) {e11.printStackTrace();btnNewButton.setBackground(Color.GREEN);					}JOptionPane.showMessageDialog(null, "Congrats You Won !!!!");System.exit(0);;  
				}
			}
		});
		button_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_3.setFocusable(false);
		button_3.setBackground(Color.WHITE);
		button_3.setBounds(194, 46, 51, 23);
		panel.add(button_3);
		
		JButton button_4 = new JButton("6");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (random>Integer.parseInt(button_4.getText()))
				{
					count++;
					button_4.setBackground(Color.YELLOW);
					draw();
				}
			
				else	if (random<Integer.parseInt(button_4.getText()))
				{
					count++;
					button_4.setBackground(Color.RED);
					draw();
				}
				else
				{
					button_4.setBackground(Color.GREEN);
					try {DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());dataOutputStream.writeUTF("addscore");dataOutputStream.writeUTF(name);JOptionPane.showMessageDialog(null, "You Got 10 Score");	} catch (IOException e11) {e11.printStackTrace();btnNewButton.setBackground(Color.GREEN);					}JOptionPane.showMessageDialog(null, "Congrats You Won !!!!");System.exit(0);;  
				}
				
				
			}
		});
		button_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_4.setFocusable(false);
		button_4.setBackground(Color.WHITE);
		button_4.setBounds(243, 46, 51, 23);
		panel.add(button_4);
		
		JButton button_5 = new JButton("7");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (random>Integer.parseInt(button_5.getText()))
				{
					count++;
					button_5.setBackground(Color.YELLOW);
					draw();
				}
			
				else	if (random<Integer.parseInt(button_5.getText()))
				{
					count++;
					button_5.setBackground(Color.RED);
					draw();
				}
				else
				{
					button_5.setBackground(Color.GREEN);
					try {DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());dataOutputStream.writeUTF("addscore");dataOutputStream.writeUTF(name);JOptionPane.showMessageDialog(null, "You Got 10 Score");	} catch (IOException e11) {e11.printStackTrace();btnNewButton.setBackground(Color.GREEN);					}JOptionPane.showMessageDialog(null, "Congrats You Won !!!!");System.exit(0);;  
				}
				
				
				
			}
		});
		button_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_5.setFocusable(false);
		button_5.setBackground(Color.WHITE);
		button_5.setBounds(292, 46, 51, 23);
		panel.add(button_5);
		
		JButton button_6 = new JButton("8");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (random>Integer.parseInt(button_6.getText()))
				{
					count++;
					button_6.setBackground(Color.YELLOW);
					draw();
				}
			
				else	if (random<Integer.parseInt(button_6.getText()))
				{
					count++;
					button_6.setBackground(Color.RED);
					draw();
				}
				else
				{
					button_6.setBackground(Color.GREEN);
					try {DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());dataOutputStream.writeUTF("addscore");dataOutputStream.writeUTF(name);JOptionPane.showMessageDialog(null, "You Got 10 Score");	} catch (IOException e11) {e11.printStackTrace();btnNewButton.setBackground(Color.GREEN);					}JOptionPane.showMessageDialog(null, "Congrats You Won !!!!");System.exit(0);;  
				}
				
				
				
			}
		});
		button_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_6.setFocusable(false);
		button_6.setBackground(Color.WHITE);
		button_6.setBounds(341, 46, 51, 23);
		panel.add(button_6);
		
		JButton button_7 = new JButton("9");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (random>Integer.parseInt(button_7.getText()))
				{
					count++;
					button_7.setBackground(Color.YELLOW);
					draw();
				}
			
				else	if (random<Integer.parseInt(button_7.getText()))
				{
					count++;
					button_7.setBackground(Color.RED);
					draw();
				}
				else
				{
					button_7.setBackground(Color.GREEN);
					try {DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());dataOutputStream.writeUTF("addscore");dataOutputStream.writeUTF(name);JOptionPane.showMessageDialog(null, "You Got 10 Score");	} catch (IOException e11) {e11.printStackTrace();btnNewButton.setBackground(Color.GREEN);					}JOptionPane.showMessageDialog(null, "Congrats You Won !!!!");System.exit(0);;  
				}
			}
		});
		button_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_7.setFocusable(false);
		button_7.setBackground(Color.WHITE);
		button_7.setBounds(386, 46, 51, 23);
		panel.add(button_7);
		
		JButton button_8 = new JButton("10");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (random>Integer.parseInt(button_8.getText()))
				{
					count++;
					button_8.setBackground(Color.YELLOW);
					draw();
				}
			
				else	if (random<Integer.parseInt(button_8.getText()))
				{
					count++;
					button_8.setBackground(Color.RED);
					draw();
				}
				else
				{
					button_8.setBackground(Color.GREEN);
					try {DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());dataOutputStream.writeUTF("addscore");dataOutputStream.writeUTF(name);JOptionPane.showMessageDialog(null, "You Got 10 Score");	} catch (IOException e11) {e11.printStackTrace();btnNewButton.setBackground(Color.GREEN);					}JOptionPane.showMessageDialog(null, "Congrats You Won !!!!");System.exit(0);;  
				}
			}
		});
		button_8.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_8.setFocusable(false);
		button_8.setBackground(Color.WHITE);
		button_8.setBounds(435, 46, 51, 23);
		panel.add(button_8);
		
		JButton button_9 = new JButton("11");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton o = button_9;
				if (random>Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.YELLOW);
					draw();
				}
			
				else	if (random<Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.RED);
					draw();
				}
				else
				{
					o.setBackground(Color.GREEN);
					try {DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());dataOutputStream.writeUTF("addscore");dataOutputStream.writeUTF(name);JOptionPane.showMessageDialog(null, "You Got 10 Score");	} catch (IOException e11) {e11.printStackTrace();btnNewButton.setBackground(Color.GREEN);					}JOptionPane.showMessageDialog(null, "Congrats You Won !!!!");System.exit(0);;  
				}
			}
		});
		button_9.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_9.setFocusable(false);
		button_9.setBackground(Color.WHITE);
		button_9.setBounds(0, 69, 51, 23);
		panel.add(button_9);
		
		JButton button_10 = new JButton("12");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				JButton o = button_10;
				if (random>Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.YELLOW);
					draw();
				}
			
				else	if (random<Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.RED);
					draw();
				}
				else
				{
					o.setBackground(Color.GREEN);
					try {DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());dataOutputStream.writeUTF("addscore");dataOutputStream.writeUTF(name);JOptionPane.showMessageDialog(null, "You Got 10 Score");	} catch (IOException e11) {e11.printStackTrace();btnNewButton.setBackground(Color.GREEN);					}JOptionPane.showMessageDialog(null, "Congrats You Won !!!!");System.exit(0);;  
				}
			}
		});
		button_10.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_10.setFocusable(false);
		button_10.setBackground(Color.WHITE);
		button_10.setBounds(49, 69, 51, 23);
		panel.add(button_10);
		
		JButton button_11 = new JButton("13");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	JButton o = button_11;
			if (random>Integer.parseInt(o.getText()))
			{
				count++;
				o.setBackground(Color.YELLOW);
				draw();
			}
		
			else	if (random<Integer.parseInt(o.getText()))
			{
				count++;
				o.setBackground(Color.RED);
				draw();
			}
			else
			{
				o.setBackground(Color.GREEN);
				try {DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());dataOutputStream.writeUTF("addscore");dataOutputStream.writeUTF(name);JOptionPane.showMessageDialog(null, "You Got 10 Score");	} catch (IOException e11) {e11.printStackTrace();btnNewButton.setBackground(Color.GREEN);					}JOptionPane.showMessageDialog(null, "Congrats You Won !!!!");System.exit(0);;  
			}
			}
		});
		button_11.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_11.setFocusable(false);
		button_11.setBackground(Color.WHITE);
		button_11.setBounds(98, 69, 51, 23);
		panel.add(button_11);
		
		JButton button_12 = new JButton("14");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton o = button_12;
				if (random>Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.YELLOW);
					draw();
				}
			
				else	if (random<Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.RED);
					draw();
				}
				else
				{
					o.setBackground(Color.GREEN);
					try {DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());dataOutputStream.writeUTF("addscore");dataOutputStream.writeUTF(name);JOptionPane.showMessageDialog(null, "You Got 10 Score");	} catch (IOException e11) {e11.printStackTrace();btnNewButton.setBackground(Color.GREEN);					}JOptionPane.showMessageDialog(null, "Congrats You Won !!!!");System.exit(0);;  
				}
			}
		});
		button_12.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_12.setFocusable(false);
		button_12.setBackground(Color.WHITE);
		button_12.setBounds(147, 69, 51, 23);
		panel.add(button_12);
		
		JButton button_13 = new JButton("15");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton o = button_13;
				if (random>Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.YELLOW);
					draw();
				}
			
				else	if (random<Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.RED);
					draw();
				}
				else
				{
					o.setBackground(Color.GREEN);
					try {DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());dataOutputStream.writeUTF("addscore");dataOutputStream.writeUTF(name);JOptionPane.showMessageDialog(null, "You Got 10 Score");	} catch (IOException e11) {e11.printStackTrace();btnNewButton.setBackground(Color.GREEN);					}JOptionPane.showMessageDialog(null, "Congrats You Won !!!!");System.exit(0);;  
				}
			}
		});
		button_13.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_13.setFocusable(false);
		button_13.setBackground(Color.WHITE);
		button_13.setBounds(194, 69, 51, 23);
		panel.add(button_13);
		
		JButton button_14 = new JButton("16");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton o = button_14;
				if (random>Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.YELLOW);
					draw();
				}
			
				else	if (random<Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.RED);
					draw();
				}
				else
				{
					o.setBackground(Color.GREEN);
					try {DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());dataOutputStream.writeUTF("addscore");dataOutputStream.writeUTF(name);JOptionPane.showMessageDialog(null, "You Got 10 Score");	} catch (IOException e11) {e11.printStackTrace();btnNewButton.setBackground(Color.GREEN);					}JOptionPane.showMessageDialog(null, "Congrats You Won !!!!");System.exit(0);;  
				}
			}
		});
		button_14.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_14.setFocusable(false);
		button_14.setBackground(Color.WHITE);
		button_14.setBounds(243, 69, 51, 23);
		panel.add(button_14);
		
		JButton button_15 = new JButton("17");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton o = button_15;
				if (random>Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.YELLOW);
					draw();
				}
			
				else	if (random<Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.RED);
					draw();
				}
				else
				{
					o.setBackground(Color.GREEN);
					try {DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());dataOutputStream.writeUTF("addscore");dataOutputStream.writeUTF(name);JOptionPane.showMessageDialog(null, "You Got 10 Score");	} catch (IOException e11) {e11.printStackTrace();btnNewButton.setBackground(Color.GREEN);					}JOptionPane.showMessageDialog(null, "Congrats You Won !!!!");System.exit(0);;  
				}
			}
		});
		button_15.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_15.setFocusable(false);
		button_15.setBackground(Color.WHITE);
		button_15.setBounds(292, 69, 51, 23);
		panel.add(button_15);
		
		JButton button_16 = new JButton("18");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton o = button_16;
				if (random>Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.YELLOW);
					draw();
				}
			
				else	if (random<Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.RED);
					draw();
				}
				else
				{
					o.setBackground(Color.GREEN);
					try {DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());dataOutputStream.writeUTF("addscore");dataOutputStream.writeUTF(name);JOptionPane.showMessageDialog(null, "You Got 10 Score");	} catch (IOException e11) {e11.printStackTrace();btnNewButton.setBackground(Color.GREEN);					}JOptionPane.showMessageDialog(null, "Congrats You Won !!!!");System.exit(0);;  
				}
			}
		});
		button_16.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_16.setFocusable(false);
		button_16.setBackground(Color.WHITE);
		button_16.setBounds(341, 69, 51, 23);
		panel.add(button_16);
		
		JButton button_17 = new JButton("19");
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton o = button_17;
				if (random>Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.YELLOW);
					draw();
				}
			
				else	if (random<Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.RED);
					draw();
				}
				else
				{
					o.setBackground(Color.GREEN);
					try {DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());dataOutputStream.writeUTF("addscore");dataOutputStream.writeUTF(name);JOptionPane.showMessageDialog(null, "You Got 10 Score");	} catch (IOException e11) {e11.printStackTrace();btnNewButton.setBackground(Color.GREEN);					}JOptionPane.showMessageDialog(null, "Congrats You Won !!!!");System.exit(0);;  
				}
			}
		});
		button_17.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_17.setFocusable(false);
		button_17.setBackground(Color.WHITE);
		button_17.setBounds(386, 69, 51, 23);
		panel.add(button_17);
		
		JButton button_18 = new JButton("20");
		button_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton o = button_18;
				if (random>Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.YELLOW);
					draw();
				}
			
				else	if (random<Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.RED);
					draw();
				}
				else
				{
					o.setBackground(Color.GREEN);
					try {DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());dataOutputStream.writeUTF("addscore");dataOutputStream.writeUTF(name);JOptionPane.showMessageDialog(null, "You Got 10 Score");	} catch (IOException e11) {e11.printStackTrace();btnNewButton.setBackground(Color.GREEN);					}JOptionPane.showMessageDialog(null, "Congrats You Won !!!!");System.exit(0);;  
				}
			}
		});
		button_18.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_18.setFocusable(false);
		button_18.setBackground(Color.WHITE);
		button_18.setBounds(435, 69, 51, 23);
		panel.add(button_18);
		
		JButton button_19 = new JButton("21");
		button_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton o = button_19;
				if (random>Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.YELLOW);
					draw();
				}
			
				else	if (random<Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.RED);
					draw();
				}
				else
				{
					o.setBackground(Color.GREEN);
					try {DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());dataOutputStream.writeUTF("addscore");dataOutputStream.writeUTF(name);JOptionPane.showMessageDialog(null, "You Got 10 Score");	} catch (IOException e11) {e11.printStackTrace();btnNewButton.setBackground(Color.GREEN);					}JOptionPane.showMessageDialog(null, "Congrats You Won !!!!");System.exit(0);;  
				}
			}
		});
		button_19.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_19.setFocusable(false);
		button_19.setBackground(Color.WHITE);
		button_19.setBounds(0, 92, 51, 23);
		panel.add(button_19);
		
		JButton button_20 = new JButton("22");
		button_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			JButton o = button_20;
			if (random>Integer.parseInt(o.getText()))
			{
				count++;
				o.setBackground(Color.YELLOW);
				draw();
			}
		
			else	if (random<Integer.parseInt(o.getText()))
			{
				count++;
				o.setBackground(Color.RED);
				draw();
			}
			else
			{
				o.setBackground(Color.GREEN);
				try {DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());dataOutputStream.writeUTF("addscore");dataOutputStream.writeUTF(name);JOptionPane.showMessageDialog(null, "You Got 10 Score");	} catch (IOException e11) {e11.printStackTrace();btnNewButton.setBackground(Color.GREEN);					}JOptionPane.showMessageDialog(null, "Congrats You Won !!!!");System.exit(0);;  
			}
			}});
		button_20.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_20.setFocusable(false);
		button_20.setBackground(Color.WHITE);
		button_20.setBounds(49, 92, 51, 23);
		panel.add(button_20);
		
		JButton button_21 = new JButton("23");
		button_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton o = button_21;
				if (random>Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.YELLOW);
					draw();
				}
			
				else	if (random<Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.RED);
					draw();
				}
				else
				{
					o.setBackground(Color.GREEN);
					try {DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());dataOutputStream.writeUTF("addscore");dataOutputStream.writeUTF(name);JOptionPane.showMessageDialog(null, "You Got 10 Score");	} catch (IOException e11) {e11.printStackTrace();btnNewButton.setBackground(Color.GREEN);					}JOptionPane.showMessageDialog(null, "Congrats You Won !!!!");System.exit(0);;  
				}
			}
		});
		button_21.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_21.setFocusable(false);
		button_21.setBackground(Color.WHITE);
		button_21.setBounds(98, 92, 51, 23);
		panel.add(button_21);
		
		JButton button_22 = new JButton("24");
		button_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton o = button_22;
				if (random>Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.YELLOW);
					draw();
				}
			
				else	if (random<Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.RED);
					draw();
				}
				else
				{
					o.setBackground(Color.GREEN);
					try {DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());dataOutputStream.writeUTF("addscore");dataOutputStream.writeUTF(name);JOptionPane.showMessageDialog(null, "You Got 10 Score");	} catch (IOException e11) {e11.printStackTrace();btnNewButton.setBackground(Color.GREEN);					}JOptionPane.showMessageDialog(null, "Congrats You Won !!!!");System.exit(0);;  
				}
			}
		});
		button_22.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_22.setFocusable(false);
		button_22.setBackground(Color.WHITE);
		button_22.setBounds(147, 92, 51, 23);
		panel.add(button_22);
		
		JButton button_23 = new JButton("25");
		button_23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton o = button_23;
				if (random>Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.YELLOW);
					draw();
				}
			
				else	if (random<Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.RED);
					draw();
				}
				else
				{
					o.setBackground(Color.GREEN);
					try {DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());dataOutputStream.writeUTF("addscore");dataOutputStream.writeUTF(name);JOptionPane.showMessageDialog(null, "You Got 10 Score");	} catch (IOException e11) {e11.printStackTrace();btnNewButton.setBackground(Color.GREEN);					}JOptionPane.showMessageDialog(null, "Congrats You Won !!!!");System.exit(0);;  
				}
			}
		});
		button_23.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_23.setFocusable(false);
		button_23.setBackground(Color.WHITE);
		button_23.setBounds(194, 92, 51, 23);
		panel.add(button_23);
		
		JButton button_24 = new JButton("26");
		button_24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton o = button_24;
				if (random>Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.YELLOW);
					draw();
				}
			
				else	if (random<Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.RED);
					draw();
				}
				else
				{
					o.setBackground(Color.GREEN);
					try {DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());dataOutputStream.writeUTF("addscore");dataOutputStream.writeUTF(name);JOptionPane.showMessageDialog(null, "You Got 10 Score");	} catch (IOException e11) {e11.printStackTrace();btnNewButton.setBackground(Color.GREEN);					}JOptionPane.showMessageDialog(null, "Congrats You Won !!!!");System.exit(0);;  
				}
			}
		});
		button_24.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_24.setFocusable(false);
		button_24.setBackground(Color.WHITE);
		button_24.setBounds(243, 92, 51, 23);
		panel.add(button_24);
		
		JButton button_25 = new JButton("27");
		button_25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton o = button_25;
				if (random>Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.YELLOW);
					draw();
				}
			
				else	if (random<Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.RED);
					draw();
				}
				else
				{
					o.setBackground(Color.GREEN);
					try {DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());dataOutputStream.writeUTF("addscore");dataOutputStream.writeUTF(name);JOptionPane.showMessageDialog(null, "You Got 10 Score");	} catch (IOException e11) {e11.printStackTrace();btnNewButton.setBackground(Color.GREEN);					}JOptionPane.showMessageDialog(null, "Congrats You Won !!!!");System.exit(0);;  
				}
			}
		});
		button_25.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_25.setFocusable(false);
		button_25.setBackground(Color.WHITE);
		button_25.setBounds(292, 92, 51, 23);
		panel.add(button_25);
		
		JButton button_26 = new JButton("28");
		button_26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton o = button_26;
				if (random>Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.YELLOW);
					draw();
				}
			
				else	if (random<Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.RED);
					draw();
				}
				else
				{
					o.setBackground(Color.GREEN);
					try {DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());dataOutputStream.writeUTF("addscore");dataOutputStream.writeUTF(name);JOptionPane.showMessageDialog(null, "You Got 10 Score");	} catch (IOException e11) {e11.printStackTrace();btnNewButton.setBackground(Color.GREEN);					}JOptionPane.showMessageDialog(null, "Congrats You Won !!!!");System.exit(0);;  
				}
			}
		});
		button_26.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_26.setFocusable(false);
		button_26.setBackground(Color.WHITE);
		button_26.setBounds(341, 92, 51, 23);
		panel.add(button_26);
		
		JButton button_27 = new JButton("29");
		button_27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				JButton o = button_27;
				if (random>Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.YELLOW);
					draw();
				}
			
				else	if (random<Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.RED);
					draw();
				}
				else
				{
					o.setBackground(Color.GREEN);
					try {DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());dataOutputStream.writeUTF("addscore");dataOutputStream.writeUTF(name);JOptionPane.showMessageDialog(null, "You Got 10 Score");	} catch (IOException e11) {e11.printStackTrace();btnNewButton.setBackground(Color.GREEN);					}JOptionPane.showMessageDialog(null, "Congrats You Won !!!!");System.exit(0);;  
				}
			}
		});
		button_27.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_27.setFocusable(false);
		button_27.setBackground(Color.WHITE);
		button_27.setBounds(386, 92, 51, 23);
		panel.add(button_27);
		
		JButton button_28 = new JButton("30");
		button_28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton o = button_28;
				if (random>Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.YELLOW);
					draw();
				}
			
				else	if (random<Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.RED);
					draw();
				}
				else
				{
					o.setBackground(Color.GREEN);
					try {DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());dataOutputStream.writeUTF("addscore");dataOutputStream.writeUTF(name);JOptionPane.showMessageDialog(null, "You Got 10 Score");	} catch (IOException e11) {e11.printStackTrace();btnNewButton.setBackground(Color.GREEN);					}JOptionPane.showMessageDialog(null, "Congrats You Won !!!!");System.exit(0);;  
				}
			}
		});
		button_28.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_28.setFocusable(false);
		button_28.setBackground(Color.WHITE);
		button_28.setBounds(435, 92, 51, 23);
		panel.add(button_28);
		
		JButton button_29 = new JButton("31");
		button_29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton o = button_29;
				if (random>Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.YELLOW);
					draw();
				}
			
				else	if (random<Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.RED);
					draw();
				}
				else
				{
					o.setBackground(Color.GREEN);
					try {DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());dataOutputStream.writeUTF("addscore");dataOutputStream.writeUTF(name);JOptionPane.showMessageDialog(null, "You Got 10 Score");	} catch (IOException e11) {e11.printStackTrace();btnNewButton.setBackground(Color.GREEN);					}JOptionPane.showMessageDialog(null, "Congrats You Won !!!!");System.exit(0);;  
				}
			}
		});
		button_29.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_29.setFocusable(false);
		button_29.setBackground(Color.WHITE);
		button_29.setBounds(0, 114, 51, 23);
		panel.add(button_29);
		
		JButton button_30 = new JButton("32");
		button_30.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton o = button_30;
				if (random>Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.YELLOW);
					draw();
				}
			
				else	if (random<Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.RED);
					draw();
				}
				else
				{
					o.setBackground(Color.GREEN);
					try {DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());dataOutputStream.writeUTF("addscore");dataOutputStream.writeUTF(name);JOptionPane.showMessageDialog(null, "You Got 10 Score");	} catch (IOException e11) {e11.printStackTrace();btnNewButton.setBackground(Color.GREEN);					}JOptionPane.showMessageDialog(null, "Congrats You Won !!!!");System.exit(0);;  
				}
			}
		});
		button_30.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_30.setFocusable(false);
		button_30.setBackground(Color.WHITE);
		button_30.setBounds(49, 114, 51, 23);
		panel.add(button_30);
		
		JButton button_31 = new JButton("33");
		button_31.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton o = button_31;
				if (random>Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.YELLOW);
					draw();
				}
			
				else	if (random<Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.RED);
					draw();
				}
				else
				{
					o.setBackground(Color.GREEN);
					try {DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());dataOutputStream.writeUTF("addscore");dataOutputStream.writeUTF(name);JOptionPane.showMessageDialog(null, "You Got 10 Score");	} catch (IOException e11) {e11.printStackTrace();btnNewButton.setBackground(Color.GREEN);					}JOptionPane.showMessageDialog(null, "Congrats You Won !!!!");System.exit(0);;  
				}
			}
		});
		button_31.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_31.setFocusable(false);
		button_31.setBackground(Color.WHITE);
		button_31.setBounds(98, 114, 51, 23);
		panel.add(button_31);
		
		JButton button_32 = new JButton("34");
		button_32.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton o = button_32;
				if (random>Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.YELLOW);
					draw();
				}
			
				else	if (random<Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.RED);
					draw();
				}
				else
				{
					o.setBackground(Color.GREEN);
					try {DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());dataOutputStream.writeUTF("addscore");dataOutputStream.writeUTF(name);JOptionPane.showMessageDialog(null, "You Got 10 Score");	} catch (IOException e11) {e11.printStackTrace();btnNewButton.setBackground(Color.GREEN);					}JOptionPane.showMessageDialog(null, "Congrats You Won !!!!");System.exit(0);;  
				}
			}
		});
		button_32.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_32.setFocusable(false);
		button_32.setBackground(Color.WHITE);
		button_32.setBounds(147, 114, 51, 23);
		panel.add(button_32);
		
		JButton button_33 = new JButton("35");
		button_33.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton o = button_33;
				if (random>Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.YELLOW);
					draw();
				}
			
				else	if (random<Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.RED);
					draw();
				}
				else
				{
					o.setBackground(Color.GREEN);
					try {DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());dataOutputStream.writeUTF("addscore");dataOutputStream.writeUTF(name);JOptionPane.showMessageDialog(null, "You Got 10 Score");	} catch (IOException e11) {e11.printStackTrace();btnNewButton.setBackground(Color.GREEN);					}JOptionPane.showMessageDialog(null, "Congrats You Won !!!!");System.exit(0);;  
				}
			}
		});
		button_33.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_33.setFocusable(false);
		button_33.setBackground(Color.WHITE);
		button_33.setBounds(194, 114, 51, 23);
		panel.add(button_33);
		
		JButton button_34 = new JButton("36");
		button_34.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton o = button_34;
				if (random>Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.YELLOW);
					draw();
				}
			
				else	if (random<Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.RED);
					draw();
				}
				else
				{
					o.setBackground(Color.GREEN);
					try {DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());dataOutputStream.writeUTF("addscore");dataOutputStream.writeUTF(name);JOptionPane.showMessageDialog(null, "You Got 10 Score");	} catch (IOException e11) {e11.printStackTrace();btnNewButton.setBackground(Color.GREEN);					}JOptionPane.showMessageDialog(null, "Congrats You Won !!!!");System.exit(0);;  
				}
			}
		});
		button_34.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_34.setFocusable(false);
		button_34.setBackground(Color.WHITE);
		button_34.setBounds(243, 114, 51, 23);
		panel.add(button_34);
		
		JButton button_35 = new JButton("37");
		button_35.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				JButton o = button_35;
				if (random>Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.YELLOW);
					draw();
				}
			
				else	if (random<Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.RED);
					draw();
				}
				else
				{
					o.setBackground(Color.GREEN);
					try {DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());dataOutputStream.writeUTF("addscore");dataOutputStream.writeUTF(name);JOptionPane.showMessageDialog(null, "You Got 10 Score");	} catch (IOException e11) {e11.printStackTrace();btnNewButton.setBackground(Color.GREEN);					}JOptionPane.showMessageDialog(null, "Congrats You Won !!!!");System.exit(0);;  
				}
			
			}
			
		});
		button_35.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_35.setFocusable(false);
		button_35.setBackground(Color.WHITE);
		button_35.setBounds(292, 114, 51, 23);
		panel.add(button_35);
		
		JButton button_36 = new JButton("38");
		button_36.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton o = button_36;
				if (random>Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.YELLOW);
					draw();
				}
			
				else	if (random<Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.RED);
					draw();
				}
				else
				{
					o.setBackground(Color.GREEN);
					try {DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());dataOutputStream.writeUTF("addscore");dataOutputStream.writeUTF(name);JOptionPane.showMessageDialog(null, "You Got 10 Score");	} catch (IOException e11) {e11.printStackTrace();btnNewButton.setBackground(Color.GREEN);					}JOptionPane.showMessageDialog(null, "Congrats You Won !!!!");System.exit(0);;  
				}
			}
		});
		button_36.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_36.setFocusable(false);
		button_36.setBackground(Color.WHITE);
		button_36.setBounds(341, 114, 51, 23);
		panel.add(button_36);
		
		JButton button_37 = new JButton("39");
		button_37.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				JButton o = button_37;
				if (random>Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.YELLOW);
					draw();
				}
			
				else	if (random<Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.RED);
					draw();
				}
				else
				{
					o.setBackground(Color.GREEN);
					try {DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());dataOutputStream.writeUTF("addscore");dataOutputStream.writeUTF(name);JOptionPane.showMessageDialog(null, "You Got 10 Score");	} catch (IOException e11) {e11.printStackTrace();btnNewButton.setBackground(Color.GREEN);					}JOptionPane.showMessageDialog(null, "Congrats You Won !!!!");System.exit(0);;  
				}
			
			}
			
		});
		button_37.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_37.setFocusable(false);
		button_37.setBackground(Color.WHITE);
		button_37.setBounds(386, 114, 51, 23);
		panel.add(button_37);
		
		JButton button_38 = new JButton("40");
		button_38.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton o = button_38;
				if (random>Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.YELLOW);
					draw();
				}
			
				else	if (random<Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.RED);
					draw();
				}
				else
				{
					o.setBackground(Color.GREEN);
					try {DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());dataOutputStream.writeUTF("addscore");dataOutputStream.writeUTF(name);JOptionPane.showMessageDialog(null, "You Got 10 Score");	} catch (IOException e11) {e11.printStackTrace();btnNewButton.setBackground(Color.GREEN);					}JOptionPane.showMessageDialog(null, "Congrats You Won !!!!");System.exit(0);;  
				}
			}
		});
		button_38.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_38.setFocusable(false);
		button_38.setBackground(Color.WHITE);
		button_38.setBounds(435, 114, 51, 23);
		panel.add(button_38);
		
		JButton button_39 = new JButton("41");
		button_39.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton o = button_39;
				if (random>Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.YELLOW);
					draw();
				}
			
				else	if (random<Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.RED);
					draw();
				}
				else
				{
					o.setBackground(Color.GREEN);
					try {DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());dataOutputStream.writeUTF("addscore");dataOutputStream.writeUTF(name);JOptionPane.showMessageDialog(null, "You Got 10 Score");	} catch (IOException e11) {e11.printStackTrace();btnNewButton.setBackground(Color.GREEN);					}JOptionPane.showMessageDialog(null, "Congrats You Won !!!!");System.exit(0);;  
				}
			}
		});
		button_39.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_39.setFocusable(false);
		button_39.setBackground(Color.WHITE);
		button_39.setBounds(0, 137, 51, 23);
		panel.add(button_39);
		
		JButton button_40 = new JButton("42");
		button_40.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton o = button_40;
				if (random>Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.YELLOW);
					draw();
				}
			
				else	if (random<Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.RED);
					draw();
				}
				else
				{
					o.setBackground(Color.GREEN);
					try {DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());dataOutputStream.writeUTF("addscore");dataOutputStream.writeUTF(name);JOptionPane.showMessageDialog(null, "You Got 10 Score");	} catch (IOException e11) {e11.printStackTrace();btnNewButton.setBackground(Color.GREEN);					}JOptionPane.showMessageDialog(null, "Congrats You Won !!!!");System.exit(0);;  
				}
			}
		});
		button_40.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_40.setFocusable(false);
		button_40.setBackground(Color.WHITE);
		button_40.setBounds(49, 137, 51, 23);
		panel.add(button_40);
		
		JButton button_41 = new JButton("43");
		button_41.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton o = button_41;
				if (random>Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.YELLOW);
					draw();
				}
			
				else	if (random<Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.RED);
					draw();
				}
				else
				{
					o.setBackground(Color.GREEN);
					try {DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());dataOutputStream.writeUTF("addscore");dataOutputStream.writeUTF(name);JOptionPane.showMessageDialog(null, "You Got 10 Score");	} catch (IOException e11) {e11.printStackTrace();btnNewButton.setBackground(Color.GREEN);					}JOptionPane.showMessageDialog(null, "Congrats You Won !!!!");System.exit(0);;  
				}
			}
		});
		button_41.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_41.setFocusable(false);
		button_41.setBackground(Color.WHITE);
		button_41.setBounds(98, 137, 51, 23);
		panel.add(button_41);
		
		JButton button_42 = new JButton("44");
		button_42.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton o = button_42;
				if (random>Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.YELLOW);
					draw();
				}
			
				else	if (random<Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.RED);
					draw();
				}
				else
				{
					o.setBackground(Color.GREEN);
					try {DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());dataOutputStream.writeUTF("addscore");dataOutputStream.writeUTF(name);JOptionPane.showMessageDialog(null, "You Got 10 Score");	} catch (IOException e11) {e11.printStackTrace();btnNewButton.setBackground(Color.GREEN);					}JOptionPane.showMessageDialog(null, "Congrats You Won !!!!");System.exit(0);;  
				}
			}
		});
		button_42.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_42.setFocusable(false);
		button_42.setBackground(Color.WHITE);
		button_42.setBounds(147, 137, 51, 23);
		panel.add(button_42);
		
		JButton button_43 = new JButton("45");
		button_43.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton o = button_43;
				if (random>Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.YELLOW);
					draw();
				}
			
				else	if (random<Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.RED);
					draw();
				}
				else
				{
					o.setBackground(Color.GREEN);
					try {DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());dataOutputStream.writeUTF("addscore");dataOutputStream.writeUTF(name);JOptionPane.showMessageDialog(null, "You Got 10 Score");	} catch (IOException e11) {e11.printStackTrace();btnNewButton.setBackground(Color.GREEN);					}JOptionPane.showMessageDialog(null, "Congrats You Won !!!!");System.exit(0);;  
				}
			}
		});
		button_43.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_43.setFocusable(false);
		button_43.setBackground(Color.WHITE);
		button_43.setBounds(194, 137, 51, 23);
		panel.add(button_43);
		
		JButton button_44 = new JButton("46");
		button_44.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton o = button_44;
				if (random>Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.YELLOW);
					draw();
				}
			
				else	if (random<Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.RED);
					draw();
				}
				else
				{
					o.setBackground(Color.GREEN);
					try {DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());dataOutputStream.writeUTF("addscore");dataOutputStream.writeUTF(name);JOptionPane.showMessageDialog(null, "You Got 10 Score");	} catch (IOException e11) {e11.printStackTrace();btnNewButton.setBackground(Color.GREEN);					}JOptionPane.showMessageDialog(null, "Congrats You Won !!!!");System.exit(0);;  
				}
			}
		});
		button_44.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_44.setFocusable(false);
		button_44.setBackground(Color.WHITE);
		button_44.setBounds(243, 137, 51, 23);
		panel.add(button_44);
		
		JButton button_45 = new JButton("47");
		button_45.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton o = button_45;
				if (random>Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.YELLOW);
					draw();
				}
			
				else	if (random<Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.RED);
					draw();
				}
				else
				{
					o.setBackground(Color.GREEN);
					try {DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());dataOutputStream.writeUTF("addscore");dataOutputStream.writeUTF(name);JOptionPane.showMessageDialog(null, "You Got 10 Score");	} catch (IOException e11) {e11.printStackTrace();btnNewButton.setBackground(Color.GREEN);					}JOptionPane.showMessageDialog(null, "Congrats You Won !!!!");System.exit(0);;  
				}
			}
		});
		button_45.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_45.setFocusable(false);
		button_45.setBackground(Color.WHITE);
		button_45.setBounds(292, 137, 51, 23);
		panel.add(button_45);
		
		JButton button_46 = new JButton("48");
		button_46.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton o = button_46;
				if (random>Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.YELLOW);
					draw();
				}
			
				else	if (random<Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.RED);
					draw();
				}
				else
				{
					o.setBackground(Color.GREEN);
					try {DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());dataOutputStream.writeUTF("addscore");dataOutputStream.writeUTF(name);JOptionPane.showMessageDialog(null, "You Got 10 Score");	} catch (IOException e11) {e11.printStackTrace();btnNewButton.setBackground(Color.GREEN);					}JOptionPane.showMessageDialog(null, "Congrats You Won !!!!");System.exit(0);;  
				}
			}
		});
		button_46.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_46.setFocusable(false);
		button_46.setBackground(Color.WHITE);
		button_46.setBounds(341, 137, 51, 23);
		panel.add(button_46);
		
		JButton button_47 = new JButton("49");
		button_47.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton o = button_47;
				if (random>Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.YELLOW);
					draw();
				}
			
				else	if (random<Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.RED);
					draw();
				}
				else
				{
					o.setBackground(Color.GREEN);
					try {DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());dataOutputStream.writeUTF("addscore");dataOutputStream.writeUTF(name);JOptionPane.showMessageDialog(null, "You Got 10 Score");	} catch (IOException e11) {e11.printStackTrace();btnNewButton.setBackground(Color.GREEN);					}JOptionPane.showMessageDialog(null, "Congrats You Won !!!!");System.exit(0);;  
				}
			}
		});
		button_47.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_47.setFocusable(false);
		button_47.setBackground(Color.WHITE);
		button_47.setBounds(386, 137, 51, 23);
		panel.add(button_47);
		
		JButton button_48 = new JButton("50");
		button_48.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton o = button_48;
				if (random>Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.YELLOW);
					draw();
				}
			
				else	if (random<Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.RED);
					draw();
				}
				else
				{
					o.setBackground(Color.GREEN);
					try {DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());dataOutputStream.writeUTF("addscore");dataOutputStream.writeUTF(name);JOptionPane.showMessageDialog(null, "You Got 10 Score");	} catch (IOException e11) {e11.printStackTrace();btnNewButton.setBackground(Color.GREEN);					}JOptionPane.showMessageDialog(null, "Congrats You Won !!!!");System.exit(0);;  
				}
			}
		});
		button_48.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_48.setFocusable(false);
		button_48.setBackground(Color.WHITE);
		button_48.setBounds(435, 137, 51, 23);
		panel.add(button_48);
		
		JButton button_49 = new JButton("51");
		button_49.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton o = button_49;
				if (random>Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.YELLOW);
					draw();
				}
			
				else	if (random<Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.RED);
					draw();
				}
				else
				{
					o.setBackground(Color.GREEN);
					try {DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());dataOutputStream.writeUTF("addscore");dataOutputStream.writeUTF(name);JOptionPane.showMessageDialog(null, "You Got 10 Score");	} catch (IOException e11) {e11.printStackTrace();btnNewButton.setBackground(Color.GREEN);					}JOptionPane.showMessageDialog(null, "Congrats You Won !!!!");System.exit(0);;  
				}
			}
		});
		button_49.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_49.setFocusable(false);
		button_49.setBackground(Color.WHITE);
		button_49.setBounds(0, 160, 51, 23);
		panel.add(button_49);
		
		JButton button_50 = new JButton("52");
		button_50.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JButton o = button_50;
				if (random>Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.YELLOW);
					draw();
				}
			
				else	if (random<Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.RED);
					draw();
				}
				else
				{
					o.setBackground(Color.GREEN);
					try {DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());dataOutputStream.writeUTF("addscore");dataOutputStream.writeUTF(name);JOptionPane.showMessageDialog(null, "You Got 10 Score");	} catch (IOException e11) {e11.printStackTrace();btnNewButton.setBackground(Color.GREEN);					}JOptionPane.showMessageDialog(null, "Congrats You Won !!!!");System.exit(0);;  
				}
			}
		});
		button_50.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_50.setFocusable(false);
		button_50.setBackground(Color.WHITE);
		button_50.setBounds(49, 160, 51, 23);
		panel.add(button_50);
		
		JButton button_51 = new JButton("53");
		button_51.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton o = button_51;
				if (random>Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.YELLOW);
					draw();
				}
			
				else	if (random<Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.RED);
					draw();
				}
				else
				{
					o.setBackground(Color.GREEN);
					try {DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());dataOutputStream.writeUTF("addscore");dataOutputStream.writeUTF(name);JOptionPane.showMessageDialog(null, "You Got 10 Score");	} catch (IOException e11) {e11.printStackTrace();btnNewButton.setBackground(Color.GREEN);					}JOptionPane.showMessageDialog(null, "Congrats You Won !!!!");System.exit(0);;  
				}
			}
		});
		button_51.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_51.setFocusable(false);
		button_51.setBackground(Color.WHITE);
		button_51.setBounds(98, 160, 51, 23);
		panel.add(button_51);
		
		JButton button_52 = new JButton("54");
		button_52.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton o = button_52;
				if (random>Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.YELLOW);
					draw();
				}
			
				else	if (random<Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.RED);
					draw();
				}
				else
				{
					o.setBackground(Color.GREEN);
					try {DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());dataOutputStream.writeUTF("addscore");dataOutputStream.writeUTF(name);JOptionPane.showMessageDialog(null, "You Got 10 Score");	} catch (IOException e11) {e11.printStackTrace();btnNewButton.setBackground(Color.GREEN);					}JOptionPane.showMessageDialog(null, "Congrats You Won !!!!");System.exit(0);;  
				}
			}
		});
		button_52.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_52.setFocusable(false);
		button_52.setBackground(Color.WHITE);
		button_52.setBounds(147, 160, 51, 23);
		panel.add(button_52);
		
		JButton button_53 = new JButton("55");
		button_53.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton o = button_53;
				if (random>Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.YELLOW);
					draw();
				}
			
				else	if (random<Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.RED);
					draw();
				}
				else
				{
					o.setBackground(Color.GREEN);
					try {DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());dataOutputStream.writeUTF("addscore");dataOutputStream.writeUTF(name);JOptionPane.showMessageDialog(null, "You Got 10 Score");	} catch (IOException e11) {e11.printStackTrace();btnNewButton.setBackground(Color.GREEN);					}JOptionPane.showMessageDialog(null, "Congrats You Won !!!!");System.exit(0);;  
				}
			}
		});
		button_53.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_53.setFocusable(false);
		button_53.setBackground(Color.WHITE);
		button_53.setBounds(194, 160, 51, 23);
		panel.add(button_53);
		
		JButton button_54 = new JButton("56");
		button_54.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton o = button_54;
				if (random>Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.YELLOW);
					draw();
				}
			
				else	if (random<Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.RED);
					draw();
				}
				else
				{
					o.setBackground(Color.GREEN);
					try {DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());dataOutputStream.writeUTF("addscore");dataOutputStream.writeUTF(name);JOptionPane.showMessageDialog(null, "You Got 10 Score");	} catch (IOException e11) {e11.printStackTrace();btnNewButton.setBackground(Color.GREEN);					}JOptionPane.showMessageDialog(null, "Congrats You Won !!!!");System.exit(0);;  
				}
			}
		});
		button_54.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_54.setFocusable(false);
		button_54.setBackground(Color.WHITE);
		button_54.setBounds(243, 160, 51, 23);
		panel.add(button_54);
		
		JButton button_55 = new JButton("57");
		button_55.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton o = button_55;
				if (random>Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.YELLOW);
					draw();
				}
			
				else	if (random<Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.RED);
					draw();
				}
				else
				{
					o.setBackground(Color.GREEN);
					try {DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());dataOutputStream.writeUTF("addscore");dataOutputStream.writeUTF(name);JOptionPane.showMessageDialog(null, "You Got 10 Score");	} catch (IOException e11) {e11.printStackTrace();btnNewButton.setBackground(Color.GREEN);					}JOptionPane.showMessageDialog(null, "Congrats You Won !!!!");System.exit(0);;  
				}
			}
		});
		button_55.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_55.setFocusable(false);
		button_55.setBackground(Color.WHITE);
		button_55.setBounds(292, 160, 51, 23);
		panel.add(button_55);
		
		JButton button_56 = new JButton("58");
		button_56.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton o = button_56;
				if (random>Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.YELLOW);
					draw();
				}
			
				else	if (random<Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.RED);
					draw();
				}
				else
				{
					o.setBackground(Color.GREEN);
					try {DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());dataOutputStream.writeUTF("addscore");dataOutputStream.writeUTF(name);JOptionPane.showMessageDialog(null, "You Got 10 Score");	} catch (IOException e11) {e11.printStackTrace();btnNewButton.setBackground(Color.GREEN);					}JOptionPane.showMessageDialog(null, "Congrats You Won !!!!");System.exit(0);;  
				}
			}
		});
		button_56.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_56.setFocusable(false);
		button_56.setBackground(Color.WHITE);
		button_56.setBounds(341, 160, 51, 23);
		panel.add(button_56);
		
		JButton button_57 = new JButton("59");
		button_57.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				JButton o = button_57;
				if (random>Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.YELLOW);
					draw();
				}
			
				else	if (random<Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.RED);
					draw();
				}
				else
				{
					o.setBackground(Color.GREEN);
					try {DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());dataOutputStream.writeUTF("addscore");dataOutputStream.writeUTF(name);JOptionPane.showMessageDialog(null, "You Got 10 Score");	} catch (IOException e11) {e11.printStackTrace();btnNewButton.setBackground(Color.GREEN);					}JOptionPane.showMessageDialog(null, "Congrats You Won !!!!");System.exit(0);;  
				}
			
			}
		});
		button_57.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_57.setFocusable(false);
		button_57.setBackground(Color.WHITE);
		button_57.setBounds(386, 160, 51, 23);
		panel.add(button_57);
		
		JButton button_58 = new JButton("60");
		button_58.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton o = button_58;
				if (random>Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.YELLOW);
					draw();
				}
			
				else	if (random<Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.RED);
					draw();
				}
				else
				{
					o.setBackground(Color.GREEN);
					try {DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());dataOutputStream.writeUTF("addscore");dataOutputStream.writeUTF(name);JOptionPane.showMessageDialog(null, "You Got 10 Score");	} catch (IOException e11) {e11.printStackTrace();btnNewButton.setBackground(Color.GREEN);					}JOptionPane.showMessageDialog(null, "Congrats You Won !!!!");System.exit(0);;  
				}
			}
		});
		button_58.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_58.setFocusable(false);
		button_58.setBackground(Color.WHITE);
		button_58.setBounds(435, 160, 51, 23);
		panel.add(button_58);
		
		JButton button_59 = new JButton("61");
		button_59.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton o = button_59;
				if (random>Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.YELLOW);
					draw();
				}
			
				else	if (random<Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.RED);
					draw();
				}
				else
				{
					o.setBackground(Color.GREEN);
					try {DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());dataOutputStream.writeUTF("addscore");dataOutputStream.writeUTF(name);JOptionPane.showMessageDialog(null, "You Got 10 Score");	} catch (IOException e11) {e11.printStackTrace();btnNewButton.setBackground(Color.GREEN);					}JOptionPane.showMessageDialog(null, "Congrats You Won !!!!");System.exit(0);;  
				}
			}
		});
		button_59.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_59.setFocusable(false);
		button_59.setBackground(Color.WHITE);
		button_59.setBounds(0, 182, 51, 23);
		panel.add(button_59);
		
		JButton button_60 = new JButton("62");
		button_60.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JButton o = button_60;
				if (random>Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.YELLOW);
					draw();
				}
			
				else	if (random<Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.RED);
					draw();
				}
				else
				{
					o.setBackground(Color.GREEN);
					try {DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());dataOutputStream.writeUTF("addscore");dataOutputStream.writeUTF(name);JOptionPane.showMessageDialog(null, "You Got 10 Score");	} catch (IOException e11) {e11.printStackTrace();btnNewButton.setBackground(Color.GREEN);					}JOptionPane.showMessageDialog(null, "Congrats You Won !!!!");System.exit(0);;  
				}
			}
		});
		button_60.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_60.setFocusable(false);
		button_60.setBackground(Color.WHITE);
		button_60.setBounds(49, 182, 51, 23);
		panel.add(button_60);
		
		JButton button_61 = new JButton("63");
		button_61.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton o = button_61;
				if (random>Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.YELLOW);
					draw();
				}
			
				else	if (random<Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.RED);
					draw();
				}
				else
				{
					o.setBackground(Color.GREEN);
					try {DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());dataOutputStream.writeUTF("addscore");dataOutputStream.writeUTF(name);JOptionPane.showMessageDialog(null, "You Got 10 Score");	} catch (IOException e11) {e11.printStackTrace();btnNewButton.setBackground(Color.GREEN);					}JOptionPane.showMessageDialog(null, "Congrats You Won !!!!");System.exit(0);;  
				}
			}
		});
		button_61.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_61.setFocusable(false);
		button_61.setBackground(Color.WHITE);
		button_61.setBounds(98, 182, 51, 23);
		panel.add(button_61);
		
		JButton button_62 = new JButton("64");
		button_62.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton o = button_62;
				if (random>Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.YELLOW);
					draw();
				}
			
				else	if (random<Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.RED);
					draw();
				}
				else
				{
					o.setBackground(Color.GREEN);
					try {DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());dataOutputStream.writeUTF("addscore");dataOutputStream.writeUTF(name);JOptionPane.showMessageDialog(null, "You Got 10 Score");	} catch (IOException e11) {e11.printStackTrace();btnNewButton.setBackground(Color.GREEN);					}JOptionPane.showMessageDialog(null, "Congrats You Won !!!!");System.exit(0);;  
				}
			}
		});
		button_62.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_62.setFocusable(false);
		button_62.setBackground(Color.WHITE);
		button_62.setBounds(147, 182, 51, 23);
		panel.add(button_62);
		
		JButton button_63 = new JButton("65");
		button_63.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton o = button_63;
				if (random>Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.YELLOW);
					draw();
				}
			
				else	if (random<Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.RED);
					draw();
				}
				else
				{
					o.setBackground(Color.GREEN);
					try {DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());dataOutputStream.writeUTF("addscore");dataOutputStream.writeUTF(name);JOptionPane.showMessageDialog(null, "You Got 10 Score");	} catch (IOException e11) {e11.printStackTrace();btnNewButton.setBackground(Color.GREEN);					}JOptionPane.showMessageDialog(null, "Congrats You Won !!!!");System.exit(0);;  
				}
			}
		});
		button_63.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_63.setFocusable(false);
		button_63.setBackground(Color.WHITE);
		button_63.setBounds(194, 182, 51, 23);
		panel.add(button_63);
		
		JButton button_64 = new JButton("66");
		button_64.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton o = button_64;
				if (random>Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.YELLOW);
					draw();
				}
			
				else	if (random<Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.RED);
					draw();
				}
				else
				{
					o.setBackground(Color.GREEN);
					try {DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());dataOutputStream.writeUTF("addscore");dataOutputStream.writeUTF(name);JOptionPane.showMessageDialog(null, "You Got 10 Score");	} catch (IOException e11) {e11.printStackTrace();btnNewButton.setBackground(Color.GREEN);					}JOptionPane.showMessageDialog(null, "Congrats You Won !!!!");System.exit(0);;  
				}
			}
		});
		button_64.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_64.setFocusable(false);
		button_64.setBackground(Color.WHITE);
		button_64.setBounds(243, 182, 51, 23);
		panel.add(button_64);
		
		JButton button_65 = new JButton("67");
		button_65.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton o = button_65;
				if (random>Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.YELLOW);
					draw();
				}
			
				else	if (random<Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.RED);
					draw();
				}
				else
				{
					o.setBackground(Color.GREEN);
					try {DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());dataOutputStream.writeUTF("addscore");dataOutputStream.writeUTF(name);JOptionPane.showMessageDialog(null, "You Got 10 Score");	} catch (IOException e11) {e11.printStackTrace();btnNewButton.setBackground(Color.GREEN);					}JOptionPane.showMessageDialog(null, "Congrats You Won !!!!");System.exit(0);;  
				}
			}
		});
		button_65.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_65.setFocusable(false);
		button_65.setBackground(Color.WHITE);
		button_65.setBounds(292, 182, 51, 23);
		panel.add(button_65);
		
		JButton button_66 = new JButton("68");
		button_66.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton o = button_66;
				if (random>Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.YELLOW);
					draw();
				}
			
				else	if (random<Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.RED);
					draw();
				}
				else
				{
					o.setBackground(Color.GREEN);
					try {DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());dataOutputStream.writeUTF("addscore");dataOutputStream.writeUTF(name);JOptionPane.showMessageDialog(null, "You Got 10 Score");	} catch (IOException e11) {e11.printStackTrace();btnNewButton.setBackground(Color.GREEN);					}JOptionPane.showMessageDialog(null, "Congrats You Won !!!!");System.exit(0);;  
				}
			}
		});
		button_66.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_66.setFocusable(false);
		button_66.setBackground(Color.WHITE);
		button_66.setBounds(341, 182, 51, 23);
		panel.add(button_66);
		
		JButton button_67 = new JButton("69");
		button_67.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton o = button_67;
				if (random>Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.YELLOW);
					draw();
				}
			
				else	if (random<Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.RED);
					draw();
				}
				else
				{
					o.setBackground(Color.GREEN);
					try {DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());dataOutputStream.writeUTF("addscore");dataOutputStream.writeUTF(name);JOptionPane.showMessageDialog(null, "You Got 10 Score");	} catch (IOException e11) {e11.printStackTrace();btnNewButton.setBackground(Color.GREEN);					}JOptionPane.showMessageDialog(null, "Congrats You Won !!!!");System.exit(0);;  
				}
			}
		});
		button_67.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_67.setFocusable(false);
		button_67.setBackground(Color.WHITE);
		button_67.setBounds(386, 182, 51, 23);
		panel.add(button_67);
		
		JButton button_68 = new JButton("70");
		button_68.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton o = button_68;
				if (random>Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.YELLOW);
					draw();
				}
			
				else	if (random<Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.RED);
					draw();
				}
				else
				{
					o.setBackground(Color.GREEN);
					try {DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());dataOutputStream.writeUTF("addscore");dataOutputStream.writeUTF(name);JOptionPane.showMessageDialog(null, "You Got 10 Score");	} catch (IOException e11) {e11.printStackTrace();btnNewButton.setBackground(Color.GREEN);					}JOptionPane.showMessageDialog(null, "Congrats You Won !!!!");System.exit(0);;  
				}
			}
		});
		button_68.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_68.setFocusable(false);
		button_68.setBackground(Color.WHITE);
		button_68.setBounds(435, 182, 51, 23);
		panel.add(button_68);
		
		JButton button_69 = new JButton("71");
		button_69.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton o = button_69;
				if (random>Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.YELLOW);
					draw();
				}
			
				else	if (random<Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.RED);
					draw();
				}
				else
				{
					o.setBackground(Color.GREEN);
					try {DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());dataOutputStream.writeUTF("addscore");dataOutputStream.writeUTF(name);JOptionPane.showMessageDialog(null, "You Got 10 Score");	} catch (IOException e11) {e11.printStackTrace();btnNewButton.setBackground(Color.GREEN);					}JOptionPane.showMessageDialog(null, "Congrats You Won !!!!");System.exit(0);;  
				}
			}
		});
		button_69.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_69.setFocusable(false);
		button_69.setBackground(Color.WHITE);
		button_69.setBounds(0, 205, 51, 23);
		panel.add(button_69);
		
		JButton button_70 = new JButton("72");
		button_70.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JButton o = button_70;
				if (random>Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.YELLOW);
					draw();
				}
			
				else	if (random<Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.RED);
					draw();
				}
				else
				{
					o.setBackground(Color.GREEN);
					try {DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());dataOutputStream.writeUTF("addscore");dataOutputStream.writeUTF(name);JOptionPane.showMessageDialog(null, "You Got 10 Score");	} catch (IOException e11) {e11.printStackTrace();btnNewButton.setBackground(Color.GREEN);					}JOptionPane.showMessageDialog(null, "Congrats You Won !!!!");System.exit(0);;  
				}
			
			}
		});
		button_70.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_70.setFocusable(false);
		button_70.setBackground(Color.WHITE);
		button_70.setBounds(49, 205, 51, 23);
		panel.add(button_70);
		
		JButton button_71 = new JButton("73");
		button_71.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton o = button_71;
				if (random>Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.YELLOW);
					draw();
				}
			
				else	if (random<Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.RED);
					draw();
				}
				else
				{
					o.setBackground(Color.GREEN);
					try {DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());dataOutputStream.writeUTF("addscore");dataOutputStream.writeUTF(name);JOptionPane.showMessageDialog(null, "You Got 10 Score");	} catch (IOException e11) {e11.printStackTrace();btnNewButton.setBackground(Color.GREEN);					}JOptionPane.showMessageDialog(null, "Congrats You Won !!!!");System.exit(0);;  
				}
			}
		});
		button_71.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_71.setFocusable(false);
		button_71.setBackground(Color.WHITE);
		button_71.setBounds(98, 205, 51, 23);
		panel.add(button_71);
		
		JButton button_72 = new JButton("74");
		button_72.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton o = button_72;
				if (random>Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.YELLOW);
					draw();
				}
			
				else	if (random<Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.RED);
					draw();
				}
				else
				{
					o.setBackground(Color.GREEN);
					try {DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());dataOutputStream.writeUTF("addscore");dataOutputStream.writeUTF(name);JOptionPane.showMessageDialog(null, "You Got 10 Score");	} catch (IOException e11) {e11.printStackTrace();btnNewButton.setBackground(Color.GREEN);					}JOptionPane.showMessageDialog(null, "Congrats You Won !!!!");System.exit(0);;  
				}
			}
		});
		button_72.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_72.setFocusable(false);
		button_72.setBackground(Color.WHITE);
		button_72.setBounds(147, 205, 51, 23);
		panel.add(button_72);
		
		JButton button_73 = new JButton("75");
		button_73.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton o = button_73;
				if (random>Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.YELLOW);
					draw();
				}
			
				else	if (random<Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.RED);
					draw();
				}
				else
				{
					o.setBackground(Color.GREEN);
					try {DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());dataOutputStream.writeUTF("addscore");dataOutputStream.writeUTF(name);JOptionPane.showMessageDialog(null, "You Got 10 Score");	} catch (IOException e11) {e11.printStackTrace();btnNewButton.setBackground(Color.GREEN);					}JOptionPane.showMessageDialog(null, "Congrats You Won !!!!");System.exit(0);;  
				}
			}
		});
		button_73.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_73.setFocusable(false);
		button_73.setBackground(Color.WHITE);
		button_73.setBounds(194, 205, 51, 23);
		panel.add(button_73);
		
		JButton button_74 = new JButton("76");
		button_74.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				JButton o = button_74;
				if (random>Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.YELLOW);
					draw();
				}
			
				else	if (random<Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.RED);
					draw();
				}
				else
				{
					o.setBackground(Color.GREEN);
					try {DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());dataOutputStream.writeUTF("addscore");dataOutputStream.writeUTF(name);JOptionPane.showMessageDialog(null, "You Got 10 Score");	} catch (IOException e11) {e11.printStackTrace();btnNewButton.setBackground(Color.GREEN);					}JOptionPane.showMessageDialog(null, "Congrats You Won !!!!");System.exit(0);;  
				}
			}
			
		});
		button_74.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_74.setFocusable(false);
		button_74.setBackground(Color.WHITE);
		button_74.setBounds(243, 205, 51, 23);
		panel.add(button_74);
		
		JButton button_75 = new JButton("77");
		button_75.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JButton o = button_75;
				if (random>Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.YELLOW);
					draw();
				}
			
				else	if (random<Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.RED);
					draw();
				}
				else
				{
					o.setBackground(Color.GREEN);
					try {DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());dataOutputStream.writeUTF("addscore");dataOutputStream.writeUTF(name);JOptionPane.showMessageDialog(null, "You Got 10 Score");	} catch (IOException e11) {e11.printStackTrace();btnNewButton.setBackground(Color.GREEN);					}JOptionPane.showMessageDialog(null, "Congrats You Won !!!!");System.exit(0);;  
				}
			}
		});
		button_75.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_75.setFocusable(false);
		button_75.setBackground(Color.WHITE);
		button_75.setBounds(292, 205, 51, 23);
		panel.add(button_75);
		
		JButton button_76 = new JButton("78");
		button_76.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton o = button_76;
				if (random>Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.YELLOW);
					draw();
				}
			
				else	if (random<Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.RED);
					draw();
				}
				else
				{
					o.setBackground(Color.GREEN);
					try {DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());dataOutputStream.writeUTF("addscore");dataOutputStream.writeUTF(name);JOptionPane.showMessageDialog(null, "You Got 10 Score");	} catch (IOException e11) {e11.printStackTrace();btnNewButton.setBackground(Color.GREEN);					}JOptionPane.showMessageDialog(null, "Congrats You Won !!!!");System.exit(0);;  
				}
			
			}
		});
		button_76.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_76.setFocusable(false);
		button_76.setBackground(Color.WHITE);
		button_76.setBounds(341, 205, 51, 23);
		panel.add(button_76);
		
		JButton button_77 = new JButton("79");
		button_77.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton o = button_77;
				if (random>Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.YELLOW);
					draw();
				}
			
				else	if (random<Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.RED);
					draw();
				}
				else
				{
					o.setBackground(Color.GREEN);
					try {DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());dataOutputStream.writeUTF("addscore");dataOutputStream.writeUTF(name);JOptionPane.showMessageDialog(null, "You Got 10 Score");	} catch (IOException e11) {e11.printStackTrace();btnNewButton.setBackground(Color.GREEN);					}JOptionPane.showMessageDialog(null, "Congrats You Won !!!!");System.exit(0);;  
				}
			}
		});
		button_77.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_77.setFocusable(false);
		button_77.setBackground(Color.WHITE);
		button_77.setBounds(386, 205, 51, 23);
		panel.add(button_77);
		
		JButton button_78 = new JButton("80");
		button_78.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton o = button_78;
				if (random>Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.YELLOW);
					draw();
				}
			
				else	if (random<Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.RED);
					draw();
				}
				else
				{
					o.setBackground(Color.GREEN);
					try {DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());dataOutputStream.writeUTF("addscore");dataOutputStream.writeUTF(name);JOptionPane.showMessageDialog(null, "You Got 10 Score");	} catch (IOException e11) {e11.printStackTrace();btnNewButton.setBackground(Color.GREEN);					}JOptionPane.showMessageDialog(null, "Congrats You Won !!!!");System.exit(0);;  
				}
			}
		});
		button_78.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_78.setFocusable(false);
		button_78.setBackground(Color.WHITE);
		button_78.setBounds(435, 205, 51, 23);
		panel.add(button_78);
		
		JButton button_79 = new JButton("81");
		button_79.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton o = button_79;
				if (random>Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.YELLOW);
					draw();
				}
			
				else	if (random<Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.RED);
					draw();
				}
				else
				{
					o.setBackground(Color.GREEN);
					try {DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());dataOutputStream.writeUTF("addscore");dataOutputStream.writeUTF(name);JOptionPane.showMessageDialog(null, "You Got 10 Score");	} catch (IOException e11) {e11.printStackTrace();btnNewButton.setBackground(Color.GREEN);					}JOptionPane.showMessageDialog(null, "Congrats You Won !!!!");System.exit(0);;  
				}
			}
		});
		button_79.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_79.setFocusable(false);
		button_79.setBackground(Color.WHITE);
		button_79.setBounds(0, 228, 51, 23);
		panel.add(button_79);
		
		JButton button_80 = new JButton("82");
		button_80.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton o = button_80;
				if (random>Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.YELLOW);
					draw();
				}
			
				else	if (random<Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.RED);
					draw();
				}
				else
				{
					o.setBackground(Color.GREEN);
					try {DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());dataOutputStream.writeUTF("addscore");dataOutputStream.writeUTF(name);JOptionPane.showMessageDialog(null, "You Got 10 Score");	} catch (IOException e11) {e11.printStackTrace();btnNewButton.setBackground(Color.GREEN);					}JOptionPane.showMessageDialog(null, "Congrats You Won !!!!");System.exit(0);;  
				}
			}
		});
		button_80.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_80.setFocusable(false);
		button_80.setBackground(Color.WHITE);
		button_80.setBounds(49, 228, 51, 23);
		panel.add(button_80);
		
		JButton button_81 = new JButton("83");
		button_81.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton o = button_81;
				if (random>Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.YELLOW);
					draw();
				}
			
				else	if (random<Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.RED);
					draw();
				}
				else
				{
					o.setBackground(Color.GREEN);
					try {DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());dataOutputStream.writeUTF("addscore");dataOutputStream.writeUTF(name);JOptionPane.showMessageDialog(null, "You Got 10 Score");	} catch (IOException e11) {e11.printStackTrace();btnNewButton.setBackground(Color.GREEN);					}JOptionPane.showMessageDialog(null, "Congrats You Won !!!!");System.exit(0);;  
				}
			}
		});
		button_81.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_81.setFocusable(false);
		button_81.setBackground(Color.WHITE);
		button_81.setBounds(98, 228, 51, 23);
		panel.add(button_81);
		
		JButton button_82 = new JButton("84");
		button_82.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton o = button_82;
				if (random>Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.YELLOW);
					draw();
				}
			
				else	if (random<Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.RED);
					draw();
				}
				else
				{
					o.setBackground(Color.GREEN);
					try {DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());dataOutputStream.writeUTF("addscore");dataOutputStream.writeUTF(name);JOptionPane.showMessageDialog(null, "You Got 10 Score");	} catch (IOException e11) {e11.printStackTrace();btnNewButton.setBackground(Color.GREEN);					}JOptionPane.showMessageDialog(null, "Congrats You Won !!!!");System.exit(0);;  
				}
			
			}
		});
		button_82.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_82.setFocusable(false);
		button_82.setBackground(Color.WHITE);
		button_82.setBounds(147, 228, 51, 23);
		panel.add(button_82);
		
		JButton button_83 = new JButton("85");
		button_83.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton o = button_83;
				if (random>Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.YELLOW);
					draw();
				}
			
				else	if (random<Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.RED);
					draw();
				}
				else
				{
					o.setBackground(Color.GREEN);
					try {DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());dataOutputStream.writeUTF("addscore");dataOutputStream.writeUTF(name);JOptionPane.showMessageDialog(null, "You Got 10 Score");	} catch (IOException e11) {e11.printStackTrace();btnNewButton.setBackground(Color.GREEN);					}JOptionPane.showMessageDialog(null, "Congrats You Won !!!!");System.exit(0);;  
				}
			
			}
		});
		button_83.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_83.setFocusable(false);
		button_83.setBackground(Color.WHITE);
		button_83.setBounds(194, 228, 51, 23);
		panel.add(button_83);
		
		JButton button_84 = new JButton("86");
		button_84.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton o = button_84;
				if (random>Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.YELLOW);
					draw();
				}
			
				else	if (random<Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.RED);
					draw();
				}
				else
				{
					o.setBackground(Color.GREEN);
					try {DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());dataOutputStream.writeUTF("addscore");dataOutputStream.writeUTF(name);JOptionPane.showMessageDialog(null, "You Got 10 Score");	} catch (IOException e11) {e11.printStackTrace();btnNewButton.setBackground(Color.GREEN);					}JOptionPane.showMessageDialog(null, "Congrats You Won !!!!");System.exit(0);;  
				}
			
			}
		});
		button_84.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_84.setFocusable(false);
		button_84.setBackground(Color.WHITE);
		button_84.setBounds(243, 228, 51, 23);
		panel.add(button_84);
		
		JButton button_85 = new JButton("87");
		button_85.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton o = button_85;
				if (random>Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.YELLOW);
					draw();
				}
			
				else	if (random<Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.RED);
					draw();
				}
				else
				{
					o.setBackground(Color.GREEN);
					try {DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());dataOutputStream.writeUTF("addscore");dataOutputStream.writeUTF(name);JOptionPane.showMessageDialog(null, "You Got 10 Score");	} catch (IOException e11) {e11.printStackTrace();btnNewButton.setBackground(Color.GREEN);					}JOptionPane.showMessageDialog(null, "Congrats You Won !!!!");System.exit(0);;  
				}
			
			}
		});
		button_85.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_85.setFocusable(false);
		button_85.setBackground(Color.WHITE);
		button_85.setBounds(292, 228, 51, 23);
		panel.add(button_85);
		
		JButton button_86 = new JButton("88");
		button_86.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton o = button_86;
				if (random>Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.YELLOW);
					draw();
				}
			
				else	if (random<Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.RED);
					draw();
				}
				else
				{
					o.setBackground(Color.GREEN);
					try {DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());dataOutputStream.writeUTF("addscore");dataOutputStream.writeUTF(name);JOptionPane.showMessageDialog(null, "You Got 10 Score");	} catch (IOException e11) {e11.printStackTrace();btnNewButton.setBackground(Color.GREEN);					}JOptionPane.showMessageDialog(null, "Congrats You Won !!!!");System.exit(0);;  
				}
			
			}
		});
		button_86.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_86.setFocusable(false);
		button_86.setBackground(Color.WHITE);
		button_86.setBounds(341, 228, 51, 23);
		panel.add(button_86);
		
		JButton button_87 = new JButton("89");
		button_87.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton o = button_87;
				if (random>Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.YELLOW);
					draw();
				}
			
				else	if (random<Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.RED);
					draw();
				}
				else
				{
					o.setBackground(Color.GREEN);
					try {DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());dataOutputStream.writeUTF("addscore");dataOutputStream.writeUTF(name);JOptionPane.showMessageDialog(null, "You Got 10 Score");	} catch (IOException e11) {e11.printStackTrace();btnNewButton.setBackground(Color.GREEN);					}JOptionPane.showMessageDialog(null, "Congrats You Won !!!!");System.exit(0);;  
				}
			
			}
		});
		button_87.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_87.setFocusable(false);
		button_87.setBackground(Color.WHITE);
		button_87.setBounds(386, 228, 51, 23);
		panel.add(button_87);
		
		JButton button_88 = new JButton("90");
		button_88.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton o = button_88;
				if (random>Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.YELLOW);
					draw();
				}
			
				else	if (random<Integer.parseInt(o.getText()))
				{
					count++;
					o.setBackground(Color.RED);
					draw();
				}
				else
				{
					o.setBackground(Color.GREEN);
					try {DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());dataOutputStream.writeUTF("addscore");dataOutputStream.writeUTF(name);JOptionPane.showMessageDialog(null, "You Got 10 Score");	} catch (IOException e11) {e11.printStackTrace();btnNewButton.setBackground(Color.GREEN);					}JOptionPane.showMessageDialog(null, "Congrats You Won !!!!");System.exit(0);;  
				}
			
			}
		});
		button_88.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_88.setFocusable(false);
		button_88.setBackground(Color.WHITE);
		button_88.setBounds(435, 228, 51, 23);
		panel.add(button_88);
		
		JButton button_89 = new JButton("91");
		button_89.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			
				if (random>Integer.parseInt(button_89.getText()))
				{
					count++;
					button_89.setBackground(Color.YELLOW);
					draw();
				}
			
				else	if (random<Integer.parseInt(button_89.getText()))
				{
					count++;
					button_89.setBackground(Color.RED);
					draw();
				}
				else
				{
					button_89.setBackground(Color.GREEN);
					try {DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());dataOutputStream.writeUTF("addscore");dataOutputStream.writeUTF(name);JOptionPane.showMessageDialog(null, "You Got 10 Score");	} catch (IOException e11) {e11.printStackTrace();btnNewButton.setBackground(Color.GREEN);					}JOptionPane.showMessageDialog(null, "Congrats You Won !!!!");System.exit(0);;  
				}
			
			}
		});
		button_89.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_89.setFocusable(false);
		button_89.setBackground(Color.WHITE);
		button_89.setBounds(0, 248, 51, 23);
		panel.add(button_89);
		
		JButton button_90 = new JButton("92");
		button_90.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (random>Integer.parseInt(button_90.getText()))
				{
					count++;
					button_90.setBackground(Color.YELLOW);
					draw();
				}
			
				else	if (random<Integer.parseInt(button_90.getText()))
				{
					count++;
					button_90.setBackground(Color.RED);
					draw();
				}
				else
				{
					button_90.setBackground(Color.GREEN);
					try {DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());dataOutputStream.writeUTF("addscore");dataOutputStream.writeUTF(name);JOptionPane.showMessageDialog(null, "You Got 10 Score");	} catch (IOException e11) {e11.printStackTrace();btnNewButton.setBackground(Color.GREEN);					}JOptionPane.showMessageDialog(null, "Congrats You Won !!!!");System.exit(0);;  
				}
				
			}
		});
		button_90.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_90.setFocusable(false);
		button_90.setBackground(Color.WHITE);
		button_90.setBounds(49, 248, 51, 23);
		panel.add(button_90);
		
		JButton button_91 = new JButton("93");
		button_91.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (random>Integer.parseInt(button_91.getText()))
				{
					count++;
					button_91.setBackground(Color.YELLOW);
					draw();
				}
			
				else	if (random<Integer.parseInt(button_91.getText()))
				{
					count++;
					button_91.setBackground(Color.RED);
					draw();
				}
				else
				{
					button_91.setBackground(Color.GREEN);
					try {DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());dataOutputStream.writeUTF("addscore");dataOutputStream.writeUTF(name);JOptionPane.showMessageDialog(null, "You Got 10 Score");	} catch (IOException e11) {e11.printStackTrace();btnNewButton.setBackground(Color.GREEN);					}JOptionPane.showMessageDialog(null, "Congrats You Won !!!!");System.exit(0);;  
				}
				
			}
		});
		button_91.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_91.setFocusable(false);
		button_91.setBackground(Color.WHITE);
		button_91.setBounds(98, 248, 51, 23);
		panel.add(button_91);
		
		JButton button_92 = new JButton("94");
		button_92.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				if (random>Integer.parseInt(button_92.getText()))
				{
					count++;
					button_92.setBackground(Color.YELLOW);
					draw();
				}
			
				else	if (random<Integer.parseInt(button_92.getText()))
				{
					count++;
					button_92.setBackground(Color.RED);
					draw();
				}
				else
				{
					button_92.setBackground(Color.GREEN);
					try {DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());dataOutputStream.writeUTF("addscore");dataOutputStream.writeUTF(name);JOptionPane.showMessageDialog(null, "You Got 10 Score");	} catch (IOException e11) {e11.printStackTrace();btnNewButton.setBackground(Color.GREEN);					}JOptionPane.showMessageDialog(null, "Congrats You Won !!!!");System.exit(0);;  
				}
				
			}
		});
		button_92.setToolTipText("");
		button_92.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_92.setFocusable(false);
		button_92.setBackground(Color.WHITE);
		button_92.setBounds(147, 248, 51, 23);
		panel.add(button_92);
		
		JButton button_93 = new JButton("95");
		button_93.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (random>Integer.parseInt(button_93.getText()))
				{
					count++;
					button_93.setBackground(Color.YELLOW);
					draw();
				}
			
				else	if (random<Integer.parseInt(button_93.getText()))
				{
					count++;
					button_93.setBackground(Color.RED);
					draw();
				}
				else
				{
					button_93.setBackground(Color.GREEN);
					try {DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());dataOutputStream.writeUTF("addscore");dataOutputStream.writeUTF(name);JOptionPane.showMessageDialog(null, "You Got 10 Score");	} catch (IOException e11) {e11.printStackTrace();btnNewButton.setBackground(Color.GREEN);					}JOptionPane.showMessageDialog(null, "Congrats You Won !!!!");System.exit(0);;  
				}
				
				
			}
		});
		button_93.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_93.setFocusable(false);
		button_93.setBackground(Color.WHITE);
		button_93.setBounds(194, 248, 51, 23);
		panel.add(button_93);
		
		JButton button_94 = new JButton("96");
		button_94.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (random>Integer.parseInt(button_94.getText()))
				{
					count++;
					button_94.setBackground(Color.YELLOW);
					draw();
				}
			
				else	if (random<Integer.parseInt(button_94.getText()))
				{
					count++;
					button_94.setBackground(Color.RED);
					draw();
				}
				else
				{
					button_94.setBackground(Color.GREEN);
					try {DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());dataOutputStream.writeUTF("addscore");dataOutputStream.writeUTF(name);JOptionPane.showMessageDialog(null, "You Got 10 Score");	} catch (IOException e11) {e11.printStackTrace();btnNewButton.setBackground(Color.GREEN);					}JOptionPane.showMessageDialog(null, "Congrats You Won !!!!");System.exit(0);;  
				}
				
			}
		});
		button_94.setToolTipText("96");
		button_94.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_94.setFocusable(false);
		button_94.setBackground(Color.WHITE);
		button_94.setBounds(243, 248, 51, 23);
		panel.add(button_94);
		
		JButton button_95 = new JButton("97");
		button_95.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (random>Integer.parseInt(button_95.getText()))
				{
					count++;
					button_95.setBackground(Color.YELLOW);
					draw();
				}
			
				else	if (random<Integer.parseInt(button_95.getText()))
				{
					count++;
					button_95.setBackground(Color.RED);
					draw();
				}
				else
				{
					button_95.setBackground(Color.GREEN);
					try {DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());dataOutputStream.writeUTF("addscore");dataOutputStream.writeUTF(name);JOptionPane.showMessageDialog(null, "You Got 10 Score");	} catch (IOException e11) {e11.printStackTrace();btnNewButton.setBackground(Color.GREEN);					}JOptionPane.showMessageDialog(null, "Congrats You Won !!!!");System.exit(0);;  
				}
				
			}
		});
		button_95.setToolTipText("97");
		button_95.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_95.setFocusable(false);
		button_95.setBackground(Color.WHITE);
		button_95.setBounds(292, 248, 51, 23);
		panel.add(button_95);
		
		JButton button_96 = new JButton("98");
		button_96.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (random>Integer.parseInt(button_96.getText()))
				{
					count++;
					button_96.setBackground(Color.YELLOW);
					draw();
				}
			
				else	if (random<Integer.parseInt(button_96.getText()))
				{
					count++;
					button_96.setBackground(Color.RED);
					draw();
				}
				else
				{
					button_96.setBackground(Color.GREEN);
					try {DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());dataOutputStream.writeUTF("addscore");dataOutputStream.writeUTF(name);JOptionPane.showMessageDialog(null, "You Got 10 Score");	} catch (IOException e11) {e11.printStackTrace();btnNewButton.setBackground(Color.GREEN);					}JOptionPane.showMessageDialog(null, "Congrats You Won !!!!");System.exit(0);;  
				}
			}
		});
		button_96.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_96.setFocusable(false);
		button_96.setBackground(Color.WHITE);
		button_96.setBounds(341, 248, 51, 23);
		panel.add(button_96);
		
		JButton button_97 = new JButton("99");
		button_97.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				if (random>Integer.parseInt(button_97.getText()))
				{
					count++;
					button_94.setBackground(Color.YELLOW);
					draw();
				}
			
				else	if (random<Integer.parseInt(button_97.getText()))
				{
					count++;
					button_97.setBackground(Color.RED);
					draw();
				}
				else
				{
					button_97.setBackground(Color.GREEN);
					try {DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());dataOutputStream.writeUTF("addscore");dataOutputStream.writeUTF(name);JOptionPane.showMessageDialog(null, "You Got 10 Score");	} catch (IOException e11) {e11.printStackTrace();btnNewButton.setBackground(Color.GREEN);					}JOptionPane.showMessageDialog(null, "Congrats You Won !!!!");System.exit(0);;  
				}
			}
		});
		button_97.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_97.setFocusable(false);
		button_97.setBackground(Color.WHITE);
		button_97.setBounds(386, 248, 51, 23);
		panel.add(button_97);
		
		JButton button_98 = new JButton("100");
		button_98.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
				
				
				if (random>Integer.parseInt(button_98.getText()))
				{
					count++;
					button_98.setBackground(Color.YELLOW);
					draw();
				}
			
				else	if (random<Integer.parseInt(button_98.getText()))
				{
					count++;
					button_98.setBackground(Color.RED);
					draw();
				}
				else
				{
					button.setBackground(Color.GREEN);thread.stop();thread.stop();
					try {DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());dataOutputStream.writeUTF("addscore");dataOutputStream.writeUTF(name);JOptionPane.showMessageDialog(null, "You Got 10 Score");	} catch (IOException e11) {e11.printStackTrace();btnNewButton.setBackground(Color.GREEN);thread.stop();					}JOptionPane.showMessageDialog(null, "Congrats You Won !!!!");System.exit(0);;  
				}
				
				
				
			}
		});
		button_98.setFont(new Font("Tahoma", Font.BOLD, 8));
		button_98.setFocusable(false);
		button_98.setBackground(Color.WHITE);
		button_98.setBounds(435, 248, 51, 23);
		panel.add(button_98);
		label.setIcon(new ImageIcon(".//images//box.png"));
		label.setBounds(643, 427, 307, 62);
		panel.add(label);
		
		lblNewLabel.setBounds(720, 248, 155, 112);
		panel.add(lblNewLabel);
		
		label_1.setBounds(736, 346, 22, 112);
		panel.add(label_1);
		
		label_2.setBounds(841, 346, 22, 112);
		panel.add(label_2);
		
		lblNewLabel_2.setBounds(726, 79, 181, 149);
		panel.add(lblNewLabel_2);
		
		lblNewLabel_1.setBounds(778, 193, 46, 73);
		panel.add(lblNewLabel_1);
		
		lblNewLabel_5.setBounds(643, 258, 96, 90);
		panel.add(lblNewLabel_5);
		
		label_4.setBounds(857, 270, 118, 73);
		panel.add(label_4);
		
		label_5.setBounds(718, 137, 46, 14);
		panel.add(label_5);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(959, 226, 405, -10);
		panel.add(separator);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.ORANGE);
		panel_1.setBounds(0, 0, 1370, 208);
		frame_1.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(132, 73, 192, 20);
		panel_1.add(textField);
		
		JLabel label_8 = new JLabel("UserName : ");
		label_8.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_8.setBounds(10, 79, 131, 14);
		panel_1.add(label_8);
		
		JLabel label_9 = new JLabel("Password :");
		label_9.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_9.setBounds(10, 104, 131, 14);
		panel_1.add(label_9);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(132, 103, 192, 20);
		panel_1.add(passwordField);
		
		button_99 = new JButton("LogIn\r\n");
		button_99.setBorder(new LineBorder(new Color(255, 0, 0)));
		button_99.setBackground(Color.WHITE);
		button_99.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
					dataOutputStream.writeUTF("login");
				
				
					dataOutputStream.writeUTF(textField.getText());
					dataOutputStream.writeUTF(passwordField.getText());
					
				String msg = new DataInputStream(socket.getInputStream()).readUTF();
				
				if (msg.equalsIgnoreCase("right")) {
					name=textField.getText();
					setEnableRec(panel, true);
					setEnableRec(panel_2, true);				}
				else
				{
					JOptionPane.showMessageDialog(null, msg);
				}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			
				try {
					DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
				
				dataOutputStream.writeUTF("credit");
				dataOutputStream.writeUTF(name);
				
		 credit = Integer.parseInt(new DataInputStream(socket.getInputStream()).readUTF());
		 
				
				
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				Runnable runnable = new Runnable() {
					
					@Override
					public void run() {
						System.out.println(credit);
						while(credit!=0)
						{
						label_10.setText(String.valueOf(credit));
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
				}
						
						Runnable runnable = new Runnable() {
							
							@Override
							public void run() {
								// TODO Auto-generated method stub
								try
								{
								DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
								dataOutputStream.writeUTF("delcredit");
								dataOutputStream.writeUTF(name);
								}catch (Exception e) {
									// TODO: handle exception
								}	
							}
						};
						
						new Thread(runnable).start();
						credit--;
						if (credit==0)
							System.exit(0);
						}
						
						//System.exit(0);
					}
				};
				
				new Thread(runnable).start();
			
			
					
			
			
			}
		});
		button_99.setBounds(117, 156, 125, 23);
		panel_1.add(button_99);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setForeground(Color.BLACK);
		separator_3.setBackground(Color.BLACK);
		separator_3.setOrientation(SwingConstants.VERTICAL);
		separator_3.setBounds(852, 0, 1, 208);
		panel_1.add(separator_3);
		
		btnNewButton_1 = new JButton("\r\n     User Registration \r\n\r\n");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			SignUp  signUp = new SignUp(socket);
			signUp.frame.setVisible(true);
			}
		});
		
		JLabel lblNewLabel_7 = new JLabel("( New User , click here to Register )\r\n");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_7.setBounds(1012, 122, 331, 14);
		panel_1.add(lblNewLabel_7);
		btnNewButton_1.setBounds(886, 41, 457, 122);
		panel_1.add(btnNewButton_1);
		
		JLabel lblNewLabel_8 = new JLabel("( Click here to fill PassWord ) ");
		lblNewLabel_8.setForeground(Color.BLACK);
		lblNewLabel_8.setBackground(Color.WHITE);
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_8.setBounds(505, 15, 264, 33);
		panel_1.add(lblNewLabel_8);
		
		JLabel lblEnterYourDetails = new JLabel("Enter your Details to SignIn");
		lblEnterYourDetails.setForeground(Color.BLACK);
		lblEnterYourDetails.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblEnterYourDetails.setBackground(Color.WHITE);
		lblEnterYourDetails.setBounds(10, 15, 314, 33);
		panel_1.add(lblEnterYourDetails);
		
		
		
		
        Random random = new Random();
        LinkedHashSet hashSet = new LinkedHashSet();

        int no = random.nextInt(10);


        for (int i=no; i<10; i++)
        {
            hashSet.add(i);
        }
        for (int i=0; i<no; i++)
        {
            hashSet.add(i);
        }
Object[] array = hashSet.toArray();
	
		
	JButton btnNewButton_2 = new JButton(String.valueOf(array[9]));
	btnNewButton_2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			
			passwordField.setText(passwordField.getText()+btnNewButton_2.getText());
			
		}
	});
		
		JButton button_103 = new JButton(String.valueOf(array[0]));
		button_103.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				passwordField.setText(passwordField.getText()+button_103.getText());

			}
		});
		button_103.setBounds(502, 59, 62, 23);
		panel_1.add(button_103);
		
		btnNewButton_2.setBounds(441, 59, 62, 23);
		panel_1.add(btnNewButton_2);
		JButton button_104 = new JButton(String.valueOf(array[1]));
		button_104.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				passwordField.setText(passwordField.getText()+button_104.getText());

			}
		});
		button_104.setBounds(624, 59, 62, 23);
		panel_1.add(button_104);
		
		JButton button_105 = new JButton(String.valueOf(array[2]));
		button_105.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				passwordField.setText(passwordField.getText()+button_105.getText());

			
			}
		});
		button_105.setBounds(563, 59, 62, 23);
		panel_1.add(button_105);
		
		JButton button_106 = new JButton(String.valueOf(array[3]));
		button_106.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				passwordField.setText(passwordField.getText()+button_106.getText());

			}
		});
		button_106.setBounds(502, 81, 62, 23);
		panel_1.add(button_106);
		
		JButton button_107 = new JButton(String.valueOf(array[4]));
		button_107.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				passwordField.setText(passwordField.getText()+button_107.getText());

			}
		});
		button_107.setBounds(441, 81, 62, 23);
		panel_1.add(button_107);
		
		JButton button_108 = new JButton(String.valueOf(array[5]));
		button_108.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				passwordField.setText(passwordField.getText()+button_108.getText());
			}
		});
		button_108.setBounds(624, 81, 62, 23);
		panel_1.add(button_108);
		
		JButton button_109 = new JButton(String.valueOf(array[6]));
		button_109.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				passwordField.setText(passwordField.getText()+button_109.getText());

			}
		});
		button_109.setBounds(563, 81, 62, 23);
		panel_1.add(button_109);
		
		JButton button_110 = new JButton(String.valueOf(array[7]));
		button_110.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				passwordField.setText(passwordField.getText()+button_110.getText());

			}
		});
		button_110.setBounds(683, 81, 62, 23);
		panel_1.add(button_110);
		
		JButton button_111 = new JButton(String.valueOf(array[8]));
		button_111.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				passwordField.setText(passwordField.getText()+button_111.getText());

			}
		});
		button_111.setBounds(683, 59, 62, 23);
		panel_1.add(button_111);
		
	
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(956, 209, 414, 500);
		frame_1.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(207, 0, 1, 265);
		panel_2.add(separator_2);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.BLACK);
		separator_1.setBounds(0, 263, 414, 2);
		panel_2.add(separator_1);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setForeground(Color.BLACK);
		separator_4.setOrientation(SwingConstants.VERTICAL);
		separator_4.setBounds(218, 0, 6, 265);
		panel_2.add(separator_4);
		
		JButton button_100 = new JButton("");
		button_100.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
				
				dataOutputStream.writeUTF("credit");
				
				dataOutputStream.writeUTF(name);
				
			JOptionPane.showMessageDialog(null, "Your Credit is :"+new DataInputStream(socket.getInputStream()).readUTF(), "Score", JOptionPane.INFORMATION_MESSAGE);	
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}		
			}
		});
		button_100.setIcon(new ImageIcon("./images/credit.jpg"));
		button_100.setToolTipText("Credit Refill");
		button_100.setOpaque(false);
		button_100.setFocusPainted(false);
		button_100.setContentAreaFilled(false);
		button_100.setBorderPainted(false);
		button_100.setBounds(61, 290, 319, 148);
		panel_2.add(button_100);
		
		JButton button_101 = new JButton("");
		button_101.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JFileChooser chooser = new JFileChooser();
				chooser.setCurrentDirectory(new File (System.getProperty("user.home") + "\\Desktop"));
				chooser.showOpenDialog(null);
				try
				{
								File song = new File(chooser.getSelectedFile().toString());
								FileInputStream songlocation = new FileInputStream(song);
				                Player player = new Player(songlocation);
				                
				                
				                AudioFile audioFile = AudioFileIO.read(song);
				                
				                
				        
				           Runnable songthread = new Runnable() {
					
							@Override
							public void run() {
								// TODO Auto-generated method stub
							     
						         try {
									player.play();
								} catch (JavaLayerException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
						         
						         	
							}
						};
				           
				         
				         Thread thread = new Thread(songthread);
				         thread.start();
				         
				
				
			}catch (Exception e1) {
				// TODO: handle exception
			}
			}
		});
		button_101.setIcon(new ImageIcon("./images/music.png"));
		button_101.setToolTipText("Play Music");
		button_101.setOpaque(false);
		button_101.setFocusPainted(false);
		button_101.setContentAreaFilled(false);
		button_101.setBorderPainted(false);
		button_101.setBounds(10, 70, 199, 148);
		panel_2.add(button_101);
		
		JButton button_102 = new JButton("");
		button_102.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
				
				dataOutputStream.writeUTF("score");
				dataOutputStream.writeUTF(name);
				
			JOptionPane.showMessageDialog(null, "Your Score is :"+new DataInputStream(socket.getInputStream()).readUTF(), "Score", JOptionPane.INFORMATION_MESSAGE);	
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
					
				
			}
		});
	
		
		

		
		
		button_102.setIcon(new ImageIcon("./images/viewscore.png"));
		button_102.setToolTipText("View Score");
		button_102.setOpaque(false);
		button_102.setFocusPainted(false);
		button_102.setContentAreaFilled(false);
		button_102.setBorderPainted(false);
		button_102.setBounds(230, 81, 161, 148);
		panel_2.add(button_102);
		
		setEnableRec(panel, false);
		
		
		label_10.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_10.setBounds(29, 11, 169, 24);
		panel.add(label_10);
		setEnableRec(panel_2, false);
//	}
	
	

	}

	
	
	public void draw() {
		
		if (count==10)
		{
		label.setIcon(null);
		label.revalidate();
		label.repaint();
		
		lblNewLabel_6.setIcon(new ImageIcon(".//images//hng.png"));
		lblNewLabel_6.revalidate();
		lblNewLabel_6.repaint();
		try
		{
		DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
		dataOutputStream.writeUTF("delcredit");
		dataOutputStream.writeUTF(name);
		}catch (Exception e) {
			// TODO: handle exception
		}
		JOptionPane.showMessageDialog(null, "Try Again", "Game Over", JOptionPane.WARNING_MESSAGE);
		
		
		
		}
			
			if(count==11)
			{
				JOptionPane.showMessageDialog(null, "Please Restart Game", "Game Over", JOptionPane.WARNING_MESSAGE);
			}
			
			
			if (count==7)
			{
			lblNewLabel.setIcon(new ImageIcon(".\\images\\stomach.png"));
			lblNewLabel.setBounds(720, 248, 155, 112);
	lblNewLabel.revalidate();
	lblNewLabel.repaint();
			}
			
			if (count==9)
			{
			label_1.setIcon(new ImageIcon(".\\images\\legs.png"));
			label_1.setBounds(736, 346, 22, 112);
	label_1.revalidate();
	label_1.repaint();
			label_2.setIcon(new ImageIcon(".\\images\\legs.png"));
			label_2.setBounds(841, 346, 22, 112);
			label_2.revalidate();
			label_2.repaint();
			
			}
			if (count==1)
			{
			lblNewLabel_2.setIcon(new ImageIcon(".\\images\\face.png"));
			lblNewLabel_2.setBounds(726, 79, 181, 149);
	lblNewLabel_2.revalidate();
	lblNewLabel_2.repaint();
			}
			
			if (count==2)
			{
				
				label_3.setIcon(new ImageIcon(".\\images\\neweyes.png"));
				label_3.setBounds(809, 123, 46, 14);
				
				label_3.revalidate();
				label_3.repaint();
				lblNewLabel_3.setIcon(new ImageIcon(".\\images\\neweyes.png"));
				lblNewLabel_3.setBounds(766, 123, 46, 14);
				
				lblNewLabel_3.revalidate();
				lblNewLabel_3.repaint();
			}
			if (count==3)
			{
				lblNewLabel_4.setIcon(new ImageIcon(".\\images\\newmouth.png"));
				lblNewLabel_4.setBounds(766, 173, 69, 23);
				lblNewLabel_4.revalidate();
				lblNewLabel_4.repaint();
			}
			
			
			if (count==4)
			{
				
				label_7.setIcon(new ImageIcon(".\\images\\nose.png"));
				label_7.setBounds(786, 148, 46, 14);
				label_7.revalidate();
				label_7.repaint();
			}
			if (count==5)
			{
				
				
				label_6.setIcon(new ImageIcon(".\\images\\newear.png"));
				label_6.setBounds(855, 132, 46, 14);
				
				label_6.revalidate();
				label_6.repaint();
				
				label_5.setIcon(new ImageIcon(".\\images\\newear.png"));
				label_5.setBounds(718, 137, 46, 14);
				label_5.revalidate();
				label_5.repaint();
				
			}
			
			if (count==6)
			{
				lblNewLabel_1.setIcon(new ImageIcon(".\\images\\neck.png"));
				lblNewLabel_1.setBounds(778, 193, 46, 73);

				lblNewLabel_1.revalidate();
				lblNewLabel_1.repaint();
				
			}
			
			if (count==8)
			
			
			{
				
				
				lblNewLabel_5.setIcon(new ImageIcon(".\\images\\newleft.png"));
				lblNewLabel_5.setBounds(643, 258, 96, 90);

				lblNewLabel_5.revalidate();
				lblNewLabel_5.repaint();
				label_4.setIcon(new ImageIcon(".\\images\\newright.png"));
				label_4.setBounds(857, 270, 118, 73);
			
			label_4.revalidate();
			label_4.repaint();
			
			}
			
			
			

			
			
			
			
			
		}
}
