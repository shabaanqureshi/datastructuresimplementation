import java.util.ArrayList;
import java.util.LinkedList;

public class HashTable<K, V> {

	private int size = 0;
	private int capacity;
	private LinkedList<Pair>[] table;

	public HashTable() {
		int capacity = 10;
		table = new LinkedList[capacity];
		for (int i = 0; i < table.length; i++) {
			table[i] = new LinkedList<Pair>();
		}

	}

	public HashTable(int capacity) {
		this.capacity = capacity;
		LinkedList<Pair>[] table = new LinkedList[this.capacity];
		for (int i = 0; i < table.length; i++) {
			table[i] = new LinkedList<Pair>();
		}
	}

	public void clear() {
		size = 0;
		table = new LinkedList[size];
	}

	public boolean containsKey(K key) {
		LinkedList<Pair> list = table[((key.hashCode() % capacity) + capacity) % capacity];
		for (Pair p: list) {
			if (p.key.equals(key)) {
				return true;
			}
		}
		return false;
	}

	public V get(K key) {
		LinkedList<Pair> list = table[((key.hashCode() % capacity) + capacity) % capacity];
		for (Pair p: list) {
			if (p.key.equals(key)) {
				return (V) p.value;
			}
		}
		return null;
	}

	public void put(K key, V value) {
		LinkedList<Pair> list = table[((key.hashCode() % capacity) + capacity) % capacity];
		for (Pair p: list) {
			if (containsKey(key)) {
				if(p.key.equals(key)) {
					p.value = (V) value;
				}
			}
			else {
				Pair newPair = new Pair((K)key, (V)value);
				list.addLast(newPair);
				size = size + 1;
			}
		}


	}

	public void resize(int capacity) {

	}

	public int size() {
		return size;
	}
	public static void main(String[] args) {
		HashTable<Integer, Integer> map = new HashTable<Integer, Integer>();
		map.put(5, 2);
		map.put(5,1);
		map.put(8,1);
		map.containsKey(8);
		map.containsKey(7);
		map.get(1);
		map.clear();
		map.size();
		map.containsKey(8);
		System.out.println("testing");
	}

	public class Pair<K, V> {
		K key;
		V value;

		public Pair(K key, V value) {
			this.key = key;
			this.value = value;
		}
	}
}