/*
 *  copyright (c) thelook.cn
 */
package demo.web;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author 老唐
 */
@Named
@RequestScoped
public class IndexController {

    public String getMsg() {
        return "你好";
    }
}
