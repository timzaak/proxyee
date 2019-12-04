import sbt._

object Dependencies {
  private val nettyVersion = "4.1.25.Final"
  lazy val nettyDependencies = Seq(
    "io.netty" % "netty-buffer" % nettyVersion,
    "io.netty" % "netty-codec" % nettyVersion,
    "io.netty" % "netty-codec-http" % nettyVersion,
    "io.netty" % "netty-handler" % nettyVersion,
    "io.netty" % "netty-handler-proxy" % nettyVersion

  )

  lazy val bcpkix = "org.bouncycastle" % "bcpkix-jdk15on" % "1.58"
}