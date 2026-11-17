package com.facebook.aura.activation.model;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.G2j;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.confidentialvm.HatchVmAccessState;
import com.facebook.aura.user.provider.AuraUserData;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.activation.model.AuraActivationViewModel$isVmReadyForAdmission$1", f = "AuraActivationViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class AuraActivationViewModel$isVmReadyForAdmission$1 extends AbstractC07127nr implements G2j<AuraUserData, HatchVmAccessState, Boolean, HtJ<? super Boolean>, Object> {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public /* synthetic */ boolean Z$0;
    public int label;

    public AuraActivationViewModel$isVmReadyForAdmission$1(HtJ<? super AuraActivationViewModel$isVmReadyForAdmission$1> htJ) {
        super(4, htJ);
    }

    public final Object invoke(AuraUserData auraUserData, HatchVmAccessState hatchVmAccessState, boolean z, HtJ<? super Boolean> htJ) {
        AuraActivationViewModel$isVmReadyForAdmission$1 auraActivationViewModel$isVmReadyForAdmission$1 = new AuraActivationViewModel$isVmReadyForAdmission$1(htJ);
        auraActivationViewModel$isVmReadyForAdmission$1.L$0 = auraUserData;
        auraActivationViewModel$isVmReadyForAdmission$1.L$1 = hatchVmAccessState;
        auraActivationViewModel$isVmReadyForAdmission$1.Z$0 = z;
        return auraActivationViewModel$isVmReadyForAdmission$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        AuraUserData auraUserData = (AuraUserData) this.L$0;
        HatchVmAccessState hatchVmAccessState = (HatchVmAccessState) this.L$1;
        boolean z = this.Z$0;
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        return Boolean.valueOf(AuraActivationViewModelKt.resolveVmAdmissionReadiness(auraUserData != null ? auraUserData.isVmTypeSelectionRequired : null, hatchVmAccessState, z));
    }

    @Override // X.G2j
    public /* bridge */ /* synthetic */ Object invoke(AuraUserData auraUserData, HatchVmAccessState hatchVmAccessState, Boolean bool, HtJ<? super Boolean> htJ) {
        return invoke(auraUserData, hatchVmAccessState, AnonymousClass001.A1X(bool), htJ);
    }
}
