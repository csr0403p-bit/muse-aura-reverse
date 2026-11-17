package com.facebook.aura.checkout.ui;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.C07C;
import X.G0W;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchSelectableListSheetKt$SelectableOptionRow$editFooter$1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
    public final /* synthetic */ Function0<Unit> $onEdit;
    public final /* synthetic */ HatchSelectableOption $option;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSelectableListSheetKt$SelectableOptionRow$editFooter$1(HatchSelectableOption hatchSelectableOption, Function0<Unit> function0) {
        super(3);
        this.$option = hatchSelectableOption;
        this.$onEdit = function0;
    }

    public final void invoke(C07C c07c, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
            HatchSelectableListSheetKt.OptionEditLink(this.$option, this.$onEdit, null, bfm, 0, 4);
        } else {
            bfm.Afo();
        }
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
        invoke(c07c, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
