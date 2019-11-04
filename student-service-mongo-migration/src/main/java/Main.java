import com.mongodb.client.model.Indexes;
import core.framework.mongo.MongoMigration;

/**
 * @author Danson
 */
public class Main {
    public static void main(String[] args) {
        var migration = new MongoMigration("sys.properties");
        migration.migrate(mongo -> {
//            mongo.createIndex("schools", Indexes.ascending("name"));
            mongo.createIndex("schools", Indexes.compoundIndex(Indexes.ascending("id"), Indexes.descending("name")));
        });
    }
}
