/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.List;
import models.Categoria;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author renato
 */
public class ControllerCategoria implements MetodosPadrao{

    @Override
    public boolean salvar(Object o) {
        try{
            Session s = HibernateUtil.getSessionFactory().getCurrentSession();
            Transaction ts = s.beginTransaction();
            s.saveOrUpdate((Categoria)o);
            ts.commit();
            return true;
        }catch(Exception ex){
            return false;
        }
    }

    @Override
    public boolean excluir(Object o) {
        try{
            Session s = HibernateUtil.getSessionFactory().getCurrentSession();
            Transaction ts = s.beginTransaction();
            s.delete((Categoria)o);
            ts.commit();
            return true;
        }catch(Exception ex){
            return false;
        }
    }

    @Override
    public Object localizar(int id) {
        try{
            Session s = HibernateUtil.getSessionFactory().getCurrentSession();
            Transaction ts = s.beginTransaction();
            Categoria c = (Categoria)s.get(Categoria.class, id);
            ts.commit();
            return c;
        }catch(Exception ex){
            return null;
        }
    }

    @Override
    public List<Object> trazerTudo() {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction ts = s.beginTransaction();
        List<Object> lista = s.createQuery("from Categoria").list();
        ts.commit();
        return lista;
    }
    
    
    
}
