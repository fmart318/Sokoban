package parser;

import java.io.*;
import java.util.*;


public class GameParser {
	private final File file;
	private int width;
	private int height;

	/**
	 * Creates a new parser for the given file
	 * 
	 * @param file
	 *            The file to parse
	 */
	public GameParser(File file) {
		this.file = file;
	}
	
    public void readLines(File file) throws IOException{
    	
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        
        String numbers[];
        String currentLine = null;
        
        while ((currentLine = bufferedReader.readLine()) != null) {
        	currentLine = borrarComentarios(currentLine);
            currentLine = currentLine.trim();
            numbers = currentLine.split(","); 
        }
        bufferedReader.close();
        return ;
    }
	
    public String borrarComentarios(String line){
    	StringBuilder aux = new StringBuilder(line);
    	
    	for(int i=0; i<line.length() ; i++){
    		if(line.charAt(i) == '#')
    			aux.delete(i, line.length());
    	}
    	
    	return aux.toString();
    }
    
    
    
	
}
