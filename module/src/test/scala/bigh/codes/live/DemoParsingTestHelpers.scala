package bigh.codes.live

trait DemoParsingTestHelpers {
  self: DemoParsers =>

  implicit class StringWithParsingCapabilities(text: String) {
    def shouldParseTo(stuff: Any) {
      parse(word, text) match {
        case Success(possibleMatch, _) =>
          if (possibleMatch != stuff)
            throw new Exception(s"text: $text\n\n.. parsed, but didn't match $stuff")
        case _ =>
          throw new Exception(s"text: $text\n\n.. did not parse")
      }
    }

    def shouldNotParse() {
      parse(word, text) match {
        case Success(possibleMatch, _) =>
          throw new Exception(s"text: $text\n\n.. parsed but should NOT have parsed")
        case _ =>
      }
    }
  }
}

