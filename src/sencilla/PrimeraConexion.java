package sencilla;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class PrimeraConexion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			URL url = new URL("http://www.iesvirgendelcarmen.com");
			BufferedReader in = new BufferedReader(
					new InputStreamReader(
							url.openStream()));
			String linea;
			while ((linea = in.readLine()) != null)
				System.out.println(linea);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
