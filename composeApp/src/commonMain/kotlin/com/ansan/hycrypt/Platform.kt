package com.ansan.hycrypt

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform