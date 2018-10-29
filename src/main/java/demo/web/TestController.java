/*
 *  copyright (c) thelook.cn
 */
package demo.web;

import java.util.Objects;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author 老唐
 */
@Named("test")
@RequestScoped
public class TestController {

    @Inject
    DocService docService;

    public String getText() {
        Objects.requireNonNull(docService);
        return "你好" + docService.getID();
    }
}
