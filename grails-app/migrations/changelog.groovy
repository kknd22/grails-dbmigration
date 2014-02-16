databaseChangeLog = {

	changeSet(author: "chris (generated)", id: "changelog") {
		// TODO add changes and preconditions here
	}

	include file: 'baseline.groovy'

	include file: 'mod1.groovy'

	include file: 'mod2.groovy'

	include file: 'mod3.groovy'
}
