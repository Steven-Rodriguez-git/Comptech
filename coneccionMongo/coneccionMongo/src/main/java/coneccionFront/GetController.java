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
    
    @GetMapping("/ALM")
    public String ALM(@RequestParam String valor) throws InterruptedException, ExecutionException{
        return GetService.ALM(valor);
    }
    @GetMapping("/BO")
    public String BO(@RequestParam String valor) throws InterruptedException, ExecutionException{
        return GetService.BO(valor);
    }
    @GetMapping("/GRA")
    public String GRA(@RequestParam String valor) throws InterruptedException, ExecutionException{
        return GetService.GRA(valor);
    }
    @GetMapping("/PRO")
    public String PRO(@RequestParam String valor) throws InterruptedException, ExecutionException{
        return GetService.PRO(valor);
    }
    @GetMapping("/RAM")
    public String RAM(@RequestParam String valor) throws InterruptedException, ExecutionException{
        return GetService.RAM(valor);
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
