package proyecto;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class InterfazRegistro extends JFrame{
	JLabel labelNombre , labelEdad, labelCodigo;
	JButton registrar, cancelar;
	Container contenedor;
	JPanel panelInfo, panelBotones;
	JTextField tNombre, tEdad, tCodigo;
	
	public InterfazRegistro(){
		// Creación de componentes
		this.labelNombre = new JLabel("Nombre:");
		this.labelEdad = new JLabel("Edad:");
		this.labelCodigo = new JLabel("Codigo:");
		this.registrar = new JButton("Registrar");
		this.cancelar = new JButton("Cancelar");
		this.tNombre = new JTextField();
		this.tEdad = new JTextField();
		this.tCodigo = new JTextField();
		// Creación de contenedores
		this.panelInfo = new JPanel(new GridLayout(3, 2));
		this.panelBotones = new JPanel();
		// Adición de componentes.
		this.panelInfo.add(labelNombre);
		this.panelInfo.add(tNombre);
		this.panelInfo.add(labelEdad);
		this.panelInfo.add(tEdad);
		this.panelInfo.add(labelCodigo);
		this.panelInfo.add(tCodigo);
		this.panelBotones.add(registrar);
		this.panelBotones.add(cancelar);
		
		this.contenedor = getContentPane();
		this.contenedor.setLayout(new BorderLayout());
		this.contenedor.add(panelInfo, BorderLayout.CENTER);
		this.contenedor.add(panelBotones, BorderLayout.SOUTH);

        setTitle("Registro");
        setSize(400, 250);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		InterfazRegistro registro = new InterfazRegistro();
		LogicaCliente logicacliente = new LogicaCliente();
		
	}
	
	
}
