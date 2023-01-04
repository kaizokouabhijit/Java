package projectpackage;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import org.bson.Document;

import java.util.ArrayList;
import java.util.Iterator;

import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Filters.gte;

public class Readdata {
    public static void main(String[] args) {

        MongoClient mongoClient = new MongoClient("localhost", 27017);
        MongoDatabase database = mongoClient.getDatabase("inventory");
        MongoCollection<Document> inventorycollection = database.getCollection("inventory");

        // TO read one document
        Document inventory1 = inventorycollection.find(Filters.eq("qty", 50)).first();
        System.out.println(inventory1.toJson());

        // To read multiple doc using FindIterable and MongoCursor


        FindIterable<Document> iter = inventorycollection.find(gte("qty",50));
        MongoCursor<Document> cursor = iter.iterator();

        while(cursor.hasNext())
        {
            System.out.println(cursor.next().toJson());
        }

        System.out.println();
        System.out.println();
        System.out.println();



        // READ MULTIPLE RECORDS USING LISTS and print name in reverse directly or store in list


        ArrayList<Document> lst = inventorycollection.find(gte("qty",50)).into(new ArrayList<>());

        for (Document doc: lst)
        {
         String str1 = doc.get("item").toString();
         ArrayList<String> lst2 = new ArrayList<>();
         String str2 = "";
            char ch;
            for(int i=0;i<str1.length();i++)
            {
                ch = str1.charAt(i);
                str2 = ch + str2;


            }
            System.out.println(str2);
            lst2.add(str2);
            Iterator<String> ite = lst2.iterator();
            while(ite.hasNext())
            {
                System.out.println(ite.next() );
            }
        }


    }
}
