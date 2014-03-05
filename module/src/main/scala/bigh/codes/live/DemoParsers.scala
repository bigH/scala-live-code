package bigh.codes.live

import scala.util.parsing.combinator.JavaTokenParsers

class DemoParsers extends JavaTokenParsers {
  def word: Parser[String] = "hello" ^^ { _.toString }
}
