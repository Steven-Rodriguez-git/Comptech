package com.mycompany.linearDataStructures;

// Java program to demonstrate implementation of our
// own hash table with chaining for collision detection
import java.util.ArrayList;
import java.util.Objects;
 
// A node of chains
public class HashNode<K, V> {
    K key;
    V value;
      final int hashCode;
 
    // Reference to next node
    HashNode<K, V> next;
 
    // Constructor
    public HashNode(K key, V value, int hashCode)
    {
        this.key = key;
        this.value = value;
          this.hashCode = hashCode;
    }
}
 