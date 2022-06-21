package coneccionFront;

import com.mycompany.coneccionmongo.principal;
import com.mycompany.coneccionmongo.arbolesPorComponente;
import static com.mycompany.coneccionmongo.principal.arboles;
import static com.mycompany.coneccionmongo.principal.mapaTodo;
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

    static void ALM_capacidad() throws InterruptedException, ExecutionException{
        arboles.almacenamiento_capacidad.myTree.display4(arboles.almacenamiento_capacidad.root);
    }

    static void ALM_velLectura() throws InterruptedException, ExecutionException{
        arboles.almacenamiento_velLectura.myTree.display4(arboles.almacenamiento_velLectura.root);
    }
    static void ALM_velEscritura() throws InterruptedException, ExecutionException{
        arboles.almacenamiento_velEscritura.myTree.display4(arboles.almacenamiento_velEscritura.root);
    }
    static void ALM_marca() throws InterruptedException, ExecutionException{
        arboles.almacenamiento_marca.myTree.display4(arboles.almacenamiento_marca.root);
    }
    static void ALM_precio() throws InterruptedException, ExecutionException{
        arboles.almacenamiento_capacidad.myTree.display4(arboles.almacenamiento_capacidad.root);
    }
    /*
    //IMPLEMENTAR 
    static void ALM_nombre() throws InterruptedException, ExecutionException{//coge cualquiera y luego le retorna el arbol con ese nombre
        
        arboles.almacenamiento_capacidad.myTree.display4(arboles.almacenamiento_nombre.root);
    }
    */
    
    public static void prueba(String id) throws InterruptedException, ExecutionException{
        System.out.println(mapaTodo.get("1183"));
        System.out.println(mapaTodo.get("HHD"));
        System.out.println("ayuda");
        
        
//arboles.almacenamiento_velEscritura.myTree.display4(arboles.almacenamiento_velLectura.root);

/*        
        nodo_binario mayores = arboles.almacenamiento_velLectura.myTree.mayor(arboles.almacenamiento_velLectura.root, 4315);
        arboles.almacenamiento_velLectura.myTree.display4(mayores);
*/            
        
    }
    
  }
