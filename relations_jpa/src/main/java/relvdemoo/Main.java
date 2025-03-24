package relvdemoo;

import jakarta.persistence.EntityManager;



class Main{
	public static void main(String[] args) {
		EntityManager em=JPAUtil.getEntityManager();
		
		em.getTransaction().begin();
		Author author=new Author("J.K.Rowling");
		Book book1=new Book("Harry Potter and the Sorcerer's Stone");
		Book book2=new Book("Harry Potter and the Chamber of Secrets");
		author.addBook(book1);
		author.addBook(book2);
		em.persist(author);
		em.getTransaction().commit();
		em.close();
		JPAUtil.close();
	}
}
