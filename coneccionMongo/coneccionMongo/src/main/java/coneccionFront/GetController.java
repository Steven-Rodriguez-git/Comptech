package coneccionFront;

import coneccionFront.GetService;

import java.util.concurrent.ExecutionException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetController {
//Almacenamiento:ALM
//Board: BO
//Grafico: GRA
//Procesador: PRO
//Ram: RAM
    
    @GetMapping("/ALM_tipo")
    public void ALM_tipo() throws InterruptedException, ExecutionException{
        GetService.ALM_tipo();
    }
    @GetMapping("/")
    public void prueba() throws InterruptedException, ExecutionException{
        GetService.prueba("dios");
    }
 
    @GetMapping("/segundo")
    public void segundaPrueba() throws InterruptedException, ExecutionException{
        System.out.println("aymijo");

    }
    
    
}
