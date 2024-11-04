import mill._, scalalib._

import $ivy.`com.lihaoyi::mill-contrib-scoverage:`

import mill.contrib.scoverage.ScoverageModule

object Demo extends ScalaModule with ScoverageModule {
  def scalaVersion   = "3.3.3"
  
  def scoverageVersion = "2.2.1"

  def zioTestVersion = "2.1.11"
  
  object test extends ScoverageTests with ScalaTests {
    def ivyDeps = Agg(
      ivy"dev.zio::zio-test:$zioTestVersion",
      ivy"dev.zio::zio-test-sbt:$zioTestVersion"
    )
	
	def testFramework = "zio.test.sbt.ZTestFramework"
  }
}
