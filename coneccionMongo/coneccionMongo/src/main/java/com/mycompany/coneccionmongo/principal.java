package com.mycompany.coneccionmongo;

import com.mongodb.client.*;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.*;
import org.bson.Document;
import org.bson.conversions.Bson;

import com.mycompany.linearDataStructures.ALCircular;
import com.mycompany.linearDataStructures.ArrayList;
import com.mycompany.linearDataStructures.Cola;
import com.mycompany.linearDataStructures.Pilas;
import com.mycompany.linearDataStructures.Tree;
import com.mycompany.linearDataStructures.linkedList;
import com.mycompany.linearDataStructures.nodo_binario;
import com.mycompany.linearDataStructures.nodo;
import com.mycompany.coneccionmongo.arbolesPorComponente;



import com.mongodb.client.FindIterable;
import java.util.Iterator;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.UpdateOptions;
import com.mongodb.client.result.*;
import org.bson.types.ObjectId;
import static com.mongodb.client.model.Updates.*;
import com.mongodb.client.model.Filters.*;

class ReturningValues {
    public Tree myTree;
    public nodo_binario root;

    public ReturningValues(Tree myTree, nodo_binario root) {
        this.myTree = myTree;
        this.root = root;
    }
}

public class principal {
    
    private static int cantidadDatosMax =100000;
    public static arbolesPorComponente arboles;
    
