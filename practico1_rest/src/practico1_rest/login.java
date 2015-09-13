package practico1_rest;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.ws.rs.*;
import javax.ws.rs.core.*;

import com.ejb.entities.User;

@Path("/save")
public class login {
	@POST
	@Consumes("application/JSON")
	public void createUser( User userData ){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("practico1.ejb");
		EntityManager em = emf.createEntityManager();
		
		if(userData.equals(null)){
			throw new WebApplicationException(Response.Status.NOT_FOUND);
		}
		
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(userData);
		tx.commit();
		
		em.close();
		emf.close();
		}
}
