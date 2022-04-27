package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Usuario;

public class Demo04 {

	public static void main(String[] args) {
		// obtener los datos de un usuario, seg�n el c�digo
		
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mysql");
		EntityManager em = fabrica.createEntityManager();
       // empezo la transacci�n
		em.getTransaction().begin();
        
		
		Usuario u = em.find(Usuario.class, 3);
		System.out.println(u);
		
		// confirmar la transacci�n
		em.getTransaction().commit();
		em.close();
	}
}
