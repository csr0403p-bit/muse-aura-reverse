package com.facebook.aura.localbrowser;

import com.hatch.browser.core.BrowserHostBlocklist;

/* loaded from: classes4.dex */
public final class LocalBrowserBlocklist$check$1 implements BrowserHostBlocklist {
    public final /* synthetic */ LocalBrowserBlocklist this$0;

    public LocalBrowserBlocklist$check$1(LocalBrowserBlocklist localBrowserBlocklist) {
        this.this$0 = localBrowserBlocklist;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0068  */
    @Override // com.hatch.browser.core.BrowserHostBlocklist
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object check(byte[] r8, X.HtJ<? super com.hatch.browser.core.NativeBlocklistCheckResult> r9) throws com.hatch.browser.core.NativeException.Unavailable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.facebook.aura.localbrowser.LocalBrowserBlocklist$check$1$check$1
            if (r0 == 0) goto L68
            r6 = r9
            com.facebook.aura.localbrowser.LocalBrowserBlocklist$check$1$check$1 r6 = (com.facebook.aura.localbrowser.LocalBrowserBlocklist$check$1$check$1) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L68
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r2 = r6.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r4 = 1
            if (r0 == 0) goto L42
            if (r0 != r4) goto L7a
            X.Hwg.A00(r2)
        L20:
            com.facebook.aura.network.transport.HatchHttpResponse r2 = (com.facebook.aura.network.transport.HatchHttpResponse) r2
            com.facebook.aura.localbrowser.LocalBrowserBlocklist r1 = r7.this$0
            int r0 = com.facebook.aura.localbrowser.LocalBrowserBlocklist.$stable
            X.3UX r0 = r1.scope
            boolean r0 = X.Hxb.A04(r0)
            if (r0 == 0) goto L74
            if (r2 == 0) goto L74
            int r1 = r2.statusCode
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 != r0) goto L74
            byte[] r1 = r2.bodyBytes()
            if (r1 == 0) goto L6e
            com.hatch.browser.core.NativeBlocklistCheckResult r0 = new com.hatch.browser.core.NativeBlocklistCheckResult
            r0.<init>(r1)
            return r0
        L42:
            X.Hwg.A00(r2)
            com.facebook.aura.localbrowser.LocalBrowserBlocklist r1 = r7.this$0
            int r0 = com.facebook.aura.localbrowser.LocalBrowserBlocklist.$stable
            X.3UX r0 = r1.scope
            boolean r0 = X.Hxb.A04(r0)
            if (r0 == 0) goto L7f
            com.facebook.aura.localbrowser.LocalBrowserStefiPath$BrowserBlocklistCheck r3 = com.facebook.aura.localbrowser.LocalBrowserStefiPath.BrowserBlocklistCheck.INSTANCE
            com.facebook.aura.localbrowser.LocalBrowserBlocklist r2 = r7.this$0
            r1 = 0
            com.facebook.aura.localbrowser.LocalBrowserBlocklist$check$1$check$response$1 r0 = new com.facebook.aura.localbrowser.LocalBrowserBlocklist$check$1$check$response$1
            r0.<init>(r2, r3, r8, r1)
            r6.L$0 = r1
            r6.L$1 = r1
            r6.label = r4
            java.lang.Object r2 = X.C8j4.A0s(r0, r6)
            if (r2 != r5) goto L20
            return r5
        L68:
            com.facebook.aura.localbrowser.LocalBrowserBlocklist$check$1$check$1 r6 = new com.facebook.aura.localbrowser.LocalBrowserBlocklist$check$1$check$1
            r6.<init>(r7, r9)
            goto L12
        L6e:
            com.hatch.browser.core.NativeException$Unavailable r0 = new com.hatch.browser.core.NativeException$Unavailable
            r0.<init>()
            throw r0
        L74:
            com.hatch.browser.core.NativeException$Unavailable r0 = new com.hatch.browser.core.NativeException$Unavailable
            r0.<init>()
            throw r0
        L7a:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L7f:
            com.hatch.browser.core.NativeException$Unavailable r0 = new com.hatch.browser.core.NativeException$Unavailable
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserBlocklist$check$1.check(byte[], X.HtJ):java.lang.Object");
    }
}
