package com.facebook.aura.localbrowser.core;

import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public abstract class BrowserEngineResultKt {
    public static final long NATIVE_REPORT_RESERVE_MS = 250;

    @DebugMetadata(c = "com.facebook.aura.localbrowser.core.BrowserEngineResultKt", f = "BrowserEngineResult.kt", l = {53}, m = "encodeForReply", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.core.BrowserEngineResultKt$encodeForReply$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public int I$0;
        public long J$0;
        public long J$1;
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BrowserEngineResultKt.encodeForReply(null, null, 0, 0L, this);
        }

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object encodeForReply(com.hatch.browser.core.CommandReport r8, com.hatch.browser.protocol.ReportImageFormat r9, int r10, long r11, X.HtJ<? super byte[]> r13) {
        /*
            boolean r0 = r13 instanceof com.facebook.aura.localbrowser.core.BrowserEngineResultKt.AnonymousClass1
            if (r0 == 0) goto L27
            r6 = r13
            com.facebook.aura.localbrowser.core.BrowserEngineResultKt$encodeForReply$1 r6 = (com.facebook.aura.localbrowser.core.BrowserEngineResultKt.AnonymousClass1) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L27
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r1 = r6.result
            X.Hji r7 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r5 = 1
            r4 = 0
            if (r0 == 0) goto L36
            if (r0 != r5) goto L31
            long r11 = r6.J$0
            int r10 = r6.I$0
            java.lang.Object r8 = r6.L$0
            com.hatch.browser.core.CommandReport r8 = (com.hatch.browser.core.CommandReport) r8
            goto L2d
        L27:
            com.facebook.aura.localbrowser.core.BrowserEngineResultKt$encodeForReply$1 r6 = new com.facebook.aura.localbrowser.core.BrowserEngineResultKt$encodeForReply$1
            r6.<init>(r13)
            goto L12
        L2d:
            X.Hwg.A00(r1)     // Catch: com.hatch.browser.protocol.ApiException -> L63
            goto L5d
        L31:
            java.lang.IllegalStateException r1 = X.AnonymousClass001.A0n()
            throw r1
        L36:
            X.Hwg.A00(r1)
            if (r10 <= 0) goto L76
            X.C3cG.A1H(r6)
            long r0 = X.C3cH.A04(r11)
            r2 = 250(0xfa, double:1.235E-321)
            long r0 = r0 - r2
            com.facebook.aura.localbrowser.core.BrowserEngineResultKt$encodeForReply$releaseReason$encoded$1 r2 = new com.facebook.aura.localbrowser.core.BrowserEngineResultKt$encodeForReply$releaseReason$encoded$1     // Catch: com.hatch.browser.protocol.ApiException -> L63
            r2.<init>(r8, r9, r10, r4)     // Catch: com.hatch.browser.protocol.ApiException -> L63
            r6.L$0 = r8     // Catch: com.hatch.browser.protocol.ApiException -> L63
            r6.L$1 = r4     // Catch: com.hatch.browser.protocol.ApiException -> L63
            r6.I$0 = r10     // Catch: com.hatch.browser.protocol.ApiException -> L63
            r6.J$0 = r11     // Catch: com.hatch.browser.protocol.ApiException -> L63
            r6.J$1 = r0     // Catch: com.hatch.browser.protocol.ApiException -> L63
            r6.label = r5     // Catch: com.hatch.browser.protocol.ApiException -> L63
            java.lang.Object r1 = X.GAX.A01(r6, r2, r0)     // Catch: com.hatch.browser.protocol.ApiException -> L63
            if (r1 != r7) goto L5d
            return r7
        L5d:
            if (r1 == 0) goto L60
            return r1
        L60:
            com.hatch.browser.protocol.ReleaseReason r3 = com.hatch.browser.protocol.ReleaseReason.TIMED_OUT     // Catch: com.hatch.browser.protocol.ApiException -> L63
            goto L65
        L63:
            com.hatch.browser.protocol.ReleaseReason r3 = com.hatch.browser.protocol.ReleaseReason.EXECUTION_FAILED
        L65:
            X.C3cG.A1H(r6)
            long r1 = android.os.SystemClock.elapsedRealtime()
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r0 < 0) goto L71
            return r4
        L71:
            byte[] r4 = r8.mo3227encodeNativeFactsQn1smSk(r3, r10)     // Catch: com.hatch.browser.protocol.ApiException -> L75
        L75:
            return r4
        L76:
            java.lang.String r0 = "Failed requirement."
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.core.BrowserEngineResultKt.encodeForReply(com.hatch.browser.core.CommandReport, com.hatch.browser.protocol.ReportImageFormat, int, long, X.HtJ):java.lang.Object");
    }
}
