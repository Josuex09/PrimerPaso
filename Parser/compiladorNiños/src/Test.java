import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
//import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.tree.ParseTree;

public class Test { 
	
	
	public static class ParserErrorListener extends BaseErrorListener {
	    @Override
	    public void syntaxError(Recognizer<?, ?> recognizer,
	                            Object offendingSymbol,
	                            int line, int charPositionInLine,
	                            String msg,
	                            RecognitionException e){
	    	
	    	msg = msg.replaceAll("extraneous input", "extraña entrada");
	    	msg = msg.replaceAll("expecting", "se esperaba");
	    	msg = msg.replaceAll("token recognition error at","error de reconocimiento del simbolo");
	    	System.err.println("Error en la linea:"+line+":"+charPositionInLine+" en "+offendingSymbol+": "+msg);
	    }

	}
	
	public static class LexerErrorListener extends BaseErrorListener {
	    @Override
	    public void syntaxError(Recognizer<?, ?> recognizer,
	                            Object offendingSymbol,
	                            int line, int charPositionInLine,
	                            String msg,
	                            RecognitionException e){
	    	
	    	msg = msg.replaceAll("token recognition error at"," token invalido");
	    	System.err.println("Error lexico en la linea "+line+":"+charPositionInLine+msg);
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
		lexer.removeErrorListeners();
		lexer.addErrorListener(new LexerErrorListener());
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		PrimerPasoParser parser = new PrimerPasoParser(tokens);
		parser.removeErrorListeners();
		parser.addErrorListener(new ParserErrorListener());
		ParseTree tree = parser.program();
		System.out.println(tree.toStringTree(parser));
	} 
}