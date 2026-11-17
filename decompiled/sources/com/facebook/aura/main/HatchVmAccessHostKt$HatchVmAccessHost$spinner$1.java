package com.facebook.aura.main;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.C10G;
import X.G0V;
import com.facebook.aura.main.VmAccessGate;
import com.facebook.aura.ui.OnboardingAndActivationSpinnerKt;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchVmAccessHostKt$HatchVmAccessHost$spinner$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ VmAccessGate $gate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchVmAccessHostKt$HatchVmAccessHost$spinner$1(VmAccessGate vmAccessGate) {
        super(2);
        this.$gate = vmAccessGate;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            OnboardingAndActivationSpinnerKt.OnboardingAndActivationSpinner(((VmAccessGate.Spinner) this.$gate).debugCaption, C10G.A01, null, bfm, 48, 4);
        } else {
            bfm.Afo();
        }
    }
}
