import Libraries._

object Module extends BaseModule {
  val moduleName = "module"
  val location = "./module"

  val settings = Seq ()

  def project = baseProject

  lazy val libraries = Seq ()
}
