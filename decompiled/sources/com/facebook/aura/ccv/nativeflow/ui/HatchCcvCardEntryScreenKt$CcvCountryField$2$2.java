package com.facebook.aura.ccv.nativeflow.ui;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.AnonymousClass007;
import X.BFM;
import X.C06G;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchCcvCardEntryScreenKt$CcvCountryField$2$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ String $placeholder;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchCcvCardEntryScreenKt$CcvCountryField$2$2(String str) {
        super(2);
        this.$placeholder = str;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            AnonymousClass007.A10(bfm, C06G.A0T(bfm), this.$placeholder, C06G.A09(bfm));
            return;
        }
        bfm.Afo();
    }
}
