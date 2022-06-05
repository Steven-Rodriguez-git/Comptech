package com.unal.firebase.management.controller;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import com.google.firebase.cloud.FirestoreClient;
import com.unal.firebase.management.models.Almacenamiento;
import com.unal.firebase.management.models.Board;
import com.unal.firebase.management.models.Grafica;
import com.unal.firebase.management.models.Procesador;
import com.unal.firebase.management.models.Ram;
import com.unal.firebase.management.models.AllRam;

import java.util.concurrent.ExecutionException;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.time.Instant;
import org.apache.commons.lang3.time.StopWatch;

import com.unal.firebase.management.models.Procesador;

import Estructuras.ALCircular;
import Estructuras.ArrayList;
import Estructuras.Cola;
import Estructuras.Pilas;
import Estructuras.LinkedList;
import com.google.cloud.firestore.QuerySnapshot;


@Service
public class GetService {

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
  }


  public Board getCRUDBoard(String documentId)
    throws InterruptedException, ExecutionException {
    Firestore dbFireStore = FirestoreClient.getFirestore();
    DocumentReference documentReference = dbFireStore
      .collection("board")
      .document(documentId);
    ApiFuture<DocumentSnapshot> future = documentReference.get();
    DocumentSnapshot document = future.get();

    Board board;

    if (document.exists()) {
        
      board = document.toObject(Board.class);
      return board;
    }

    return null;
  }

  public Grafica getCRUDGrafica(String documentId)
  throws InterruptedException, ExecutionException {
  Firestore dbFireStore = FirestoreClient.getFirestore();
  DocumentReference documentReference = dbFireStore
    .collection("grafica")
    .document(documentId);
  ApiFuture<DocumentSnapshot> future = documentReference.get();
  DocumentSnapshot document = future.get();

  Grafica grafica;

  if (document.exists()) {
      
    grafica = document.toObject(Grafica.class);
    return grafica;
  }

  return null;
}

public Procesador getCRUDProcesador(String documentId)
throws InterruptedException, ExecutionException {
Firestore dbFireStore = FirestoreClient.getFirestore();
DocumentReference documentReference = dbFireStore
  .collection("procesador")
  .document(documentId);
ApiFuture<DocumentSnapshot> future = documentReference.get();
DocumentSnapshot document = future.get();

Procesador procesador;

if (document.exists()) {
    
  procesador = document.toObject(Procesador.class);
  return procesador;
}

return null;
}

public Ram getCRUDRam(String documentId)
throws InterruptedException, ExecutionException {
Firestore dbFireStore = FirestoreClient.getFirestore();
DocumentReference documentReference = dbFireStore
  .collection("ram")
  .document(documentId);
ApiFuture<DocumentSnapshot> future = documentReference.get();
DocumentSnapshot document = future.get();

Ram ram;

if (document.exists()) {
    
  ram = document.toObject(Ram.class);
  return ram;
}

return null;
}


// Esta función no debería seguir existiendo, está mal hecha en comparación  a las demás de abajo
public long getCRUDAllProcesador()throws InterruptedException, ExecutionException {
System.out.println("------------Procesador->ArrayList");
//Procesador procesador;
String[] procesadoresPrueba = {"H4aC0YXxRBgqX4nBTWMU","Grcj9K8wk7vrJvywB8Yb","V8O04Ad1StMUi49ZGysz","ZLfIbadJfmKtaUeXFTJY","PZWJTQfWwKEa4QuAXuMd","LJwUMCdD5aCbz8SjipUU","Ia6eMmZIZbKqc7PIyxEr","EgR1sKhp24Pad12c16xa","DcBouAAh5jGG2IbyU1Zz","01gCyPFh1dti72Eofbj3","2EodrzzgDF9S2WHEAnIL","2RUj976lsDulLydkhjkg","2cOu61UsOm37Eh7ryaWF","6oKyfSdFlaCQliTu40Oa","Afsa6kC5VMG9jpUtTXzp","XIIAvBJD20cNZIrWtTbe","ZfO56v1qzKoa9O2AC5dT","z8hWKsOPlwQ5dSZGQqQy","wnIF4dt3AoLOWdi6Icif","qFYfvCiqHqI7A8ydGHHH"};
long start =0;
long end =0;
long totalStart = System.currentTimeMillis();
long totalEnd = 0;
ArrayList arregloDinamico = new ArrayList();

for(int i=0;i<procesadoresPrueba.length;i++){ // en este for solo estan metiendo 10 datos y luego buscan esos mismos 10 datos dentro de este mismo for osea ... ? hay que buscarlos en la base de datos.
    start = System.currentTimeMillis();
    String documentId=procesadoresPrueba[i];
    Firestore dbFireStore = FirestoreClient.getFirestore();
    DocumentReference documentReference = dbFireStore
      .collection("procesador")
      .document(documentId);
    ApiFuture<DocumentSnapshot> future = documentReference.get();
    DocumentSnapshot document = future.get();
    
    
    //procesador = document.toObject(Procesador.class);
    //aca se meten las estructuras
    arregloDinamico.push((Comparable) document.get("marca"));
    
    
    System.out.print("dato traido:   "+arregloDinamico.Search(i));
    end = System.currentTimeMillis();
    System.out.println("  tiempo usado en la tarea: " + (end-start));

    
}
totalEnd= System.currentTimeMillis();

  return totalEnd-totalStart;

}



