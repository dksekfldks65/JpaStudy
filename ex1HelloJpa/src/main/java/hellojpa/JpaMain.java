package hellojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaMain {

    public static void main(String[] args){

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello"); //persistence.xml에 넣어둔 값 넣어줌

        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        MEMBER member = new MEMBER();
        member.setId(1l);
        member.setName("HelloA");

        em.persist(member);

        tx.commit();

        em.close();
        emf.close();

    }

}
