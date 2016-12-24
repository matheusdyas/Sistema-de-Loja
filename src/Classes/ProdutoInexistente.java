/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author loren
 */
public class ProdutoInexistente extends Exception{
    
    private Produto p;
    
    public ProdutoInexistente(Produto p){
        this.p = p;
    }
    
    @Override
    public String getMessage(){
        return "Produto não pode ser adicionado!\n      →Verifique se os preços não estao zerados ou menores que zero.";
    }
    
}
