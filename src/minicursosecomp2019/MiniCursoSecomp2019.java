/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minicursosecomp2019;

import controllers.ControllerCategoria;
import controllers.HibernateUtil;
import java.util.List;
import javax.swing.JOptionPane;
import models.Categoria;
import models.Marca;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author renato
 */
public class MiniCursoSecomp2019 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*Categoria cat = new Categoria();
        cat.setDescricao("HD");
        
        if (new ControllerCategoria().salvar(cat)){
            JOptionPane.showMessageDialog(null, "Categoria salva com sucesso!");
        }else{
            JOptionPane.showMessageDialog(null, "Houve um erro ao salvar a categoria");
        }*/
        
        /*Marca m = new Marca();
        m.setDescricao("Multilaser");*/
        /*while (JOptionPane.showConfirmDialog(null, 
                "Deseja inserir uma categoria?") == JOptionPane.YES_OPTION){
            Categoria cat = new Categoria();
            cat.setDescricao(JOptionPane.showInputDialog("Informe a categoria:"));
            Session s = HibernateUtil.getSessionFactory().getCurrentSession();
            Transaction ts = s.beginTransaction();
            //Categoria c = (Categoria)s.get(Categoria.class, 2);
            //s.delete(c);
            //c.setDescricao("Mouse");
            s.saveOrUpdate(cat);
            ts.commit();
        }*/
        
        /*Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction ts = s.beginTransaction();
        List<Categoria> lista = s.createQuery("from Categoria").list();
        ts.commit();
        
        for (Categoria categoria : lista) {
            System.out.println(categoria.getDescricao());
        }*/
    }
    
}
