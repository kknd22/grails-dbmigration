databaseChangeLog = {

	changeSet(author: "chris (generated)", id: "1392511229363-1") {
		modifyDataType(columnName: "age", newDataType: "integer", tableName: "person")
	}

	changeSet(author: "chris (generated)", id: "1392511229363-2") {
		dropNotNullConstraint(columnDataType: "integer", columnName: "age", tableName: "person")
	}
}
