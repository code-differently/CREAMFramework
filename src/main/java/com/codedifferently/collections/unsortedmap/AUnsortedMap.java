package com.codedifferently.collections.unsortedmap;

public class AUnsortedMap {
    KeyValuePair data = null;

    public AUnsortedMap(KeyValuePair data) {
        this.data = data;
    }

}


//Login
//
//
//
//HashMap Custom Implementation in Java
//author-image   By Dhiraj,   09 March, 202010K
//In this article, we will be creating a custom HashMap implementation in Java. First, we will discuss how the HashMap provided in Java API actually works internally in brief so that it will be easier with its custom implementation and then we will implement different CRUD operations such as put(), get(), delete() on the HashMap and it's best and worst-case complexity.
//
//
//What is HashMap
//
//HashMap is an implementation of the Map interface that provides storage for key-value pairs. It internally uses the Hashing technique to find the exact bucket number and hence can provide constant-time performance for the basic operations such as to get and put. It does not allow any duplicate key and allows only one null key. If the key is null then that element will be stored in a zero location in Entry array.
//
//
//How HashMap Works Internally
//
//Let us discuss how HashMap works internally in brief. A good explanation can be found here on Youtube by Ranjith.
//
//
//An instance of HashMap can be created with a new operator.
//
//
//Map<String, Integer> map = new HashMap<String, Integer>(5);
//
//
//
//
//
//
//Above statement creates an instance of HashMap with a default bucket size of 16(0...15). The bucket is nothing but an Array of an Entry object. This entry object has the key, value, hashcode of the key and a pointer to the next node. Meaning, HashMap internally uses LinkedList to store the key-value pair. A custom implementation of LinkedList can be found here.
//
//
//We mainly perform 2 operations in a HashMap - put() and get().
//
//
//Put() Operation in HashMap
//
//V put(K key, V value);
//
//map.put("mercury", 1);
//
//put() operation accepts K as a key and V as a. Now, to add this key-value pair in a Map, first, the hashcode of the key is generated and a bit-wise modulus operation(&) is performed with the size of HashMap(15) to find the exact bucket number.  The modulus operation ensures the index to be in the range 0...size of hashmap -1. Below is the prototype.
//
//
//put(K k, V v)
//int hash = hash(k) //calculates the hashcode e.g. - 87673459
//int index = hash & (n - 1)  //n is the capacity or size of HashMap. In a defualt implementation it is 16.
//
//
//
//Suppose, the index value is calculated as 4 then this key value pair would be stored in the fourth bucket(as a 4th element in the array) as an Entry object and an Entry object contains the key, value, hashcode and a pointer to next node.
//
//
//In this case, the pointer to the next object will be null as there is a single element is this node. A pointer to the next node comes into picture when there is a case of collision.
//
//
//Now let us add some more key-value in our HashMap and after adding one more entry at index 5. Now, our HashMap looks similar to:
//
//
//hashmap-put-operation
//Collision In HashMap
//
//Collision is a scenario in which two unequal keys or hashcode results in the same index value and this is a very frequent scenario in a large collection of objects. Since, each bucket of the HashMap is a LinkedList internally, the existing node(Entry Object) points to the new node in case of a collision.
//
//
//
//
//
//
//
//For example, let us perform a put() operation again and though the generated hashcode is different than existing ones, the index value may be the same. In this case, our HashMap will look like this:
//
//
//hashmap-collision
//Since Java 8, the collision case is handled differently. When the no. of entry object in a bucket grows beyond a certain threshold(8) known as TREEIFY_THRESHOLD, the content of that bucket switches from using a LinkedList to a Red-Black Tree. This improves the worst-case performance from O(n) to O(logn)
//
//
//Get() Operation in HashMap
//
//map.get("Mercury") is used to get a value from a Map by the given key. Below is a rough implementation:
//
//
//V get(K key)
//int hashCode= hash(key)
//int index = hashCode & (n - 1) // the index will be 3
//
//
//
//Now, the pointer will go to index 3 of the HashMap and tries to match the key recursively through out the LinkedList of the given bucket. Once, the key is matched to the equals() method then the corresponding value is returned.
//
//
//Equals and HashCode Contract
//
//Always override hashCode() whenever you override equals(). When you don't provide hashcode implementation, Hash based collection(map, Set) uses system generated hashCode to store and retrieve the value, which happens to be different even when two objects have same state.
//
//
//Custom HashMap Entry Object
//
//Now, let us start our custom HashMap implementation that would be very similar to actual implementation discussed above. The Entry object is the actual object that will be stored an entry inside our bucket. It is a LinkedList implementation in Java.
//
//
//public class Entry<K, V> {
//
//    private K key;
//    private V value;
//    private Entry<K, V> next;
//
//    public Entry(K key, V value, Entry<K, V> next){
//        this.key = key;
//        this.value = value;
//        this.next = next;
//    }
//
//    public K getKey() {
//        return key;
//    }
//
//    public void setKey(K key) {
//        this.key = key;
//    }
//
//    public V getValue() {
//        return value;
//    }
//
//    public void setValue(V value) {
//        this.value = value;
//    }
//
//    public Entry getNext() {
//        return next;
//    }
//
//    public void setNext(Entry<K, V> next) {
//        this.next = next;
//    }
//}
//
//
//
//Now, let us implement the different CRUD methods available in a HashMap. hashMap is basically an array of entry object.
//
//
//private int capacity = 16;
//
//    private Entry<K, V>[] table;
//
//    public CustomHashMap(){
//        table = new Entry[capacity];
//    }
//
//    public CustomHashMap(int capacity){
//        this.capacity = capacity;
//        table = new Entry[capacity];
//    }
//
//}
//
//Custom PUT Method Implementation
//
//The put() method accepts key and value as parameters. HashMap allows one null key and multiple null values.
//
//
//Whenever there is no value present at a particular index, we will directly place the Entry object at that index. Else, we will traverse the LinkedList until we reach the last entry of the list and place the new entry object as the next node of the last entry object. In the process, if we find the key already exists then we simply replace its value with the new one.
//
//
//public void put(K key, V value){
//        int index = index(key);
//        Entry newEntry = new Entry(key, value, null);
//        if(table[index] == null){
//            table[index] = newEntry;
//        }else {
//            Entry<K, V> previousNode = null;
//            Entry<K, V> currentNode = table[index];
//            while(currentNode != null){
//                if(currentNode.getKey().equals(key)){
//                    currentNode.setValue(value);
//                    break;
//                }
//                previousNode = currentNode;
//                currentNode = currentNode.getNext();
//            }
//            if(previousNode != null)
//                previousNode.setNext(newEntry);
//            }
//    }
//
//
//
//
//
//
//Custom GET method Implementation
//
//This method implementation is a simple LinkedList traversal and when we find the exact key that we are looking for then we simply return the value.
//
//
//public V get(K key){
//        V value = null;
//        int index = index(key);
//        Entry<K, V> entry = table[index];
//        while (entry != null){
//            if(entry.getKey().equals(key)) {
//                value = entry.getValue();
//                break;
//            }
//            entry = entry.getNext();
//        }
//        return value;
//    }
//
//Custom REMOVE Method Implementation
//
//Get the node at the calculated index first. Traverse the list recursively until the key matches with the key that we are looking for. Whenever, the previous node is null means it is the first element of the list. In this case, assign it's next node to the current index and hence the first element will be removed. Else, assign the next node of the current node to the next node of previous node and hence the current matched node will be removed.
//
//
//public void remove(K key){
//        int index = index(key);
//        Entry previous = null;
//        Entry entry = table[index];
//        while (entry != null){
//            if(entry.getKey().equals(key)){
//                if(previous == null){
//                    entry = entry.getNext();
//                    table[index] = entry;
//                    return;
//                }else {
//                    previous.setNext(entry.getNext());
//                    return;
//                }
//            }
//            previous = entry;
//            entry = entry.getNext();
//        }
//    }
//
//Custom HashMap Complete Implmentation
//
//Below is the complete implementation:
//
//
//package com.devglan.hashmap;
//
//public class CustomHashMap<K, V> {
//
//    private int capacity = 16; //Initial default capacity
//
//    private Entry<K, V>[] table; //Array of Entry object
//
//    public CustomHashMap(){
//        table = new Entry[capacity];
//    }
//
//    public CustomHashMap(int capacity){
//        this.capacity = capacity;
//        table = new Entry[capacity];
//    }
//
//    public void put(K key, V value){
//
//    }
//
//    public V get(K key){
//
//    }
//
//    public void remove(K key){
//
//    }
//
//    public void display(){
//        for(int i = 0; i < capacity; i++){
//            if(table[i] != null){
//                Entry<K, V> currentNode = table[i];
//                while (currentNode != null){
//                    System.out.println(String.format("Key is %s and value is %s", currentNode.getKey(), currentNode.getValue()));
//                    currentNode = currentNode.getNext();
//                }
//            }
//        }
//    }
//
//    private int index(K key){
//        if(key == null){
//            return 0;
//        }
//        return Math.abs(key.hashCode() % capacity);
//    }
//}