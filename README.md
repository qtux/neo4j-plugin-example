# neo4j-plugin-example
A simple Neo4j 2.3.x server plugin example

Setup:

* execute `mvn package`
* copy **target/example-1.0-SNAPSHOT.jar** to the Neo4j plugins folder (for example **/usr/share/java/neo4j/plugins** on Linux)
* restart the Neo4j server

Usage:

```shell
curl -u neo4j:neo4j -X POST http://localhost:7474/db/data/ext/Example/graphdb/helloWorld
```
