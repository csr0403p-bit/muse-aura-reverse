package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.DeadObjectException;

/* loaded from: classes5.dex */
public abstract class F3I {
    public static void A00(Intent intent, Context context, String str) {
        if (!"com.facebook.services".equals(str) && !"com.facebook.services.dev".equals(str)) {
            CFK.A0F("FBNSPreloadIPC", "Unknown package %s", str);
            return;
        }
        try {
            intent.setComponent(new ComponentName(str, "com.facebook.oxygen.services.fbns.PreloadedFbnsService"));
            F3F.A00(context, intent);
            context.startService(intent);
        } catch (IllegalStateException | SecurityException unused) {
        } catch (RuntimeException e) {
            if (!(e.getCause() instanceof DeadObjectException)) {
                throw e;
            }
        }
    }
}
