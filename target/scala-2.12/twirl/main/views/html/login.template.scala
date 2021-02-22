
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

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <title>Play Setup Demo</title>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

            <!-- Compiled and minified JavaScript -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
        <link rel="shortcut icon" type="image/x-icon" href="docs/images/favicon.ico" />
        <link rel="stylesheet" href="https://unpkg.com/leaflet@1.5.1/dist/leaflet.css" integrity="sha512-xwE/Az9zrjBIphAcBb3F6JVqxf46+CDLwfLMHloNu6KEQCAWi6HcDUbeOfBIptF7tcCzusKFjFw2yuvEpDL9wQ==" crossorigin=""/>
        <script src="https://unpkg.com/leaflet@1.5.1/dist/leaflet.js" integrity="sha512-GffPMF3RvMeYyc1LWMHtK8EbPv0iNZ8/oTtHPx9/cc2ILxQ+u905qIwdpULaqDkyBKgOaB57QTMg7ztg8Jm2Og==" crossorigin=""></script>
    </head>
    <body>

        <header class="topbar">
            <h1 class="focused" style="font-size: 37px;
                color: #57a957">
                <strong>DBLP Query Options</strong>
            </h1>
        </header>
    <body>
        <h6> <b>Query 1:</b>
            <br>Given a paper name (i.e., title), list its publication metadata.</h6>
            <h6><b>Query 2:</b>
            <br>Given a journal name and a year (volume) and an issue (number),
            <br>find out the metadata of all the papers published in the book
            <br>(means the volume+number of the journal).</h6>
        <h6> <b>Query 3</b>
                <br>Display the titles of the articles published by a researcher in a specific year</h6>
        <h6> <b>Query 4:</b>
            <br>Display all the authors who have published more than 10 papers in the area of SOSE to date
            <br>(Hint: Since I manually extracted all SOSE papers to you in this sub-dataset, these papers included
            <br>mean all the SOSE papers to date).</h6>
    </body>
            <div class="row">
            <div class="card col s2">
                <div class="card-panel">
                    <form action=""""),_display_(/*42.36*/routes/*42.42*/.HomeController.query1()),format.raw/*42.66*/("""">

                        <div class="row">
                            <button id="api-search-button" class="btn col s6 offset-s3" type="submit">Query 1</button>
                        </div>

                    </form>
                    <form action=""""),_display_(/*49.36*/routes/*49.42*/.HomeController.query2()),format.raw/*49.66*/("""">

                        <div class="row">
                            <button id="api-search-button" class="btn col s6 offset-s3" type="submit">Query 2</button>
                        </div>

                    </form>
                    <form action=""""),_display_(/*56.36*/routes/*56.42*/.HomeController.query3()),format.raw/*56.66*/("""">

                        <div class="row">
                            <button id="api-search-button" class="btn col s6 offset-s3" type="submit">Query 3</button>
                        </div>

                    </form>
                    <form action=""""),_display_(/*63.36*/routes/*63.42*/.HomeController.query4()),format.raw/*63.66*/("""">

                        <div class="row">
                            <button id="api-search-button" class="btn col s6 offset-s3" type="submit">Query 4</button>
                        </div>

                    </form>


                </div>
            </div>
        </div>
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
                  DATE: 2021-02-22T13:28:21.807
                  SOURCE: C:/Users/c18jo/IdeaProjects/SOSE Lab-2 Play Frontend-Backend/Frontend/app/views/login.scala.html
                  HASH: 335cf7d7873a6ad4c6b92ac4371e44390ce460f0
                  MATRIX: 811->0|3225->2389|3240->2395|3285->2419|3572->2679|3587->2685|3632->2709|3919->2969|3934->2975|3979->2999|4266->3259|4281->3265|4326->3289
                  LINES: 26->1|67->42|67->42|67->42|74->49|74->49|74->49|81->56|81->56|81->56|88->63|88->63|88->63
                  -- GENERATED --
              */
          