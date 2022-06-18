import com.sun.net.httpserver.HttpContext;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import org.glassfish.jersey.jdkhttp.JdkHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.URI;
import java.util.concurrent.Executor;

public class Main {
    public static void main(String[] args) {
        System.out.println("Starting REST Server...");
        ResourceConfig rc = new ResourceConfig().packages("at.feiertag");
        HttpServer server = JdkHttpServerFactory.createHttpServer(URI.create("http://localhost:8080/"), rc);

        System.out.println("Server started.");

        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }

        server.stop(0);
        System.out.println("Server stopped.");

    }
}