public ArrayList getCollectionProcesador() throws InterruptedException, ExecutionException{
    Firestore dbFireStore = FirestoreClient.getFirestore();
     ApiFuture<QuerySnapshot> future =  dbFireStore.collection("procesador").get();
    QuerySnapshot documents= future.get();
    
    return CrearArrayList(documents);
       
}


public Pilas getCollectionGrafica() throws InterruptedException, ExecutionException{
    Firestore dbFireStore = FirestoreClient.getFirestore();
     ApiFuture<QuerySnapshot> future =  dbFireStore.collection("grafica").get();
    QuerySnapshot documents= future.get();
    
    return CrearPila(documents);    
}



public Cola getCollectionAlmacenamiento() throws InterruptedException, ExecutionException{
    Firestore dbFireStore = FirestoreClient.getFirestore();
     ApiFuture<QuerySnapshot> future =  dbFireStore.collection("almacenamiento").get();
    QuerySnapshot documents= future.get();
    
    return CrearCola(documents);
       
}

    public ArrayList CrearArrayList(QuerySnapshot objetos)throws InterruptedException, ExecutionException{
        System.out.println("---------------> arraylist/procesador");

    ArrayList estructurado = new ArrayList();
    
    long tiempoInicio = System.currentTimeMillis();
    long tiempoFinal =0;
    
    for(DocumentSnapshot document : objetos){
        Procesador elementoPc = document.toObject(Procesador.class);
        estructurado.push(elementoPc.nombre);
    }
    tiempoFinal = System.currentTimeMillis();
    System.out.println("para insertar datos se demoro: "+(tiempoFinal-tiempoInicio));
    
    long escrituraInicio = System.currentTimeMillis();
    long escrituraFinal =0;
    for(int i=0;i<objetos.size();i++){
        System.out.print("dato Actual: ");
        System.out.println(estructurado.Search(i));
        
    }
    tiempoFinal = System.currentTimeMillis();
    System.out.println("para insertar datos se demoro: "+(tiempoFinal-tiempoInicio));

    return estructurado;
}
public Cola CrearCola(QuerySnapshot objetos)throws InterruptedException, ExecutionException{
        System.out.println("---------------> cola/almacenamiento");

    Cola estructurado = new Cola();
    
    long tiempoInicio = System.currentTimeMillis();
    long tiempoFinal =0;
    
    for(DocumentSnapshot document : objetos){
        Almacenamiento elementoPc = document.toObject(Almacenamiento.class);
        estructurado.enqueue(elementoPc.nombre);
    }
    tiempoFinal = System.currentTimeMillis();
    System.out.println("para insertar datos se demoro: "+(tiempoFinal-tiempoInicio));
    
    long escrituraInicio = System.currentTimeMillis();
    long escrituraFinal =0;
    for(int i=0;i<objetos.size();i++){
        if(i%1000==0){
        System.out.print("dato Actual: ");
        System.out.println(estructurado.search(i));
        }
        
    }
    escrituraFinal = System.currentTimeMillis();
    System.out.println("para buscar datos se demoro: "+(escrituraFinal-escrituraInicio));

    return estructurado;
}


public Pilas CrearPila(QuerySnapshot objetos)throws InterruptedException, ExecutionException{
    System.out.println("---------------> pilas/grafica");
    Pilas estructurado = new Pilas();
    
    long tiempoInicio = System.currentTimeMillis();
    long tiempoFinal =0;
    
    for(DocumentSnapshot document : objetos){
        Grafica elementoPc = document.toObject(Grafica.class);
        estructurado.push(elementoPc.nombre);
    }
    tiempoFinal = System.currentTimeMillis();
    System.out.println("para insertar datos se demoro: "+(tiempoFinal-tiempoInicio));
    
    long escrituraInicio = System.currentTimeMillis();
    long escrituraFinal =0;
    for(int i=0;i<objetos.size();i++){
        estructurado.Search(i);
    }
    escrituraFinal = System.currentTimeMillis();
    System.out.println("para insertar datos se demoro: "+(escrituraFinal-escrituraInicio));

    //quitar
    
    long eliminarInicio= System.currentTimeMillis();
    long eliminarFinal = 0;
    for(int i=0;i<objetos.size();i++){
        estructurado.pop();
    }
    eliminarFinal = System.currentTimeMillis();
    System.out.println("para eliminar datos se demoro: "+(eliminarFinal-eliminarInicio));

    return estructurado;
}

}