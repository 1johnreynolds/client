
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.6*/import java.math.BigInteger;var i = 0


Seq[Any](format.raw/*2.1*/("""    """),format.raw/*3.1*/("""<!DOCTYPE html>
<html>
    <body>

        <header class="topbar">
            <h1 class="focused" style="font-size: 37px;
                color: #57a957">
                <strong>Login Message</strong>
            </h1>
            <p class="focused" style="font-size: 20px;
                color: #3F51B5">"""),_display_(/*13.34*/message),format.raw/*13.41*/("""</p>

            <br>if statement in scala<br>
            """),_display_(/*16.14*/if(message.equals("success"))/*16.43*/ {_display_(Seq[Any](format.raw/*16.45*/("""
                """),format.raw/*17.17*/("""<h3>Login Successful</h3>
            """)))}/*18.15*/else/*18.20*/{_display_(Seq[Any](format.raw/*18.21*/("""
                """),format.raw/*19.17*/("""<h3>Login failed</h3>
            """)))}),format.raw/*20.14*/("""

            """),format.raw/*22.13*/("""<br><br>
            <br>for loop in scala<br>
            <ul>
            """),_display_(/*25.14*/for(i <- 0 to 5) yield /*25.30*/{_display_(Seq[Any](format.raw/*25.31*/("""
                """),format.raw/*26.17*/("""<li> """),_display_(/*26.23*/(i)),format.raw/*26.26*/(""" """),format.raw/*26.27*/("""</li>
            """)))}),format.raw/*27.14*/("""
            """),format.raw/*28.13*/("""</ul>
        </header>

    </body>
</html>
"""))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-02-15T17:52:27.027
                  SOURCE: C:/Users/c18jo/IdeaProjects/SOSE Lab-2 Play Frontend-Backend/Frontend/app/views/index.scala.html
                  HASH: 8f5304fbfe75ad296c690088d8dc3e060eff5cc8
                  MATRIX: 729->1|819->24|885->19|915->62|1251->371|1279->378|1367->439|1405->468|1445->470|1490->487|1548->527|1561->532|1600->533|1645->550|1711->585|1753->599|1857->676|1889->692|1928->693|1973->710|2006->716|2030->719|2059->720|2109->739|2150->752
                  LINES: 21->1|24->2|27->2|27->3|37->13|37->13|40->16|40->16|40->16|41->17|42->18|42->18|42->18|43->19|44->20|46->22|49->25|49->25|49->25|50->26|50->26|50->26|50->26|51->27|52->28
                  -- GENERATED --
              */
          