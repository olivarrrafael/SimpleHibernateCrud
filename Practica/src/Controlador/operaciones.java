
package Controlador;

import Modelo.TablaEjemplo;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class operaciones {
    
    public void altaUsuarios(TablaEjemplo user){
        
        SessionFactory Missesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = Missesion.openSession();
        Transaction tx=session.beginTransaction();
        session.save(user);
        tx.commit();
        session.close();
        JOptionPane.showMessageDialog(null,"El dato fue grabado correctamente");
                
    }
    
        public void bajaUsuarios(TablaEjemplo user){
        
        SessionFactory Missesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = Missesion.openSession();
        Transaction tx=session.beginTransaction();
        session.delete(user);
        tx.commit();
        session.close();
        JOptionPane.showMessageDialog(null,"El dato fue eliminado");
                
    }
    
}
