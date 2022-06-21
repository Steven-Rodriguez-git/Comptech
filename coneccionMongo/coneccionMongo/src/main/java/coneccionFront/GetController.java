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
    @GetMapping("/ALM_capacidad")
    public void ALM_capacidad() throws InterruptedException, ExecutionException{
        GetService.ALM_capacidad();
    }

    @GetMapping("/ALM_velLectura")
    public void ALM_velLectura() throws InterruptedException, ExecutionException{
        GetService.ALM_velLectura();
    }
    @GetMapping("/ALM_velEscritura")
    public void ALM_velEscritura() throws InterruptedException, ExecutionException{
        GetService.ALM_velEscritura();
    }
    @GetMapping("/ALM_marca")
    public void ALM_marca() throws InterruptedException, ExecutionException{
        GetService.ALM_marca();
    }
    @GetMapping("/ALM_precio")
    public void ALM_precio() throws InterruptedException, ExecutionException{
        GetService.ALM_precio();
    }
    @GetMapping("/ALM_nombre")
    public void ALM_nombre() throws InterruptedException, ExecutionException{
        //GetService.ALM_nombre();
        System.out.println("no implementado");
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
