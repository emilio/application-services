initSidebarItems({"enum":[["Command",""],["CommandStatus","Indicates if a command was applied successfully, ignored, or not supported. Applied and ignored commands are removed from our client record, and never retried. Unsupported commands are put back into our record, and retried on subsequent syncs. This is to handle clients adding support for new data types."]],"struct":[["ClientData","Argument to Store::prepare_for_sync. See comment there for more info. Only really intended to be used by tabs engine."],["Engine",""],["RemoteClient","Information about a remote client in the clients collection."],["Settings","Information about this device to include in its client record. This should be persisted across syncs, as part of the sync manager state."]],"trait":[["CommandProcessor","A command processor applies incoming commands like wipes and resets for all stores, and returns commands to send to other clients. It also manages settings like the device name and type, which is stored in the special `clients` collection."]]});