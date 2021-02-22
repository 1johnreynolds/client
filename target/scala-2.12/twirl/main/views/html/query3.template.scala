
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object query3 extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html>
    <body>

        <header class="topbar">
            <h1 class="focused" style="font-size: 37px;
                color: #57a957">
                <strong>Query 3</strong>
            </h1>

        </header>

    </body>
</html>
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-02-22T13:03:13.746
                  SOURCE: C:/Users/c18jo/IdeaProjects/SOSE Lab-2 Play Frontend-Backend/Frontend/app/views/query3.scala.html
                  HASH: 8ae0f5b660765ce05324f62ae5ab99464c50a063
                  MATRIX: 812->0
                  LINES: 26->1
                  -- GENERATED --
              */
          