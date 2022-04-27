package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Demo03 {

	public static void main(String[] args) {
		//eliminar un usuario
		
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mysql");
		EntityManager em = fabrica.createEntityManager();
       // empezo la transacción
		em.getTransaction().begin();
        //proceso --> Eliminar un usuario
		//Forma 1. borrado logico --> no lo borras, soo cambias algun estado, flag
		 
		//Forma 2. borrado fisico --> borra el registro
		//Usuario u = new Usuario(3,"Carla","Toro","");
		//u.setCodigo(15);
		//em.remove(u);
		
		// confirmar la transacción
		em.getTransaction().commit();
		em.close();
	}
}
