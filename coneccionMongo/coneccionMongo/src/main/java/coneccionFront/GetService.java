package coneccionFront;

import com.mycompany.coneccionmongo.principal;
import com.mycompany.coneccionmongo.arbolesPorComponente;
import static com.mycompany.coneccionmongo.principal.arboles;
import static com.mycompany.coneccionmongo.principal.mapaALM;
import static com.mycompany.coneccionmongo.principal.mapaBO;
import static com.mycompany.coneccionmongo.principal.mapaGRA;
import static com.mycompany.coneccionmongo.principal.mapaPRO;
import static com.mycompany.coneccionmongo.principal.mapaRAM;

import com.mycompany.linearDataStructures.*;

import java.util.concurrent.ExecutionException;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.time.Instant;

import java.util.concurrent.ExecutionException;
import org.springframework.stereotype.Service;


@Service
public class GetService{ //implements arbolesPorComponente{
    static String ALM(String valor) throws InterruptedException, ExecutionException{
        //arboles.almacenamiento_tipo.myTree.display4(arboles.almacenamiento_tipo.root);
        return (String) mapaALM.get(valor); //retorna un objeto "json" entonces toca castearlo
    }
    static String BO(String valor) throws InterruptedException, ExecutionException{
        //arboles.almacenamiento_tipo.myTree.display4(arboles.almacenamiento_tipo.root);
        return (String) mapaBO.get(valor); //retorna un objeto "json" entonces toca castearlo
    }
    static String GRA(String valor) throws InterruptedException, ExecutionException{
        //arboles.almacenamiento_tipo.myTree.display4(arboles.almacenamiento_tipo.root);
        return (String) mapaGRA.get(valor); //retorna un objeto "json" entonces toca castearlo
    }
    static String PRO(String valor) throws InterruptedException, ExecutionException{
        //arboles.almacenamiento_tipo.myTree.display4(arboles.almacenamiento_tipo.root);
        return (String) mapaPRO.get(valor); //retorna un objeto "json" entonces toca castearlo
    }
    static String RAM(String valor) throws InterruptedException, ExecutionException{
        //arboles.almacenamiento_tipo.myTree.display4(arboles.almacenamiento_tipo.root);
        return (String) mapaRAM.get(valor); //retorna un objeto "json" entonces toca castearlo
    }
   /*
    static String ALM_precio() throws InterruptedException, ExecutionException{
        arboles.almacenamiento_capacidad.myTree.display4(arboles.almacenamiento_capacidad.root);
    }
    */
    /*
    //IMPLEMENTAR 
    static void ALM_nombre() throws InterruptedException, ExecutionException{//coge cualquiera y luego le retorna el arbol con ese nombre
        
        arboles.almacenamiento_capacidad.myTree.display4(arboles.almacenamiento_nombre.root);
    }
    */
    public static String prueba(String valor) throws InterruptedException, ExecutionException{
        /*
        System.out.println(mapaTodo.get("1183"));
        System.out.println(mapaTodo.get("SSD"));//asumo que funciona
        System.out.println(mapaTodo.get("1183"));
        System.out.println(mapaTodo.get("852"));
*/
        return (String) mapaALM.get(valor);
    }
  }
