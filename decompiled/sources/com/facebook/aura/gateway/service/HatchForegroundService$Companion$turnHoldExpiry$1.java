package com.facebook.aura.gateway.service;

import X.AbstractC07127nr;
import X.C20Z;
import X.G0W;
import X.HtJ;
import com.facebook.aura.login.nativeflow.MC;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.gateway.service.HatchForegroundService$Companion$turnHoldExpiry$1", f = "HatchForegroundService.kt", l = {567, MC.hatch_android_login.__CONFIG__}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchForegroundService$Companion$turnHoldExpiry$1 extends AbstractC07127nr implements G0W<C20Z<? super Unit>, Long, HtJ<? super Unit>, Object> {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;

    public HatchForegroundService$Companion$turnHoldExpiry$1(HtJ<? super HatchForegroundService$Companion$turnHoldExpiry$1> htJ) {
        super(3, htJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0050 A[RETURN] */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r8 = r9.L$0
            X.20Z r8 = (X.C20Z) r8
            java.lang.Object r1 = r9.L$1
            java.lang.Number r1 = (java.lang.Number) r1
            X.Hji r7 = X.EnumC10460Hji.A02
            int r0 = r9.label
            r6 = 2
            r5 = 1
            if (r0 == 0) goto L1a
            if (r0 == r5) goto L3e
            if (r0 != r6) goto L51
            X.Hwg.A00(r10)
        L17:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        L1a:
            X.Hwg.A00(r10)
            if (r1 == 0) goto L17
            long r3 = r1.longValue()
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r3 = r3 - r0
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L30
            r3 = 0
        L30:
            r9.L$0 = r8
            r0 = 0
            r9.L$1 = r0
            r9.label = r5
            java.lang.Object r0 = X.C7Bq.A01(r3, r9)
            if (r0 != r7) goto L41
            return r7
        L3e:
            X.Hwg.A00(r10)
        L41:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            r0 = 0
            r9.L$0 = r0
            r9.L$1 = r0
            r9.label = r6
            java.lang.Object r0 = r8.emit(r1, r9)
            if (r0 != r7) goto L17
            return r7
        L51:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.service.HatchForegroundService$Companion$turnHoldExpiry$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0W
    public final Object invoke(C20Z<? super Unit> c20z, Long l, HtJ<? super Unit> htJ) {
        HatchForegroundService$Companion$turnHoldExpiry$1 hatchForegroundService$Companion$turnHoldExpiry$1 = new HatchForegroundService$Companion$turnHoldExpiry$1(htJ);
        hatchForegroundService$Companion$turnHoldExpiry$1.L$0 = c20z;
        hatchForegroundService$Companion$turnHoldExpiry$1.L$1 = l;
        return hatchForegroundService$Companion$turnHoldExpiry$1.invokeSuspend(Unit.INSTANCE);
    }
}
