package factories

import databases.mySql.MySqlConfig
import databases.mySql.MySqlConnection
import interfaces.IDbConfig
import interfaces.IDbConnection
import interfaces.IDbFactory

class MySqlFactory:IDbFactory {
    override fun createDbConfig(): IDbConfig {
        return MySqlConfig();
    }

    override fun createDbConnection(): IDbConnection {
        return MySqlConnection();
    }
}