
[![Download](https://api.bintray.com/packages/sofakingforever/repoverse/repoverse-kotlin/images/download.svg) ](https://bintray.com/sofakingforever/repoverse/repoverse-kotlin/_latestVersion)

# RepoVerse - Latest Repository Package Version
This is a Java/Kotlin library to check against Maven for the latest version of your package (or any package!)

For example: If you want your SDK to check its own version again maven, to understand if it needs to be updated.
This how I used it in [solid-kotlin-analytics'](https://github.com/sofakingforever/solid-kotlin-analytics/tree/master/analytics/src/main/java/com/sofakingforever/analytics/version) source code.

This library is dependant only on OkHttp3.

#### Originally developed for [solid-kotlin-analytics](https://github.com/sofakingforever/solid-kotlin-analytics)

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
// Check via Bintray
RemoteVersionResolver bintrayResolver = new BintrayVersionResolver("sofakingforever/analytics/kotlin-analytics");

// Check via GitHub
RemoteVersionResolver githubResolver = new GitHubVersionResolver("sofakingforever/solid-kotlin-analytics");

bintrayResolver.resolve(latestVersion -> {
            System.out.println("BinTray Latest Version: " + latestVersion.toString());
            
            // if (latestVersion > currentVersion)
            // need to update library

        });
```

If you encouter proguard issues when compiling, try adding this line to your proguard configuration
```proguard
-dontwarn com.sofakingforever.repoverse.**
```

## Todo List

- [x] Bintray Implementation
- [x] GitHub Implementation
- [ ] Jitpack Implementation (Any ideas how to implement?)
- [ ] Anything else?

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

