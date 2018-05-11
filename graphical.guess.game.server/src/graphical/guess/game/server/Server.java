package graphical.guess.game.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {


	public static void main(String[] args) {
System.out.println("**********Server Start**********");
		try {
			ServerSocket serverSocket = new ServerSocket(10);
			Socket socket;
			
			while (true) {
			
			socket = serverSocket.accept();
			ServerLogic logic = new ServerLogic(socket);
			Thread thread = new Thread(logic);
			thread.start();
				
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
