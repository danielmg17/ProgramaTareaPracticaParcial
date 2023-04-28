/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author umg
 */
public class ModelPersonas {
    
    
     DefaultTableModel ModeloTabla = new DefaultTableModel();
     
    ArrayList MiLista = new ArrayList<String>();
    
        public void IngresarPaciente(String ape, String nom, String tel)
    {
        ClasePersona nuevoPersona = new ClasePersona(ape, nom, tel);
        MiLista.add(nuevoPersona);        
    }
    
    public DefaultTableModel ListarPacientes()
    {             
        ArrayList <ClasePersona> ListaLocal=MiLista;
        for(ClasePersona MiListaPersona: ListaLocal)
        {
            //System.out.println(MiListaDePacientes.getApellidos());
            ModeloTabla.addRow(new Object[]{MiListaPersona.getApellidos(), MiListaPersona.getNombre(),
            MiListaPersona.getTelefono()});
        }
        
        return ModeloTabla;            
    }
    
    public DefaultTableModel nomColumna()
    {         
        ModeloTabla.addColumn("APELLIDOS");
        ModeloTabla.addColumn("NOMBRE");
        ModeloTabla.addColumn("TELEFONO");
       
        return ModeloTabla;
    }
}
