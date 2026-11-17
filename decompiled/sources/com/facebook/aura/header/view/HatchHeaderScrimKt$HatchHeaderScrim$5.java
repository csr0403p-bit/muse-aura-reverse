package com.facebook.aura.header.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchHeaderScrimKt$HatchHeaderScrim$5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ float $progress;
    public final /* synthetic */ ScrimConfig $scrim;
    public final /* synthetic */ float $scrimHeight;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchHeaderScrimKt$HatchHeaderScrim$5(ScrimConfig scrimConfig, float f, BRg bRg, float f2, int i, int i2) {
        super(2);
        this.$scrim = scrimConfig;
        this.$scrimHeight = f;
        this.$modifier = bRg;
        this.$progress = f2;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        HatchHeaderScrimKt.m995HatchHeaderScrimDzVHIIc(this.$scrim, this.$scrimHeight, this.$modifier, this.$progress, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
