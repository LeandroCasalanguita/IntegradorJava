
package Controller;

import Model.OradorModel;
import java.util.List;


public class OradorController {
    
    OradorModel oradorModel;

    public OradorController() {
        this.oradorModel = new OradorModel();
    }
    
    public void guardar(String nombre, String apellido, String email, String tema) {

        Orador orador = new Orador();
        orador.setNombre(nombre);
        orador.setApellido(apellido);
        orador.setEmail(email);
        orador.setTema(tema);

        oradorModel.insertOrador(orador);
    }
    
    public void modOrador(Orador orador, String nombre, String apellido, String email, String tema) {
        orador.setNombre(nombre);
        orador.setApellido(apellido);
        orador.setEmail(email);
        orador.setTema(tema);
        
        oradorModel.modOrador(orador);
    }

    public Orador getOrador(int id) {
        return oradorModel.getOrador(id);
    }
    
    public List<Orador> cargarOradores() {
        return oradorModel.getOradores();
    }

    public void borrarOrador(int id) {
        oradorModel.borrarOrador(id);
    }
    
}
