package sencilla;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class Reloj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String HOST = "time.nist.gov";
		final int PORT = 13;
		try (Socket socket = new Socket(HOST, PORT);
			 BufferedReader in = new BufferedReader(
				 new InputStreamReader(socket.getInputStream()));){
			 String linea;
			 while ((linea = in.readLine()) != null)
				 System.out.println(linea);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
