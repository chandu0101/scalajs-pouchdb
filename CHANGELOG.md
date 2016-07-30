### 2016.8.0

* Update PouchDB version to 5.4.5 and Scala.js to 0.6.11.
* Contemplate https://github.com/pouchdb/pouchdb/issues/5508 where PouchDB is stated to officially not support classes as options. This is done by changing classes to traits and providing constructors in companion objects' `apply` methods. This is a breaking change since the `new` keyword is no longer required to instantiate option types, but I think it is worth it.
* Types for PouchDBError and event parameters.
* Allow multiple types in several methods' parameters.

* big thanks to @rpiaggio 