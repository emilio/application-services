/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

package mozilla.appservices.remotetabs

// In order to circumvent the breaking change that has been introduced with `RemoteTab` being renamed
// to `RemoteTabRecord` to prevent a conflict with the native iOS `RemoteTab`, we are aliasing `RemoteTabRecord`
// back to `RemoteTab` for android.
typealias RemoteTab = RemoteTabRecord
