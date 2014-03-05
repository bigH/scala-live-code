import sbt._

object Libraries {

  object main {
  }

  object test {
    lazy val scalaTest = "org.scalatest" %% "scalatest" % Versions.scalatest
  }

  lazy val defaultTestingLibs = {
    import test._

    def inTest(module: ModuleID) = module % "test"

    Seq (
      inTest(scalaTest)
    )
  }

}
