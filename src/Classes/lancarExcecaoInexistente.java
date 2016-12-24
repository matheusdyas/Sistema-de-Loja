/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import javax.swing.JOptionPane;

/**
 *
 * @author loren
 */
public class lancarExcecaoInexistente {
    
    private Produto p;
    
    public void verificaSeExiste(Produto p) throws ProdutoInexistente{
        if(p != null && p.getNome().length()>0 && p.getDescricao().length() > 0 
                && p.getPrecoCusto()>0 && p.getPrecoVenda()>0){
            JOptionPane.showMessageDialog(null, "Produto cadastrado!");
        }else
            throw new ProdutoInexistente(p);
    }
}
