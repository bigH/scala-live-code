import sbt._
import Keys._
import Modules._

object RootModule {

  lazy val project = Project (
    id = "project",
    base = file("."),
    settings = moduleSettings
  ) aggregate (
    module
  )

  val moduleSettings =
    MyDefaults.settings ++ Seq (
      name := "project"
    )
}
