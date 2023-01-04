package projectpackage;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.result.UpdateResult;
import org.bson.Document;
import org.bson.conversions.Bson;

import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Updates.set;

public class Updateoperation {
    public static void main(String[] args) {
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        MongoDatabase database = mongoClient.getDatabase("inventory");
        MongoCollection<Document> inventorycollection = database.getCollection("inventory");

        Bson filter = eq("qty",50);
        Bson update = set("qty",60);

        UpdateResult updateResult = inventorycollection.updateOne(filter, update);

        System.out.println(inventorycollection.find((filter)).first());
        System.out.println(updateResult);
    }
}
