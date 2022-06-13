package coneccionFront;

import com.mycompany.coneccionmongo.principal;
import com.mycompany.coneccionmongo.arbolesPorComponente;
import static com.mycompany.coneccionmongo.principal.arboles;
import com.mycompany.linearDataStructures.*;

import java.util.concurrent.ExecutionException;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.time.Instant;

import java.util.concurrent.ExecutionException;
import org.springframework.stereotype.Service;


@Service
public class GetService{ //implements arbolesPorComponente{
    static void ALM_tipo() throws InterruptedException, ExecutionException{
        arboles.almacenamiento_tipo.myTree.display4(arboles.almacenamiento_tipo.root);
        //hacer esto por todas, eventualmente le retorno un json?
    }
    
    public static void prueba(String id) throws InterruptedException, ExecutionException{
        
        principal.creacionArboles();
        System.out.println("ayuda");

//arboles.almacenamiento_velEscritura.myTree.display4(arboles.almacenamiento_velLectura.root);

/*        
        nodo_binario mayores = arboles.almacenamiento_velLectura.myTree.mayor(arboles.almacenamiento_velLectura.root, 4315);
        arboles.almacenamiento_velLectura.myTree.display4(mayores);
*/            
        
    }
    
  }
