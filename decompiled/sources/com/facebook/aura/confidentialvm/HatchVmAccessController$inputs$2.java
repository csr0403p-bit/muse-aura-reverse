package com.facebook.aura.confidentialvm;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.G2l;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.gateway.HatchCvmReplacement;
import com.facebook.aura.gateway.HatchGatewayStateSnapshot;
import com.facebook.aura.user.provider.AuraUserData;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.confidentialvm.HatchVmAccessController$inputs$2", f = "HatchVmAccessController.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class HatchVmAccessController$inputs$2 extends AbstractC07127nr implements G2l<AuraUserData, HatchGatewayStateSnapshot, Boolean, Boolean, HatchCvmReplacement.Active, HtJ<? super HatchVmAccessInputs>, Object> {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public /* synthetic */ Object L$2;
    public /* synthetic */ boolean Z$0;
    public /* synthetic */ boolean Z$1;
    public int label;

    public HatchVmAccessController$inputs$2(HtJ<? super HatchVmAccessController$inputs$2> htJ) {
        super(6, htJ);
    }

    @Override // X.G2l
    public /* bridge */ /* synthetic */ Object invoke(AuraUserData auraUserData, HatchGatewayStateSnapshot hatchGatewayStateSnapshot, Boolean bool, Boolean bool2, HatchCvmReplacement.Active active, HtJ<? super HatchVmAccessInputs> htJ) {
        return invoke(auraUserData, hatchGatewayStateSnapshot, AnonymousClass001.A1X(bool), AnonymousClass001.A1X(bool2), active, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        AuraUserData auraUserData = (AuraUserData) this.L$0;
        HatchGatewayStateSnapshot hatchGatewayStateSnapshot = (HatchGatewayStateSnapshot) this.L$1;
        boolean z = this.Z$0;
        boolean z2 = this.Z$1;
        HatchCvmReplacement.Active active = (HatchCvmReplacement.Active) this.L$2;
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        return new HatchVmAccessInputs(auraUserData, hatchGatewayStateSnapshot, z, z2, active);
    }

    public final Object invoke(AuraUserData auraUserData, HatchGatewayStateSnapshot hatchGatewayStateSnapshot, boolean z, boolean z2, HatchCvmReplacement.Active active, HtJ<? super HatchVmAccessInputs> htJ) {
        HatchVmAccessController$inputs$2 hatchVmAccessController$inputs$2 = new HatchVmAccessController$inputs$2(htJ);
        hatchVmAccessController$inputs$2.L$0 = auraUserData;
        hatchVmAccessController$inputs$2.L$1 = hatchGatewayStateSnapshot;
        hatchVmAccessController$inputs$2.Z$0 = z;
        hatchVmAccessController$inputs$2.Z$1 = z2;
        hatchVmAccessController$inputs$2.L$2 = active;
        return hatchVmAccessController$inputs$2.invokeSuspend(Unit.INSTANCE);
    }
}
