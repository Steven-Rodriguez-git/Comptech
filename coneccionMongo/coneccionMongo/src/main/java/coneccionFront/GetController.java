package coneccionFront;

import coneccionFront.GetService;

import java.util.concurrent.ExecutionException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetController {

    @GetMapping("/")
    public void prueba() throws InterruptedException, ExecutionException{
        GetService.prueba("dios");
    }
 
    @GetMapping("/segundo")
    public void segundaPrueba() throws InterruptedException, ExecutionException{
        System.out.println("aymijo");

    }
    
    
}
