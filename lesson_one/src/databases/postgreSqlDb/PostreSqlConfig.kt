package databases.postgreSqlDb

import interfaces.IDbConfig;
import interfaces.IDbConnection

class PostreSqlConfig:IDbConfig {
    override fun setConnectionString(connectionString: String): String {
        return "PostreSQL connection string: ${connectionString}";
    }
}