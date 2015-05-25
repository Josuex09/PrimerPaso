import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.IntervalSet;

class ParserErrorStrategy extends DefaultErrorStrategy {

	private String filterTokenString(String token) {
		String res = token;
		if (token.equals("\n"))
			res = "\\n";
		else if (token.equals("'\n'"))
			res = "'\\n'";
		return res;
	}

	@Override
	public void reportNoViableAlternative(Parser parser, NoViableAltException e)
			throws RecognitionException {
		String msg = "Amigo, el problema es con la entrada : "
				+ filterTokenString(getTokenErrorDisplay(e.getOffendingToken()));
		parser.notifyErrorListeners(e.getOffendingToken(), msg, e);
	}

	@Override
	public void reportInputMismatch(Parser recognizer, InputMismatchException e) {
		String msg = "Amigo, el problema es con la entrada "
				+ filterTokenString(getTokenErrorDisplay(e.getOffendingToken()))
				+ " no coincide con lo esperado: "
				+ " "
				+ filterTokenString(e.getExpectedTokens().toString(
						recognizer.getVocabulary()));
		recognizer.notifyErrorListeners(e.getOffendingToken(), msg, e);
	}

	@Override
	public void reportUnwantedToken(Parser recognizer) {
		if (inErrorRecoveryMode(recognizer)) {
			return;
		}
		beginErrorCondition(recognizer);

		Token t = recognizer.getCurrentToken();
		String tokenName = getTokenErrorDisplay(t);
		IntervalSet expecting = getExpectedTokens(recognizer);
		String msg = "¿Qué querías decir con esto: "
				+ filterTokenString(tokenName) + "?, yo esperaba esto: "
				+ expecting.toString(recognizer.getVocabulary());
		recognizer.notifyErrorListeners(t, msg, null);
	}

	@Override
    public void reportFailedPredicate(Parser recognizer,FailedPredicateException e) {
        String ruleName = recognizer.getRuleNames()[recognizer.getContext().getRuleIndex()];
        String msg = "La regla "+ruleName+" no concuerda con la entrada "+filterTokenString(getTokenErrorDisplay(e.getOffendingToken()));
        recognizer.notifyErrorListeners(e.getOffendingToken(), msg, e);
    }

	@Override
    public void reportMissingToken(Parser recognizer) {
        if (inErrorRecoveryMode(recognizer)) {
            return;
        }
        beginErrorCondition(recognizer);

        Token t = recognizer.getCurrentToken();
        IntervalSet expecting = getExpectedTokens(recognizer);
        String msg = " falta : "+filterTokenString(expecting.toString(recognizer.getVocabulary()))+
                " en "+filterTokenString(getTokenErrorDisplay(t));

        recognizer.notifyErrorListeners(t, msg, null);
    }
}
