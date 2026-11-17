package androidx.media.session;

import X.AbstractC8842Fqy;
import X.AbstractC8846Fr3;
import X.AnonymousClass007;
import X.BV5;
import X.C3cG;
import X.C8839Fqv;
import X.C8843Fqz;
import X.FGI;
import android.app.ForegroundServiceStartNotAllowedException;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.util.Log;
import java.util.List;

@Deprecated
/* loaded from: classes6.dex */
public class MediaButtonReceiver extends BroadcastReceiver {
    public static final void A01(ForegroundServiceStartNotAllowedException foregroundServiceStartNotAllowedException) {
        Log.e("MediaButtonReceiver", BV5.A0n("caught exception when trying to start a foreground service from the background: ", foregroundServiceStartNotAllowedException));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null || !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            Log.d("MediaButtonReceiver", AnonymousClass007.A0a("Ignore unsupported intent: ", intent));
            return;
        }
        ComponentName componentNameA00 = A00(context, "android.intent.action.MEDIA_BUTTON");
        if (componentNameA00 != null) {
            intent.setComponent(componentNameA00);
            try {
                context.startForegroundService(intent);
                return;
            } catch (IllegalStateException e) {
                if (Build.VERSION.SDK_INT < 31 || !AbstractC8846Fr3.A01(e)) {
                    throw e;
                }
                A01(AbstractC8846Fr3.A00(e));
                return;
            }
        }
        ComponentName componentNameA002 = A00(context, "android.media.browse.MediaBrowserService");
        if (componentNameA002 == null) {
            throw C3cG.A0Q("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
        }
        BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
        Context applicationContext = context.getApplicationContext();
        C8843Fqz c8843Fqz = new C8843Fqz(pendingResultGoAsync, applicationContext, intent);
        C8839Fqv c8839Fqv = new C8839Fqv(componentNameA002, applicationContext, c8843Fqz);
        c8843Fqz.A01 = c8839Fqv;
        Log.d("MediaBrowserCompat", "Connecting to a MediaBrowserService.");
        ((AbstractC8842Fqy) c8839Fqv.A00).A04.connect();
    }

    public static ComponentName A00(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (listQueryIntentServices.size() == 1) {
            ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
            return new ComponentName(((PackageItemInfo) serviceInfo).packageName, ((PackageItemInfo) serviceInfo).name);
        }
        if (listQueryIntentServices.isEmpty()) {
            return null;
        }
        throw C3cG.A0Q(FGI.A0V("Expected 1 service that handles ", str, ", found ", listQueryIntentServices.size()));
    }
}
