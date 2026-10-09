package br.edu.ifpr.pgua.eic.tads.utils;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Map;

import io.javalin.Javalin;
import io.javalin.http.staticfiles.Location;


public class JavalinUtils {
    
    public static Javalin makeApp(int port){

        Javalin app = Javalin.create(config->{
            config.requestLogger.http((ctx, ms) -> {
                System.out.println(ctx.method() +" "+ ctx.fullUrl());
            });
            config.staticFiles.add("public",Location.CLASSPATH);
            
        }).start(port);
        return app;
    }


}

