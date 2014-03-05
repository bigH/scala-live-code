package bigh.codes.live

import org.scalatest.FunSpec

class DemoParsersTest extends DemoParsers with FunSpec with DemoParsingTestHelpers {
  describe("Document Parser") {
    it("should not parse empty documents") {
      "" shouldNotParse ()
    }

    it("should parse hello") {
      "hello" shouldParseTo "hello"
    }
  }
}

