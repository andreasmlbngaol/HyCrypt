package com.ansan.hycrypt.domain

class JVMPlatform: Platform {
    override val name: String = "Java ${System.getProperty("java.version").split(".").first()}"
}

