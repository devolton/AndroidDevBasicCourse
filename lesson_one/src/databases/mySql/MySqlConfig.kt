package databases.mySql
import interfaces.IDbConfig
import interfaces.IDbConnection

class MySqlConfig:IDbConfig {
    override fun setConnectionString(connectionString: String): String {
        return "MySQL connectin string: ${connectionString}";
    }
}