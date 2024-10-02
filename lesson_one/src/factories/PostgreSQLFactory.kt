package factories

import databases.postgreSqlDb.PostgreSqlConnection
import databases.postgreSqlDb.PostreSqlConfig
import interfaces.IDbConfig
import interfaces.IDbConnection
import interfaces.IDbFactory

class PostgreSQLFactory :IDbFactory {
    override fun createDbConfig(): IDbConfig {
        return PostreSqlConfig();
    }

    override fun createDbConnection(): IDbConnection {
        return PostgreSqlConnection();
    }
}