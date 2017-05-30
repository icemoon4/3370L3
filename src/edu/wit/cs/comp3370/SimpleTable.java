package edu.wit.cs.comp3370;

public class SimpleTable extends HashTable {
		
	public SimpleTable(int size) {
		super(size);
	}

	@Override
	public int calculateHash(String word) {
		int hash = 0;
		int multiplier = 31;
		for(byte b=0; b<word.length(); b++){
			hash = ((hash*multiplier)+word.charAt(b)) % tableSize;
		}
		return hash;
	}

}
