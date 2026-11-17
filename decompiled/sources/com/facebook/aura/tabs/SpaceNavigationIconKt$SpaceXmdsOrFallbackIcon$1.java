package com.facebook.aura.tabs;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class SpaceNavigationIconKt$SpaceXmdsOrFallbackIcon$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $fallbackIconRes;
    public final /* synthetic */ long $iconTint;
    public final /* synthetic */ float $size;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpaceNavigationIconKt$SpaceXmdsOrFallbackIcon$1(long j, float f, int i) {
        super(2);
        this.$iconTint = j;
        this.$size = f;
        this.$fallbackIconRes = i;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            SpaceNavigationIconKt.m2305SpaceFallbackIconTHPkMYs(this.$iconTint, this.$size, this.$fallbackIconRes, null, bfm, 0, 8);
        } else {
            bfm.Afo();
        }
    }
}
