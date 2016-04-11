package chandu0101.pouchdb

import chandu0101.pouchdb.plugins.PouchDBFindPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.annotation.{ScalaJSDefined, JSName}
import scala.scalajs.js.{Array => JArray, Promise, UndefOr, undefined}

@ScalaJSDefined
class PouchDBAjaxOptions(val timeout: UndefOr[Double] = undefined,
                         val headers: UndefOr[js.Dictionary[js.Any]] = undefined,
                         val withCredentials: UndefOr[Boolean] = undefined,
                         val skip_setup: UndefOr[Boolean] = undefined,
                         val cache: UndefOr[Boolean] = undefined) extends js.Object


@ScalaJSDefined
class PouchDBAuthOptions(val username: UndefOr[String] = undefined, val password: UndefOr[String] = undefined) extends js.Object

@ScalaJSDefined
class PouchDBOptions(val name: UndefOr[String] = undefined,
                     val adapter: UndefOr[String] = undefined,
                     val revs_limit: UndefOr[Int] = undefined,
                     val ajax: UndefOr[PouchDBAjaxOptions] = undefined,
                     val auth: UndefOr[PouchDBAuthOptions] = undefined,
                     val db: UndefOr[js.Any] = undefined,
                     val auto_compaction: UndefOr[Boolean] = undefined) extends js.Object

@ScalaJSDefined
class PouchDBDestroyOptions(val ajax: UndefOr[PouchDBAjaxOptions] = undefined) extends js.Object


@ScalaJSDefined
class PouchDBAllDocsOptions(val include_docs: UndefOr[Boolean] = undefined,
                            val startkey: UndefOr[String] = undefined,
                            val endkey: UndefOr[String] = undefined,
                            val inclusive_end: UndefOr[Boolean] = undefined,
                            val limit: UndefOr[Int] = undefined,
                            val skip: UndefOr[Int] = undefined,
                            val descending: UndefOr[Boolean] = undefined,
                            val conflicts: UndefOr[Boolean] = undefined,
                            val attachments: UndefOr[Boolean] = undefined,
                            val binary: UndefOr[Boolean] = undefined,
                            val key: UndefOr[String] = undefined,
                            val keys: UndefOr[js.Array[String]] = undefined) extends js.Object

@ScalaJSDefined
trait PouchDBAllDocsResponse extends js.Object {

  val total_rows: Int

  val offset: Int

  val rows: js.Array[js.Dynamic]

}

@js.native
trait EventEmitter extends js.Object {
  def on(event: String, listener: js.Function1[js.Dynamic, Any]): this.type = js.native

}

@js.native
trait ChangesEventEmitter extends EventEmitter {

  def cancel(): Unit = js.native
}

object ChangesEventEmitter {

  implicit class ChangesEventEmitterEvents(val self: ChangesEventEmitter) extends AnyVal {
    def onChange(listener: js.Function1[js.Dynamic, Any]): self.type = self.on("change", listener)

    def onComplete(listener: js.Function1[js.Dynamic, Any]): self.type = self.on("complete", listener)

    def onError(listener: js.Function1[js.Dynamic, Any]): self.type = self.on("error", listener)

    def onCreate(listener: js.Function1[js.Dynamic, Any]): self.type = self.on("create", listener)

    def onUpdate(listener: js.Function1[js.Dynamic, Any]): self.type = self.on("update", listener)

    def onDelete(listener: js.Function1[js.Dynamic, Any]): self.type = self.on("delete", listener)

    def onDenied(listener: js.Function1[js.Dynamic, Any]): self.type = self.on("denied", listener)

    def onPaused(listener: js.Function1[js.Dynamic, Any]): self.type = self.on("paused", listener)

    def onActive(listener: js.Function1[js.Dynamic, Any]): self.type = self.on("active", listener)
  }

}

@js.native
class PouchDBChangesOptions(val live: UndefOr[Boolean] = undefined,
                            val include_docs: UndefOr[Boolean] = undefined,
                            val conflicts: UndefOr[Boolean] = undefined,
                            val attachments: UndefOr[Boolean] = undefined,
                            val binary: UndefOr[Boolean] = undefined,
                            val descending: UndefOr[Boolean] = undefined,
                            val since: UndefOr[String] = undefined,
                            val limit: UndefOr[Int] = undefined,
                            val timeout: UndefOr[Int] = undefined,
                            val heartbeat: UndefOr[Int] = undefined,
                            val filter: UndefOr[js.Function] = undefined,
                            val doc_ids: UndefOr[js.Array[String]] = undefined,
                            val query_params: UndefOr[js.Dynamic] = undefined,
                            val view: UndefOr[js.Function] = undefined,
                            val return_docs: UndefOr[Boolean] = undefined,
                            val batch_size: UndefOr[Int] = undefined,
                            val style: UndefOr[String] = undefined) extends js.Object


@ScalaJSDefined
class PouchDBReplicateOptions(val live: UndefOr[Boolean] = undefined,
                              val retry: UndefOr[Boolean] = undefined,
                              val filter: UndefOr[js.Function] = undefined,
                              val doc_ids: UndefOr[js.Array[String]] = undefined,
                              val query_params: UndefOr[js.Object] = undefined,
                              val view: UndefOr[js.Function] = undefined,
                              val since: UndefOr[String] = undefined,
                              val heartbeat: UndefOr[Int] = undefined,
                              val timeout: UndefOr[Int] = undefined,
                              val batch_size: UndefOr[Int] = undefined,
                              val batches_limit: UndefOr[Int] = undefined,
                              val back_off_function: UndefOr[js.Function] = undefined) extends js.Object


@js.native
trait Replicate extends js.Object {
  def to(remoteDB: String, options: PouchDBReplicateOptions = ???): ChangesEventEmitter = js.native

