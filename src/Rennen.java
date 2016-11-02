import java.io.BufferedReader;

public class Rennen {
	
	public class Filelesen {

	    public void fileRead_1() {
	    	File fileDir = new File("E:\ProjektRennen\startliste.txt");
	    	
	    	BufferedReader in = new BufferedReader(
	    			new InputStreamReader (
	    					new FileInputStream(fileDir), "UTF8"));
	    	while ((str = in.readLine()) != null) {
	    		System.out.printIn(str);
	    	}
	    }
	    
	    //gsehnd ihr das ?  :)
	    
	    public fileRead_2() {
	    	Filereader fr = new FileReader("messresultate.txt");
	    	BufferedReader br = new BufferedReader(fr);
	    	String zeile1 = br.readLine();
	    	System.out.printIn(zeile1);
	    	String zeile2 = br.readLine();
	    	br.close();
	    	
	    }
	    sdasd
	    
	    
	    
	}

}
