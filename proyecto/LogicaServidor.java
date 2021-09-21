package proyecto;

import java.awt.Container;
import java.awt.FlowLayout;
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class LogicaServidor extends JFrame{
	private ServerSocket servidor;
	private Socket conexion;
	
	private ObjectOutputStream salida;
	private ObjectInputStream entrada;
	
	JTextArea area;
	Container contenedor;
		public LogicaServidor() {
		
			JPanel panel = new JPanel();
			JTextArea area = new JTextArea(15, 30);
			contenedor = getContentPane();
			contenedor.setLayout(new FlowLayout());
			panel.add(area);
			contenedor.add(panel);
			setTitle("Info Servidor");
			setSize(400, 250);
			setVisible(true);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		
	public void ejecutarServidor() {
		try {
			this.servidor = new ServerSocket(12345, 10);
			while(true) {
				area.setText("Esperando una petición\n");
				conexion = servidor.accept();
				area.setText("Conexión lograda:" + conexion.getInetAddress().getHostName());
				
				salida = new ObjectOutputStream(conexion.getOutputStream());
                salida.flush();
                
                entrada = new ObjectInputStream(conexion.getInputStream());
                procesarConexion();
			}
		}
		catch(IOException IOException) {
			area.setText("Fracasó la conexión.\n");
		}
		
	}
	
	public void procesarConexion() {
		
	}
	
}
	
	
	
