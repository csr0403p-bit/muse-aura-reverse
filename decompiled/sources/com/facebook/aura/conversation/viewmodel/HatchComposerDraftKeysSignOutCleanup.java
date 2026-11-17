package com.facebook.aura.conversation.viewmodel;

import com.facebook.aura.auth.signout.SignOutCleanupHandler;

/* loaded from: classes3.dex */
public final class HatchComposerDraftKeysSignOutCleanup implements SignOutCleanupHandler {
    public static final int $stable = 0;
    public static final HatchComposerDraftKeysSignOutCleanup INSTANCE = new HatchComposerDraftKeysSignOutCleanup();

    @Override // com.facebook.aura.auth.signout.SignOutCleanupHandler
    public void cleanup() {
        HatchComposerDraftStore.Companion.forgetDataKeys$fbandroid_express_aura_java_com_facebook_aura_conversation_viewmodel_viewmodel();
    }
}
