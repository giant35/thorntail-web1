/*
 *  copyright (c) thelook.cn
 */
package demo.web;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * @author 老唐
 */
@Path("test2")
public class Test2Controller {

    @GET
    public String getMsg2() {
        return "test2 消息";
    }
}
