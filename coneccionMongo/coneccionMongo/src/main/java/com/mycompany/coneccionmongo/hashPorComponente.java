package com.mycompany.coneccionmongo;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mycompany.linearDataStructures.Map;
import com.mycompany.linearDataStructures.Tree;
import com.mycompany.linearDataStructures.nodo_binario;
import org.bson.Document;

public class hashPorComponente {
    public String[] coleccion = {"almacenamiento","board","grafica","procesador","ram"};
    public String[][] datos ={{"capacidad","tipo","velLectura","velEscritura","marca","precio"},
        {"chipset","socket","compatibilidadArqRam","maxRam","puertos","marca","precio"},
        {"memoria","arquitectura","anchoBanda","frecuenciaBase","frecuenciaOc","consumo","computo","marca","precio"},
        {"generacion","nucleos","hilos","frecuencia","cache","consumo","graficaIntegrada","marca","precio"},
        {"capacidad","arquitectura","velocidad","tasaTransferencia","marca","precio"}
};
    public MongoDatabase database;
    public Map<String, Integer> map = new Map<>();



    public hashPorComponente(MongoDatabase database){
       this.database = database;
        
        for(int i=0;i<=4;i++){
            for(int j=0;j<datos[i].length;j++){
                hashImplementar(coleccion[i],datos[i][j]);
           }
       }

       
    }
    

    public void hashImplementar(String coleccion, String caracteristica){
        //System.out.println(coleccion);
        //System.out.println(caracteristica);

        database = this.database;
        Tree myTree = new Tree();
        Comparable data;
        MongoCollection<Document> collection = database.getCollection(coleccion);
        MongoCursor<Document> cursor = collection.find().iterator();
        try {
            //while (cursor.hasNext()) {
            for(Integer i=0;i<100;i++){
                map.add((cursor.next().get(caracteristica)).toString(), i);//el valor que les voy a dar
            }
        }
         catch(Error E){
         System.out.println(E);
         }
         finally {
            cursor.close();
        }
        
    }



        
    
}
