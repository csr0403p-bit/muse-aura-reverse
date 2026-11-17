package com.facebook.aura.pairs;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class ConnectionsComponentsKt$ConnectionsOverflowButton$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ long $iconColor;
    public final /* synthetic */ float $iconSize;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ Function0<Unit> $onClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectionsComponentsKt$ConnectionsOverflowButton$2(Function0<Unit> function0, BRg bRg, boolean z, float f, long j, int i, int i2) {
        super(2);
        this.$onClick = function0;
        this.$modifier = bRg;
        this.$enabled = z;
        this.$iconSize = f;
        this.$iconColor = j;
        this.$$changed = i;
        this.$$default = i2;
    }

    public final void invoke(BFM bfm, int i) {
        ConnectionsComponentsKt.m1650ConnectionsOverflowButtonxfPyhaw(this.$onClick, this.$modifier, this.$enabled, this.$iconSize, this.$iconColor, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