    public static void creacionArboles( /*String[] args*/ ) {

        String uri = "mongodb://localhost:27017";

        try (MongoClient mongoClient = MongoClients.create(uri)) {//busque en la url si hay cliente mongo
            MongoDatabase database = mongoClient.getDatabase("proyecto");//traiga toda la base de datos proyecto
             arboles = new arbolesPorComponente(database);//cree TODO arbol
/*            
            arboles.almacenamiento_velLectura.myTree.display4(arboles.almacenamiento_velLectura.root);
            System.out.println("INICIO");
            nodo_binario mayores = arboles.almacenamiento_velLectura.myTree.mayor(arboles.almacenamiento_velLectura.root, 4315);
            arboles.almacenamiento_velLectura.myTree.display4(mayores);
            System.out.println("BUSCAME");
            nodo_binario menores = arboles.almacenamiento_velLectura.myTree.menor(arboles.almacenamiento_velLectura.root, 4315);
            arboles.almacenamiento_velLectura.myTree.display4(menores);
*/
/*            
            arboles.procesador_marca.myTree.display4(arboles.procesador_marca.root);
            System.out.println("INICIO");
            nodo_binario mayores = arboles.procesador_marca.myTree.mayor(arboles.procesador_marca.root, "nvidiaf4499n5@10");
            arboles.procesador_marca.myTree.display4(mayores);
            System.out.println("BUSCAME");
            nodo_binario menores = arboles.procesador_marca.myTree.menor(arboles.procesador_marca.root, "nvidiaf4499n5@10");
            arboles.procesador_marca.myTree.display4(menores);
*/
            
            
            
            //arboles.almacenamiento_velLectura.myTree.pruebaComparable(arboles.almacenamiento_velLectura.root);
            // balanceo
            //parece que el balanceo si sirve
            //nodo_binario pruebaBalanceo = arboles.almacenamiento_velLectura.myTree.rotacion(arboles.almacenamiento_velLectura.root);
            //arboles.almacenamiento_velLectura.myTree.display4(pruebaBalanceo);
            //arboles.almacenamiento_velLectura.myTree.display4(arboles.almacenamiento_velLectura.root);
//TOCA ORDENAR TODO ARBOL EN EL OTRO ARCHIVO            
//System.out.println(arboles.almacenamiento_velLectura.myTree.mayor(arboles.almacenamiento_velLectura.root, 4315));
/*            
            nodo_binario mayores = arboles.almacenamiento_velLectura.myTree.mayor(pruebaBalanceo, 4315);
            arboles.almacenamiento_velLectura.myTree.display4(mayores);
            System.out.println("BUSCAME");
            nodo_binario menores = arboles.almacenamiento_velLectura.myTree.menor(pruebaBalanceo, 4315);
            arboles.almacenamiento_velLectura.myTree.display4(menores);
            */

// mayores pruebas        
            /*
            nodo_binario mayoresAlmacenamientoTipo = arboles.almacenamiento_velLectura.myTree.mayor(arboles.almacenamiento_velLectura.root, 1300);
            System.out.println(mayoresAlmacenamientoTipo);
            System.out.println(arboles.almacenamiento_velLectura.root);
//SI NO ESTA BALANCEADO PARA QUE LE SIRVE SABER QUIEN ESTA A LA DERECHA
            arboles.almacenamiento_velLectura.myTree.display3(mayoresAlmacenamientoTipo);
            */
            
            
            //Tree arbol =  prueba.almacenamiento_capacidad.myTree;
            //nodo_binario cabezaTree =  prueba.almacenamiento_capacidad.root;

            //arbol.display2(cabezaTree);
                //MongoCollection<Document> collection = database.getCollection("almacenamiento");//toda la coleccion "almacenamiento", estocomo archivo bson
                //Bson filter = eq("capacidad", 838);//solo los que tengan x, no usado por ahora
                //MongoCursor<Document> cursor = collection.find(filter).iterator();
                //MongoCursor<Document> cursor = collection.find().iterator(); //itere sobre los datos de mi coleccion
                //prueba.creacionArboles();
                //ReturningValues conjuntoArbol= ArbolImplementar(database);//cree el arbol
                //Tree arbol =  conjuntoArbol.myTree;
                //nodo_binario cabezaTree =  conjuntoArbol.root;

                //nodo_binario pruebaRotacion =arbol.rotacion(cabezaTree);
                //arbol.display2(pruebaRotacion);//preorden
                //arbol.display3(pruebaRotacion);//postorden
                //arbol.display4(pruebaRotacion);//inorden
                //System.out.println(arbol.search(cabezaTree,4994));

                //System.out.println(cabezaTree.dato);
                //arbol.display2(cabezaTree);//preorden
                //arbol.display3(cabezaTree);//postorden
                //arbol.display4(cabezaTree);//inorden

            
//pruebas de velocidad, crear, buscar, eliminar
            //ALCircularImplementar(database);
            //ArrayListImplementar(database);
            //ColaImplementar(database);
            //PilasImplementar(database);
            //LinkedListImplementar(database);

            
/*            
            try {
                while (cursor.hasNext()) {
                    System.out.println(cursor.next().get("nombre")); //aca lo meto a las estructuras
                }
            } finally {
                cursor.close();
            }
*/

    }
}
    
    

    public static ReturningValues ArbolImplementar(MongoDatabase database){
        Tree myTree = new Tree();
        nodo_binario root = null;
        Comparable data;
        MongoCollection<Document> collection = database.getCollection("board");
        MongoCursor<Document> cursor = collection.find().iterator();
        int contador =0;
        long beginRead = System.currentTimeMillis();
         try {
                //while (cursor.hasNext()) {
                while (contador<cantidadDatosMax){
                root = myTree.insert(root,(Comparable) cursor.next().get("chipset"));
                contador++;
         }
        }
         catch(Error E){
         System.out.println(E);
         }
         finally {
            cursor.close();
        }
        long endRead = System.currentTimeMillis();
        System.out.println("tiempo usado en la escritura con ARBOL BINARIO con "+cantidadDatosMax+" datos: "+ (endRead-beginRead));
        
        ReturningValues valores = new ReturningValues(myTree,root);
        return valores;
    }
    
    
    
