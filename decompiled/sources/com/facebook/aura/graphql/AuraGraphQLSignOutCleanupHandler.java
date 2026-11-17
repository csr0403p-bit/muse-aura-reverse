package com.facebook.aura.graphql;

import com.facebook.aura.auth.signout.SignOutCleanupHandler;

/* loaded from: classes3.dex */
public final class AuraGraphQLSignOutCleanupHandler implements SignOutCleanupHandler {
    public static final AuraGraphQLSignOutCleanupHandler INSTANCE = new AuraGraphQLSignOutCleanupHandler();

    @Override // com.facebook.aura.auth.signout.SignOutCleanupHandler
    public void cleanup() {
        AuraGraphQLService.executorCache.clear();
    }
}
