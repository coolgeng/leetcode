class HashTable <K, V>{
	private static class Entry<K, V> {
		private final K key;
		private final V value;
		
		Entry(K key, V val){
			this.key = key;
			this.val = val;
		}
	}
	
	private static int BUCK_COUNT = 13;
	
	private List<Entry>[] buckets = new ArrayList[BUCKET_COUNT];
	
	public HashTable(){
		for (int i = 0, l = buckets.length; i < l; i++) {
			buckets[i] = new ArrayList<Entry<K, V>>();
		}
	}
	
	public V get(K key){
		int b = key.hashCode() % BUCKET_COUNT;
		List<Entry> entries = buckets[b];
		for (Entry entry: entries){
			if (e.key.equals(key)) {
				return e.val;
			}
		}
		return null;
	}
	
	public void put(K key, V val){
		int b = key.hashCode() % BUCKET_COUNT;
		List<Entry> entries = buckets[b];
		entries.add(new Entry<K,V>(key, val));
	}
	
}