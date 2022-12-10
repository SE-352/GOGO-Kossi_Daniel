
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("Hello World!");
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Tp-3");
        EntityManager em = emf.createEntityManager();
        
        EntityTransaction etr = em.getTransaction();
        etr.begin();
        
        etr.commit();
        em.close();
        emf.close();
	}

} 
