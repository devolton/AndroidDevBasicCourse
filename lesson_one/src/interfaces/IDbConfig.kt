package interfaces
import interfaces.IDbConnection
interface IDbConfig {
    fun setConnectionString(connectionString:String):String;
}