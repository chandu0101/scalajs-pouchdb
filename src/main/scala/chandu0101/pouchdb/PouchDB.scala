package chandu0101.pouchdb

import chandu0101.pouchdb.plugins.PouchDBFindPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.annotation.{ScalaJSDefined, JSName}
import scala.scalajs.js.{Array => JArray, Promise, UndefOr, undefined}

@ScalaJSDefined
trait PouchDBAjaxOptions extends js.Object {
  val timeout: UndefOr[Double]
  val headers: UndefOr[js.Dictionary[js.Any]]
  val withCredentials: UndefOr[Boolean]
  val skip_setup: UndefOr[Boolean]
  val cache: UndefOr[Boolean]
}

object PouchDBAjaxOptions {
  def apply(timeout: UndefOr[Double] = undefined, headers: UndefOr[js.Dictionary[js.Any]] = undefined,
            withCredentials: UndefOr[Boolean] = undefined, skip_setup: UndefOr[Boolean] = undefined,
            cache: UndefOr[Boolean] = undefined): PouchDBAjaxOptions =
    js.Dynamic.literal(timeout = timeout, headers = headers, withCredentials = withCredentials,
      skip_setup = skip_setup, cache = cache).asInstanceOf[PouchDBAjaxOptions]
}

@ScalaJSDefined
trait PouchDBAuthOptions extends js.Object {
  val username: UndefOr[String]
  val password: UndefOr[String]
}

object PouchDBAuthOptions {
  def apply(username: UndefOr[String] = undefined, password: UndefOr[String] = undefined): PouchDBAuthOptions =
    js.Dynamic.literal(username = username, password = password).asInstanceOf[PouchDBAuthOptions]
}


@ScalaJSDefined
trait PouchDBOptions extends js.Object {
  val name: UndefOr[String]
  val adapter: UndefOr[String]
  val revs_limit: UndefOr[Int]
  val ajax: UndefOr[PouchDBAjaxOptions]
  val auth: UndefOr[PouchDBAuthOptions]
  val db: UndefOr[js.Any]
  val auto_compaction: UndefOr[Boolean]
}

object PouchDBOptions {
  def apply(name: UndefOr[String] = undefined, adapter: UndefOr[String] = undefined, revs_limit: UndefOr[Int] = undefined,
            ajax: UndefOr[PouchDBAjaxOptions] = undefined, auth: UndefOr[PouchDBAuthOptions] = undefined,
            db: UndefOr[js.Any] = undefined, auto_compaction: UndefOr[Boolean] = undefined): PouchDBOptions =
    js.Dynamic.literal(name = name, adapter = adapter, revs_limit = revs_limit, ajax = ajax, auth = auth,
      db = db, auto_compaction = auto_compaction).asInstanceOf[PouchDBOptions]
}

@ScalaJSDefined
trait PouchDBDestroyOptions extends js.Object {
  val ajax: UndefOr[PouchDBAjaxOptions]
}

object PouchDBDestroyOptions {
  def apply(ajax: UndefOr[PouchDBAjaxOptions] = undefined): PouchDBDestroyOptions =
    js.Dynamic.literal(ajax = ajax).asInstanceOf[PouchDBDestroyOptions]
}

@ScalaJSDefined
trait PouchDBAllDocsOptions extends js.Object {
  val include_docs: UndefOr[Boolean]
  val startkey: UndefOr[String]
  val endkey: UndefOr[String]
  val inclusive_end: UndefOr[Boolean]
  val limit: UndefOr[Int]
  val skip: UndefOr[Int]
  val descending: UndefOr[Boolean]
  val conflicts: UndefOr[Boolean]
  val attachments: UndefOr[Boolean]
  val binary: UndefOr[Boolean]
  val key: UndefOr[String]
  val keys: UndefOr[js.Array[String]]
}

