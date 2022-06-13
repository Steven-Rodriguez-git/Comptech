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

    
    public static void prueba(String id) throws InterruptedException, ExecutionException{
        
        principal.creacionArboles();
        System.out.println("ayuda");

//arboles.almacenamiento_velEscritura.myTree.display4(arboles.almacenamiento_velLectura.root);

/*        
        nodo_binario mayores = arboles.almacenamiento_velLectura.myTree.mayor(arboles.almacenamiento_velLectura.root, 4315);
        arboles.almacenamiento_velLectura.myTree.display4(mayores);
*/            
        
    }
    /*
  public Almacenamiento getCRUDAlmacenamiento(String documentId)
    throws InterruptedException, ExecutionException {
    Firestore dbFireStore = FirestoreClient.getFirestore();
    DocumentReference documentReference = dbFireStore
      .collection("almacenamiento")
      .document(documentId);
    ApiFuture<DocumentSnapshot> future = documentReference.get();
    DocumentSnapshot document = future.get();

    Almacenamiento almacenamiento;

    if (document.exists()) {
        
      almacenamiento = document.toObject(Almacenamiento.class);
      return almacenamiento;
    }

    return null;
    
    */
  }
