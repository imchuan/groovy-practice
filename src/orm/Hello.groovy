package orm

import groovy.sql.Sql

/**
 * @author Leon
 */

class User {

    @Override
    String toString() {
        return "${name} , ${password}"
    }
    def name
    def password
}


def URL = "jdbc:mysql://localhost:3306/test?zeroDateTimeBehavior=convertToNull&useUnicode=true&characterEncoding=utf-8&autoReconnect=true&autoReconnectForPools=true"
def DRIVER = "com.mysql.jdbc.Driver"
def USER = "root"
def PASSWORD = ""
def sql = Sql.newInstance(URL, USER, PASSWORD, DRIVER)

def users = []
sql.eachRow("SELECT * from user", { u ->
    users << new User(name: u.name, password: u.password)
})

users.each { e -> println e }