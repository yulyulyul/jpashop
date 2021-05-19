package jpabook.jpashop.domain.wink;

import jpabook.jpashop.domain.wink.domain.Account;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class BankRepository{

    @PersistenceContext
    private EntityManager em;

    public Long save(Account account){
        em.persist(account);
        return account.getId();
    }

    public Account find(Long id){
        return em.find(Account.class, id);
    }

}
