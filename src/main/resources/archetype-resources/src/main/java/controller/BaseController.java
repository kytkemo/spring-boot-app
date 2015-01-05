#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.controller;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;

@Controller
public final class BaseController implements CommandLineRunner {

    @Override
    public void run(String... strings) throws Exception {

        System.out.println("Hello World!");
    }
}
