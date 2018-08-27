package com.sofakingforever.repoverse.resolvers

import com.sofakingforever.repoverse.Version


interface RemoteVersionResolver {

    val packagePath: String

    fun resolve(callback: Callback)

    interface Callback {
        fun onVersionResolved(latestVersion: Version)
    }

}

