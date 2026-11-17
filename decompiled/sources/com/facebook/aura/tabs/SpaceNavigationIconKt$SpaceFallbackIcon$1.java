package com.facebook.aura.tabs;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class SpaceNavigationIconKt$SpaceFallbackIcon$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ int $fallbackIconRes;
    public final /* synthetic */ long $iconTint;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ float $size;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpaceNavigationIconKt$SpaceFallbackIcon$1(long j, float f, int i, BRg bRg, int i2, int i3) {
        super(2);
        this.$iconTint = j;
        this.$size = f;
        this.$fallbackIconRes = i;
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
        SpaceNavigationIconKt.m2305SpaceFallbackIconTHPkMYs(this.$iconTint, this.$size, this.$fallbackIconRes, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
