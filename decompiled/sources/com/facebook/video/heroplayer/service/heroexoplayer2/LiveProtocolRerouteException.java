package com.facebook.video.heroplayer.service.heroexoplayer2;

import X.DmR;

/* loaded from: classes5.dex */
public final class LiveProtocolRerouteException extends RuntimeException {
    public final DmR replacement;

    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public LiveProtocolRerouteException(X.DmR r5) {
        /*
            r4 = this;
            java.lang.String r0 = "Live protocol admission changed before source construction"
            r4.<init>(r0)
            r3 = 0
            if (r5 == 0) goto L32
            X.DDx r0 = r5.A03
            android.net.Uri r2 = r0.A08
            boolean r0 = r5.A02()
            if (r0 != 0) goto L32
            if (r2 == 0) goto L32
            java.lang.String r1 = "http"
            java.lang.String r0 = "https"
            java.util.Set r1 = X.C60O.A19(r1, r0)
            java.lang.String r0 = r2.getScheme()
            boolean r0 = X.AbstractC0878AGe.A0k(r1, r0)
            if (r0 == 0) goto L32
            java.lang.String r0 = r2.getHost()
            if (r0 == 0) goto L32
            boolean r0 = X.C7BY.A0j(r0)
            if (r0 == 0) goto L33
        L32:
            r5 = r3
        L33:
            r4.replacement = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.video.heroplayer.service.heroexoplayer2.LiveProtocolRerouteException.<init>(X.DmR):void");
    }
}
