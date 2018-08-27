# RepoVerse - Latest Repository Package Version
This is a Java/Kotlin library to check for the latest package release on a repository (GitHub & Bintray only for now)
You can use this to validate that the current version is indeed the latest version on your github repo / bintray artifact repo.

[![Download](https://api.bintray.com/packages/sofakingforever/repoverse/repoverse-kotlin/images/download.svg) ](https://bintray.com/sofakingforever/repoverse/repoverse-kotlin/_latestVersion)

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

### Java Implementation Example
Create a new resolver with the repo's path, and call resolve() with the callback

```java
RemoteVersionResolver bintrayResolver = new BintrayVersionResolver("sofakingforever/repoverse/repoverse-kotlin");

bintrayResolver.resolve(latestVersion -> {
            System.out.println("BinTray Latest Version: " + latestVersion.toString());
            
            // if (latestVersion > currentVersion)
            // need to update library

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

