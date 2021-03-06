package modelo;

public class Cliente {
private String runCliente;
private String nombreCliente;
private String apellidoCliente;
private String aniosCliente;
private CategorķaEnum nombreCategoria;
public Cliente(String runCliente, String nombreCliente, String apellidoCliente, String aniosCliente,
		CategorķaEnum nombreCategoria) {
	super();
	this.runCliente = runCliente;
	this.nombreCliente = nombreCliente;
	this.apellidoCliente = apellidoCliente;
	this.aniosCliente = aniosCliente;
	this.nombreCategoria = nombreCategoria;
}
public String getRunCliente() {
	return runCliente;
}
public void setRunCliente(String runCliente) {
	this.runCliente = runCliente;
}
public String getNombreCliente() {
	return nombreCliente;
}
public void setNombreCliente(String nombreCliente) {
	this.nombreCliente = nombreCliente;
}
public String getApellidoCliente() {
	return apellidoCliente;
}
public void setApellidoCliente(String apellidoCliente) {
	this.apellidoCliente = apellidoCliente;
}
public String getAniosCliente() {
	return aniosCliente;
}
public void setAniosCliente(String aniosCliente) {
	this.aniosCliente = aniosCliente;
}
public CategorķaEnum getNombreCategoria() {
	return nombreCategoria;
}
public void setNombreCategoria(CategorķaEnum nombreCategoria) {
	this.nombreCategoria = nombreCategoria;
}
@Override
public String toString() {
	return "Cliente [runCliente=" + runCliente + ", nombreCliente=" + nombreCliente + ", apellidoCliente="
			+ apellidoCliente + ", aniosCliente=" + aniosCliente + ", nombreCategoria=" + nombreCategoria + "]";
}


}
