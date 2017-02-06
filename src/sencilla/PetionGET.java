package sencilla;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class PetionGET {

	public static void main(String[] args) {
		final String HOST = "www.iesvirgendelcarmen.com";
		final int PORT = 80;
		try (Socket socket = new Socket(HOST, PORT);
			BufferedReader in = new BufferedReader(
					 new InputStreamReader(socket.getInputStream()));
			PrintWriter out = new PrintWriter(new OutputStreamWriter(
					socket.getOutputStream()));)
		{
			//pasamos los parámetros al socket
			out.write("GET / HTTP/1.1\n"); //importante el salto de línea
			out.write("Host:"+HOST+"\n\n"); // importante los dos saltos de línea
			out.flush();
			//recibimos los parámetros
			String linea;
			while ((linea = in.readLine()) != null)
				System.out.println(linea);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
