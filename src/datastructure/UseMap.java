package datastructure;
import databases.ConnectToSqlDB;
import java.util.*;


public class UseMap {

	public static void main(String[] args) throws Exception {

				HashMap<Object, Object> map = new HashMap<>();
				map.put(1234, "billu");
				map.put(5678, "babu");
				map.put(9000, "bob");

				Iterator<Object> mapIt = map.keySet().iterator();
				Object key;
				while (mapIt.hasNext()) {
					key = mapIt.next();
					System.out.println("KEY: " + key);
					System.out.println("VALUE: " + map.get(key));
				}

				String tableName = "`test_hash_map`";
				ConnectToSqlDB sql = new ConnectToSqlDB();



			}
		}


/*
 * Demonstrate how to use Map that includes storing and retrieving elements.
 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
 * Use For Each loop and while loop with Iterator to retrieve data.
 *
 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
 */
/** INSTRUCTIONS
 *
 * Implement code to demonstrate how to interact with a database connection, using a Map
 * You must insert the map into a table, and then you must submit & execute a query to retrieve
 * all the submitted data (retrieval does not need to be stored as a map - you can use any data structure)
 *
 * Use For-Each loop and While-loop with Iterator to retrieve data.
 */