package org.ssglobal.training.codes;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;
import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.logging.XMLFormatter;
import java.util.stream.Collectors;

public class FunList {
	
	private BufferedReader bufferedReader;
	private Word word; //injectables
	
	//local scope lahat ng logging, it is inside the transactional methods
	//One transactional class, one logger
	// DONT USE LOGGER SA POJO
	// dont use anonymous logger, for utility generic classes only
	//SEVERE level - important messages, serious failures
	//WARNING level - potential problems, always log din lahat ng may warning
	// INFO level - providing informations executed
	//CONFIG/FINE/FINER/FINEST level - not mostly used
	// level OFF/level ALL - to turn on and off the messages
	//Can put the messages in a supplier (try mo ito ha)
	
		// by default - handler is ConsoleHandler
		// one type of handler pero transactional class
		//Step 1A: Instantiate to create a LOGGER (always private and static)
	private static Logger logger = Logger.getLogger(FunList.class.getName());
	
	{ // put inside the IB if paulit ulit yung setup
		
		// name.log lagi and extension haaa
		// pwedeng ibang level, pero type of handler
		//each handler should have different format message
		
		//Step2: Creating another handler(FileHandler)
		// Step3: Format the message
		logger.setLevel(Level.INFO);
				try {
					FileHandler fileHandler = new FileHandler("./src/log/funlist.log", true);
					fileHandler.setEncoding("UTF-8"); //always set to UTF-8 characters
					fileHandler.setLevel(Level.WARNING);
					
					SimpleFormatter formatter = new SimpleFormatter();
					fileHandler.setFormatter(formatter);
					//always add filehandler or any type of handler to the logger
					logger.addHandler(fileHandler);
					
				} catch (SecurityException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
	}
	
	// if may dalawang constructor sa IB nalang ilagay yung setup
	public FunList() {
		//Step 1B: Set the logging level, put inside all of the constructor
		//logger.setLevel(Level.SEVERE); //enum si level
		// bawal sabay mag setlevel (severe muna to lowest)
		//logger.setLevel(Level.WARNING);// palitan ng warning after
		// kapag level.ALL : hanggang INFO lang
		 // mostly info lagi
	
	}
	

	public FunList(String fileName) {
		//Step 1B: Set the logging level
		//logger.setLevel(Level.SEVERE); 
		//logger.setLevel(Level.WARNING);
		// anything na may EXCEPTION ito, sa lahat ng CATCH lalagay pag severe
		//put after the catch
		
		Path p = Paths.get(fileName);
	
		
		try {
			this.bufferedReader = Files.newBufferedReader(p);
		} catch (IOException e) { 
			//Step 1C: Apply severe logging
			logger.severe("Error message: " +  e.getMessage() );
		}
	
	}
	

	public long countWords() {
		logger.info("execute countWords() ");
		
		long temp = this.bufferedReader.lines().map((str) -> 
						{ int count = 0; String[] words = null; 
						words = str.split(" "); count += words.length; 
						return count; }).count();
		
		logger.info("exit without erros countWords() ");
		return temp;
		}
	
	@SuppressWarnings("deprecation")
	public boolean enableDisplay() {
		
		// put INFO after the method name, and before the returns
		logger.info("execute enableDisplay()");
		
		
		// put WARNING message before
		logger.warning("custom date is deprecated");
		Date xmas = new Date(121, 11, 25);
		
		try {
			if( this.bufferedReader.lines().toArray(String[]:: new) != null);
			showLines();
			logger.info("exit without errors enableDisplay()");
			return true;
			
		} catch (Exception e) {
			logger.severe("Error message:" + e.getMessage() );
		}
		
		logger.info("exit with errors enableDisplay()");
		return false;
	}
	
	// put logger
	public void showLines() {
		logger.info("execute showLines() ");
		this.bufferedReader.lines().forEach((line)-> {
			System.out.println(line);
			
		});
		logger.info("exit without errors showLines() ");
	}
	
	// put logger
	public List<String> getContentList() {
		logger.info("execute getContentList() ");
		List<String> temp =  this.bufferedReader.lines().collect(Collectors.toList());
		
		logger.info("exit without errors getContentList() ");
		return temp;
	}
	
	public String[] getContentArray() {
		logger.info("execute getContentArray() ");
		//return this.bufferedReader.lines().toArray(String[]:: new);
		String[] temp = (String []) this.bufferedReader.lines().toArray();
		
		logger.info("exit without errors getContentArray() ");
		return temp;
	}
	
	public String[] getContentArray2() {
		logger.info("execute getContentArray2() ");
		String [] temp = this.bufferedReader.lines().toArray(String[]:: new);

		logger.info("exit without errors getContentArray2() ");
		return temp;
	}
	
	public String processStr(String str1, String str2) {
		logger.info("execute processStr str1 = " + str1 + " str2 =" + str2);
		String temp = String.join(" ", str1, str2);
		
		logger.info("exit without errors processStr() ");
		return temp;
	}
		
	
	class Word { //HAS-A relationship
		
	}
}

//HUWAG MO HAHAYAANG MAY EXCEPTION 
//rewrite test methods


