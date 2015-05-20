import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
//import org.antlr.v4.runtime.tree.*;

public class Test { 
	
	
	public static class VerboseListener extends BaseErrorListener {
	    @Override
	    public void syntaxError(Recognizer<?, ?> recognizer,
	                            Object offendingSymbol,
	                            int line, int charPositionInLine,
	                            String msg,
	                            RecognitionException e)
	    {
	        System.err.println("Error lexico en la linea "+line+":"+charPositionInLine+" token invalido:"+msg.charAt(msg.length()-2));
	    }

	}
	
	
	
	public static String leerArchivo(String ruta){
		File archivo = null;
	    FileReader fr = null;
	    String total="";
	    BufferedReader br = null;
	 
	      try {
	         archivo = new File (ruta);
	         fr = new FileReader (archivo);
	         br = new BufferedReader(fr);
	         String linea;
	         while((linea=br.readLine())!=null)
	            total+=linea+"\n";
	      }
	      catch(Exception e){
	         e.printStackTrace();
	      }finally{
	         try{                    
	            if( null != fr ){   
	               fr.close();     
	            }                  
	         }catch (Exception e2){ 
	            e2.printStackTrace();
	         }
	      }
	      return total;
	}
	public static void main(String[] args) throws Exception {
		ANTLRInputStream input = new ANTLRInputStream(leerArchivo(args[0]));
		PrimerPasoLexer lexer = new PrimerPasoLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		//MANEJAR LOS ERRORES 
		lexer.removeErrorListeners();
		lexer.addErrorListener(new VerboseListener());
		tokens.fill();
		int i=0;
		for(Object t:tokens.getTokens()){
			System.out.println("Token #"+(i++)+": "+t.toString().split("'")[1]);
			
		}	
	} 
}