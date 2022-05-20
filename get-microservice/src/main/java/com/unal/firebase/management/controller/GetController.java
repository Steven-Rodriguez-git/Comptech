package com.unal.firebase.management.controller;

import com.google.cloud.firestore.CollectionReference;
import java.util.concurrent.ExecutionException;

import com.unal.firebase.management.models.Almacenamiento;
import com.unal.firebase.management.models.Board;
import com.unal.firebase.management.models.Grafica;
import com.unal.firebase.management.models.Procesador;
import com.unal.firebase.management.models.Ram;
import com.unal.firebase.management.models.AllRam;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetController {
    
     public GetService getService;

    public GetController(GetService getService){
        this.getService = getService;
    }

    @GetMapping("/getAlmacenamiento")
    public Almacenamiento getAlmacenamiento(@RequestParam String documentId) throws InterruptedException, ExecutionException{
       return getService.getCRUDAlmacenamiento(documentId);
    }

    @GetMapping("/getBoard")
    public Board getBoard(@RequestParam String documentId) throws InterruptedException, ExecutionException{
       return getService.getCRUDBoard(documentId);
    }

    @GetMapping("/getGrafica")
    public Grafica getGrafica(@RequestParam String documentId) throws InterruptedException, ExecutionException{
       return getService.getCRUDGrafica(documentId);
    }

    @GetMapping("/getProcesador")
    public Procesador getProcesador(@RequestParam String documentId) throws InterruptedException, ExecutionException{
       return getService.getCRUDProcesador(documentId);
    }

    @GetMapping("/getRam")
    public Ram getRam(@RequestParam String documentId) throws InterruptedException, ExecutionException{
       return getService.getCRUDRam(documentId);
    }

    @GetMapping("/test")    
    public ResponseEntity<String> testGetEndpoint(){
        return ResponseEntity.ok("Test working");
    }
    
    @GetMapping("/GetAllProcesador")
    public void getProcesadorCollection() throws InterruptedException, ExecutionException{
        getService.getCollectionProcesador();
    }
    
    
    @GetMapping("/GetAllGrafica")
    public void getGraficaCollection() throws InterruptedException, ExecutionException{
        getService.getCollectionGrafica();
    }
       @GetMapping("/GetAllAlmacenamiento")
    public void getAlmacenamientoCollection() throws InterruptedException, ExecutionException{
        getService.getCollectionAlmacenamiento();
       
        
    }

}
