scalaVersion := "2.11.2"

organization := "net.s_mach"

name := "frank.w.klucznik"

version := "1.0-SNAPSHOT"

scalacOptions ++= Seq("-feature","-unchecked", "-deprecation")

libraryDependencies += "org.scalatest" % "scalatest_2.11" % "2.2.1" % "test"
