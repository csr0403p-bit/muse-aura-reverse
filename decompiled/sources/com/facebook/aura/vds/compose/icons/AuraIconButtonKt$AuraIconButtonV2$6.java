package com.facebook.aura.vds.compose.icons;

import X.AVy;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.B6A;
import X.BFM;
import X.BRg;
import X.C1DG;
import X.G0V;
import X.InterfaceC1072AWd;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraIconButtonKt$AuraIconButtonV2$6 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ AuraIconButtonBackground $background;
    public final /* synthetic */ B6A $backgroundColor;
    public final /* synthetic */ String $contentDescription;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ AVy $iconPainter;
    public final /* synthetic */ InterfaceC1072AWd $interactionSource;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ Function0<Unit> $onClick;
    public final /* synthetic */ String $onClickLabel;
    public final /* synthetic */ B6A $overrideIconColor;
    public final /* synthetic */ C1DG $overrideIconSize;
    public final /* synthetic */ AuraIconButtonSizeV2 $size;
    public final /* synthetic */ AuraIconButtonStyle $style;
    public final /* synthetic */ String $testTag;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraIconButtonKt$AuraIconButtonV2$6(BRg bRg, AVy aVy, AuraIconButtonSizeV2 auraIconButtonSizeV2, AuraIconButtonStyle auraIconButtonStyle, AuraIconButtonBackground auraIconButtonBackground, B6A b6a, String str, Function0<Unit> function0, String str2, boolean z, B6A b6a2, C1DG c1dg, InterfaceC1072AWd interfaceC1072AWd, String str3, int i, int i2, int i3) {
        super(2);
        this.$modifier = bRg;
        this.$iconPainter = aVy;
        this.$size = auraIconButtonSizeV2;
        this.$style = auraIconButtonStyle;
        this.$background = auraIconButtonBackground;
        this.$backgroundColor = b6a;
        this.$contentDescription = str;
        this.$onClick = function0;
        this.$onClickLabel = str2;
        this.$enabled = z;
        this.$overrideIconColor = b6a2;
        this.$overrideIconSize = c1dg;
        this.$interactionSource = interfaceC1072AWd;
        this.$testTag = str3;
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
        AuraIconButtonKt.m2552AuraIconButtonV2imgtlEU(this.$modifier, this.$iconPainter, this.$size, this.$style, this.$background, this.$backgroundColor, this.$contentDescription, this.$onClick, this.$onClickLabel, this.$enabled, this.$overrideIconColor, this.$overrideIconSize, this.$interactionSource, this.$testTag, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
    }
}
