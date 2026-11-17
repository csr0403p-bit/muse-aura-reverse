package com.facebook.aura.confidentialvm;

import X.AbstractC07127nr;
import X.C3UX;
import X.G0V;
import X.HtJ;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.confidentialvm.HatchVmAccessController$pinAcceptedBidForEnrollment$pinned$1", f = "HatchVmAccessController.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class HatchVmAccessController$pinAcceptedBidForEnrollment$pinned$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
    public final /* synthetic */ String $vmId;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchVmAccessController$pinAcceptedBidForEnrollment$pinned$1(String str, HtJ<? super HatchVmAccessController$pinAcceptedBidForEnrollment$pinned$1> htJ) {
        super(2, htJ);
        this.$vmId = str;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchVmAccessController$pinAcceptedBidForEnrollment$pinned$1(this.$vmId, htJ);
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
        return new HatchVmAccessController$pinAcceptedBidForEnrollment$pinned$1(this.$vmId, htJ).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r3) {
        /*
            r2 = this;
            int r0 = r2.label
            if (r0 != 0) goto L26
            X.Hwg.A00(r3)
            com.facebook.aura.gateway.store.HatchCvmChipClaimStore r1 = com.facebook.aura.gateway.store.HatchCvmChipClaimStore.INSTANCE
            java.lang.String r0 = r2.$vmId
            com.facebook.aura.gateway.store.HatchCvmChipClaim r0 = r1.read(r0)
            if (r0 == 0) goto L20
            boolean r0 = r0.getPinsEnrollment()
            if (r0 != 0) goto L20
            java.lang.String r0 = r2.$vmId
            boolean r1 = r1.pinAcceptedBidForEnrollment(r0)
            r0 = 1
            if (r1 != 0) goto L21
        L20:
            r0 = 0
        L21:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L26:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.HatchVmAccessController$pinAcceptedBidForEnrollment$pinned$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
