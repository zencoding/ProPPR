package edu.cmu.ml.praprolog.prove;

import edu.cmu.ml.praprolog.prove.wam.State;

public class MinAlphaException extends IllegalStateException {
	public MinAlphaException(double minAlpha, double localAlpha, State u) {
		super("minAlpha too high! Did you remember to set alpha in logic program components? "+
                		"dpr minAlpha ="+minAlpha+" localAlpha="+localAlpha+" for state "+u);
	}
}
