package controllers

import javax.inject._
import play.api._
import play.api.mvc._

@Singleton
class APIController @Inject()(
                                val controllerComponents: ControllerComponents
                              ) extends BaseController {
  def hello(name: String): Action[AnyContent] = Action {
    implicit request =>
      if (name.nonEmpty) {
        Ok(s"Hello $name! Lovely to meet you.")
      }
      else {
        Ok(s"Hello world!")
      }
  }
}
