package com.facebook.aura.partners.voice.avatar;

import X.AnonymousClass007;
import X.C3cG;
import X.CFK;
import android.content.Context;
import com.facebook.aura.auth.signout.SignOutCleanupHandler;
import com.facebook.aura.common.appcontext.AuraAppContext;
import com.facebook.aura.executors.AuraExecutors;
import java.io.File;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class HatchCallIdleVideoSignOutCleanup implements SignOutCleanupHandler {
    public static final HatchCallIdleVideoSignOutCleanup INSTANCE = new HatchCallIdleVideoSignOutCleanup();

    @Override // com.facebook.aura.auth.signout.SignOutCleanupHandler
    public void cleanup() {
        File cacheDir;
        Context context = AuraAppContext.INSTANCE.getContext();
        if (context == null || (cacheDir = context.getCacheDir()) == null) {
            return;
        }
        File fileA0O = C3cG.A0O(cacheDir, HatchAvatarIdlePosterCacheKt.CALL_IDLE_VIDEO_DIR);
        File fileA0O2 = C3cG.A0O(cacheDir, AnonymousClass007.A0a("hatch_call_idle_videos.retired-", UUID.randomUUID()));
        if (!fileA0O.exists() || fileA0O.renameTo(fileA0O2)) {
            AuraExecutors.INSTANCE.getIoExecutor().execute(new Runnable() { // from class: com.facebook.aura.partners.voice.avatar.HatchCallIdleVideoSignOutCleanup.cleanup.1
                @Override // java.lang.Runnable
                public final void run() {
                    HatchAvatarIdlePosterCacheKt.deleteRetiredCallIdleVideos();
                }
            });
        } else {
            CFK.A06(HatchAvatarIdlePosterCacheKt.TAG, "Could not move call idle clips aside for deletion");
        }
    }
}
