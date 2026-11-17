package com.facebook.rp.platform.metaai.rsys;

import X.AbstractC07127nr;
import X.C3UX;
import X.C8j3;
import X.G0V;
import X.HoC;
import X.HtJ;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdkRealTimeSession$armStartEarconHolds$3", f = "MetaAiRsysSdkRealTimeSession.kt", l = {817, 836}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class MetaAiRsysSdkRealTimeSession$armStartEarconHolds$3 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ HoC $holdJob;
    public long J$0;
    public long J$1;
    public Object L$0;
    public int label;
    public final /* synthetic */ MetaAiRsysSdkRealTimeSession this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Lcom/facebook/rp/platform/metaai/rsys/MetaAiRsysSdkRealTimeSession;LX/HoC;LX/HtJ<-Lcom/facebook/rp/platform/metaai/rsys/MetaAiRsysSdkRealTimeSession$armStartEarconHolds$3;>;)V */
    public MetaAiRsysSdkRealTimeSession$armStartEarconHolds$3(MetaAiRsysSdkRealTimeSession metaAiRsysSdkRealTimeSession, HtJ htJ, HoC hoC) {
        super(2, htJ);
        this.this$0 = metaAiRsysSdkRealTimeSession;
        this.$holdJob = hoC;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new MetaAiRsysSdkRealTimeSession$armStartEarconHolds$3(this.this$0, htJ, this.$holdJob);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0090 A[Catch: Exception -> 0x0096, CancellationException -> 0x00c3, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x00c3, Exception -> 0x0096, blocks: (B:31:0x007e, B:32:0x0081, B:34:0x0090, B:13:0x002a, B:14:0x002d, B:16:0x0033, B:17:0x003b, B:19:0x0041, B:20:0x0043, B:22:0x0055, B:24:0x0059, B:26:0x006b, B:10:0x0018), top: B:45:0x0009 }] */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            r15 = this;
            X.Hji r7 = X.EnumC10460Hji.A02
            int r0 = r15.label
            java.lang.String r6 = "Playing the deferred start earcon after the Bluetooth cross-fade"
            r8 = 2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L15
            if (r0 == r2) goto L2a
            if (r0 != r8) goto L10
            goto L7e
        L10:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L15:
            X.Hwg.A00(r16)
            com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdkRealTimeSession r0 = r15.this$0     // Catch: java.lang.Exception -> L96 java.util.concurrent.CancellationException -> Lc3
            X.1BN<java.lang.Boolean> r1 = r0.A0b     // Catch: java.lang.Exception -> L96 java.util.concurrent.CancellationException -> Lc3
            X.FXa r0 = new X.FXa     // Catch: java.lang.Exception -> L96 java.util.concurrent.CancellationException -> Lc3
            r0.<init>(r8, r3)     // Catch: java.lang.Exception -> L96 java.util.concurrent.CancellationException -> Lc3
            r15.label = r2     // Catch: java.lang.Exception -> L96 java.util.concurrent.CancellationException -> Lc3
            java.lang.Object r0 = X.AbstractC9777Gfy.A00(r15, r0, r1)     // Catch: java.lang.Exception -> L96 java.util.concurrent.CancellationException -> Lc3
            if (r0 != r7) goto L2d
            return r7
        L2a:
            X.Hwg.A00(r16)     // Catch: java.lang.Exception -> L96 java.util.concurrent.CancellationException -> Lc3
        L2d:
            com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdkRealTimeSession r1 = r15.this$0     // Catch: java.lang.Exception -> L96 java.util.concurrent.CancellationException -> Lc3
            boolean r0 = r1.A0g     // Catch: java.lang.Exception -> L96 java.util.concurrent.CancellationException -> Lc3
            if (r0 != 0) goto L3b
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.A0M     // Catch: java.lang.Exception -> L96 java.util.concurrent.CancellationException -> Lc3
            r0.set(r2)     // Catch: java.lang.Exception -> L96 java.util.concurrent.CancellationException -> Lc3
            com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdkRealTimeSession.A07(r1, r6)     // Catch: java.lang.Exception -> L96 java.util.concurrent.CancellationException -> Lc3
        L3b:
            com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdkRealTimeSession r0 = r15.this$0     // Catch: java.lang.Exception -> L96 java.util.concurrent.CancellationException -> Lc3
            X.GSV r0 = r0.A08     // Catch: java.lang.Exception -> L96 java.util.concurrent.CancellationException -> Lc3
            if (r0 == 0) goto L7a
            long r0 = r0.A08     // Catch: java.lang.Exception -> L96 java.util.concurrent.CancellationException -> Lc3
        L43:
            com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdkRealTimeSession r2 = r15.this$0     // Catch: java.lang.Exception -> L96 java.util.concurrent.CancellationException -> Lc3
            X.GXO r2 = r2.A0E     // Catch: java.lang.Exception -> L96 java.util.concurrent.CancellationException -> Lc3
            X.GX5 r2 = r2.A0B     // Catch: java.lang.Exception -> L96 java.util.concurrent.CancellationException -> Lc3
            X.GX4 r2 = r2.A01     // Catch: java.lang.Exception -> L96 java.util.concurrent.CancellationException -> Lc3
            X.GXX r4 = r2.A0Q()     // Catch: java.lang.Exception -> L96 java.util.concurrent.CancellationException -> Lc3
            r11 = 0
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 < 0) goto L81
            X.GXX r2 = X.GXX.A02     // Catch: java.lang.Exception -> L96 java.util.concurrent.CancellationException -> Lc3
            if (r4 != r2) goto L81
            r9 = 2400(0x960, double:1.186E-320)
            long r9 = r9 + r0
            long r4 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Exception -> L96 java.util.concurrent.CancellationException -> Lc3
            long r9 = r9 - r4
            r13 = 500(0x1f4, double:2.47E-321)
            long r4 = X.ATD.A07(r9, r11, r13)     // Catch: java.lang.Exception -> L96 java.util.concurrent.CancellationException -> Lc3
            int r2 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r2 <= 0) goto L81
            r15.L$0 = r3     // Catch: java.lang.Exception -> L96 java.util.concurrent.CancellationException -> Lc3
            r15.J$0 = r0     // Catch: java.lang.Exception -> L96 java.util.concurrent.CancellationException -> Lc3
            r15.J$1 = r4     // Catch: java.lang.Exception -> L96 java.util.concurrent.CancellationException -> Lc3
            r15.label = r8     // Catch: java.lang.Exception -> L96 java.util.concurrent.CancellationException -> Lc3
            java.lang.Object r0 = X.C7Bq.A01(r4, r15)     // Catch: java.lang.Exception -> L96 java.util.concurrent.CancellationException -> Lc3
            if (r0 != r7) goto L81
            goto L7d
        L7a:
            r0 = -1
            goto L43
        L7d:
            return r7
        L7e:
            X.Hwg.A00(r16)     // Catch: java.lang.Exception -> L96 java.util.concurrent.CancellationException -> Lc3
        L81:
            com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdkRealTimeSession r0 = r15.this$0     // Catch: java.lang.Exception -> L96 java.util.concurrent.CancellationException -> Lc3
            com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdkRealTimeSession.A08(r0, r6)     // Catch: java.lang.Exception -> L96 java.util.concurrent.CancellationException -> Lc3
            com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdkRealTimeSession r0 = r15.this$0     // Catch: java.lang.Exception -> L96 java.util.concurrent.CancellationException -> Lc3
            java.util.concurrent.atomic.AtomicInteger r0 = r0.A0N     // Catch: java.lang.Exception -> L96 java.util.concurrent.CancellationException -> Lc3
            int r0 = r0.get()     // Catch: java.lang.Exception -> L96 java.util.concurrent.CancellationException -> Lc3
            if (r0 != 0) goto Lc0
            X.HoC r0 = r15.$holdJob     // Catch: java.lang.Exception -> L96 java.util.concurrent.CancellationException -> Lc3
            r0.A5w(r3)     // Catch: java.lang.Exception -> L96 java.util.concurrent.CancellationException -> Lc3
            goto Lc0
        L96:
            java.lang.String r0 = "Start earcon Bluetooth cross-fade hold failed"
            X.AbstractC7608F5v.A1L(r0)
            com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdkRealTimeSession r4 = r15.this$0
            boolean r0 = r4.A0g
            java.lang.String r2 = "Playing the deferred start earcon after the Bluetooth cross-fade failed"
            if (r0 != 0) goto Lac
            java.util.concurrent.atomic.AtomicBoolean r1 = r4.A0M
            r0 = 1
            r1.set(r0)
            com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdkRealTimeSession.A07(r4, r2)
        Lac:
            com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdkRealTimeSession r0 = r15.this$0
            com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdkRealTimeSession.A08(r0, r2)
            com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdkRealTimeSession r0 = r15.this$0
            java.util.concurrent.atomic.AtomicInteger r0 = r0.A0N
            int r0 = r0.get()
            if (r0 != 0) goto Lc0
            X.HoC r0 = r15.$holdJob
            r0.A5w(r3)
        Lc0:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        Lc3:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdkRealTimeSession$armStartEarconHolds$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((MetaAiRsysSdkRealTimeSession$armStartEarconHolds$3) C8j3.A1E(htJ, c3ux, this)).invokeSuspend(Unit.INSTANCE);
    }
}
