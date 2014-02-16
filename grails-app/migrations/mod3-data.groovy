
/**
 *   for h2 db
*/

changeSet(author: "dbm (generated)", id: "migrate-person-data") {
        sql("""insert into address (id, version, person_id, street_name, city, zip_code)
              select SYSTEM_SEQUENCE_197695C2_FEEA_4E42_AAED_0D4D7305F446.NEXTVAL, 0, id, street_name, city, zip_code from person""")
}

/**
 * for mysql
 */
 changeSet(author: "dbm (generated)", id: "migrate-person-data") { 
        sql("""insert into address (id, version, person_id, street_name, city, zip_code)
              select LAST_INSERT_ID(), 0, id, street_name, city, zip_code from person""")
    }