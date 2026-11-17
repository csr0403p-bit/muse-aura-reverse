package com.facebook.aura.audio;

import X.C3cG;
import android.content.Context;
import com.facebook.aura.auth.signout.SignOutCleanupHandler;
import com.facebook.aura.common.appcontext.AuraAppContext;
import java.io.File;

/* loaded from: classes2.dex */
public final class HatchAudioCacheSignOutCleanup implements SignOutCleanupHandler {
    public static final int $stable = 0;
    public static final HatchAudioCacheSignOutCleanup INSTANCE = new HatchAudioCacheSignOutCleanup();

    @Override // com.facebook.aura.auth.signout.SignOutCleanupHandler
    public void cleanup() {
        File cacheDir;
        Context context = AuraAppContext.INSTANCE.getContext();
        if (context == null || (cacheDir = context.getCacheDir()) == null) {
            return;
        }
        HatchAudioCacheKt.deleteChildrenInBackground(C3cG.A0O(cacheDir, HatchAudioCacheKt.AUDIO_CACHE_DIR));
    }
}
