package controles;

import Classes.Clientes;
import Classes.Produto;


/**
 *
 * @author lucas
 */
public class ControlarCadastro {
    
    public boolean cadastroClientes(Clientes c){
        
        boolean x = false;
        
        if(c != null && c.getNome().length()>0 && c.getEndereco().length()>0 && c.getTelefone().length()==11){
            return true;
        }
        return x;
    }

}
