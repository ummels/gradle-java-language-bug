This repository demonstrates a suspected bug with [Gradle](https://www.gradle.org).

While [build.gradle](/build.gradle#L4) mandates a compatibility with Java 8, using a
[method](/src/main/java/de/ummels/test/Main.java#L10)
which is only available in Java 11 and newer does not lead to a compile error.
