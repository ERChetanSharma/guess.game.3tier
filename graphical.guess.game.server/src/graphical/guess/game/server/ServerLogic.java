package graphical.guess.game.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class ServerLogic implements Runnable {
	Socket socket;
	String chk="";
	int test=0;
	public ServerLogic(Socket socket) {
this.socket=socket;
	}
	DataInputStream dataInputStream ;
	@Override
	public void run() {
ServerInput input = new ServerInput(socket);
		try {
		dataInputStream 		= new DataInputStream(socket.getInputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		while (!chk.equalsIgnoreCase("stop"))
		{
			if (!socket.isConnected())
			{
				System.out.println(socket+"is disconnected");
Thread.currentThread().stop();

			}
			
			try {
				chk = dataInputStream.readUTF();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.print(socket);
				e.printStackTrace();
				
	Thread.currentThread().stop();

				
			}

			if (chk.equalsIgnoreCase("create"))
			{

			try {
				new DataOutputStream(socket.getOutputStream()).writeUTF(input.createUser());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				Thread.currentThread().stop();
			}
			
			}
			
			
			if (chk.equalsIgnoreCase("login"))
			{
				try {
					new DataOutputStream(socket.getOutputStream()).writeUTF(input.logIn());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					Thread.currentThread().stop();
				}				
			}
		 if (chk.equalsIgnoreCase("score"))
			{
			
			 
			 try {
					new DataOutputStream(socket.getOutputStream()).writeUTF(input.checkScore());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					Thread.currentThread().stop();
				} 
			 
			 
			}
		 if (chk.equalsIgnoreCase("delcredit"))
			{
			
		
			
			try { 
			 
			 Class.forName("com.mysql.jdbc.Driver");
				Connection conn = null;
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/userscore","root", "hackmyzone");
				java.sql.PreparedStatement preparedStatement = conn.prepareStatement("select credit from user where username=?");
				
				DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
				String name=dataInputStream.readUTF();
				preparedStatement.setString(1, name);
				
				ResultSet resultSet = preparedStatement.executeQuery();
				if (resultSet.next())
				{
					int credit = resultSet.getInt(1);
					if (credit>0)
					{
					credit-=2;
					conn.close();
					Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/userscore","root", "hackmyzone");
					
					java.sql.PreparedStatement preparedStatement2 = connection.prepareStatement("update  user set credit=? where username=?");	
			preparedStatement2.setInt(1, credit);
			preparedStatement2.setString(2, name);
					preparedStatement2.executeUpdate();
					}
				}
				}catch (Exception e) {
			e.getMessage();
				
				}
			
				
			 
			
			 
			 
			 
			 
			 
			 
			 
			 
			}
			
		 if (chk.equalsIgnoreCase("addscore"))
			{
			
			 
			 try {
				input.addScore();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					Thread.currentThread().stop();
				} 
			 
			 
			}
		
		
		 if (chk.equalsIgnoreCase("credit"))
			{
		
			 try {
					new DataOutputStream(socket.getOutputStream()).writeUTF(input.credit());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					Thread.currentThread().stop();
				} 
			 
			 
			}
		 
		
		
		 if (chk.equalsIgnoreCase("chkcredit"))
			{
		
			 try {
					new DataOutputStream(socket.getOutputStream()).writeUTF(input.Chkcredit());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					Thread.currentThread().stop();
				} 
			 
			 
			}
		
		
		}
			
			
	
		
		
		
		
	}

	}
