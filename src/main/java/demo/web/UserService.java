/*
 *  copyright (c) thelook.cn
 */
package demo.web;

import java.util.Date;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

/**
 *
 * @author 老唐
 */
@ApplicationScoped
public class UserService {

    @PersistenceContext(unitName="MyPU")
    EntityManager em;

    @Transactional
    public User create(String name) {
        final User user = new User();
        user.setCreated(new Date());
        user.setName(name);
        em.persist(user);
        return user;
    }
}
