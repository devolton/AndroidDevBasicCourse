package managers

import interfaces.IDbFactory

class DbManager(private val factory: IDbFactory) {
    private val config = factory.createDbConfig();
    private val connection= factory.createDbConnection();
    fun setConnectionStr(connectionString: String){
        println(config.setConnectionString(connectionString));
    }
    fun connect(){
      println(connection.connect());
    }
    fun disconnect(){
        println(connection.disConnect());
    }
}