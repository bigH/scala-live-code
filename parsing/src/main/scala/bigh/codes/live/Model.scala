package bigh.codes.live

sealed trait Document
case object EmptyDocument extends Document
sealed trait Expression
