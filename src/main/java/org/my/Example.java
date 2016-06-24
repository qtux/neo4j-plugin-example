package org.my;

import org.neo4j.server.plugins.Description;
import org.neo4j.server.plugins.PluginTarget;
import org.neo4j.server.plugins.ServerPlugin;
import org.neo4j.server.plugins.Source;
import org.neo4j.server.rest.repr.Representation;
import org.neo4j.server.rest.repr.ValueRepresentation;
import org.neo4j.graphdb.GraphDatabaseService;

@Description("Comprehensive plugin description.")
public class Example extends ServerPlugin {
	@Description("Returns 'Hello World'")
	@PluginTarget(GraphDatabaseService.class)
	public Representation helloWorld(@Source GraphDatabaseService graphDb) {
		return ValueRepresentation.string("Hello World");
	}
}
