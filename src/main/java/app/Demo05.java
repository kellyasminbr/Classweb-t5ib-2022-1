package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Usuario;

public class Demo05 {
      public static void main(String[] args) {
		//eliminar version 2 --> usando busqueda
    	  
    	EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mysql");
  		EntityManager em = fabrica.createEntityManager();
         // empezo la transacción
  		em.getTransaction().begin();
          //proceso --> Eliminar un usuario
  		//Forma 1. borrado logico --> no lo borras, soo cambias algun estado, flag
  		 
  		//Forma 2. borrado fisico --> borra el registro
  		Usuario u = em.find(Usuario.class, 15);
  		if (u == null)
  			System.out.println("Código NO existe");
  			else {
  		       em.remove(u);
  		       System.out.println("Usuario ELIMINADO...!");
  			}
  		
  		// confirmar la transacción
  		em.getTransaction().commit();
  		em.close();
	}
}
