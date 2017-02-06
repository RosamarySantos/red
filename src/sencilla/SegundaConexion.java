package sencilla;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SegundaConexion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			URL url = new URL("http://www.iesvirgendelcarmen.com");
			URLConnection conexion = url.openConnection();
			//obtener las cabeceras 
			//public Map<String,List<String>> getHeaderFields()
			Map<String,List<String>> cabeceras = conexion.getHeaderFields();
			//recorremos ese Map cabeceras
			for (Entry<String, List<String>> entry : cabeceras.entrySet()) {
			    System.out.println(entry.getKey() + ": " + entry.getValue());
			}
			BufferedReader in = new BufferedReader(
					new InputStreamReader(
							conexion.getInputStream()));
			String linea;
			while ((linea = in.readLine()) != null)
				System.out.println(linea);
		//	conexion.get
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
