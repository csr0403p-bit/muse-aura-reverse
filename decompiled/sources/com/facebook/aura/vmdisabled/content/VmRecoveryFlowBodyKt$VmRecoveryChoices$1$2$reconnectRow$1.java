package com.facebook.aura.vmdisabled.content;

import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.G0V;
import com.facebook.aura.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class VmRecoveryFlowBodyKt$VmRecoveryChoices$1$2$reconnectRow$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ Function0<Unit> $onReconnect;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VmRecoveryFlowBodyKt$VmRecoveryChoices$1$2$reconnectRow$1(Function0<Unit> function0) {
        super(2);
        this.$onReconnect = function0;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
            VmRecoveryFlowBodyKt.VmRecoveryChoiceRow(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f121131), AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f121130), this.$onReconnect, null, false, bfm, 0, 24);
        } else {
            bfm.Afo();
        }
    }
}
