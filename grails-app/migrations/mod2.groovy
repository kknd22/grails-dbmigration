databaseChangeLog = {

	changeSet(author: "chris (generated)", id: "1392512038117-1") {
		addColumn(tableName: "person") {
			column(name: "city", type: "varchar(255)")
		}
	}

	changeSet(author: "chris (generated)", id: "1392512038117-2") {
		addColumn(tableName: "person") {
			column(name: "street_name", type: "varchar(255)")
		}
	}

	changeSet(author: "chris (generated)", id: "1392512038117-3") {
		addColumn(tableName: "person") {
			column(name: "zip_code", type: "varchar(255)")
		}
	}
}
