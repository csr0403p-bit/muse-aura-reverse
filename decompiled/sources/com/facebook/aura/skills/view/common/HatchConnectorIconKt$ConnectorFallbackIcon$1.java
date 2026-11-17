package com.facebook.aura.skills.view.common;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchConnectorIconKt$ConnectorFallbackIcon$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ int $iconRes;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ float $size;
    public final /* synthetic */ long $tint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConnectorIconKt$ConnectorFallbackIcon$1(int i, float f, long j, BRg bRg, int i2, int i3) {
        super(2);
        this.$iconRes = i;
        this.$size = f;
        this.$tint = j;
        this.$modifier = bRg;
        this.$$changed = i2;
        this.$$default = i3;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        HatchConnectorIconKt.m2168ConnectorFallbackIconPZHvWI(this.$iconRes, this.$size, this.$tint, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
