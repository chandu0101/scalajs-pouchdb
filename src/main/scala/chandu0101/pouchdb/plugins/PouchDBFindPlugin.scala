package chandu0101.pouchdb.plugins


import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined
import scala.scalajs.js.{undefined, UndefOr, Array, Promise}

@ScalaJSDefined
class PouchDBFindOptions(val selector: js.Object,
                         val fields: UndefOr[js.Array[String]] = undefined,
                         val sort: UndefOr[js.Array[String]] = undefined,
                         val limit: UndefOr[Int] = undefined,
                         val skip: UndefOr[Int] = undefined) extends js.Object

@ScalaJSDefined
class PouchDBIndexOptions(val fields: js.Array[String],
                          val name: UndefOr[String] = undefined,
                          val ddoc: UndefOr[String] = undefined,
                          val `type`: UndefOr[String] = undefined) extends js.Object

@ScalaJSDefined
class PouchDBCreateIndexOptions(val index: PouchDBIndexOptions) extends js.Object


@js.native
trait PouchDBFindPlugin extends js.Object {


  def createIndex(options: PouchDBCreateIndexOptions): Promise[js.Dynamic] = js.native

  def getIndexes(): Promise[js.Dynamic] = js.native

  def deleteIndex(index: js.Object): Promise[js.Dynamic] = js.native

  def find(request: PouchDBFindOptions): Promise[js.Dynamic] = js.native
}
