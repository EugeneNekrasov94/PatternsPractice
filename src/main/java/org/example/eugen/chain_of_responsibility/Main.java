package org.example.eugen.chain_of_responsibility;

import org.example.eugen.chain_of_responsibility.middleware.Middleware;
import org.example.eugen.chain_of_responsibility.middleware.RoleCheckMiddleware;
import org.example.eugen.chain_of_responsibility.middleware.ThrottlingMiddleware;
import org.example.eugen.chain_of_responsibility.middleware.UserExistsMiddleware;
import org.example.eugen.chain_of_responsibility.server.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;

    private static void init() {
        server = new Server();
        server.register("admin@example.com", "admin_pass");
        server.register("user@example.com", "user_pass");

        // Проверки связаны в одну цепь. Клиент может строить различные цепи,
        // используя одни и те же компоненты.
        Middleware middleware = Middleware.link(
                new ThrottlingMiddleware(2),
                new UserExistsMiddleware(server),
                new RoleCheckMiddleware()
        );

        // Сервер получает цепочку от клиентского кода.
        server.setMiddleware(middleware);
    }

    public static void main(String[] args) throws IOException {
        init();

        boolean success;
        do {
            System.out.print("Enter email: ");
            String email = reader.readLine();
            System.out.print("Input password: ");
            String password = reader.readLine();
            success = server.logIn(email, password);
        } while (!success);
    }
}
