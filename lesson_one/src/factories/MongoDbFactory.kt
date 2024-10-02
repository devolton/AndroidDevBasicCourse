package factories

import databases.mongoDb.MongoDbConfig
import databases.mongoDb.MongoDbConnection
import interfaces.IDbConfig
import interfaces.IDbConnection
import interfaces.IDbFactory

class MongoDbFactory:IDbFactory {
    override fun createDbConfig(): IDbConfig {
        return MongoDbConfig();
    }

    override fun createDbConnection(): IDbConnection {
        return MongoDbConnection();
    }
}