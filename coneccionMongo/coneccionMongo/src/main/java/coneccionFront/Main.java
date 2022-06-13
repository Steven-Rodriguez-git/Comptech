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
        
        //principal.creacionArboles();
        //llamo a getService, cuando algo le llegue crea la estructura
        //GetService.prueba("45");
    
    /*    
        ClassLoader classLoader = GetMicroserviceApplication.class.getClassLoader();

	File file = new File(Objects.requireNonNull(classLoader.getResource("steven-admin-privatekey-firebase.json")).getFile());
	FileInputStream serviceAccount = new FileInputStream(file.getAbsolutePath());

        SpringApplication.run(GetMicroserviceApplication.class, args);
	*/
        
        
    }
    
}
