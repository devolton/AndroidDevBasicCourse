package databases.postgreSqlDb
import interfaces.IDbConnection
class PostgreSqlConnection :IDbConnection{
    override fun connect(): String {
        return "Connect to PostreSQL database!";
    }
    override fun disConnect(): String {
        return "Disconnect from PostreSQL database!";
    }
}