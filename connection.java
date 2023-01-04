package projectpackage;

import com.mongodb.MongoClient;
import org.bson.Document;

import java.util.ArrayList;

public class connection {
    public static void main(String[] args) {
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        ArrayList<Document> databases = mongoClient.listDatabases().into(new ArrayList<>());
        databases.forEach(db-> System.out.println(db.toJson()));
    }
}
