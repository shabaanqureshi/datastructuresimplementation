import java.util.ArrayList;
import java.util.LinkedList;

public class HashTable<Key, Value> {

	private int size = 0;
	private int bucket;
	LinkedList[] table;

	//Default constructor
	public HashTable() {
		table = new LinkedList[10];
		for (int i = 0; i < table.length; i++) {
			table[i] = new LinkedList<Value>();
		}
	}

	//Constructor 
	public HashTable(int bucket) {
		table = new LinkedList[bucket];
		for (int i = 0; i < table.length; i++) {
			table[i] = new LinkedList<Value>();
		}
	}


	Value put(Key key, Value value) {
		return null;
	}

	//Removes all of the mappings from the map
	void clear() {
	}

	void rehash() {

	}

	Value remove(Key key) {
		return null;
	}



	//Return true if the map contains a mapping for the specified key
	boolean containsKey(Key key) {
		return false;
	}

	//Returns false if this map maps one or more keys to the specified value
	boolean containsValue(Value value) {
		return true;
	}

	//Return the value to which the specified key is mapped or null if this map contains no mapping for the key
	Value get(Key key) {
		return null;
	}

	//Returns the hash code value for this map
	int hashcode() {
		return 5;
	}


	//Returns the number of key-value mappings in this map
	int size() {
		return size;
	}


	public static void main(String[] args) {
		HashTable<String, Integer> t = new HashTable<String, Integer>();
		System.out.println(t.size());
	}
}