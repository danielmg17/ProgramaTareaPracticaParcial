/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelos.ModelPersonas;
import Vistas.frmPersonas;
import Vistas.frmPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author umg
 */
public class PersonasController implements ActionListener {
    frmPrincipal VistaPrincipal;
    frmPersonas VistaPersonas;
    ModelPersonas PersonasModelo;

    public PersonasController(frmPrincipal VistaPrincipal, frmPersonas VistaPersonas, ModelPersonas PersonasModelo) {
        this.VistaPrincipal = VistaPrincipal;
        this.VistaPersonas = VistaPersonas;
        this.PersonasModelo = PersonasModelo;
        
        this.VistaPrincipal.btnAgregar.addActionListener(this);
        this.VistaPrincipal.btnListar.addActionListener(this);
        
        this.VistaPrincipal.setLocationRelativeTo(null);
        this.VistaPrincipal.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.VistaPrincipal.btnAgregar){
           if(this.VistaPersonas.jtbPersonas.getColumnCount()==0)
            {
                this.VistaPersonas.jtbPersonas.setModel(this.PersonasModelo.nomColumna());
            }
           
           
            this.PersonasModelo.IngresarPaciente(this.VistaPrincipal.txtApellidos.getText(), this.VistaPrincipal.txtNombre.getText(),
            this.VistaPrincipal.txtTelefono.getText());
            
            //this.VistaPersonas.jtbPersonas.setModel(this.PersonasModelo.ListarPacientes());
        }
        
        if(e.getSource() == this.VistaPrincipal.btnListar){
            this.VistaPersonas.jtbPersonas.setModel(this.PersonasModelo.ListarPacientes());
            this.VistaPersonas.setVisible(true);
        }
        
    }

}
