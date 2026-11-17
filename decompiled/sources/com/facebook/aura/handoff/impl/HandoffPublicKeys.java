package com.facebook.aura.handoff.impl;

import X.C31u;
import X.C60O;
import X.InterfaceC7359EnW;

/* loaded from: classes3.dex */
public final class HandoffPublicKeys {
    public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties = C60O.A1b(HandoffPublicKeys.class, "webKeysJson", "<v#0>", 0);
    public static final HandoffPublicKeys INSTANCE = new HandoffPublicKeys();
    public static final String TAG = "HandoffPublicKeys";

    /* JADX WARN: Removed duplicated region for block: B:11:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String pemFor(X.C07087ng r10) {
        /*
            r9 = this;
            r5 = 0
            X.C7384Etj.A0Y(r10, r5)
            X.Exw r0 = com.facebook.aura.handoff.impl.MC.muse_android_deeplink_security_controls.signed_url_web_keys
            X.31u r0 = com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt.auraMobileConfigString(r0)
            java.lang.String r7 = pemFor$lambda$0(r0)
            r9 = 0
            if (r7 == 0) goto L56
            boolean r0 = X.C7BY.A0j(r7)
            if (r0 != 0) goto L56
            X.9sU r6 = com.facebook.aura.json.HatchJsonKt.HatchJson     // Catch: java.lang.Throwable -> L4d
            X.9pz r8 = r6.A02     // Catch: java.lang.Throwable -> L4d
            java.lang.Class<java.util.Map> r4 = java.util.Map.class
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            X.BFU r0 = X.C7nl.A00(r1)     // Catch: java.lang.Throwable -> L4d
            java.lang.Integer r2 = X.C79.A00     // Catch: java.lang.Throwable -> L4d
            X.7nn r3 = new X.7nn     // Catch: java.lang.Throwable -> L4d
            r3.<init>(r2, r0)     // Catch: java.lang.Throwable -> L4d
            X.BFU r1 = X.C7nl.A00(r1)     // Catch: java.lang.Throwable -> L4d
            X.7nn r0 = new X.7nn     // Catch: java.lang.Throwable -> L4d
            r0.<init>(r2, r1)     // Catch: java.lang.Throwable -> L4d
            X.A6i r2 = X.C3cG.A0x(r4)     // Catch: java.lang.Throwable -> L4d
            X.7nn[] r0 = new X.C07107nn[]{r3, r0}     // Catch: java.lang.Throwable -> L4d
            java.util.List r1 = java.util.Arrays.asList(r0)     // Catch: java.lang.Throwable -> L4d
            X.BFU r0 = new X.BFU     // Catch: java.lang.Throwable -> L4d
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L4d
            X.9hr r0 = X.C9u8.A03(r0, r8)     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r8 = r6.A00(r7, r0)     // Catch: java.lang.Throwable -> L4d
            goto L52
        L4d:
            r0 = move-exception
            X.Hud r8 = X.C3cG.A0s(r0)
        L52:
            boolean r0 = r8 instanceof X.C10571Hud
            if (r0 == 0) goto L57
        L56:
            r8 = r9
        L57:
            java.util.Map r8 = (java.util.Map) r8
            java.lang.String r3 = "HandoffPublicKeys"
            if (r8 != 0) goto L63
            java.lang.String r0 = "Malformed signed_url_web_keys, denying signed links"
            X.CFK.A06(r3, r0)
        L62:
            return r9
        L63:
            java.lang.String r1 = r10.A02
            X.7nh r0 = r10.A01
            java.lang.String r2 = r0.name()
            long r6 = r10.A00
            java.lang.StringBuilder r1 = X.C3cG.A0g(r1)
            java.lang.String r0 = "-"
            X.C60O.A1R(r0, r2, r1)
            r1.append(r6)
            java.lang.String r4 = r1.toString()
            java.lang.Object r2 = r8.get(r4)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L62
            r1 = 45
            r0 = 43
            java.lang.String r2 = r2.replace(r1, r0)     // Catch: java.lang.IllegalArgumentException -> La4
            r1 = 95
            r0 = 47
            java.lang.String r0 = r2.replace(r1, r0)     // Catch: java.lang.IllegalArgumentException -> La4
            byte[] r2 = android.util.Base64.decode(r0, r5)     // Catch: java.lang.IllegalArgumentException -> La4
            X.C7384Etj.A0U(r2)     // Catch: java.lang.IllegalArgumentException -> La4
            java.nio.charset.Charset r1 = X.DCl.A05     // Catch: java.lang.IllegalArgumentException -> La4
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.IllegalArgumentException -> La4
            r0.<init>(r2, r1)     // Catch: java.lang.IllegalArgumentException -> La4
            return r0
        La4:
            r2 = move-exception
            java.lang.String r1 = "Malformed "
            java.lang.String r0 = " in signed_url_web_keys, denying signed links"
            java.lang.String r0 = X.FGI.A0U(r1, r4, r0)
            X.CFK.A0A(r3, r0, r2)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.handoff.impl.HandoffPublicKeys.pemFor(X.7ng):java.lang.String");
    }

    public static final String pemFor$lambda$0(C31u<Object, String> c31u) {
        return (String) C31u.A00(c31u, $$delegatedProperties);
    }
}
