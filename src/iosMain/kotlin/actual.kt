package org.tallythings.common

import platform.UIKit.UIDevice

actual fun platformName(): String {
    //Here's a little platform specific code :)
  return UIDevice.currentDevice.systemName() +
         " " +
         UIDevice.currentDevice.systemVersion
}