object PouchDBAllDocsOptions {
  def apply(include_docs: UndefOr[Boolean] = undefined, startkey: UndefOr[String] = undefined, endkey: UndefOr[String] = undefined,
            inclusive_end: UndefOr[Boolean] = undefined, limit: UndefOr[Int] = undefined, skip: UndefOr[Int] = undefined,
            descending: UndefOr[Boolean] = undefined, conflicts: UndefOr[Boolean] = undefined, attachments: UndefOr[Boolean] = undefined,
            binary: UndefOr[Boolean] = undefined, key: UndefOr[String] = undefined, keys: UndefOr[js.Array[String]] = undefined): PouchDBAllDocsOptions =
    js.Dynamic.literal(include_docs = include_docs, startkey = startkey, endkey = endkey, inclusive_end = inclusive_end,
      limit = limit, skip = skip, descending = descending, conflicts = conflicts, attachments = attachments, binary = binary,
      key = key, keys = keys).asInstanceOf[PouchDBAllDocsOptions]
}

@ScalaJSDefined
trait PouchDBAllDocsResponse extends js.Object {
  val total_rows: Int
  val offset: Int
  val rows: js.Array[js.Dynamic]
}

@js.native
trait EventEmitter extends js.Object {
  def on(event: String, listener: js.Function0[Unit]): this.type = js.native
  def on[A](event: String, listener: js.Function1[A, Unit]): this.type = js.native
}

@js.native
trait ChangesEventEmitter extends EventEmitter {
  def cancel(): Unit = js.native
}

@ScalaJSDefined
trait PouchDBError extends js.Object {
  val status: Int
  val name: String
  val message: String
}

@ScalaJSDefined
trait EventInfo extends js.Object {
  val doc_write_failures: Int
  val docs_read: Int
  val docs_written: Int
  val errors: js.Array[PouchDBError]
  val last_seq: Int
  val ok: Boolean
  val start_time: String
}

@ScalaJSDefined
trait OnChangeInfo extends EventInfo {
  val docs: js.Array[js.Object]
}

@ScalaJSDefined
trait OnCompleteInfo extends EventInfo {
  val end_time: String
  val status: String
}

object ChangesEventEmitter {

  implicit class ChangesEventEmitterEvents(val self: ChangesEventEmitter) extends AnyVal {
    def onChange(listener: js.Function1[OnChangeInfo, Unit]): self.type = self.on("change", listener)
    def onComplete(listener: js.Function1[OnCompleteInfo, Unit]): self.type = self.on("complete", listener)
    def onError(listener: js.Function1[PouchDBError, Unit]): self.type = self.on("error", listener)
    def onDenied(listener: js.Function1[PouchDBError, Unit]): self.type = self.on("denied", listener)
    def onPaused(listener: js.Function1[PouchDBError, Unit]): self.type = self.on("paused", listener)
    def onActive(listener: js.Function0[Unit]): self.type = self.on("active", listener)
    def onCreated(listener: js.Function1[String, Unit]): self.type = self.on("created", listener)
    def onDestroyed(listener: js.Function1[String, Unit]): self.type = self.on("destroyed", listener)
  }

}

@ScalaJSDefined
trait PouchDBChangesOptions extends js.Object {
  val live: UndefOr[Boolean]
  val include_docs: UndefOr[Boolean]
  val conflicts: UndefOr[Boolean]
  val attachments: UndefOr[Boolean]
  val binary: UndefOr[Boolean]
  val descending: UndefOr[Boolean]
  val since: UndefOr[String]
  val limit: UndefOr[Int]
  val timeout: UndefOr[Int]
  val heartbeat: UndefOr[Int]
  val filter: UndefOr[js.Function]
  val doc_ids: UndefOr[js.Array[String]]
  val query_params: UndefOr[js.Dynamic]
  val view: UndefOr[js.Function]
  val return_docs: UndefOr[Boolean]
  val batch_size: UndefOr[Int]
  val style: UndefOr[String]
}

