package chandu0101.pouchdb

import org.scalatest._
import scala.scalajs.js
import scala.scalajs.js.JavaScriptException
import scala.scalajs.js.annotation.ScalaJSDefined
import scala.scalajs.js.Dynamic.{literal => json}

class PouchDBTest extends BaseTest with BeforeAndAfter {


  val DB_NAME = "scalajs-pouchdb"

  var db: PouchDB = null

  val DEFAULT_ID = "doc1"



  before {
    db = new PouchDB(DB_NAME, new PouchDBOptions(adapter = "memory"))
  }

  after {
    db.destroy()
  }

  test("should create db with given name") {
    db.info().toFuture.map(resp => assert(resp.db_name == DB_NAME))
  }

  test("should insert a new document") {
    val doc1 = new Doc(_id = DEFAULT_ID, name = "doc1_name")
    db.put(doc1).toFuture.map(resp => {
      assert(resp.ok == true && resp.id == DEFAULT_ID && resp.rev.nonEmpty)
    })
  }

  test("should update existing document") {
    val doc1 = new Doc(_id = DEFAULT_ID, name = "doc1_name")
    db.put(doc1).toFuture
      .flatMap(resp => db.put(new Doc(_id = resp.id, _rev = resp.rev, name = "New Updated Name")).toFuture)
      .map(resp => assert(resp.ok == true && resp.id == DEFAULT_ID && resp.rev.nonEmpty))
  }

//  test("should get existing document with id") {
//    val doc1 = new Doc(_id = "doc2", name = "doc1_name")
//    db.put(doc1).toFuture
//      .flatMap(resp => db.get[Doc](resp.id).toFuture)
//      .map(resp => assert(resp._id == DEFAULT_ID && resp._rev.nonEmpty && resp.name == "doc1_name")).recover {
//      recoverFunction
//    }
//  }

}
