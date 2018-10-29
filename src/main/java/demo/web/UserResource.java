/*
 *  copyright (c) thelook.cn
 */
package demo.web;

import java.util.Objects;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

/**
 *
 * @author 老唐
 */
@Path("user")
public class UserResource {

    @Inject
    UserService userService;
    @PersistenceContext(unitName="MyPU")
    EntityManager em;

    @POST
    @Produces("application/json")
    public User create(@QueryParam("name") String name) {
        Objects.requireNonNull(userService);
        return userService.create(name);
    }

    @GET
    @Path("/{id}")
    @Produces("application/json")
    public User get(@PathParam("id") Integer id) {
        final User user = em.find(User.class, id);
        return user;
    }
}
