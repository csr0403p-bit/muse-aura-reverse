package com.facebook.aura.vds.compose.surface;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.C1DH;
import X.C1DM;
import X.C1EQ;
import X.G0V;
import X.G0W;
import X.InterfaceC05151eP;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AuraSurfaceKt$AuraSurface$6 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ C1DH $border;
    public final /* synthetic */ boolean $clipContent;
    public final /* synthetic */ long $color;
    public final /* synthetic */ G0W<InterfaceC05151eP, BFM, Integer, Unit> $content;
    public final /* synthetic */ long $contentColor;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ C1EQ $legacyBrush;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ C1DM $shape;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraSurfaceKt$AuraSurface$6(BRg bRg, C1DM c1dm, boolean z, long j, C1EQ c1eq, long j2, C1DH c1dh, boolean z2, G0W<? super InterfaceC05151eP, ? super BFM, ? super Integer, Unit> g0w, int i, int i2) {
        super(2);
        this.$modifier = bRg;
        this.$shape = c1dm;
        this.$clipContent = z;
        this.$color = j;
        this.$legacyBrush = c1eq;
        this.$contentColor = j2;
        this.$border = c1dh;
        this.$enabled = z2;
        this.$content = g0w;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        AuraSurfaceKt.m2623AuraSurface1esR5Hs(this.$modifier, this.$shape, this.$clipContent, this.$color, this.$legacyBrush, this.$contentColor, this.$border, this.$enabled, this.$content, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
