ServerInfo
==========
A plugin that tells you everything about a server
--------------------------------------------------

ServerInfo is a simple Spigot plugin that tells you everything you need to know about a server including its type,
version, MC version, and more.

Compiling from Source
------
To compile ServerInfo, you will need JDK 21, an internet connection, and preferably an IDE (IntelliJ is the best).

If you don't want to use an IDE, clone this repo and run `./gradlew build`. You can find the compiled jar
in `build/libs` as `ServerInfo-<last-release>.jar`. Otherwise, clone this repo, set up a project that uses existing
resources, and add a configuration that runs `gradle build`.

Binaries
------
You can download the jar files in the releases tab if you don't want to compile ServerInfo from source. Keep in
mind, it usually won't be up-to-date with the latest commit.

(c) 2021-2024 Anston Sorensen
