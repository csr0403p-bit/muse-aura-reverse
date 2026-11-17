package com.facebook.aura.confidentialvm.view;

import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.G0V;
import com.facebook.aura.R;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ComposableSingletons$ConfidentialVmPinHelpBottomSheetKt$lambda$1255943437$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public static final ComposableSingletons$ConfidentialVmPinHelpBottomSheetKt$lambda$1255943437$1 INSTANCE = new ComposableSingletons$ConfidentialVmPinHelpBottomSheetKt$lambda$1255943437$1();

    public ComposableSingletons$ConfidentialVmPinHelpBottomSheetKt$lambda$1255943437$1() {
        super(2);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
            ConfidentialVmPinHelpBottomSheetKt.PinHelpSectionHeader(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120790), null, bfm, 0, 2);
        } else {
            bfm.Afo();
        }
    }
}
