package br.edu.ifpr.pgua.eic.tads;

import br.edu.ifpr.pgua.eic.tads.controllers.IndexController;
import br.edu.ifpr.pgua.eic.tads.utils.JavalinUtils;
import io.javalin.Javalin;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
        var app = JavalinUtils.makeApp(8080);
        
        app.get("/boas-vindas", ctx -> ctx.result("Olá Mundo!!"));
        app.get("/cadastro", ctx -> ctx.result("Aqui é cadastro!"));

        
    }
}
