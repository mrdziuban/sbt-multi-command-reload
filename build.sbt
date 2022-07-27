Global / onChangedBuildSource := ReloadOnSourceChanges

def proj(i: Int) = Project(s"proj$i", file(s"proj-$i"))
  .settings(
    name := s"sbt-alias-watch-proj-$i",
    organization := "com.example",
    scalaVersion := "2.13.8",
    version      := "0.1.0-SNAPSHOT",
  )

lazy val proj1 = proj(1)
lazy val proj2 = proj(2)
lazy val proj3 = proj(3)
