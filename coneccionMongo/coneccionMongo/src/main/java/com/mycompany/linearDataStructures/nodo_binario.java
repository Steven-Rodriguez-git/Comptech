package com.mycompany.linearDataStructures;

public class nodo_binario extends nodo{
        /*
        ************** REVISION EL 27/05/2022 **********************
        -Esta clase fu� creada para uso de �rboles y circulares.
        -Extiende de nodo solo para usar el constructor.
        -No se recomienda llamar a super.siguiente, ya que es de tipo nodo, y no de nodo_binario
    */
    
        nodo_binario right;
        nodo_binario left;
        public nodo_binario(Comparable dato){ // constructor para usar gen�ricos
            super(dato);        
        }
        
    }
