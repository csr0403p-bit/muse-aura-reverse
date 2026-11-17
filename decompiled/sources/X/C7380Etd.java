package X;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.provider.Settings;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.Etd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7380Etd {
    public static CVU A02;
    public static String A03;
    public final NotificationManager A00;
    public final Context A01;
    public static final Object A06 = C3cG.A0T();
    public static Set<String> A04 = C60O.A13();
    public static final Object A05 = C3cG.A0T();

    public final void A01(String str, int i, Notification notification) {
        Bundle bundle = notification.extras;
        if (bundle == null || !bundle.getBoolean("android.support.useSideChannel")) {
            this.A00.notify(str, i, notification);
            return;
        }
        Context context = this.A01;
        context.getPackageName();
        CVV cvv = new CVV(str, i, notification);
        synchronized (A05) {
            CVU cvu = A02;
            if (cvu == null) {
                cvu = new CVU(context.getApplicationContext());
                A02 = cvu;
            }
            BV6.A10(cvu.A02, cvv, 0);
        }
        this.A00.cancel(str, i);
    }

    public C7380Etd(Context context) {
        this.A01 = context;
        this.A00 = (NotificationManager) context.getSystemService("notification");
    }

    public static Set<String> A00(Context context) {
        Set<String> set;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (A06) {
            if (string != null) {
                if (!string.equals(A03)) {
                    String[] strArrA1a = BV4.A1a(string, ":");
                    HashSet hashSet = new HashSet(strArrA1a.length);
                    for (String str : strArrA1a) {
                        ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                        if (componentNameUnflattenFromString != null) {
                            hashSet.add(componentNameUnflattenFromString.getPackageName());
                        }
                    }
                    A04 = hashSet;
                    A03 = string;
                }
                set = A04;
            } else {
                set = A04;
            }
        }
        return set;
    }
}
