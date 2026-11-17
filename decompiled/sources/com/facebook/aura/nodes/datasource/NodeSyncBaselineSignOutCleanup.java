package com.facebook.aura.nodes.datasource;

import com.facebook.aura.auth.signout.SignOutCleanupHandler;

/* loaded from: classes3.dex */
public final class NodeSyncBaselineSignOutCleanup implements SignOutCleanupHandler {
    public static final NodeSyncBaselineSignOutCleanup INSTANCE = new NodeSyncBaselineSignOutCleanup();

    @Override // com.facebook.aura.auth.signout.SignOutCleanupHandler
    public void cleanup() {
        NodeSyncBaselineStore.Companion.deleteAll$fbandroid_express_aura_java_com_facebook_aura_nodes_datasource_datasource();
    }
}
