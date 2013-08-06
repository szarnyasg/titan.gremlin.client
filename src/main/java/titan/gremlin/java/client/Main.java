package titan.gremlin.java.client;

import javax.script.ScriptException;

public class Main {

	public static void main(String[] args) throws ScriptException {
		TitanQueries titanQueries = new TitanQueries();
		titanQueries.queryVertex();
		titanQueries.queryVertexPair();	
	}
	
}