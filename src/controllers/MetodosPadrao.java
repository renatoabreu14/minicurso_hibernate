/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

/**
 *
 * @author renato
 */
public interface MetodosPadrao {
    
    public boolean salvar(Object o);
    
    public boolean excluir(Object o);
    
    public Object localizar(int id);
    
}
