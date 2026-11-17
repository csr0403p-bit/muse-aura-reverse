package com.facebook.aura.gateway;

import X.AbstractC7559F3s;
import X.G0U;

/* loaded from: classes2.dex */
public final class HatchCvmReplaceStore$setReplacement$next$1 extends AbstractC7559F3s implements G0U<HatchCvmReplacement, HatchCvmReplacement> {
    public final /* synthetic */ String $attemptId;
    public final /* synthetic */ HatchVmState $state;
    public final /* synthetic */ String $vmId;
    public final /* synthetic */ HatchlingVmType $vmType;

    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    @Override // X.G0U
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.aura.gateway.HatchCvmReplacement invoke(com.facebook.aura.gateway.HatchCvmReplacement r9) {
        /*
            r8 = this;
            r0 = 0
            X.C7384Etj.A0Y(r9, r0)
            java.lang.String r0 = r8.$vmId
            if (r0 == 0) goto L4c
            java.lang.String r0 = r8.$attemptId
            if (r0 == 0) goto L4c
            com.facebook.aura.gateway.HatchVmState r0 = r8.$state
            boolean r0 = com.facebook.aura.gateway.HatchCvmReplaceStoreKt.isCvmReplacement(r0)
            if (r0 == 0) goto L4c
            com.facebook.aura.gateway.HatchlingVmType r1 = r8.$vmType
            com.facebook.aura.gateway.HatchlingVmType r0 = com.facebook.aura.gateway.HatchlingVmType.HATCH_CVM
            if (r1 != r0) goto L4c
            java.lang.String r0 = r8.$vmId
            com.facebook.aura.gateway.HatchCvmReplacement$Active r2 = com.facebook.aura.gateway.HatchCvmReplaceStoreKt.forVm(r9, r0)
            if (r2 == 0) goto L3c
            java.lang.String r1 = r8.$attemptId
            java.lang.String r0 = r2.attemptId
            boolean r0 = X.C7384Etj.areEqual(r0, r1)
            if (r0 == 0) goto L3c
            com.facebook.aura.gateway.HatchVmState r5 = r8.$state
            java.lang.String r3 = r2.vmId
            java.lang.String r4 = r2.attemptId
            java.lang.String r6 = r2.ownerNonce
            java.lang.Long r7 = r2.claimExpiresAtSecs
            com.facebook.aura.gateway.HatchCvmReplacement$Active r0 = r2.copy(r3, r4, r5, r6, r7)
            if (r0 != 0) goto L49
        L3c:
            java.lang.String r1 = r8.$vmId
            java.lang.String r2 = r8.$attemptId
            com.facebook.aura.gateway.HatchVmState r3 = r8.$state
            r4 = 0
            com.facebook.aura.gateway.HatchCvmReplacement$Active r0 = new com.facebook.aura.gateway.HatchCvmReplacement$Active
            r5 = r4
            r0.<init>(r1, r2, r3, r4, r5)
        L49:
            com.facebook.aura.gateway.HatchCvmReplacement r0 = (com.facebook.aura.gateway.HatchCvmReplacement) r0
            return r0
        L4c:
            com.facebook.aura.gateway.HatchCvmReplacement$None r0 = com.facebook.aura.gateway.HatchCvmReplacement.None.INSTANCE
            goto L49
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchCvmReplaceStore$setReplacement$next$1.invoke(com.facebook.aura.gateway.HatchCvmReplacement):com.facebook.aura.gateway.HatchCvmReplacement");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchCvmReplaceStore$setReplacement$next$1(String str, String str2, HatchVmState hatchVmState, HatchlingVmType hatchlingVmType) {
        super(1);
        this.$vmId = str;
        this.$attemptId = str2;
        this.$state = hatchVmState;
        this.$vmType = hatchlingVmType;
    }
}
