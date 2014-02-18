grails dbmigration

http://grails-plugins.github.io/grails-database-migration/docs/manual
<p/>

http://assarconsulting.blogspot.com/2011/08/database-migration-in-grails.html
<p/>

http://refactr.com/blog/2012/01/grails-database-migration-gotchas/
<p/>

Normal workflow Steps:
1.	build initial domain object
2.	grails dbm-create-changelog  (create empty root changelog)
3.	grails dbm-gorm-diff baseline.groovy --add (root changelog will inclue the generated log)
4.	grails dbm-update (update db, insert mods into the databse log table)
5.	modify domain object , repeat (step 3, 4)

Note:
1. if set these in the configuration.groovy, then the dbm-update may be skipped (auto migration)
		grails.plugin.databasemigration.updateOnStart = true
		grails.plugin.databasemigration.updateOnStartFileNames = ['changelog.groovy']
2. Do not run dbm-XXX command inside grails command prompt, the db connection for some reason will be exhausted
3. use dbm-db-doc between dbm-gorm-diff and dbm-update. The generated html shows what change (include sql) will be made for the update
4. data migration can be done inside one of the changelog or create a new log with embbed sql
