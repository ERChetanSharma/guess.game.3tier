package graphical.guess.game.server;

import java.io.DataInputStream;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.jdbc.PreparedStatement;

public class ServerInput {
	
	
	Socket socket;
	public ServerInput(Socket socket) {
this.socket =  socket;
	
	
	}

	String checkScore()
	{
		String msg = null;
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = null;
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/userscore","root", "hackmyzone");

		java.sql.PreparedStatement preparedStatement = conn.prepareStatement("select overallscore from user where username=?");
		
		DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
		String name=dataInputStream.readUTF();
		preparedStatement.setString(1, name);
		
		ResultSet resultSet = preparedStatement.executeQuery();
		if (resultSet.next())
		{
			msg = String.valueOf(resultSet.getInt(1));
		
		}
		
		}catch (Exception e) {
msg=e.getMessage();
		
		}
		
		return msg;
	}
	
	String createUser()
	{
		String msg;
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = null;
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/userscore","root", "hackmyzone");

		java.sql.PreparedStatement preparedStatement = conn.prepareStatement("insert into user values(?,?,?,?)");
		DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
		preparedStatement.setString(1, dataInputStream.readUTF());
		preparedStatement.setString(2, dataInputStream.readUTF());
		preparedStatement.setInt(3, 0);
		preparedStatement.setInt(4, 0);
		
		preparedStatement.execute();
		msg="user created";
		}catch (Exception e) {
msg=e.getMessage();
		
		}
		
		return msg;
		
		
	}
	
	
	
	
String logIn()
{
	String msg;
	try
	{
	Class.forName("com.mysql.jdbc.Driver");
	Connection conn = null;
	conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/userscore","root", "hackmyzone");

	java.sql.PreparedStatement preparedStatement = conn.prepareStatement("select * from user where username=? and password=?");
	DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
	preparedStatement.setString(1, dataInputStream.readUTF());
	preparedStatement.setString(2, dataInputStream.readUTF());
	ResultSet resultSet = preparedStatement.executeQuery();
	if (resultSet.next())
	{
		msg="right";
	}else
	{
		msg="wrong";
	}
	
	}catch (Exception e) {
msg=e.getMessage();
	
	}
	
	
	return msg;
}
	
	void addScore()
	{
		String msg = null;
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = null;
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/userscore","root", "hackmyzone");
		java.sql.PreparedStatement preparedStatement = conn.prepareStatement("select overallscore,credit from user where username=?");
		
		DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
		String name=dataInputStream.readUTF();
		preparedStatement.setString(1, name);
		
		ResultSet resultSet = preparedStatement.executeQuery();
		if (resultSet.next())
		{
			int overallscore = resultSet.getInt(1);
			int credit = resultSet.getInt(2);
			overallscore+=10;
			credit++;
			conn.close();
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/userscore","root", "hackmyzone");
			java.sql.PreparedStatement preparedStatement2 = connection.prepareStatement("update  user set overallscore=? ,credit=? where username=?");	
	preparedStatement2.setInt(1, overallscore);
	preparedStatement2.setInt(2, credit);
	preparedStatement2.setString(3, name);
			preparedStatement2.executeUpdate();
		}
		
		}catch (Exception e) {
	msg=e.getMessage();
		
		}
	
	}
	
	
String credit()
{
	String msg = null;
	try
	{
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
		msg = String.valueOf(credit+1);
		credit++;
		conn.close();
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/userscore","root", "hackmyzone");
		java.sql.PreparedStatement preparedStatement2 = connection.prepareStatement("update  user set credit=? where username=?");	
preparedStatement2.setInt(1, credit);
preparedStatement2.setString(2, name);
		preparedStatement2.executeUpdate();
	}
	
	}catch (Exception e) {
msg=e.getMessage();
	
	}
	System.out.println(msg);
	return msg;
}



String Chkcredit()
{
	String msg = null;
	try
	{
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
		msg = String.valueOf(credit+1);
		
	}
	
	}catch (Exception e) {
msg=e.getMessage();
	
	}
	System.out.println(msg);
	return msg;
}



















	
	
	
	
	
	
}
