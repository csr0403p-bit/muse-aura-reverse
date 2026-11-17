package com.facebook.aura.modellock;

import com.facebook.aura.auth.signout.SignOutCleanupHandler;

/* loaded from: classes5.dex */
public final class ModelLockAppealFileCleanup implements SignOutCleanupHandler {
    public static final ModelLockAppealFileCleanup INSTANCE = new ModelLockAppealFileCleanup();

    @Override // com.facebook.aura.auth.signout.SignOutCleanupHandler
    public void cleanup() {
        ModelLockAppealFiles.INSTANCE.delete();
    }
}
