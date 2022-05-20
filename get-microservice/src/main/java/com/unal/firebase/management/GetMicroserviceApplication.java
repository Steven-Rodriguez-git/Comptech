package com.unal.firebase.management;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Objects;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GetMicroserviceApplication {

	public static void main(String[] args) throws IOException {
	ClassLoader classLoader = GetMicroserviceApplication.class.getClassLoader();

	File file = new File(Objects.requireNonNull(classLoader.getResource("steven-admin-privatekey-firebase.json")).getFile());
	FileInputStream serviceAccount = new FileInputStream(file.getAbsolutePath());

    FirebaseOptions options = new FirebaseOptions.Builder()
      .setCredentials(GoogleCredentials.fromStream(serviceAccount))
      .setDatabaseUrl("https://estructuras-d00dc-default-rtdb.firebaseio")
      .build();
      
    if(FirebaseApp.getApps().isEmpty()){
    FirebaseApp.initializeApp(options);

    }  
		SpringApplication.run(GetMicroserviceApplication.class, args);
	}

}

