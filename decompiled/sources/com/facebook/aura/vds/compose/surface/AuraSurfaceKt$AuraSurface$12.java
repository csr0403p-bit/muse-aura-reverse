package com.facebook.aura.vds.compose.surface;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.C1DH;
import X.C1DM;
import X.C1EQ;
import X.C1YD;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC05011Yg;
import X.InterfaceC05151eP;
import X.InterfaceC1072AWd;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AuraSurfaceKt$AuraSurface$12 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ C1DH $border;
    public final /* synthetic */ boolean $checked;
    public final /* synthetic */ boolean $clipContent;
    public final /* synthetic */ long $color;
    public final /* synthetic */ G0W<InterfaceC05151eP, BFM, Integer, Unit> $content;
    public final /* synthetic */ long $contentColor;
    public final /* synthetic */ String $contentDescription;
    public final /* synthetic */ String $contentDescriptionChecked;
    public final /* synthetic */ String $contentDescriptionUnchecked;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ InterfaceC05011Yg $indication;
    public final /* synthetic */ InterfaceC1072AWd $interactionSource;
    public final /* synthetic */ C1EQ $legacyBrush;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ G0U<Boolean, Unit> $onCheckedChange;
    public final /* synthetic */ C1YD $role;
    public final /* synthetic */ C1DM $shape;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraSurfaceKt$AuraSurface$12(boolean z, G0U<? super Boolean, Unit> g0u, BRg bRg, C1DM c1dm, boolean z2, long j, C1EQ c1eq, long j2, C1DH c1dh, InterfaceC1072AWd interfaceC1072AWd, InterfaceC05011Yg interfaceC05011Yg, boolean z3, C1YD c1yd, String str, String str2, String str3, G0W<? super InterfaceC05151eP, ? super BFM, ? super Integer, Unit> g0w, int i, int i2, int i3) {
        super(2);
        this.$checked = z;
        this.$onCheckedChange = g0u;
        this.$modifier = bRg;
        this.$shape = c1dm;
        this.$clipContent = z2;
        this.$color = j;
        this.$legacyBrush = c1eq;
        this.$contentColor = j2;
        this.$border = c1dh;
        this.$interactionSource = interfaceC1072AWd;
        this.$indication = interfaceC05011Yg;
        this.$enabled = z3;
        this.$role = c1yd;
        this.$contentDescription = str;
        this.$contentDescriptionChecked = str2;
        this.$contentDescriptionUnchecked = str3;
        this.$content = g0w;
        this.$$changed = i;
        this.$$changed1 = i2;
        this.$$default = i3;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        AuraSurfaceKt.m2626AuraSurfaceab7H2o(this.$checked, this.$onCheckedChange, this.$modifier, this.$shape, this.$clipContent, this.$color, this.$legacyBrush, this.$contentColor, this.$border, this.$interactionSource, this.$indication, this.$enabled, this.$role, this.$contentDescription, this.$contentDescriptionChecked, this.$contentDescriptionUnchecked, this.$content, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
    }
}
