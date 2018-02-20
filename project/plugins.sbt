addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "1.1.4")

resolvers += Resolver.url("bintray-sbilinski", url("http://dl.bintray.com/sbilinski/maven"))(Resolver.ivyStylePatterns)

addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "1.1.4")
// sbt-assembly for "fat jars"
addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.5")