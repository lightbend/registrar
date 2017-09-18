name := "registrar"

scalaVersion := "2.12.3"

val Versions = new {
  val Akka = "2.5.4"
  val AkkaHttp = "10.0.10"
  val SprayJson = "1.3.3"
}

libraryDependencies ++= Vector(
  "com.typesafe.akka" %% "akka-actor"           % Versions.Akka,
  "com.typesafe.akka" %% "akka-stream"          % Versions.Akka,
  "com.typesafe.akka" %% "akka-http"            % Versions.AkkaHttp,
  "com.typesafe.akka" %% "akka-http-spray-json" % Versions.AkkaHttp,
  "io.spray"          %% "spray-json"           % Versions.SprayJson
)