package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {

  def index = Action {
    Ok(views.html.index("Nishida Dental  Clinick"))
  }

  def index1 = Action {
    Ok(views.html.index1("Nishida Dental  Clinick"))
  }

  def index2 = Action {
    Ok(views.html.index2("Nishida Dental  Clinick"))
  }

  def index3 = Action {
    Ok(views.html.index3("Nishida Dental  Clinick"))
  }

  def index4 = Action {
    Ok(views.html.index4("Nishida Dental  Clinick"))
  }

  def index5 = Action {
    Ok(views.html.index5("Nishida Dental  Clinick"))
  }
}