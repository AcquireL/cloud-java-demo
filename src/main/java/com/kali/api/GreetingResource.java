package com.kali.api;


import com.kali.util.Logged;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/greet")
@ApplicationScoped
public class GreetingResource {

    @GET
    @Logged  // 只有这个方法会被日志切面拦截
    public String greet() {
        return "Hello, Quarkus with AOP!";
    }
}
