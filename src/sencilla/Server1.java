package sencilla;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintWriter out = null;
		try (ServerSocket server = new ServerSocket(9090);){
			server.setSoTimeout(100_000);
			System.out.println("Esperando conexión del cliente....");
			while(true){
				Socket socket = server.accept();
				 out = new PrintWriter(
						new OutputStreamWriter(
								socket.getOutputStream()));
				out.println("Hola cliente");
				out.flush();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (out != null) out.close();
		}
		

	}

}
