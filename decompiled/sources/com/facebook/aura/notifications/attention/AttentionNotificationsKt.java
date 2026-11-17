package com.facebook.aura.notifications.attention;

import X.AbstractC10402HbJ;
import X.AnonymousClass003;
import X.C7384Etj;
import X.C7Je;
import X.C7m8;
import X.C7mB;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* loaded from: classes2.dex */
public abstract class AttentionNotificationsKt {
    public static final PendingIntent openUriOrAppPendingIntent(Context context, int i, String str) {
        PendingIntent pendingIntentOpenUriPendingIntent;
        C7384Etj.A0Y(context, 0);
        if (str != null && (pendingIntentOpenUriPendingIntent = openUriPendingIntent(context, i, str, false)) != null) {
            return pendingIntentOpenUriPendingIntent;
        }
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage != null) {
            return PendingIntent.getActivity(context, 0, launchIntentForPackage, 201326592);
        }
        return null;
    }

    public static final PendingIntent openUriPendingIntent(Context context, int i, String str, boolean z) {
        AnonymousClass003.A0v(context, str);
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage == null) {
            return null;
        }
        Uri uriA01 = null;
        try {
            uriA01 = C7Je.A01(str);
        } catch (SecurityException | UnsupportedOperationException unused) {
        }
        if (uriA01 == null) {
            return null;
        }
        launchIntentForPackage.addFlags(603979776);
        launchIntentForPackage.setData(uriA01);
        if (z) {
            AttentionNotifications.INSTANCE.cancelApprovalOnOpen(launchIntentForPackage, i);
        }
        C7m8 c7m8 = new C7m8();
        c7m8.A06(launchIntentForPackage, context.getClassLoader());
        c7m8.A00 = C7mB.A00("*|all_packages|*", AbstractC10402HbJ.A0o);
        c7m8.A01 = true;
        return c7m8.A01(context, i, 201326592);
    }
}