    public static void ALCircularImplementar(MongoDatabase database){
        //no identifica bien si no le traigo toda la base de datos, mejor hacerlo
    MongoCollection<Document> collection = database.getCollection("almacenamiento");
    MongoCursor<Document> cursor = collection.find().iterator();
    MongoCursor<Document> respaldo = collection.find().iterator();
    ALCircular alCircular = new ALCircular();//implenento la estructura

    int cantidadDatos = cantidadDatosMax;//cuantos datos quiero ver, tambien lo puedo hacer con un while(cursor.next!=null), para pruebas es mas facil asi

    long beginRead = System.currentTimeMillis();
    for(int i=0;i<cantidadDatos;i++){
        alCircular.add((Comparable) cursor.next().get("velLectura")); 
    }
    long endRead = System.currentTimeMillis();
    System.out.println("tiempo usado en la escritura de ALCIRCULAR para "+cantidadDatos+" datos: "+ (endRead-beginRead));
            
    long beginSearch = System.currentTimeMillis();
    for(int j=0;j<cantidadDatos;j++){
        alCircular.search( (Comparable) respaldo.next().get("velLectura")); 
    }
    long endSearch = System.currentTimeMillis();
    System.out.println("tiempo usado en la busqueda de ALCIRCULAR para "+cantidadDatos+" datos: "+ (endSearch-beginSearch));
   
    long beginDelete = System.currentTimeMillis();
    for(int i=0;i<cantidadDatos;i++){
        alCircular.delete(i);
    }
    long endDelete= System.currentTimeMillis();
    System.out.println("tiempo usado en la elmininacion de ALCIRCULAR para "+cantidadDatos+" datos: "+ (endDelete-beginDelete));
    
    
    return;
    }
    
    public static void ArrayListImplementar(MongoDatabase database){
        
    MongoCollection<Document> collection = database.getCollection("almacenamiento");
    MongoCursor<Document> cursor = collection.find().iterator();
    MongoCursor<Document> respaldo = collection.find().iterator();
    ArrayList arraylist = new ArrayList();

    int cantidadDatos = cantidadDatosMax;

    long beginRead = System.currentTimeMillis();
    for(int i=0;i<cantidadDatos;i++){
        arraylist.push((Comparable) cursor.next().get("velLectura")); 
    }
    long endRead = System.currentTimeMillis();
    System.out.println("tiempo usado en la escritura de ARRAYLIST para "+cantidadDatos+" datos: "+ (endRead-beginRead));
            
    long beginSearch = System.currentTimeMillis();
    for(int j=0;j<cantidadDatos;j++){
        arraylist.search((Comparable) respaldo.next().get("velLectura")); 
    }
    long endSearch = System.currentTimeMillis();
    System.out.println("tiempo usado en la busqueda de ARRAYLIST para "+cantidadDatos+" datos: "+ (endSearch-beginSearch));
    
    long beginDelete = System.currentTimeMillis();
    for(int i=0;i<cantidadDatos;i++){
        arraylist.pop(); 
    }
    long endDelete= System.currentTimeMillis();
    System.out.println("tiempo usado en la elmininacion de ARRAYLIST para "+cantidadDatos+" datos: "+ (endDelete-beginDelete));
    
    return;
    }
    
