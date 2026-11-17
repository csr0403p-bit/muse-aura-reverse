package com.facebook.aura.bloks.plugins.core.deeplinktootherappoverride;

import X.C7384Etj;
import X.C7Je;
import X.CFK;
import android.net.Uri;

/* loaded from: classes6.dex */
public final class MWABKBloksActionDeeplinkToOtherAppOrDirectToAppStoreImpl {
    public static final String DESTINATION_URL_PARAM = "destination_url";
    public static final MWABKBloksActionDeeplinkToOtherAppOrDirectToAppStoreImpl INSTANCE = new MWABKBloksActionDeeplinkToOtherAppOrDirectToAppStoreImpl();
    public static final String INTER_APP_REDIRECT_PATH = "/inter_app/redirect/";
    public static final String TAG = "MWABKBloksActionDeeplinkToOtherAppOrDirectToAppStoreImpl";

    /* JADX WARN: Removed duplicated region for block: B:24:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object evaluate(X.Hj6 r8, X.F6D r9) {
        /*
            r1 = 0
            boolean r2 = X.AnonymousClass002.A1a(r8, r9)
            X.FBB r0 = r9.A02
            r9 = 0
            if (r0 != 0) goto L12
            java.lang.String r1 = com.facebook.aura.bloks.plugins.core.deeplinktootherappoverride.MWABKBloksActionDeeplinkToOtherAppOrDirectToAppStoreImpl.TAG
            java.lang.String r0 = "Bloks context null while evaluating BKBloksActionDeeplinkToOtherAppOrDirectToAppStoreImpl"
            X.CFK.A04(r1, r0)
            return r9
        L12:
            android.content.Context r4 = X.FBB.A00(r0)
            java.lang.Object[] r0 = r8.A01
            r1 = r0[r1]
            java.lang.String r1 = (java.lang.String) r1
            r5 = r0[r2]
            java.lang.String r5 = (java.lang.String) r5
            com.facebook.aura.bloks.plugins.core.deeplinktootherappoverride.MWABKBloksActionDeeplinkToOtherAppOrDirectToAppStoreImpl r0 = com.facebook.aura.bloks.plugins.core.deeplinktootherappoverride.MWABKBloksActionDeeplinkToOtherAppOrDirectToAppStoreImpl.INSTANCE
            java.lang.String r6 = r0.extractDestinationUrl(r1)
            if (r6 != 0) goto L29
            r6 = r1
        L29:
            if (r5 == 0) goto L50
            int r8 = r5.length()
            int r8 = r8 - r2
            r7 = 0
            r3 = 0
        L32:
            if (r7 > r8) goto L52
            r0 = r8
            if (r3 != 0) goto L38
            r0 = r7
        L38:
            char r2 = r5.charAt(r0)
            r1 = 32
            r0 = 0
            if (r2 > r1) goto L42
            r0 = 1
        L42:
            if (r3 != 0) goto L4b
            if (r0 != 0) goto L48
            r3 = 1
            goto L32
        L48:
            int r7 = r7 + 1
            goto L32
        L4b:
            if (r0 == 0) goto L52
            int r8 = r8 + (-1)
            goto L32
        L50:
            r0 = r9
            goto L6f
        L52:
            int r0 = r8 + 1
            java.lang.CharSequence r0 = r5.subSequence(r7, r0)
            java.lang.String r0 = r0.toString()
            int r0 = r0.length()
            if (r0 <= 0) goto L50
            android.net.Uri r1 = X.C7Je.A01(r5)
            X.C7384Etj.A0U(r1)
            java.lang.String r0 = "id"
            java.lang.String r0 = r1.getQueryParameter(r0)
        L6f:
            java.lang.String r1 = com.facebook.aura.bloks.plugins.core.deeplinktootherappoverride.MWABKBloksActionDeeplinkToOtherAppOrDirectToAppStoreImpl.TAG
            X.C7384Etj.A0V(r1)
            X.C7384Etj.A0X(r6)
            boolean r0 = X.AbstractC07378iq.A01(r4, r1, r6, r0)
            if (r0 != 0) goto L80
            X.AbstractC07378iq.A00(r4, r1, r5)
        L80:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.bloks.plugins.core.deeplinktootherappoverride.MWABKBloksActionDeeplinkToOtherAppOrDirectToAppStoreImpl.evaluate(X.Hj6, X.F6D):java.lang.Object");
    }

    private final String extractDestinationUrl(String str) {
        String queryParameter = null;
        if (str != null) {
            try {
                Uri uriA01 = C7Je.A01(str);
                C7384Etj.A0U(uriA01);
                String path = uriA01.getPath();
                if (path != null && path.startsWith(INTER_APP_REDIRECT_PATH)) {
                    queryParameter = uriA01.getQueryParameter(DESTINATION_URL_PARAM);
                    return queryParameter;
                }
            } catch (Exception e) {
                CFK.A0A(TAG, "Failed to parse URL for inter_app/redirect extraction", e);
                return queryParameter;
            }
        }
        return null;
    }
}
