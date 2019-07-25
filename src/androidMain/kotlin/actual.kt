package org.tallythings.common

actual fun platformName() : String {
    // We could call into an android specific method.
    return "Android"
}