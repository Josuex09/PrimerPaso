import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

	public class LexerErrorListener extends BaseErrorListener {
	    @Override
	    public void syntaxError(Recognizer<?, ?> recognizer,
	                            Object offendingSymbol,
	                            int line, int charPositionInLine,
	                            String msg,
	                            RecognitionException e){
	    	
	    	//msg = msg.replaceAll("token recognition error at"," token invalido");
	    	//System.err.println("Error  en la linea "+line+":"+charPositionInLine+msg);
	    	System.err.println("Ops!! hubo un error lexico en la linea:"+line+":"+charPositionInLine+" no entiendo esto: "+msg.charAt(msg.length()-2) );
	    }

	}