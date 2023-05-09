/*
 Un directorio telefónico posee una lista de Clientes de los que interesa conocer su dni,
nombre, apellido, ciudad y dirección.
El directorio telefónico posee además las siguientes funcionalidades:
● agregarCliente() que permite registrar un nuevo cliente con su respectivo nro de
teléfono. Siendo el nro del teléfono la clave del mismo.
● buscarCliente() que en base al nro de teléfono retorna el Cliente asociado al
mismo.
● buscarTeléfono() que en base a un apellido nos devuelve una lista con los nros de
teléfono asociados a dicho apellido.
● buscarClientes() que en base a una ciudad nos devuelve una lista con los Clientes
asociados a dicha ciudad.
● borrarCliente() que en base al número de teléfono elimina al cliente del directorio.
Importante: Armar el modelo UML representado las clases necesarias. Implementar en java.
Vistas sugeridas para las funcionalidades (utilice JInternalFrame y que sean
accedidas desde un menú principal): AgregarClientes, BuscarCliente y BorrarCliente.
 */
package Clases;

/**
 *
 * @author H
 */
public class Cliente {
    protected String dni;
    protected String nombre;
    protected String apellido;
    protected String direccion;
    protected String ciudad;
    protected String nro;

    public Cliente() {
    }

    public Cliente(String dni, String nombre, String apellido, String direccion, String ciudad) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.ciudad = ciudad;
    }
    
    

    public Cliente(String dni, String nombre, String apellido, String direccion, String ciudad,String nro) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.nro=nro;
    }

    public String getNro() {
        return nro;
    }

    public void setNro(String nro) {
        this.nro = nro;
    }
    
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return nombre+" "+ apellido+" "+ dni;
    }
    
    
    
    
    
    
}
