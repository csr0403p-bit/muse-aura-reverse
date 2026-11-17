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
public final class AuraButtonGroupsKt$Header$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ ApQ $text;
    public final /* synthetic */ C1YL $textAlign;
    public final /* synthetic */ G0U<String, Unit> $textUrlClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraButtonGroupsKt$Header$1(BRg bRg, ApQ apQ, C1YL c1yl, G0U<? super String, Unit> g0u, int i, int i2) {
        super(2);
        this.$modifier = bRg;
        this.$text = apQ;
        this.$textAlign = c1yl;
        this.$textUrlClick = g0u;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        AuraButtonGroupsKt.m2456HeaderB9Ufvwk(this.$modifier, this.$text, this.$textAlign, this.$textUrlClick, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
