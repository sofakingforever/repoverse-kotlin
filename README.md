# RepoVerse - Latest Repository Package Version
This is a Java/Kotlin library to check for the latest package release on a repository (GitHub & Bintray only for now)


## Quick Start Guide

### Add To Gradle
Add library to your gradle module

```gradle
repositories {
    maven { url "http://dl.bintray.com/sofakingforever/repoverse" }
}

dependencies {
    implementation "com.sofakingforever.repoverse:repoverse:1.0.2"
}
```

### Kotlin Implementation Example
Initiate analytics and send events

```java
RemoteVersionResolver bintrayResolver = new BintrayVersionResolver("sofakingforever/analytics/kotlin-analytics");

bintrayResolver.resolve(latestVersion -> {
            System.out.println("BinTray Latest Version: " + latestVersion.toString());

        });
```

#### See more integration examples in the [source code](https://github.com/sofakingforever/repoverse-kotlin/blob/master/src/main/java/com/sofakingforever/repoverse/Main.java)


### Originally developed for
#### [solid-kotlin-analytics](https://github.com/sofakingforever/solid-kotlin-analytics)

License
-------

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

