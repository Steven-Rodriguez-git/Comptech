package coneccionFront;

import com.mycompany.coneccionmongo.arbolesPorComponente;
import com.mycompany.coneccionmongo.principal;

import coneccionFront.GetService;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.ExecutionException;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;




/**
 *
 * @author david
 */
@SpringBootApplication
public class Main {
    
    public static void main(String[] args) throws InterruptedException, ExecutionException {
	ClassLoader classLoader = Main.class.getClassLoader();
        SpringApplication.run(Main.class, args);
        principal.creacionArboles();
        
        
    }
    
}
