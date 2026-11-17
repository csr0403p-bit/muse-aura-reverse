package com.facebook.aura.settings;

import X.AnonymousClass005;

/* loaded from: classes4.dex */
public abstract class WhatsAppConnectConsentJsonKt {
    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.AHD<com.facebook.aura.settings.WhatsAppConnectDisclosureRun> toFooterRuns(com.facebook.aura.settings.ChannelTosDisclosureJson r7) {
        /*
            r0 = 0
            X.C7384Etj.A0Y(r7, r0)
            java.util.List<com.facebook.aura.settings.ChannelTosRunJson> r0 = r7.footer_runs
            boolean r0 = r0.isEmpty()
            r6 = 0
            if (r0 != 0) goto L32
            java.util.List<com.facebook.aura.settings.ChannelTosRunJson> r1 = r7.footer_runs
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L1a
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L1a
        L19:
            return r6
        L1a:
            java.util.Iterator r1 = r1.iterator()
        L1e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L19
            java.lang.Object r0 = r1.next()
            com.facebook.aura.settings.ChannelTosRunJson r0 = (com.facebook.aura.settings.ChannelTosRunJson) r0
            java.lang.String r0 = r0.text
            boolean r0 = X.C7BY.A0j(r0)
            if (r0 != 0) goto L1e
        L32:
            java.util.List<com.facebook.aura.settings.ChannelTosRunJson> r0 = r7.footer_runs
            java.util.ArrayList r5 = X.AnonymousClass003.A0i(r0)
            java.util.Iterator r4 = r0.iterator()
        L3c:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L76
            java.lang.Object r3 = r4.next()
            com.facebook.aura.settings.ChannelTosRunJson r3 = (com.facebook.aura.settings.ChannelTosRunJson) r3
            java.lang.String r2 = r3.url
            if (r2 == 0) goto L74
            boolean r0 = X.C7BY.A0j(r2)
            if (r0 != 0) goto L74
        L52:
            java.lang.String r1 = r3.text
            int r0 = r1.length()
            if (r0 == 0) goto L19
            if (r2 == 0) goto L69
            boolean r0 = X.C7BY.A0j(r1)
            if (r0 != 0) goto L19
            boolean r0 = isHttpsUrl(r2)
            if (r0 != 0) goto L69
            return r6
        L69:
            java.lang.String r1 = r3.text
            com.facebook.aura.settings.WhatsAppConnectDisclosureRun r0 = new com.facebook.aura.settings.WhatsAppConnectDisclosureRun
            r0.<init>(r1, r2)
            r5.add(r0)
            goto L3c
        L74:
            r2 = r6
            goto L52
        L76:
            X.AHD r6 = X.AGI.A07(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.WhatsAppConnectConsentJsonKt.toFooterRuns(com.facebook.aura.settings.ChannelTosDisclosureJson):X.AHD");
    }

    public static final boolean isHttpsUrl(String str) {
        return AnonymousClass005.A1a(str, "https://") && str.length() > 8;
    }
}
