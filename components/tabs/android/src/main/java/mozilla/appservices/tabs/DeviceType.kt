/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

package mozilla.appservices.remotetabs

// Originally `TabsDeviceType` was named `DeviceType`, but this created a namespace clash for iOS with
// the `DeviceType` created for FxA. This conflict is not an issue for android so to avoid created a
// breaking change we are aliasing `TabsDeviceType` back to `DeviceType`.
typealias DeviceType = TabsDeviceType