object PouchDBChangesOptions {
  def apply(live: UndefOr[Boolean] = undefined, include_docs: UndefOr[Boolean] = undefined, conflicts: UndefOr[Boolean] = undefined,
            attachments: UndefOr[Boolean] = undefined, binary: UndefOr[Boolean] = undefined, descending: UndefOr[Boolean] = undefined,
            since: UndefOr[String] = undefined, limit: UndefOr[Int] = undefined, timeout: UndefOr[Int] = undefined,
            heartbeat: UndefOr[Int] = undefined, filter: UndefOr[js.Function] = undefined, doc_ids: UndefOr[js.Array[String]] = undefined,
            query_params: UndefOr[js.Dynamic] = undefined, view: UndefOr[js.Function] = undefined, return_docs: UndefOr[Boolean] = undefined,
            batch_size: UndefOr[Int] = undefined, style: UndefOr[String] = undefined): PouchDBChangesOptions =
    js.Dynamic.literal(live = live, include_docs = include_docs, conflicts = conflicts, attachments = attachments,
      binary = binary, descending = descending, since = since, limit = limit, timeout = timeout, heartbeat = heartbeat,
      filter = filter, doc_ids = doc_ids, query_params = query_params, view = view, return_docs = return_docs,
      batch_size = batch_size, style = style).asInstanceOf[PouchDBChangesOptions]
}

@ScalaJSDefined
trait PouchDBReplicateOptions extends js.Object {
  val live: UndefOr[Boolean]
  val retry: UndefOr[Boolean]
  val filter: UndefOr[js.Function]
  val doc_ids: UndefOr[js.Array[String]]
  val query_params: UndefOr[js.Object]
  val view: UndefOr[js.Function]
  val since: UndefOr[String]
  val heartbeat: UndefOr[Int]
  val timeout: UndefOr[Int]
  val batch_size: UndefOr[Int]
  val batches_limit: UndefOr[Int]
  val back_off_function: UndefOr[js.Function]
}

object PouchDBReplicateOptions {
  def apply(live: UndefOr[Boolean] = undefined, retry: UndefOr[Boolean] = undefined, filter: UndefOr[js.Function] = undefined,
            doc_ids: UndefOr[js.Array[String]] = undefined, query_params: UndefOr[js.Object] = undefined,
            view: UndefOr[js.Function] = undefined, since: UndefOr[String] = undefined, heartbeat: UndefOr[Int] = undefined,
            timeout: UndefOr[Int] = undefined, batch_size: UndefOr[Int] = undefined, batches_limit: UndefOr[Int] = undefined,
            back_off_function: UndefOr[js.Function] = undefined): PouchDBReplicateOptions =
    js.Dynamic.literal(live = live, retry = retry, filter = filter, doc_ids = doc_ids, query_params = query_params,
      view = view, since = since, heartbeat = heartbeat, timeout = timeout, batch_size = batch_size,
      batches_limit = batches_limit, back_off_function = back_off_function).asInstanceOf[PouchDBReplicateOptions]
}

@js.native
trait Replicate extends js.Object {
  def to(remoteDB: PouchDB | String, options: PouchDBReplicateOptions = ???): ChangesEventEmitter = js.native

  def from(remoteDB: PouchDB | String, options: PouchDBReplicateOptions = ???): ChangesEventEmitter = js.native
}

@ScalaJSDefined
trait PouchDBQueryOptions extends js.Object {
  val fun: UndefOr[js.Function]
  val reduce: UndefOr[js.Function | String]
  val include_docs: UndefOr[Boolean]
  val startkey: UndefOr[String]
  val endkey: UndefOr[String]
  val inclusive_end: UndefOr[Boolean]
  val limit: UndefOr[Int]
  val skip: UndefOr[Int]
  val descending: UndefOr[Boolean]
  val key: UndefOr[String]
  val keys: UndefOr[js.Array[String]]
  val group: UndefOr[Boolean]
  val group_level: UndefOr[Int]
  val stale: UndefOr[String]
}

object PouchDBQueryOptions {
  def apply(fun: UndefOr[js.Function] = undefined, reduce: UndefOr[js.Function | String] = undefined,
            include_docs: UndefOr[Boolean] = undefined, startkey: UndefOr[String] = undefined,
            endkey: UndefOr[String] = undefined, inclusive_end: UndefOr[Boolean] = undefined,
            limit: UndefOr[Int] = undefined, skip: UndefOr[Int] = undefined, descending: UndefOr[Boolean] = undefined,
            key: UndefOr[String] = undefined, keys: UndefOr[js.Array[String]] = undefined,
            group: UndefOr[Boolean] = undefined, group_level: UndefOr[Int] = undefined,
            stale: UndefOr[String] = undefined): PouchDBQueryOptions =
    js.Dynamic.literal(fun = fun, reduce = reduce.asInstanceOf[js.Any], include_docs = include_docs, startkey = startkey, endkey = endkey,
      inclusive_end = inclusive_end, limit = limit, skip = skip, descending = descending, key = key, keys = keys,
      group = group, group_level = group_level, stale = stale).asInstanceOf[PouchDBQueryOptions]
}

