package com.sofakingforever.repoverse;

import com.sofakingforever.repoverse.resolvers.BintrayVersionResolver;
import com.sofakingforever.repoverse.resolvers.GitHubVersionResolver;
import com.sofakingforever.repoverse.resolvers.RemoteVersionResolver;
import org.jetbrains.annotations.NotNull;

public class Main {

    public static void main(String[] args) {

        RemoteVersionResolver githubResolver = new GitHubVersionResolver("sofakingforever/kotlin-analytics");
        RemoteVersionResolver bintrayResolver = new BintrayVersionResolver("sofakingforever/analytics/kotlin-analytics");


        githubResolver.resolve(latestVersion -> {
            System.out.println("GitHub Latest Version: " + latestVersion.toString());

        });

        bintrayResolver.resolve(latestVersion -> {
            System.out.println("BinTray Latest Version: " + latestVersion.toString());

        });

    }
}
