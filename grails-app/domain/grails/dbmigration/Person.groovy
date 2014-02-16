package grails.dbmigration
/*
class Person {
    static hasMany = [addresses: Address]
    String name
    Integer age
    static constraints = {
      name()
      age()
    }
}
*/

/*
class Person {
    String name
    Integer age
    String streetName
    String city
    String zipCode
    static constraints = {
      name()
      age(nullable: true)
      streetName(nullable:true)
      city(nullable:true)
      zipCode(nullable:true)
    }
} 
*/

class Person {
    static hasMany = [addresses: Address]
    String name
    Integer age
    static constraints = {
      name()
      age(nullable: true)
    }
}