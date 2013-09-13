package org.suda.gallerymgr.managedbeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "helloBean", eager = true)
@SessionScoped
public class HelloWorld {
    public HelloWorld() {
        System.out.println("HelloWorld started!");
    }
    private static final long serialVersionUID = 1L;

    private String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
