package jpademoo;
import jakarta.persistence.EntityManager;
public class Main{
	public static void main(String[]args) {
		EntityManager em=JPAUtil.getEntityManager();
		em.getTransaction().begin();
		Employee emp1=new Employee("asif","Student",200);
		em.persist(emp1);
		em.getTransaction().commit();
		em.close();
		JPAUtil.close();
	}
}