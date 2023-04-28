
import Controlador.PersonasController;
import Modelos.ModelPersonas;
import Vistas.frmPersonas;
import Vistas.frmPrincipal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author umg
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        frmPrincipal vista = new frmPrincipal();
        frmPersonas vistaPerso = new frmPersonas(null, true);
        ModelPersonas modelo = new ModelPersonas();
        
        PersonasController Controlador= new PersonasController(vista,vistaPerso, modelo);
    }
    
}
