/*
 *  copyright (c) thelook.cn
 */
package demo.web;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

/**
 *
 * @author 老唐
 */
@Named
@ApplicationScoped
public class DocService {
    public String getID(){
        return "doc";
    }
}
