package projectpackage;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.ArrayList;

public class connDatabase {
    public static void insertManyCollection(MongoCollection<Document> inventorycollection)
    {
        ArrayList<Document> inventory = new ArrayList<>();
        inventory.add(new Document().append("title","Shaving gel"));
        inventorycollection.insertMany(inventory);

    }
    public static void main(String[] args) {
        try {
            MongoClient mongoClient = new MongoClient("localhost", 27017);
            MongoDatabase sample = mongoClient.getDatabase("inventory");
//            Document doc = new Document();
//            doc.append("item", "Shaver")
//                    .append("qty", 50)
//                    .append("status", "B")
//                    .append("size", new Document().append("h",20)
//                            .append("w",30)
//                            .append("uom","cm"));

            MongoCollection<Document> inventorycollection = sample.getCollection("inventory");
           // inventorycollection.insertOne(doc);

            insertManyCollection(inventorycollection);
            System.out.println("Inserted");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }



    }
}
