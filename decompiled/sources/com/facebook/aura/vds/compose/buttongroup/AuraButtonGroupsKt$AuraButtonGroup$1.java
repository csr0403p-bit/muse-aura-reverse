package com.facebook.aura.vds.compose.buttongroup;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.ApQ;
import X.BFM;
import X.BRg;
import X.C1YL;
import X.G0U;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AuraButtonGroupsKt$AuraButtonGroup$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ G0U<AuraButtonGroupStyleByScope, Unit> $buttons;
    public final /* synthetic */ ApQ $footer;
    public final /* synthetic */ C1YL $footerTextAlign;
    public final /* synthetic */ ApQ $header;
    public final /* synthetic */ C1YL $headerTextAlign;
    public final /* synthetic */ G0U<String, Unit> $headerUrlClick;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ AuraButtonGroupSize $size;
    public final /* synthetic */ boolean $suppressPadding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraButtonGroupsKt$AuraButtonGroup$1(BRg bRg, ApQ apQ, C1YL c1yl, G0U<? super String, Unit> g0u, ApQ apQ2, C1YL c1yl2, AuraButtonGroupSize auraButtonGroupSize, boolean z, G0U<? super AuraButtonGroupStyleByScope, Unit> g0u2, int i, int i2) {
        super(2);
        this.$modifier = bRg;
        this.$header = apQ;
        this.$headerTextAlign = c1yl;
        this.$headerUrlClick = g0u;
        this.$footer = apQ2;
        this.$footerTextAlign = c1yl2;
        this.$size = auraButtonGroupSize;
        this.$suppressPadding = z;
        this.$buttons = g0u2;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        AuraButtonGroupsKt.m2454AuraButtonGroupFLdL6rA(this.$modifier, this.$header, this.$headerTextAlign, this.$headerUrlClick, this.$footer, this.$footerTextAlign, this.$size, this.$suppressPadding, this.$buttons, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
