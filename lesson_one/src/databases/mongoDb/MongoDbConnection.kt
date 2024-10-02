package databases.mongoDb
import interfaces.IDbConnection;

class MongoDbConnection:IDbConnection {
    override fun connect(): String {
        return "Connect to MongoDb database!";
    }
    override fun disConnect(): String {
        return "Disconnect from MongoDb database!";
    }
}