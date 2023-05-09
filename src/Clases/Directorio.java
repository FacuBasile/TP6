/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


/**
 *
 * @author H
 */
public class Directorio {
    private static Cliente cl;
    private static Map <Cliente ,String> clientes = new HashMap();

    public Directorio() {
        
    }
    
    
    /*
    ● agregarCliente() que permite registrar un nuevo cliente con su respectivo nro de
        teléfono. Siendo el nro del teléfono la clave del mismo.
    */
    
    
    public static boolean agregarCliente(String tel, Cliente cl){
        boolean agregado=false;
            
            if(!clientes.containsValue(tel)){
                clientes.put(cl, tel);
                agregado=true;
            }
                   
       
        
        
       return agregado;
    }
    
   /*
    ● buscarCliente() que en base al nro de teléfono retorna el Cliente asociado al
      mismo.
    */
    public static Cliente buscarCliente(String tel){
        
        
        Cliente clienteEncontrado=null;
        
        for (Map.Entry<Cliente, String> entry : clientes.entrySet()) {
            
            Cliente key = entry.getKey();
            String value = entry.getValue();
            
            if(entry.getValue().equals(tel)){
               
               clienteEncontrado=new Cliente(entry.getKey().dni,
                                             entry.getKey().nombre,
                                             entry.getKey().apellido,
                                             entry.getKey().direccion,
                                             entry.getKey().ciudad,
                                             entry.getValue());
               
                                                                    
              break;
            }
            
        }
        
        
        return clienteEncontrado;
    }
    
   // ● borrarCliente() que en base al número de teléfono elimina al cliente del directorio.
    public static boolean borrarCliente(String cl){
        boolean borrado=false;
        
                for (Map.Entry<Cliente, String> entry : clientes.entrySet()) {
            Cliente key = entry.getKey();
            String value = entry.getValue();
            
                if(entry.getValue().equals(cl)){
                    clientes.remove(entry.getKey());
                    borrado=true;
                }
            
        }
        
        
        
        return borrado;
    }
    
    //● buscarTeléfono() que en base a un apellido nos devuelve una lista con los nros de
     //teléfono asociados a dicho apellido.
    
    public static ArrayList<String> buscarTelefono(String apellido){
        
        ArrayList<String> telefonosAsociados= new ArrayList();
        
        for (Map.Entry<Cliente, String> entry : clientes.entrySet()) {
            
            Cliente key = entry.getKey();
            String value = entry.getValue();
            
            if(entry.getKey().apellido.equals(apellido)){
               
               telefonosAsociados.add(entry.getValue());
            }
            
        }
        return telefonosAsociados;
    }        
    
//    ● buscarClientes() que en base a una ciudad nos devuelve una lista con los Clientes
//    asociados a dicha ciudad.
    
    public static ArrayList<String> buscarClientes(String ciu){
         ArrayList <String> clientesCiudad = new ArrayList();
         
         
        for (Map.Entry<Cliente, String> entry : clientes.entrySet()) {
            
            Cliente key = entry.getKey();
            String value = entry.getValue();
            
            if(entry.getKey().getCiudad().equals(ciu)){
                
               
                
             
                clientesCiudad.add(entry.getValue());
                
            }   
        }  
       return clientesCiudad; 
    }  
}   

