package org.tallythings.common

import platform.Foundation.NSDate
import platform.UIKit.UIDevice

actual fun platformName(): String {
    //Here's a little platform specific code :)
  return UIDevice.currentDevice.systemName() +
         " " +
         UIDevice.currentDevice.systemVersion
}

//TODO: need to format
actual fun timestamp(): String {
    return NSDate.new().toString()
}