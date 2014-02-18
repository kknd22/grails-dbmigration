grails dbmigration

http://grails-plugins.github.io/grails-database-migration/docs/manual
<p/>
http://assarconsulting.blogspot.com/2011/08/database-migration-in-grails.html
<p/>
http://refactr.com/blog/2012/01/grails-database-migration-gotchas/
<p/>
http://dmitrijs.artjomenko.com/2011/07/how-to-ignore-failed-database.html
<p/>
Mastering Grails: Grails and legacy databases <p/>
https://www.ibm.com/developerworks/java/library/j-grails07158/
<p/>

Normal workflow Steps: <p/>
1.	build initial domain object  <p/>
2.	grails dbm-create-changelog  (create empty root changelog)  <p/>
3.	grails dbm-gorm-diff baseline.groovy --add (root changelog will inclue the generated log) <p/>
4.	grails dbm-update (update db, insert mods into the databse log table) <p/>
5.	modify domain object , repeat (step 3, 4) <p/> <p/>

Note: <p/>
1. if set these in the configuration.groovy, then the dbm-update may be skipped (auto migration) <p/>
		grails.plugin.databasemigration.updateOnStart = true  <p/>
		grails.plugin.databasemigration.updateOnStartFileNames = ['changelog.groovy']  <p/>
2. Do not run dbm-XXX command inside grails command prompt, the db connection for some reason will be exhausted  <p/>
3. use dbm-db-doc between dbm-gorm-diff and dbm-update. The generated html shows what change (include sql) will be made for the update  <p/>
4. data migration can be done inside one of the changelog or create a new log with embbed sql  <p/>

Gotyous: seems to be on oracle only <p/>
1. if two class name share the first 12+ character, the default primary key constraint id in oracle will be the same then they collide  <p/>
2. if a field name in multiple class share the same name, e.g. "key", "lables" and they have unique contraint or not null constraint, then sometime the plugins generate constrait the random number are the SAME, which will caus ethe collision   <p/>
