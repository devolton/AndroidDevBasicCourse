package databases.mySql

import interfaces.IDbConnection

class MySqlConnection: IDbConnection {
    override fun connect(): String {
        return "Connect to MySql database!";
    }

    override fun disConnect(): String {
        return "Disconnect from MySql database!";
    }

}