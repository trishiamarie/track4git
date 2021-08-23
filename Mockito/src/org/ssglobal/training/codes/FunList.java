package org.ssglobal.training.codes;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class FunList {
	
	private BufferedReader bufferedReader;
	private Word word; //injectables
	
	
	public FunList() {
		
	}
	
	
	
	public FunList(String fileName) {
		Path p = Paths.get(fileName);
		
		try {
			this.bufferedReader = Files.newBufferedReader(p);
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}
	

	public long countWords() {
		
		return this.bufferedReader.lines().map((str) -> 
						{ int count = 0; String[] words = null; 
						words = str.split(" "); count += words.length; 
						return count; }).count();
		}
	
	public boolean enableDisplay() {
		if( this.bufferedReader.lines().toArray(String[]:: new) != null);
		showLines();
		return true;
	}
	

	public void showLines() {
		
		this.bufferedReader.lines().forEach((line)-> {
			System.out.println(line);
		});
	}
	
	public List<String> getContentList() {
		return this.bufferedReader.lines().collect(Collectors.toList());
	}
	
	public String[] getContentArray() {
		//return this.bufferedReader.lines().toArray(String[]:: new);
		return (String []) this.bufferedReader.lines().toArray();
	}
	
	public String[] getContentArray2() {
		return this.bufferedReader.lines().toArray(String[]:: new);

	}
	
	public String processStr(String str1, String str2) {
		return String.join(" ", str1, str2);
	}
		
	
	class Word { //HAS-A relationship
		
	}
}

//HUWAG MO HAHAYAANG MAY EXCEPTION 
//rewrite test methods