  def from(remoteDB: String, options: PouchDBReplicateOptions = ???): ChangesEventEmitter = js.native
}

@js.native
class PouchDBQueryOptions(val fun: UndefOr[js.Function] = undefined,
                          val reduce: UndefOr[js.Function | String] = undefined,
                          val include_docs: UndefOr[Boolean] = undefined,
                          val startkey: UndefOr[String] = undefined,
                          val endkey: UndefOr[String] = undefined,
                          val inclusive_end: UndefOr[Boolean] = undefined,
                          val limit: UndefOr[Int] = undefined,
                          val skip: UndefOr[Int] = undefined,
                          val descending: UndefOr[Boolean] = undefined,
                          val key: UndefOr[String] = undefined,
                          val keys: UndefOr[js.Array[String]] = undefined,
                          val group: UndefOr[Boolean] = undefined,
                          val group_level: UndefOr[Int] = undefined,
                          val stale: UndefOr[String] = undefined) extends js.Object


@js.native
trait PouchDBDebug extends js.Object {
  def enable(to: String = "*"): Unit = js.native

  def disable(): Unit = js.native

}

@ScalaJSDefined
class PouchDBGetOptions(val rev: UndefOr[String] = undefined,
                        val revs: UndefOr[Boolean] = undefined,
                        val revs_info: UndefOr[Boolean] = undefined,
                        val open_revs: UndefOr[js.Dynamic] = undefined,
                        val conflicts: UndefOr[Boolean] = undefined,
                        val attachments: UndefOr[Boolean] = undefined,
                        val ajax: UndefOr[PouchDBAjaxOptions] = undefined) extends js.Object



@ScalaJSDefined
trait PouchDBInfo extends js.Object {
  val db_name: String
  val doc_count: Int
  val update_seq: String
  val adapter: UndefOr[String]
  val idb_attachment_format: UndefOr[String]
  val sqlite_plugin: UndefOr[String]
  val websql_encoding: UndefOr[String]
  val backend_adapter: UndefOr[String]
}

@ScalaJSDefined
trait PouchDBUpdateDocResponse extends js.Object {
  val ok : Boolean
  val id : String
  val rev : String
}

@ScalaJSDefined
trait PouchDBEntity extends js.Object {
  val _id : String
  val _rev : String
}

@ScalaJSDefined
class PouchDBCompactOptions(val interval: UndefOr[Int] = undefined) extends js.Object

@ScalaJSDefined
class PouchDBBulkGetOptions(val docs: js.Array[js.Object],
                            val revs: UndefOr[Boolean] = undefined,
                            val attachments: UndefOr[Boolean] = undefined,
                            val binary: UndefOr[Boolean] = undefined) extends js.Object

case class PouchDBException(err: js.Dynamic) extends Exception

@js.native
@JSName("PouchDB")
class PouchDB(name: String = ???, options: PouchDBOptions = ???) extends js.Object with PouchDBFindPlugin{

  var _db_name: String = js.native

  def destroy(options: PouchDBDestroyOptions = ???): Promise[js.Dynamic] = js.native

  def put(doc: js.Object, docId: String = ???, docRev: String = ???, options: js.Object = ???): Promise[PouchDBUpdateDocResponse] = js.native

  def post(doc: js.Object, options: js.Dynamic = ???): Promise[PouchDBUpdateDocResponse] = js.native

  def get[T <: js.Object](docId: String, options: PouchDBGetOptions = ???): Promise[T] = js.native

  def remove(doc: js.Object, options: js.Dynamic = ???): Promise[PouchDBUpdateDocResponse] = js.native

  @JSName("remove")
  def removeWithId(docId: String, docRev: String, options: js.Dynamic = ???): Promise[js.Dynamic] = js.native

  def bulkDocs(docs: js.Array[js.Object], options: js.Dynamic = ???): Promise[js.Dynamic] = js.native

  def allDocs(options: PouchDBAllDocsOptions = ???): Promise[PouchDBAllDocsResponse] = js.native

  def changes(options: PouchDBChangesOptions): ChangesEventEmitter = js.native

  val replicate: Replicate = js.native

  def sync(remoteDB: String, options: PouchDBReplicateOptions = ???): ChangesEventEmitter = js.native

  def putAttachment(docId: String, attachmentId: String, rev: String = ???, attachment: js.Any, `type`: String): Promise[js.Dynamic] = js.native

  def getAttachment(docId: String, attachmentId: String, options: UndefOr[js.Dynamic] = undefined): Promise[js.Dynamic] = js.native

  def removeAttachment(docId: String, attachmentId: String, rev: String): Promise[js.Dynamic] = js.native

  def query(fun: js.Function, options: PouchDBQueryOptions = ???): Promise[js.Dynamic] = js.native

  def viewCleanup(): Promise[js.Dynamic] = js.native

  def info(): Promise[PouchDBInfo] = js.native

  def compact(options: PouchDBCompactOptions = ???): Promise[js.Dynamic] = js.native

  def revsDiff(diff: js.Array[String]): Promise[js.Dynamic] = js.native

  def bulkGet(options: PouchDBBulkGetOptions): Promise[js.Dynamic] = js.native

}

@js.native
@JSName("PouchDB")
object PouchDB extends EventEmitter {

  def replicate(source: String, target: String, options: PouchDBReplicateOptions = ???): ChangesEventEmitter = js.native

  def sync(src: String, target: String, options: PouchDBReplicateOptions = ???): ChangesEventEmitter = js.native

  def defaults(options: js.Dynamic): PouchDB = js.native

  def plugin(plugins: js.Dynamic): Unit = js.native

  val debug: PouchDBDebug = js.native

}


