// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/c18jo/IdeaProjects/SOSE Lab-2 Play Frontend-Backend/Frontend/conf/routes
// @DATE:Sat Feb 27 14:32:08 MST 2021

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:7
package controllers {

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def query3(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "query3")
    }
  
    // @LINE:7
    def querySelectionHandler(): Call = {
    
      () match {
      
        // @LINE:7
        case ()  =>
          
          Call("GET", _prefix)
      
      }
    
    }
  
    // @LINE:15
    def query4(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "query4")
    }
  
    // @LINE:11
    def query2(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "query2")
    }
  
    // @LINE:9
    def query1(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "query1")
    }
  
    // @LINE:19
    def queryOneHandler(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "response")
    }
  
  }

  // @LINE:22
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:22
    def at(file:String): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[String]].unbind("file", file))
    }
  
  }


}
