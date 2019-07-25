package org.tallythings.common

import java.util.*

actual fun platformName() : String {
    // We could call into an android specific method.
    return "Android"
}

actual fun timestamp(): String {
    return Date().toString()
}