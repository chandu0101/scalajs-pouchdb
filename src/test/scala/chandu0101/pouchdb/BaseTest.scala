package chandu0101.pouchdb

import org.scalatest.{Assertion, OneInstancePerTest, Suite, AsyncFunSuite}

import scala.concurrent.ExecutionContext
import scala.scalajs.js.JavaScriptException

abstract class BaseTest extends AsyncFunSuite {


  override implicit def executionContext: ExecutionContext = scala.scalajs.concurrent.JSExecutionContext.Implicits.queue

  def recoverFunction : PartialFunction[Throwable,Assertion] = PartialFunction[Throwable,Assertion] {
    case ex:Exception  => {
      if(ex.isInstanceOf[JavaScriptException]) println(s"******* Error in executing javascript function : ${ex.asInstanceOf[JavaScriptException].exception}   *******")
      else println(s"******* Error in executing test : ${ex.getMessage} ******")
      assert(false)
    }

  }
}
