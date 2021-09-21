package stusy.datajpa.repository;

import org.springframework.stereotype.Repository;
import stusy.datajpa.entitiy.Member;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class MemberJpaRepository {

    @PersistenceContext
    private EntityManager em;

    public Member save(Member member) {
        em.persist(member);
        return member;
    }

    public void delete(Member member) {
        em.remove(member);
    }

    public List<Member> findAll() {
        return em.createQuery("select m from Member  m", Member.class).getResultList();
    }

    public Member find(Long id) {
        return em.find(Member.class, id);
    }
}
