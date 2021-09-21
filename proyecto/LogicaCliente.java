package proyecto;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;

public class LogicaCliente {
	private ObjectOutputStream salida; 
    private ObjectInputStream entrada;
    private Socket cliente;
    
    public void conectar(String direccion) {
    	try {
    		cliente = new Socket(direccion, 12345);
    		
    		this.entrada = new ObjectInputStream(cliente.getInputStream());
            this.salida = new ObjectOutputStream(cliente.getOutputStream());
            this.salida.flush();
    	} catch (UnknownHostException ex) {
            System.out.println("UnknownHostException: "+ ex.getMessage());
        } catch (IOException ex) {
            System.out.println("IOException: "+ ex.getMessage());
        }
    }
    
    public void registrarUsuario(String nombre, int edad, int codigo) {
    	ArrayList<>
    }
    
}
