package com.mycompany.coneccionmongo;
import com.mongodb.client.*;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;



import com.mycompany.linearDataStructures.*;
import com.mycompany.coneccionmongo.arbolesPorComponente;
class retornoMaximo{
    public retornaArbol prueba;

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

    public String[] coleccion = {"almacenamiento","board","grafica","procesador","ram"};
    public String[] almacenamiento= {"capacidad","tipo","velLectura","velEscritura","marca","precio"};
    public String[] board= {"chipset","socket","compatibilidadArqRam","maxRam","puertos","marca","precio"};
    public String[] grafica= {"memoria","arquitectura","anchoBanda","frecuenciaBase","frecuenciaOc","consumo","computo","marca","precio"};
    public String[] procesador= {"generacion","nucleos","hilos","frecuencia","cache","consumo","graficaIntegrada","marca","precio"};
    public String[] ram= {"capacidad","arquitectura","velocidad","tasaTransferencia","marca","precio"};

    public MongoDatabase database;



    public arbolesPorComponente(MongoDatabase database){
       this.database = database;
        
        this.almacenamiento_capacidad = creacionArboles(coleccion[0],almacenamiento[0]);
        this.almacenamiento_tipo = creacionArboles(coleccion[0],almacenamiento[1]);
        this.almacenamiento_velLectura = creacionArboles(coleccion[0],almacenamiento[2]);       
        this.almacenamiento_velEscritura = creacionArboles(coleccion[0],almacenamiento[3]);
        this.almacenamiento_marca = creacionArboles(coleccion[0],almacenamiento[4]);
        this.almacenamiento_precio = creacionArboles(coleccion[0],almacenamiento[5]);       
        
        this.board_chipset = creacionArboles(coleccion[1], board[0]);
        this.board_socket = creacionArboles( coleccion[1], board[1]);
        this.board_compatibilidadArqRam = creacionArboles( coleccion[1], board[2]);
        this.board_maxRam = creacionArboles(coleccion[1], board[3]);
        this.board_puertos = creacionArboles(coleccion[1], board[4]);
        this.board_marca = creacionArboles(coleccion[1], board[5]);
        this.board_precio = creacionArboles( coleccion[1], board[6]);
        
        this.grafica_memoria = creacionArboles(coleccion[2], grafica[0]);
        this.grafica_arquitectura = creacionArboles( coleccion[2], grafica[1]);
        this.grafica_anchoBanda = creacionArboles( coleccion[2], grafica[2]);
        this.grafica_frecuenciaBase = creacionArboles( coleccion[2], grafica[3]);
        this.grafica_frecuenciaOc = creacionArboles( coleccion[2], grafica[4]);
        this.grafica_consumo = creacionArboles( coleccion[2], grafica[5]);
        this.grafica_computo = creacionArboles( coleccion[2], grafica[6]);
        this.grafica_marca = creacionArboles( coleccion[2], grafica[7]);
        this.grafica_precio = creacionArboles( coleccion[2], grafica[8]);

        this.procesador_generacion = creacionArboles( coleccion[3], procesador[0]);
        this.procesador_nucleos = creacionArboles( coleccion[3], procesador[1]);
        this.procesador_hilos = creacionArboles( coleccion[3], procesador[2]);
        this.procesador_frecuencia = creacionArboles( coleccion[3], procesador[3]);
        this.procesador_cache = creacionArboles( coleccion[3], procesador[4]);
        this.procesador_consumo = creacionArboles( coleccion[3], procesador[5]);
        this.procesador_graficaIntegrada = creacionArboles( coleccion[3], procesador[6]);
        this.procesador_marca = creacionArboles( coleccion[3], procesador[7]);
        this.procesador_precio = creacionArboles( coleccion[3], procesador[8]);

        this.ram_capacidad = creacionArboles( coleccion[4], ram[0]);
        this.ram_arquitectura = creacionArboles( coleccion[4], ram[1]);
        this.ram_velocidad = creacionArboles( coleccion[4], ram[2]);
        this.ram_tasaTransferencia = creacionArboles( coleccion[4], ram[3]);
        this.ram_marca = creacionArboles( coleccion[4], ram[4]);
        this.ram_precio = creacionArboles( coleccion[4], ram[5]);

    }
    
    public retornaArbol creacionArboles(String coleccion, String caracteristica){
        retornaArbol conjuntoArbol= ArbolImplementar(coleccion,caracteristica);//cree el arbol
        Tree arbol =  conjuntoArbol.myTree;
        nodo_binario cabezaTree =  conjuntoArbol.root;
        
        conjuntoArbol.root = arbol.rotacion(cabezaTree);//ordene todo arbol
        
        return conjuntoArbol;

    }

    public retornaArbol ArbolImplementar(String coleccion, String caracteristica){
        //System.out.println(coleccion);
        //System.out.println(caracteristica);

        database = this.database;
        Tree myTree = new Tree();
        nodo_binario root = null;
        Comparable data;
        MongoCollection<Document> collection = database.getCollection(coleccion);
        MongoCursor<Document> cursor = collection.find().iterator();
        try {
            //while (cursor.hasNext()) {
            for(int i=0;i<100;i++){
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
