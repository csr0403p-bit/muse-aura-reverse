package com.facebook.aura.activation.model;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.G0W;
import X.HtJ;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.activation.model.AuraActivationViewModel$isWearablesStepOutstanding$1", f = "AuraActivationViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class AuraActivationViewModel$isWearablesStepOutstanding$1 extends AbstractC07127nr implements G0W<Boolean, Boolean, HtJ<? super Boolean>, Object> {
    public /* synthetic */ boolean Z$0;
    public /* synthetic */ boolean Z$1;
    public int label;

    public AuraActivationViewModel$isWearablesStepOutstanding$1(HtJ<? super AuraActivationViewModel$isWearablesStepOutstanding$1> htJ) {
        super(3, htJ);
    }

    public final Object invoke(boolean z, boolean z2, HtJ<? super Boolean> htJ) {
        AuraActivationViewModel$isWearablesStepOutstanding$1 auraActivationViewModel$isWearablesStepOutstanding$1 = new AuraActivationViewModel$isWearablesStepOutstanding$1(htJ);
        auraActivationViewModel$isWearablesStepOutstanding$1.Z$0 = z;
        auraActivationViewModel$isWearablesStepOutstanding$1.Z$1 = z2;
        return auraActivationViewModel$isWearablesStepOutstanding$1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0010  */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
        /*
            r3 = this;
            boolean r2 = r3.Z$0
            boolean r1 = r3.Z$1
            int r0 = r3.label
            if (r0 != 0) goto L16
            X.Hwg.A00(r4)
            if (r2 == 0) goto L10
            r0 = 1
            if (r1 == 0) goto L11
        L10:
            r0 = 0
        L11:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L16:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.activation.model.AuraActivationViewModel$isWearablesStepOutstanding$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Boolean bool2, HtJ<? super Boolean> htJ) {
        return invoke(AnonymousClass001.A1X(bool), AnonymousClass001.A1X(bool2), htJ);
    }
}
