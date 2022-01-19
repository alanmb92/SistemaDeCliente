package vista;

import java.util.Scanner;

public class Menu {
//private ClienteServicio clienteServicio;
//private ArchivoSservicio archivoServicio;
//private ExportarCsv exportarCsv;
	private String filename = "Clientes";
	private String filename1 = "DBClientes.csv";
	private Scanner scanner;

	public void iniciarMenu() {
		// menu principal
		System.out.println("Ingrese una opcion");
		System.out.println(" 1.listarCliente.\r\n" + " 2.agregarCliente.\r\n" + " 3.editarCliente.\r\n"
				+ " 4.importarDatos.\r\n" + " 5.exportarDatos.\r\n" + " 6.terminarPrograma.\r\n" + "");
	}

	public void listarCliente() {

	}

	public void agregarCliente() {
		System.out.println("-------------Crear Cliente-------------");
		System.out.println("Ingrese RUN del Cliente");
		System.out.println("Ingrese nombre del Cliente");
		System.out.println("Ingrese apellido del cliente");
		System.out.println("Ingrese años como cliente");
	}

	public void editarCliente() {

	}

	public void cargarDatos() {

	}

	public void exportarDatos() {

	}

	public void terminarPrograma() {

	}
}
