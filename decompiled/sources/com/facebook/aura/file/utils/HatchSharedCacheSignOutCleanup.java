package com.facebook.aura.file.utils;

import X.C4JM;
import X.C60O;
import X.C7384Etj;
import android.app.Application;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.os.PersistableBundle;
import com.facebook.aura.auth.signout.SignOutCleanupHandler;
import java.io.File;

/* loaded from: classes3.dex */
public final class HatchSharedCacheSignOutCleanup implements SignOutCleanupHandler {
    public static final int $stable = 0;
    public static final HatchSharedCacheSignOutCleanup INSTANCE = new HatchSharedCacheSignOutCleanup();

    @Override // com.facebook.aura.auth.signout.SignOutCleanupHandler
    public void cleanup() {
        ClipDescription primaryClipDescription;
        PersistableBundle extras;
        Application application = C4JM.A00;
        if (application != null) {
            ClipboardManager clipboardManager = (ClipboardManager) application.getSystemService(ClipboardManager.class);
            if (clipboardManager != null && (primaryClipDescription = clipboardManager.getPrimaryClipDescription()) != null && (extras = primaryClipDescription.getExtras()) != null && extras.getBoolean(HatchFileUIUtils.SHARED_CACHE_CLIP_EXTRA)) {
                clipboardManager.clearPrimaryClip();
            }
            File cacheDir = application.getCacheDir();
            C7384Etj.A0U(cacheDir);
            DeleteAsideKt.deleteAside(cacheDir, C60O.A16("shared", HatchFileUIUtils.CLIPBOARD_STAGING_DIR));
        }
    }
}
