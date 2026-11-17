package com.facebook.aura.status.viewmodel;

import X.AbstractC07127nr;
import X.C20Z;
import X.G0V;
import X.HtJ;
import com.facebook.aura.installsource.AuraInstallSourceDetector;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.status.viewmodel.HatchStatusPillViewModel$isWithinForegroundGrace$1$1", f = "HatchStatusPillViewModel.kt", l = {AuraInstallSourceDetector.SYSTEM_IMAGE_FLAGS, 130, 131}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchStatusPillViewModel$isWithinForegroundGrace$1$1 extends AbstractC07127nr implements G0V<C20Z<? super Boolean>, HtJ<? super Unit>, Object> {
    public /* synthetic */ Object L$0;
    public int label;

    public HatchStatusPillViewModel$isWithinForegroundGrace$1$1(HtJ<? super HatchStatusPillViewModel$isWithinForegroundGrace$1$1> htJ) {
        super(2, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        HatchStatusPillViewModel$isWithinForegroundGrace$1$1 hatchStatusPillViewModel$isWithinForegroundGrace$1$1 = new HatchStatusPillViewModel$isWithinForegroundGrace$1$1(htJ);
        hatchStatusPillViewModel$isWithinForegroundGrace$1$1.L$0 = obj;
        return hatchStatusPillViewModel$isWithinForegroundGrace$1$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004e A[RETURN] */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r5 = r6.L$0
            X.20Z r5 = (X.C20Z) r5
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r3 = 3
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L19
            if (r0 == r1) goto L28
            if (r0 == r2) goto L3c
            if (r0 != r3) goto L4f
            X.Hwg.A00(r7)
        L16:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L19:
            java.lang.Boolean r0 = X.AnonymousClass001.A0k(r7, r1)
            r6.L$0 = r5
            r6.label = r1
            java.lang.Object r0 = r5.emit(r0, r6)
            if (r0 != r4) goto L2b
            return r4
        L28:
            X.Hwg.A00(r7)
        L2b:
            com.facebook.aura.utils.HatchUtil r0 = com.facebook.aura.utils.HatchUtil.INSTANCE
            long r0 = r0.disconnectedBotStatusMuteMs()
            r6.L$0 = r5
            r6.label = r2
            java.lang.Object r0 = X.C7Bq.A01(r0, r6)
            if (r0 != r4) goto L3f
            return r4
        L3c:
            X.Hwg.A00(r7)
        L3f:
            java.lang.Boolean r1 = X.AnonymousClass001.A0h()
            r0 = 0
            r6.L$0 = r0
            r6.label = r3
            java.lang.Object r0 = r5.emit(r1, r6)
            if (r0 != r4) goto L16
            return r4
        L4f:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.status.viewmodel.HatchStatusPillViewModel$isWithinForegroundGrace$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final Object invoke(C20Z<? super Boolean> c20z, HtJ<? super Unit> htJ) {
        HatchStatusPillViewModel$isWithinForegroundGrace$1$1 hatchStatusPillViewModel$isWithinForegroundGrace$1$1 = new HatchStatusPillViewModel$isWithinForegroundGrace$1$1(htJ);
        hatchStatusPillViewModel$isWithinForegroundGrace$1$1.L$0 = c20z;
        return hatchStatusPillViewModel$isWithinForegroundGrace$1$1.invokeSuspend(Unit.INSTANCE);
    }
}
