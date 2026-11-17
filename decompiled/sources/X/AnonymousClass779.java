package X;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.StrictMode;

/* renamed from: X.779, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class AnonymousClass779 {
    public static final Uri A00(C75P c75p, Integer num, String str, int i) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("glance-action");
        builder.path(1 - num.intValue() != 0 ? "CALLBACK" : "BROADCAST");
        builder.appendQueryParameter("appWidgetId", String.valueOf(c75p.A00));
        builder.appendQueryParameter("viewId", String.valueOf(i));
        builder.appendQueryParameter("viewSize", C73O.A01(c75p.A04));
        builder.appendQueryParameter("extraData", str);
        if (c75p.A0E) {
            builder.appendQueryParameter("lazyCollection", String.valueOf(c75p.A03));
            builder.appendQueryParameter("lazeViewItem", String.valueOf(c75p.A02));
        }
        return builder.build();
    }

    public static final void A01(Activity activity, Intent intent) {
        Integer num;
        Parcelable parcelableExtra = intent.getParcelableExtra("ACTION_INTENT");
        if (parcelableExtra == null) {
            throw C60O.A0i("List adapter activity trampoline invoked without specifying target intent.");
        }
        Intent intent2 = (Intent) parcelableExtra;
        if (intent.hasExtra("android.widget.extra.CHECKED")) {
            intent2.putExtra("android.widget.extra.CHECKED", intent.getBooleanExtra("android.widget.extra.CHECKED", false));
        }
        String stringExtra = intent.getStringExtra("ACTION_TYPE");
        if (stringExtra == null) {
            throw C60O.A0i("List adapter activity trampoline invoked without trampoline type");
        }
        Bundle bundleExtra = intent.getBundleExtra("ACTIVITY_OPTIONS");
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        StrictMode.setVmPolicy((Build.VERSION.SDK_INT >= 31 ? C77C.A00(new StrictMode.VmPolicy.Builder(vmPolicy)) : new StrictMode.VmPolicy.Builder()).build());
        if (stringExtra.equals("ACTIVITY")) {
            num = C79.A00;
        } else if (stringExtra.equals("BROADCAST")) {
            num = C79.A01;
        } else if (stringExtra.equals("SERVICE")) {
            num = C79.A0C;
        } else if (stringExtra.equals("FOREGROUND_SERVICE")) {
            num = C79.A0K;
        } else {
            if (!stringExtra.equals("CALLBACK")) {
                throw C60O.A0i(stringExtra);
            }
            num = C79.A0P;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            activity.startActivity(intent2, bundleExtra);
        } else if (iIntValue == 1 || iIntValue == 4) {
            activity.sendBroadcast(intent2);
        } else if (iIntValue != 2) {
            activity.startForegroundService(intent2);
        } else {
            activity.startService(intent2);
        }
        StrictMode.setVmPolicy(vmPolicy);
        activity.finish();
    }
}
