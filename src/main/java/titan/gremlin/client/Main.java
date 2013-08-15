package titan.gremlin.client;

import javax.script.ScriptException;

public class Main {

	public static void main(String[] args) throws ScriptException {
		if (args.length < 2) {
			System.out.println("Usage: client HOST <vertices|vertexpairs>");
			return;
		}

		final String host = args[1];
		TitanQueries titanQueries = new TitanQueries(host);
		
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