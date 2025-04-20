package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		

//		Pessoa p1 = new Pessoa(null, "Carlos da Silva", "carlos@gmail.com");
//		Pessoa p2 = new Pessoa(null, "Roberto da Silva", "roberto@gmail.com");
//		Pessoa p3 = new Pessoa(null, "Jose da Silva", "jose@gmail.com");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
//		Para buscar dados!
//		Pessoa p = em.find(Pessoa.class, 2);
//		System.out.println(p);
		
//		Para persistir dados!
//		em.getTransaction().begin();
//		em.persist(p1);
//		em.persist(p2);
//		em.persist(p3);
//		em.getTransaction().commit();
		
		System.out.println("End!!!");
		
		em.close();
		emf.close();
		
//		System.out.println(p1);
//		System.out.println(p2);
//		System.out.println(p3);

	}

}
