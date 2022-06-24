package coneccionFront;

import coneccionFront.GetService;

import java.util.concurrent.ExecutionException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetController {
//Almacenamiento:ALM
//Board: BO
//Grafico: GRA
//Procesador: PRO
//Ram: RAM
    
    @GetMapping("/Request")
    public String Request(@RequestParam String valor) throws InterruptedException, ExecutionException{
        return GetService.Request(valor);
    }
    @GetMapping("/")
    public String prueba(@RequestParam String valor) throws InterruptedException, ExecutionException{
        return GetService.prueba(valor);
    }

 
    @GetMapping("/segundo")
    public void segundaPrueba() throws InterruptedException, ExecutionException{
        System.out.println("aymijo");

    }
    
    
}
