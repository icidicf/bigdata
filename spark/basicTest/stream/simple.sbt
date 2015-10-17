name := "Simple Project"

version := "1.0"

scalaVersion := "2.10.4"

libraryDependencies +=  "org.apache.spark" % "spark-streaming_2.10" % "1.5.1"
libraryDependencies += "org.apache.spark" %% "spark-core" % "1.5.1"
resolvers += "Sonatype (releases)" at "https://oss.sonatype.org/content/repositories/releases/"

libraryDependencies += "org.zeromq" %% "zeromq-scala-binding" % "0.0.6"


