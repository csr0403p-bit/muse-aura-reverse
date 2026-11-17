package com.facebook.aura.file.view;

import com.facebook.aura.auth.signout.SignOutCleanupHandler;
import com.facebook.aura.file.view.api.ContentViewerDataHolder;

/* loaded from: classes.dex */
public final class ContentViewerDataHolderCleanupHandler implements SignOutCleanupHandler {
    public static final int $stable = 0;
    public static final ContentViewerDataHolderCleanupHandler INSTANCE = new ContentViewerDataHolderCleanupHandler();

    @Override // com.facebook.aura.auth.signout.SignOutCleanupHandler
    public void cleanup() {
        ContentViewerDataHolder.INSTANCE.clear();
    }
}
