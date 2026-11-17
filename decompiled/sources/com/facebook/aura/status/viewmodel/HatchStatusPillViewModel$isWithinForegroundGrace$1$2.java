package com.facebook.aura.status.viewmodel;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.G0W;
import X.HtJ;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.status.viewmodel.HatchStatusPillViewModel$isWithinForegroundGrace$1$2", f = "HatchStatusPillViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchStatusPillViewModel$isWithinForegroundGrace$1$2 extends AbstractC07127nr implements G0W<Boolean, Long, HtJ<? super Boolean>, Object> {
    public final /* synthetic */ long $initialSendCount;
    public /* synthetic */ long J$0;
    public /* synthetic */ boolean Z$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchStatusPillViewModel$isWithinForegroundGrace$1$2(long j, HtJ<? super HatchStatusPillViewModel$isWithinForegroundGrace$1$2> htJ) {
        super(3, htJ);
        this.$initialSendCount = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r1 = r6.Z$0
            long r4 = r6.J$0
            int r0 = r6.label
            if (r0 != 0) goto L1a
            X.Hwg.A00(r7)
            if (r1 == 0) goto L14
            long r2 = r6.$initialSendCount
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r0 = 1
            if (r1 == 0) goto L15
        L14:
            r0 = 0
        L15:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L1a:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.status.viewmodel.HatchStatusPillViewModel$isWithinForegroundGrace$1$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Long l, HtJ<? super Boolean> htJ) {
        return invoke(AnonymousClass001.A1X(bool), l.longValue(), htJ);
    }

    public final Object invoke(boolean z, long j, HtJ<? super Boolean> htJ) {
        HatchStatusPillViewModel$isWithinForegroundGrace$1$2 hatchStatusPillViewModel$isWithinForegroundGrace$1$2 = new HatchStatusPillViewModel$isWithinForegroundGrace$1$2(this.$initialSendCount, htJ);
        hatchStatusPillViewModel$isWithinForegroundGrace$1$2.Z$0 = z;
        hatchStatusPillViewModel$isWithinForegroundGrace$1$2.J$0 = j;
        return hatchStatusPillViewModel$isWithinForegroundGrace$1$2.invokeSuspend(Unit.INSTANCE);
    }
}