    public static void ColaImplementar(MongoDatabase database){
        
    MongoCollection<Document> collection = database.getCollection("almacenamiento");
    MongoCursor<Document> cursor = collection.find().iterator();
    MongoCursor<Document> respaldo = collection.find().iterator();
    Cola cola = new Cola();

    int cantidadDatos = cantidadDatosMax;

    long beginRead = System.currentTimeMillis();
    for(int i=0;i<cantidadDatos;i++){
        cola.enqueue((Comparable) cursor.next().get("velLectura")); 
    }
    long endRead = System.currentTimeMillis();
    System.out.println("tiempo usado en la escritura de COLA para "+cantidadDatos+" datos: "+ (endRead-beginRead));

    long beginSearch = System.currentTimeMillis();
    for(int j=0;j<cantidadDatos;j++){
        cola.search((Comparable) respaldo.next().get("velLectura")); 
    }
    long endSearch = System.currentTimeMillis();
    System.out.println("tiempo usado en la busqueda de COLA para "+cantidadDatos+" datos: "+ (endSearch-beginSearch));
    
    long beginDelete = System.currentTimeMillis();
    for(int i=0;i<cantidadDatos;i++){
        cola.dequeue(); 
    }
    long endDelete= System.currentTimeMillis();
    System.out.println("tiempo usado en la elmininacion de COLA para "+cantidadDatos+" datos: "+ (endDelete-beginDelete));
    
    return;
    }
    
    
    public static void PilasImplementar(MongoDatabase database){
        
    MongoCollection<Document> collection = database.getCollection("almacenamiento");
    MongoCursor<Document> cursor = collection.find().iterator();
    MongoCursor<Document> respaldo = collection.find().iterator();
    Pilas pila = new Pilas();

    int cantidadDatos = cantidadDatosMax;

    long beginRead = System.currentTimeMillis();
    for(int i=0;i<cantidadDatos;i++){
        pila.insert((Comparable) cursor.next().get("velLectura")); 
    }
    long endRead = System.currentTimeMillis();
    System.out.println("tiempo usado en la escritura de PILA para "+cantidadDatos+" datos: "+ (endRead-beginRead));
            
    long beginSearch = System.currentTimeMillis();
    for(int j=0;j<cantidadDatos;j++){
        pila.Search((Comparable) respaldo.next().get("velLectura")); 
    }
    long endSearch = System.currentTimeMillis();
    System.out.println("tiempo usado en la busqueda de PILA para "+cantidadDatos+" datos: "+ (endSearch-beginSearch));
    
    long beginDelete = System.currentTimeMillis();
    for(int i=0;i<cantidadDatos;i++){
        pila.remove(); 
    }
    long endDelete= System.currentTimeMillis();
    System.out.println("tiempo usado en la elmininacion de PILA para "+cantidadDatos+" datos: "+ (endDelete-beginDelete));
    
    return;
    }
 
    public static void LinkedListImplementar(MongoDatabase database){
        
    MongoCollection<Document> collection = database.getCollection("almacenamiento");
    MongoCursor<Document> cursor = collection.find().iterator();
    MongoCursor<Document> respaldo = collection.find().iterator();
    linkedList listaEnlazada = new linkedList();

    int cantidadDatos = cantidadDatosMax;

    long beginRead = System.currentTimeMillis();
    for(int i=0;i<cantidadDatos;i++){
        listaEnlazada.add((Comparable) cursor.next().get("velLectura")); 
    }
    long endRead = System.currentTimeMillis();
    System.out.println("tiempo usado en la escritura de LINKEDLIST para "+cantidadDatos+" datos: "+ (endRead-beginRead));

    long beginSearch = System.currentTimeMillis();
    for(int j=0;j<cantidadDatos;j++){
        listaEnlazada.search((Comparable) respaldo.next().get("velLectura")); 
    }
    long endSearch = System.currentTimeMillis();
    System.out.println("tiempo usado en la busqueda de LINKEDLIST para "+cantidadDatos+" datos: "+ (endSearch-beginSearch));
    
    long beginDelete = System.currentTimeMillis();
    for(int i=0;i<cantidadDatos;i++){
        listaEnlazada.popFront(); 
    }
    long endDelete= System.currentTimeMillis();
    System.out.println("tiempo usado en la elmininacion de LINKEDLIST para "+cantidadDatos+" datos: "+ (endDelete-beginDelete));
    
    return;
    }
    
}

/*    
    FindIterable<Document> iterDoc = collection.find();
    Iterator it = iterDoc.iterator();//para que itere por cada archivo
    //while (it.hasNext()) {
    for (int i=0;i<25;i++) {
            System.out.println(it.next().getClass().getSimpleName());
            System.out.println(it.next());
        }
*/