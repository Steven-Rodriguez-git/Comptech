package Estructuras;

class nodo_binario extends nodo{
        /*
        ************** REVISION EL 27/05/2022 **********************
        -Esta clase fué creada para uso de árboles y circulares.
        -Extiende de nodo solo para usar el constructor.
        -No se recomienda llamar a super.siguiente, ya que es de tipo nodo, y no de nodo_binario
    */
    
        nodo_binario right;
        nodo_binario left;
        nodo_binario(Comparable dato){ // constructor para usar genéricos
            super(dato);        
        }
        
    }
