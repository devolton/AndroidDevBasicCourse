package interfaces

interface IDbFactory {
    fun createDbConfig():IDbConfig;
    fun createDbConnection():IDbConnection;
}