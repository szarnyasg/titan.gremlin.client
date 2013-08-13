package titan.gremlin.client;

import javax.script.ScriptException;

public class Main {

	public static void main(String[] args) throws ScriptException {
		if (args.length < 1) {
			System.out.println("Usage: client <vertices|vertexpairs>");
			return;
		}

		TitanQueries titanQueries = new TitanQueries();
		
		switch (args[0]) {
		case "vertices":
			titanQueries.queryVertex();
			break;
		case "vertexpairs":
			titanQueries.queryVertexPair();
			break;
		default:
			System.out.println("Invalid parameter.");
			break;
		}

	}

}