package com.facebook.aura.json;

/* loaded from: classes2.dex */
public abstract class HatchStefiResponseDecoderKt {
    /* JADX WARN: Removed duplicated region for block: B:12:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object decodeStefiResponseWith(com.facebook.aura.network.AuraHttpResponse r7, kotlin.jvm.functions.Function0<? extends X.C9hr<T>> r8, boolean r9, java.lang.String r10) {
        /*
            X.AnonymousClass005.A0y(r7, r8, r10)
            java.lang.String r3 = r7.bodyString()     // Catch: java.lang.Exception -> L88
            boolean r0 = r7.isSuccessful
            if (r0 != 0) goto L39
            r2 = 0
            if (r3 == 0) goto L17
            boolean r0 = X.C7BY.A0j(r3)
            if (r0 == 0) goto L15
            r3 = r2
        L15:
            if (r3 != 0) goto L28
        L17:
            java.lang.String r1 = r7.errorMessage
            if (r1 == 0) goto L22
            boolean r0 = X.C7BY.A0j(r1)
            if (r0 != 0) goto L22
            r2 = r1
        L22:
            if (r2 != 0) goto L37
            java.lang.String r3 = X.C3cG.A0b(r7, r10)
        L28:
            int r4 = r7.code
            java.lang.Throwable r6 = r7.cause
            r5 = 0
            com.facebook.aura.json.NetworkException r0 = new com.facebook.aura.json.NetworkException
            r2 = r0
            r7 = r5
            r8 = r5
            r9 = r5
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            goto L98
        L37:
            r3 = r2
            goto L28
        L39:
            if (r9 == 0) goto L3e
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L3e:
            if (r3 == 0) goto L77
            boolean r0 = X.C7BY.A0j(r3)
            if (r0 != 0) goto L77
            X.9sU r1 = com.facebook.aura.json.HatchJsonKt.HatchJson     // Catch: java.lang.Exception -> L53
            java.lang.Object r0 = r8.invoke()     // Catch: java.lang.Exception -> L53
            X.9jG r0 = (X.C9jG) r0     // Catch: java.lang.Exception -> L53
            java.lang.Object r0 = r1.A00(r3, r0)     // Catch: java.lang.Exception -> L53
            return r0
        L53:
            r6 = move-exception
            boolean r0 = X.C7BY.A0j(r3)
            if (r0 == 0) goto L6a
            java.lang.String r3 = r7.errorMessage
            if (r3 != 0) goto L6a
            java.lang.String r3 = r6.getMessage()
            if (r3 != 0) goto L6a
            java.lang.String r0 = " decode failed"
            java.lang.String r3 = X.FGI.A0M(r10, r0)
        L6a:
            int r4 = r7.code
            r5 = 0
            com.facebook.aura.json.NetworkException r0 = new com.facebook.aura.json.NetworkException
            r2 = r0
            r7 = r5
            r8 = r5
            r9 = r5
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            goto L98
        L77:
            java.lang.String r1 = X.C3cH.A0c(r7, r10)
            int r2 = r7.code
            r3 = 0
            com.facebook.aura.json.NetworkException r0 = new com.facebook.aura.json.NetworkException
            r4 = r3
            r5 = r3
            r6 = r3
            r7 = r3
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            goto L98
        L88:
            r4 = move-exception
            java.lang.String r1 = X.C3cH.A0d(r7, r10, r4)
            int r2 = r7.code
            r3 = 0
            com.facebook.aura.json.NetworkException r0 = new com.facebook.aura.json.NetworkException
            r5 = r3
            r6 = r3
            r7 = r3
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
        L98:
            X.Hud r0 = X.C3cG.A0s(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.json.HatchStefiResponseDecoderKt.decodeStefiResponseWith(com.facebook.aura.network.AuraHttpResponse, kotlin.jvm.functions.Function0, boolean, java.lang.String):java.lang.Object");
    }
}
