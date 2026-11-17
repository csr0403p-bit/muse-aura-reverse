package com.facebook.aura.vds.compose.base;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ComponentsKt$AuraHorizontalSpacer$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ float $width;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComponentsKt$AuraHorizontalSpacer$1(float f, int i) {
        super(2);
        this.$width = f;
        this.$$changed = i;
    }

    public final void invoke(BFM bfm, int i) {
        ComponentsKt.m2402AuraHorizontalSpacer8Feqmps(this.$width, bfm, AnonymousClass011.A00(this.$$changed));
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
