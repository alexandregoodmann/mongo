package goodmann.mongo.book;

import java.net.UnknownHostException;

import com.mongodb.MongoClient;

@org.springframework.stereotype.Service
public class Service {

	public void connect() throws UnknownHostException {
		MongoClient mongoClient = new MongoClient("mongo", 27017);
		mongoClient.getDatabaseNames().forEach(e -> {
			System.out.println(e);
		});
	}
}
