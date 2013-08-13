package titan.gremlin.client;

import javax.script.ScriptException;

public class Main {

	public static void main(String[] args) throws ScriptException {
		TitanQueries titanQueries = new TitanQueries();
		titanQueries.queryVertex();
		titanQueries.queryVertexPair();	
	}
	
}