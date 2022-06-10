package com.mycompany.coneccionmongo;
import com.mongodb.client.*;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;



import com.mycompany.linearDataStructures.*;


class ReturningValues {
    public Tree myTree;
    public nodo_binario root;

    public ReturningValues(Tree myTree, nodo_binario root) {
        this.myTree = myTree;
        this.root = root;
    }
}

public class arbolesPorComponente {
    public static void arbolesPorComponente(){

        this.creacionArboles(database,coleccion)

    }

    public static void creacionArboles(MongoDatabase database, String coleccion){

        ReturningValues conjuntoArbol= ArbolImplementar(database);//cree el arbol
        Tree arbol =  conjuntoArbol.myTree;
        nodo_binario cabezaTree =  conjuntoArbol.root;


    }

    public static ReturningValues ArbolImplementar(MongoDatabase database){
        Tree myTree = new Tree();
        nodo_binario root = null;
        Comparable data;
        MongoCollection<Document> collection = database.getCollection(coleccion);
        MongoCursor<Document> cursor = collection.find().iterator();
        try {
                //while (cursor.hasNext()) {
                while (contador<cantidadDatosMax){
                root = myTree.insert(root,(Comparable) cursor.next().get("velLectura"));
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



}
