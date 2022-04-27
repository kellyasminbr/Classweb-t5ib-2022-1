package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Usuario;

public class Demo02 {
      
	public static void main(String[] args) {
		//actualizar los datos de un usuario
		Usuario u = new Usuario(3, "Carla", "Toro", "U002@Gmail.com", "10002", 
				"2022-03-24", 2, 1);
       
	   //grabar en la tabla --->JPA
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mysql");
		EntityManager em = fabrica.createEntityManager();
       // empezo la transacción
		em.getTransaction().begin();
        //proceso --> Actualizar en la tabla (entidad)
		em.merge(u); // actualiza si existe el codigo pero si no existe,lo inserta
		// confirmar la transacción
		em.getTransaction().commit();
		em.close();

	}
}
