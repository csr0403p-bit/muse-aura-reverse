package com.facebook.aura.vmdisabled.content;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.G0V;
import com.facebook.aura.vmdisabled.VmRecoveryFlowType;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class VmRecoveryFlowBodyKt$VmRecoveryFlowBody$1$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ VmRecoveryFlowType $flowType;
    public final /* synthetic */ boolean $preview;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VmRecoveryFlowBodyKt$VmRecoveryFlowBody$1$1(VmRecoveryFlowType vmRecoveryFlowType, boolean z) {
        super(2);
        this.$flowType = vmRecoveryFlowType;
        this.$preview = z;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            VmRecoveryFlowBodyKt.VmRecoveryBodyText(this.$flowType, this.$preview, null, bfm, 0, 4);
        } else {
            bfm.Afo();
        }
    }
}
