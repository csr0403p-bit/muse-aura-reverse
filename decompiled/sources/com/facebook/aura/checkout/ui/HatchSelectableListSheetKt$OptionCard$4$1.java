package com.facebook.aura.checkout.ui;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class HatchSelectableListSheetKt$OptionCard$4$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $icon;
    public final /* synthetic */ HatchSelectableOption $option;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSelectableListSheetKt$OptionCard$4$1(HatchSelectableOption hatchSelectableOption, int i) {
        super(2);
        this.$option = hatchSelectableOption;
        this.$icon = i;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            HatchSelectableListSheetKt.LeadingGlyph(this.$option, this.$icon, bfm, 0);
        } else {
            bfm.Afo();
        }
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
