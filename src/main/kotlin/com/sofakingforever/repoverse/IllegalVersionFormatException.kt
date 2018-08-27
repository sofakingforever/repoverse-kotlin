package com.sofakingforever.repoverse

import java.net.MalformedURLException

class IllegalVersionFormatException(version : String) : MalformedURLException("Version '$version' is illegal") {

}