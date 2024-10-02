package databases.mongoDb
import interfaces.IDbConfig;
import interfaces.IDbConnection

class MongoDbConfig :IDbConfig{
    override fun setConnectionString(connectionString: String): String {
        return "MongoDb connection string: ${connectionString}";
    }
}