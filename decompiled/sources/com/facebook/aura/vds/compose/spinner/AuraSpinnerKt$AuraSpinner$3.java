package com.facebook.aura.vds.compose.spinner;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AuraSpinnerKt$AuraSpinner$3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ AuraSpinnerStyle $style;
    public final /* synthetic */ long $tint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraSpinnerKt$AuraSpinner$3(BRg bRg, AuraSpinnerStyle auraSpinnerStyle, long j, int i, int i2) {
        super(2);
        this.$modifier = bRg;
        this.$style = auraSpinnerStyle;
        this.$tint = j;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        AuraSpinnerKt.m2611AuraSpinnerFNF3uiM(this.$modifier, this.$style, this.$tint, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
