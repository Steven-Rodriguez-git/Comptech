package com.mycompany.coneccionmongo;
import com.mongodb.client.*;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;



import com.mycompany.linearDataStructures.*;

class retornoMaximo{
    public retornaArbol prueba;

}
class retornaArbol {
    public Tree myTree;
    public nodo_binario root;

    public retornaArbol(Tree myTree, nodo_binario root) {
        this.myTree = myTree;
        this.root = root;
    }
}

public class arbolesPorComponente {
    public retornaArbol almacenamiento_capacidad;
    public retornaArbol almacenamiento_tipo;
    public retornaArbol almacenamiento_velLectura;
    public retornaArbol almacenamiento_velEscritura;
    public retornaArbol almacenamiento_marca;
    public retornaArbol almacenamiento_precio;

    public retornaArbol board_chipset;
    public retornaArbol board_socket;
    public retornaArbol board_compatibilidadArqRam;
    public retornaArbol board_maxRam;
    public retornaArbol board_puertos;
    public retornaArbol board_marca;
    public retornaArbol board_precio;

    public retornaArbol grafica_memoria;
    public retornaArbol grafica_arquitectura;
    public retornaArbol grafica_anchoBanda;    
    public retornaArbol grafica_frecuenciaBase;
    public retornaArbol grafica_frecuenciaOc;
    public retornaArbol grafica_consumo;
    public retornaArbol grafica_computo;
    public retornaArbol grafica_marca;
    public retornaArbol grafica_precio;
    
    public retornaArbol procesador_generacion;
    public retornaArbol procesador_nucleos;
    public retornaArbol procesador_hilos;
    public retornaArbol procesador_frecuencia;
    public retornaArbol procesador_cache;
    public retornaArbol procesador_consumo;
    public retornaArbol procesador_graficaIntegrada;
    public retornaArbol procesador_marca;
    public retornaArbol procesador_precio;

    public retornaArbol ram_capacidad;
    public retornaArbol ram_arquitectura;
    public retornaArbol ram_velocidad;
    public retornaArbol ram_tasaTransferencia;
    public retornaArbol ram_marca;
    public retornaArbol ram_precio;

    public String[] coleccion = {"almacenamiento","board","grafica","procesador","ram","marca","precio"};
    public String[] almacenamiento= {"capacidad","tipo","velLectura","velLectura","marca","precio"};
    public String[] board= {"chispset","socket","compatibilidadArqRam","maxRam","puertos","marca","precio"};
    public String[] grafica= {"memoria","arquitectura","anchoBanda","frecuenciaBase","frecuenciaOc","consumo","computo","marca","precio"};
    public String[] procesador= {"generacion","nucleos","hilos","frecuencia","cache","consumo","graficaIntegrada","marca","precio"};
    public String[] ram= {"capacidad","arquitectura","velocidad","tasaTransferencia","marca","precio"};





    public arbolesPorComponente(MongoDatabase database){
        this.almacenamiento_capacidad = creacionArboles(database,coleccion[0],almacenamiento[0]);
        this.almacenamiento_tipo = creacionArboles(database,coleccion[0],almacenamiento[1]);
        this.almacenamiento_velLectura = creacionArboles(database,coleccion[0],almacenamiento[2]);
        this.almacenamiento_velEscritura = creacionArboles(database,coleccion[0],almacenamiento[3]);
        this.almacenamiento_marca = creacionArboles(database,coleccion[0],almacenamiento[4]);
        this.almacenamiento_precio = creacionArboles(database,coleccion[0],almacenamiento[5]);
        
        this.board_chipset = creacionArboles(database, coleccion[1], board[0]);
        this.board_socket = creacionArboles(database, coleccion[1], board[1]);
        this.board_compatibilidadArqRam = creacionArboles(database, coleccion[1], board[2]);
        this.board_maxRam = creacionArboles(database, coleccion[1], board[3]);
        this.board_puertos = creacionArboles(database, coleccion[1], board[4]);
        this.board_marca = creacionArboles(database, coleccion[1], board[5]);
        this.board_precio = creacionArboles(database, coleccion[1], board[6]);
        
        this.grafica_memoria = creacionArboles(database, coleccion[2], board[0]);
        this.grafica_arquitectura = creacionArboles(database, coleccion[2], board[1]);
        this.grafica_anchoBanda = creacionArboles(database, coleccion[2], board[2]);
        this.grafica_frecuenciaBase = creacionArboles(database, coleccion[2], board[3]);
        this.grafica_frecuenciaOc = creacionArboles(database, coleccion[2], board[4]);
        this.grafica_consumo = creacionArboles(database, coleccion[2], board[5]);
        this.grafica_computo = creacionArboles(database, coleccion[2], board[6]);
        this.grafica_marca = creacionArboles(database, coleccion[2], board[7]);
        this.grafica_precio = creacionArboles(database, coleccion[2], board[8]);

        this.procesador_generacion = creacionArboles(database, coleccion[3], procesador[0]);
        this.procesador_nucleos = creacionArboles(database, coleccion[3], procesador[1]);
        this.procesador_hilos = creacionArboles(database, coleccion[3], procesador[2]);
        this.procesador_frecuencia = creacionArboles(database, coleccion[3], procesador[3]);
        this.procesador_cache = creacionArboles(database, coleccion[3], procesador[4]);
        this.procesador_consumo = creacionArboles(database, coleccion[3], procesador[5]);
        this.procesador_graficaIntegrada = creacionArboles(database, coleccion[3], procesador[6]);
        this.procesador_marca = creacionArboles(database, coleccion[3], procesador[7]);
        this.procesador_precio = creacionArboles(database, coleccion[3], procesador[8]);

        this.ram_capacidad = creacionArboles(database, coleccion[4], ram[0]);
        this.ram_arquitectura = creacionArboles(database, coleccion[4], ram[1]);
        this.ram_velocidad = creacionArboles(database, coleccion[4], ram[2]);
        this.ram_tasaTransferencia = creacionArboles(database, coleccion[4], ram[3]);
        this.ram_marca = creacionArboles(database, coleccion[4], ram[4]);
        this.ram_precio = creacionArboles(database, coleccion[4], ram[5]);
        
    }
    
    public static retornaArbol creacionArboles(MongoDatabase database, String coleccion, String caracteristica){
        retornaArbol conjuntoArbol= ArbolImplementar(database,coleccion,caracteristica);//cree el arbol
        Tree arbol =  conjuntoArbol.myTree;
        nodo_binario cabezaTree =  conjuntoArbol.root;

        return conjuntoArbol;

    }

    public static retornaArbol ArbolImplementar(MongoDatabase database,String coleccion, String caracteristica){
        Tree myTree = new Tree();
        nodo_binario root = null;
        Comparable data;
        MongoCollection<Document> collection = database.getCollection(coleccion);
        MongoCursor<Document> cursor = collection.find().iterator();
        try {
            while (cursor.hasNext()) {
                root = myTree.insert(root,(Comparable) cursor.next().get(caracteristica));
         }
        }
         catch(Error E){
         System.out.println(E);
         }
         finally {
            cursor.close();
        }
        retornaArbol valores = new retornaArbol(myTree,root);
        return valores;
    }



}
