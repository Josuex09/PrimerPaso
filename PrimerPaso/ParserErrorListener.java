import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

	public class ParserErrorListener extends BaseErrorListener {
	    @Override
	    public void syntaxError(Recognizer<?, ?> recognizer,
	                            Object offendingSymbol,
	                            int line, int charPositionInLine,
	                            String msg,
	                            RecognitionException e){
	    	
	    	
	    	/*msg = msg.replaceAll("mismatched input", "no coincide la entrada");
	    	msg = msg.replaceAll("no viable alternative at input", "error en la entrada");
	    	msg = msg.replaceAll("missing", "falta");
	    	msg = msg.replaceAll("extraneous input", "extraña entrada");
	    	msg = msg.replaceAll("expecting", "se esperaba");
	    	msg = msg.replaceAll("token recognition error at","error de reconocimiento del simbolo");
	    	msg = msg.replaceAll("at", "en");
	    	System.err.println("Error en la linea:"+line+":"+charPositionInLine+" en "+offendingSymbol+": "+msg);
	    	*/
	    	System.err.println("Ops!! hubo un error sintactico en la linea:"+line+":"+charPositionInLine+"  "+msg);
	    }

	}
