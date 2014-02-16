databaseChangeLog = {

	changeSet(author: "chris (generated)", id: "1392513070932-1") {
		createTable(tableName: "address") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "addressPK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "city", type: "varchar(255)")

			column(name: "person_id", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "street_name", type: "varchar(255)")

			column(name: "zip_code", type: "varchar(255)")
		}
	}

	changeSet(author: "chris (generated)", id: "1392513070932-3") {
		createIndex(indexName: "FKBB979BF46E4F47AC", tableName: "address") {
			column(name: "person_id")
		}
	}

	changeSet(author: "dbm (generated)", id: "migrate-person-data") { 
        sql("""insert into address (id, version, person_id, street_name, city, zip_code)
              select LAST_INSERT_ID(), 0, id, street_name, city, zip_code from person""")
    }
	
	changeSet(author: "chris (generated)", id: "1392513070932-4") {
		dropColumn(columnName: "city", tableName: "person")
	}

	changeSet(author: "chris (generated)", id: "1392513070932-5") {
		dropColumn(columnName: "street_name", tableName: "person")
	}

	changeSet(author: "chris (generated)", id: "1392513070932-6") {
		dropColumn(columnName: "zip_code", tableName: "person")
	}

	changeSet(author: "chris (generated)", id: "1392513070932-2") {
		addForeignKeyConstraint(baseColumnNames: "person_id", baseTableName: "address", constraintName: "FKBB979BF46E4F47AC", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "person", referencesUniqueColumn: "false")
	}
}