@js.native
trait PouchDBDebug extends js.Object {
  def enable(to: String = "*"): Unit = js.native

  def disable(): Unit = js.native
}

@ScalaJSDefined
trait PouchDBGetOptions extends js.Object {
  val rev: UndefOr[String]
  val revs: UndefOr[Boolean]
  val revs_info: UndefOr[Boolean]
  val open_revs: UndefOr[js.Dynamic]
  val conflicts: UndefOr[Boolean]
  val attachments: UndefOr[Boolean]
  val ajax: UndefOr[PouchDBAjaxOptions]
}

object PouchDBGetOptions {
  def apply(rev: UndefOr[String] = undefined, revs: UndefOr[Boolean] = undefined, revs_info: UndefOr[Boolean] = undefined,
            open_revs: UndefOr[js.Dynamic] = undefined, conflicts: UndefOr[Boolean] = undefined, attachments: UndefOr[Boolean] = undefined,
            ajax: UndefOr[PouchDBAjaxOptions] = undefined): PouchDBGetOptions =
    js.Dynamic.literal(rev = rev, revs = revs, revs_info = revs_info, open_revs = open_revs, conflicts = conflicts,
      attachments = attachments, ajax = ajax).asInstanceOf[PouchDBGetOptions]
}

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
  val ok: Boolean
  val id: String
  val rev: String
}

@ScalaJSDefined
trait PouchDBEntity extends js.Object {
  val _id: String
  val _rev: String
}

@ScalaJSDefined
trait PouchDBCompactOptions extends js.Object {
  val interval: UndefOr[Int]
}

object PouchDBCompactOptions {
  def apply(interval: UndefOr[Int] = undefined): PouchDBCompactOptions =
    js.Dynamic.literal(interval = interval).asInstanceOf[PouchDBCompactOptions]
}

@ScalaJSDefined
trait PouchDBBulkGetOptions extends js.Object {
  val docs: js.Array[js.Object]
  val revs: UndefOr[Boolean]
  val attachments: UndefOr[Boolean]
  val binary: UndefOr[Boolean]
}

object PouchDBBulkGetOptions {
  def apply(docs: js.Array[js.Object], revs: UndefOr[Boolean] = undefined, attachments: UndefOr[Boolean] = undefined,
            binary: UndefOr[Boolean] = undefined): PouchDBBulkGetOptions =
    js.Dynamic.literal(docs = docs, revs = revs, attachments = attachments, binary = binary).asInstanceOf[PouchDBBulkGetOptions]
}

@js.native
@JSName("PouchDB")
class PouchDB(name: String = ???, options: PouchDBOptions = ???) extends js.Object with PouchDBFindPlugin {

  var _db_name: String = js.native

  def destroy(options: PouchDBDestroyOptions = ???): Promise[js.Dynamic] = js.native

  def put(doc: js.Object, docId: String = ???, docRev: String = ???, options: js.Object = ???): Promise[PouchDBUpdateDocResponse] = js.native

  def post(doc: js.Object, options: js.Dynamic = ???): Promise[PouchDBUpdateDocResponse] = js.native

  def get[T <: js.Object](docId: String, options: PouchDBGetOptions = ???): Promise[T] = js.native

  def remove(doc: js.Object): Promise[PouchDBUpdateDocResponse] = js.native

  def remove(doc: js.Object, options: js.Dynamic): Promise[PouchDBUpdateDocResponse] = js.native

  def remove(docId: String, docRev: String): Promise[PouchDBUpdateDocResponse] = js.native

  def remove(docId: String, docRev: String, options: js.Dynamic): Promise[PouchDBUpdateDocResponse] = js.native

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

  val version: String = js.native

}


