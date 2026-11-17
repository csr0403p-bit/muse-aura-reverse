package com.facebook.aura.vds.compose.surface;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.B6A;
import X.BFM;
import X.BRg;
import X.C1DH;
import X.C1DM;
import X.C1EQ;
import X.G0V;
import X.G0W;
import X.InterfaceC05011Yg;
import X.InterfaceC05151eP;
import X.InterfaceC1072AWd;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraSurfaceKt$AuraSurface$4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ C1DH $border;
    public final /* synthetic */ boolean $clipContent;
    public final /* synthetic */ Function0<B6A> $colorLambda;
    public final /* synthetic */ G0W<InterfaceC05151eP, BFM, Integer, Unit> $content;
    public final /* synthetic */ long $contentColor;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ InterfaceC05011Yg $indication;
    public final /* synthetic */ InterfaceC1072AWd $interactionSource;
    public final /* synthetic */ C1EQ $legacyBrush;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ Function0<Unit> $onClick;
    public final /* synthetic */ String $onClickLabel;
    public final /* synthetic */ Function0<Unit> $onLongClick;
    public final /* synthetic */ String $onLongClickLabel;
    public final /* synthetic */ C1DM $shape;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraSurfaceKt$AuraSurface$4(BRg bRg, C1DM c1dm, boolean z, Function0<B6A> function0, C1EQ c1eq, long j, C1DH c1dh, Function0<Unit> function02, String str, Function0<Unit> function03, String str2, InterfaceC1072AWd interfaceC1072AWd, InterfaceC05011Yg interfaceC05011Yg, boolean z2, G0W<? super InterfaceC05151eP, ? super BFM, ? super Integer, Unit> g0w, int i, int i2, int i3) {
        super(2);
        this.$modifier = bRg;
        this.$shape = c1dm;
        this.$clipContent = z;
        this.$colorLambda = function0;
        this.$legacyBrush = c1eq;
        this.$contentColor = j;
        this.$border = c1dh;
        this.$onClick = function02;
        this.$onClickLabel = str;
        this.$onLongClick = function03;
        this.$onLongClickLabel = str2;
        this.$interactionSource = interfaceC1072AWd;
        this.$indication = interfaceC05011Yg;
        this.$enabled = z2;
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
        AuraSurfaceKt.m2624AuraSurfaceWiQJ_vM(this.$modifier, this.$shape, this.$clipContent, this.$colorLambda, this.$legacyBrush, this.$contentColor, this.$border, this.$onClick, this.$onClickLabel, this.$onLongClick, this.$onLongClickLabel, this.$interactionSource, this.$indication, this.$enabled, this.$content, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
    }
}
