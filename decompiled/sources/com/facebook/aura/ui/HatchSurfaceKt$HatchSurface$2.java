package com.facebook.aura.ui;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.C1DH;
import X.C1DM;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchSurfaceKt$HatchSurface$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ C1DH $border;
    public final /* synthetic */ long $color;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $content;
    public final /* synthetic */ long $contentColor;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ C1DM $shape;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchSurfaceKt$HatchSurface$2(BRg bRg, C1DM c1dm, long j, long j2, C1DH c1dh, G0V<? super BFM, ? super Integer, Unit> g0v, int i, int i2) {
        super(2);
        this.$modifier = bRg;
        this.$shape = c1dm;
        this.$color = j;
        this.$contentColor = j2;
        this.$border = c1dh;
        this.$content = g0v;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        HatchSurfaceKt.m2328HatchSurfaceY0xEhic(this.$modifier, this.$shape, this.$color, this.$contentColor, this.$border, this.$content, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
