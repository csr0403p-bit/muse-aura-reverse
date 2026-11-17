package com.facebook.aura.confidentialvm;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.G0W;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.gateway.HatchCvmReplaceStoreKt;
import com.facebook.aura.gateway.HatchCvmReplacement;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.confidentialvm.HatchVmAccessController$inputs$1", f = "HatchVmAccessController.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class HatchVmAccessController$inputs$1 extends AbstractC07127nr implements G0W<HatchCvmReplacement, String, HtJ<? super HatchCvmReplacement.Active>, Object> {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;

    public HatchVmAccessController$inputs$1(HtJ<? super HatchVmAccessController$inputs$1> htJ) {
        super(3, htJ);
    }

    @Override // X.G0W
    public final Object invoke(HatchCvmReplacement hatchCvmReplacement, String str, HtJ<? super HatchCvmReplacement.Active> htJ) {
        HatchVmAccessController$inputs$1 hatchVmAccessController$inputs$1 = new HatchVmAccessController$inputs$1(htJ);
        hatchVmAccessController$inputs$1.L$0 = hatchCvmReplacement;
        hatchVmAccessController$inputs$1.L$1 = str;
        return hatchVmAccessController$inputs$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        HatchCvmReplacement hatchCvmReplacement = (HatchCvmReplacement) this.L$0;
        String str = (String) this.L$1;
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        return HatchCvmReplaceStoreKt.forVm(hatchCvmReplacement, str);
    }
}
