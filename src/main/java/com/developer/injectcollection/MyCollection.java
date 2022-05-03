package com.developer.injectcollection;

import java.util.*;

public class MyCollection {

	private List<String> myList;
	private Set<String> mySet;
	private Map<Integer,String> myMap;
	private List<Book> myBook;
	
	public List<String> getMyList() {
		return myList;
	}
	public void setMyList(List<String> myList) {
		this.myList = myList;
	}
	public Set<String> getMySet() {
		return mySet;
	}
	public void setMySet(Set<String> mySet) {
		this.mySet = mySet;
	}
	public Map<Integer, String> getMyMap() {
		return myMap;
	}
	public void setMyMap(Map<Integer, String> myMap) {
		this.myMap = myMap;
	}
	public List<Book> getMyBook() {
		return myBook;
	}
	public void setMyBook(List<Book> myBook) {
		this.myBook = myBook;
	}
	
	
	
	
}
