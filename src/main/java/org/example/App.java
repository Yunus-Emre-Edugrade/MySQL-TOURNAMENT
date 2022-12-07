package org.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    static EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPersistence");


    public static void main( String[] args )
    {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et;
        List<People> listEmployee = null;
        try {
            et = em.getTransaction();
            et.begin();
            listEmployee = em.createQuery("FROM People").getResultList();

            // code



            et.commit();
        } catch (Exception e){
            em.close();
        }
        finally {
            em.close();
        }
        System.out.println( "Hello World!" );
        listEmployee.forEach(e-> System.out.println(e));
    }
}
