/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

#![allow(unknown_lints)]
#![warn(rust_2018_idioms)]

#[macro_use]
pub mod error;
mod schema;
mod storage;
mod sync;

uniffi_macros::include_scaffolding!("tabs");

pub use crate::storage::{ClientRemoteTabs, RemoteTab};
pub use crate::sync::engine::TabsEngine;
pub use crate::sync::store::TabsStore;
pub use error::{Error, ErrorKind, Result};
use sync15::DeviceType;

pub use crate::sync::store::get_registered_sync_engine;
