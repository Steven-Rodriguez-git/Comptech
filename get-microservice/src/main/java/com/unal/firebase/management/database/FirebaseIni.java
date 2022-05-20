package com.unal.firebase.management.database;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.Firestore;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;

import java.io.IOException;
import java.io.InputStream;

import javax.annotation.PostConstruct;
import org.springframework.stereotype.Service;

@Service
public class FirebaseIni {

  @PostConstruct
  private void initFirebase() throws IOException {
    InputStream serviceAccount = getClass().getClassLoader().getResourceAsStream("david-admin-privatekey-firebase.json");

    FirebaseOptions options = new FirebaseOptions.Builder()
      .setCredentials(GoogleCredentials.fromStream(serviceAccount))
      .setDatabaseUrl("https://estructuras2-6b96d-default-rtdb.firebaseio.com")
      .build();

    if(FirebaseApp.getApps().isEmpty()){
    FirebaseApp.initializeApp(options);

    }  
  }

  public Firestore getFirestore(){
      return FirestoreClient.getFirestore();
  }
}