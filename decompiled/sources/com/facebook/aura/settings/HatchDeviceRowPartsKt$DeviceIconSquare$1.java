package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchDeviceRowPartsKt$DeviceIconSquare$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ long $background;
    public final /* synthetic */ int $iconRes;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ float $size;
    public final /* synthetic */ long $tint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchDeviceRowPartsKt$DeviceIconSquare$1(int i, float f, BRg bRg, long j, long j2, int i2, int i3) {
        super(2);
        this.$iconRes = i;
        this.$size = f;
        this.$modifier = bRg;
        this.$background = j;
        this.$tint = j2;
        this.$$changed = i2;
        this.$$default = i3;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        HatchDeviceRowPartsKt.m1951DeviceIconSquareWSOZc8o(this.$iconRes, this.$size, this.$modifier, this.$background, this.$tint, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
