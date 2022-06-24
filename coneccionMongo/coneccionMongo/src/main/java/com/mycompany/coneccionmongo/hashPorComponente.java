package com.mycompany.coneccionmongo;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mycompany.linearDataStructures.Map;
import com.mycompany.linearDataStructures.Tree;
import com.mycompany.linearDataStructures.ArrayList;
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
    public Map<String, String> mapALM = new Map<>();
    public Map<String, String> mapBO = new Map<>();
    public Map<String, String> mapGRA = new Map<>();
    public Map<String, String> mapPRO = new Map<>();
    public Map<String, String> mapRAM = new Map<>();
    public Map<String, String> mapTemporal = new Map<>();



    public hashPorComponente(MongoDatabase database){
       this.database = database;
        
        for(int i=0;i<=4;i++){
            mapTemporal = new Map<>();
            for(int j=0;j<datos[i].length;j++){                
                hashImplementar(coleccion[i],datos[i][j],i);
           }
       }
       
    }
    

    public void hashImplementar(String coleccion, String caracteristica,int numeroColeccion){
        //System.out.println(coleccion);
        //System.out.println(caracteristica);

        switch (numeroColeccion) {
                    case 0:
                        mapALM = insertarDatos(coleccion,caracteristica);
                        break;
                    case 1:
                        mapBO = insertarDatos(coleccion,caracteristica);
                        break;
                    case 2:
                        mapGRA = insertarDatos(coleccion,caracteristica);
                        break;
                    case 3:
                        mapPRO = insertarDatos(coleccion,caracteristica);                        
                        break;
                    case 4:
                        mapRAM = insertarDatos(coleccion,caracteristica);
                        break;
                    default:
                        break;
                }
    }
    public Map insertarDatos(String coleccion, String caracteristica){
        database = this.database;
        MongoCollection<Document> collection = database.getCollection(coleccion);
        MongoCursor<Document> cursor = collection.find().iterator();
        MongoCursor<Document> respaldoCursor = collection.find().iterator();
        
        try {
            //while (cursor.hasNext()) {
            for(Integer i=0;i<101;i++){
                mapTemporal.add((cursor.next().get(caracteristica)).toString(),respaldoCursor.next().toJson());//el valor que les voy a dar
                //guarde en el mapa que representa el hash la caracteristica que pido como llave y como valor toda la coleccion asociada a si misma
            }

        }
         catch(Error E){
         System.out.println(E);
         return null;
         }
         finally {
            cursor.close();
        }
    System.out.println(coleccion +" ademas" +caracteristica);
    return mapTemporal;   
    }



        
    
}
