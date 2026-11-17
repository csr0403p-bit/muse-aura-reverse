package com.facebook.aura.nodes.cards;

/* loaded from: classes5.dex */
public abstract class CalendarProviderResolverKt {
    /* JADX WARN: Removed duplicated region for block: B:24:0x0046 A[PHI: r1
  0x0046: PHI (r1v4 java.lang.Integer) = (r1v3 java.lang.Integer), (r1v7 java.lang.Integer) binds: [B:19:0x0039, B:23:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.graphics.drawable.Drawable resolveCalendarAccountIcon(android.content.Context r6, java.lang.String r7) throws android.content.res.Resources.NotFoundException {
        /*
            r0 = 0
            X.C7384Etj.A0Y(r6, r0)
            r5 = 0
            if (r7 == 0) goto L59
            int r0 = r7.length()
            if (r0 == 0) goto L59
            android.accounts.AccountManager r0 = android.accounts.AccountManager.get(r6)
            android.accounts.AuthenticatorDescription[] r4 = r0.getAuthenticatorTypes()
            X.C7384Etj.A0U(r4)
            int r2 = r4.length
            r1 = 0
        L1a:
            if (r1 >= r2) goto L2d
            r3 = r4[r1]
            java.lang.String r0 = r3.type
            if (r0 != 0) goto L28
            r0 = 0
        L23:
            if (r0 != 0) goto L2e
            int r1 = r1 + 1
            goto L1a
        L28:
            boolean r0 = r0.equalsIgnoreCase(r7)
            goto L23
        L2d:
            r3 = r5
        L2e:
            if (r3 == 0) goto L58
            int r0 = r3.smallIconId
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            if (r0 != 0) goto L39
            r1 = r5
        L39:
            if (r1 != 0) goto L46
            int r0 = r3.iconId
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            if (r0 != 0) goto L44
            r1 = r5
        L44:
            if (r1 == 0) goto L59
        L46:
            int r2 = r1.intValue()
            android.content.pm.PackageManager r1 = r6.getPackageManager()     // Catch: java.lang.Throwable -> L59
            java.lang.String r0 = r3.packageName     // Catch: java.lang.Throwable -> L59
            android.content.res.Resources r0 = r1.getResourcesForApplication(r0)     // Catch: java.lang.Throwable -> L59
            android.graphics.drawable.Drawable r5 = r0.getDrawable(r2, r5)     // Catch: java.lang.Throwable -> L59
        L58:
            return r5
        L59:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.nodes.cards.CalendarProviderResolverKt.resolveCalendarAccountIcon(android.content.Context, java.lang.String):android.graphics.drawable.Drawable");
    }
}
