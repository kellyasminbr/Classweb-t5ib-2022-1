package app;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.Usuario;

public class Login {
	
	public static void main(String[] args) {
		
		
	   EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mysql");
	   EntityManager em = fabrica.createEntityManager();
	    
			
			// select * from tb_usuarios where id_tipo= 1
	       Query consulta = em.createNativeQuery("{call usp_validaAcceso(:usuario, :clave)}", Usuario.class);
	       consulta.setParameter("usuario", "U001@gmail.com");
	       consulta.setParameter("clave", "10001");
	       
	       Usuario u  =(Usuario) consulta.getSingleResult(); //GETSINL.. TE DEVUELVE UN VALOR
	       
	       if (u== null) {
	    	   System.err.println("usuario o clave incorrecto");
	     }else {
	    	 System.out.println("Bienvenido...");
	     }
	       
	       em.close();
	}

	     
	
	
	
    
}

