package com.facebook.aura.vds.compose.button;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.B6A;
import X.BFM;
import X.BRg;
import X.C1822Arm;
import X.C1DG;
import X.C1YL;
import X.C3TQ;
import X.G0V;
import X.G0W;
import X.InterfaceC05011Yg;
import X.InterfaceC1072AWd;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraButtonKt$AuraButton$13 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$changed2;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ AuraButtonAccessibility $accessibility;
    public final /* synthetic */ boolean $arrangeTextVertically;
    public final /* synthetic */ int $clickHaptic;
    public final /* synthetic */ boolean $clipIconBounds;
    public final /* synthetic */ boolean $cropTextIfRequired;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ G0W<IconContext, BFM, Integer, Unit> $icon;
    public final /* synthetic */ String $id;
    public final /* synthetic */ InterfaceC05011Yg $indication;
    public final /* synthetic */ InterfaceC1072AWd $interactionSource;
    public final /* synthetic */ boolean $isIconTrailing;
    public final /* synthetic */ boolean $loading;
    public final /* synthetic */ int $maxLines;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ Function0<Unit> $onClick;
    public final /* synthetic */ String $onClickLabel;
    public final /* synthetic */ Function0<Unit> $onLongClick;
    public final /* synthetic */ Function0<B6A> $overrideBackgroundColor;
    public final /* synthetic */ Function0<B6A> $overrideContentColor;
    public final /* synthetic */ Function0<C3TQ> $overridePaddingValues;
    public final /* synthetic */ Function0<C1DG> $overrideSpacingBetweenIconAndText;
    public final /* synthetic */ G0V<BFM, Integer, C1822Arm> $overrideTextStyle;
    public final /* synthetic */ AuraButtonSize $size;
    public final /* synthetic */ AuraLabelButtonStyle $style;
    public final /* synthetic */ String $text;
    public final /* synthetic */ C1YL $textAlign;
    public final /* synthetic */ boolean $useNonScaledText;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraButtonKt$AuraButton$13(String str, String str2, C1YL c1yl, BRg bRg, AuraLabelButtonStyle auraLabelButtonStyle, AuraButtonSize auraButtonSize, G0W<? super IconContext, ? super BFM, ? super Integer, Unit> g0w, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, InterfaceC1072AWd interfaceC1072AWd, InterfaceC05011Yg interfaceC05011Yg, Function0<Unit> function0, String str3, Function0<Unit> function02, Function0<B6A> function03, Function0<B6A> function04, G0V<? super BFM, ? super Integer, C1822Arm> g0v, Function0<C1DG> function05, Function0<? extends C3TQ> function06, AuraButtonAccessibility auraButtonAccessibility, boolean z6, int i, boolean z7, int i2, int i3, int i4, int i5, int i6) {
        super(2);
        this.$id = str;
        this.$text = str2;
        this.$textAlign = c1yl;
        this.$modifier = bRg;
        this.$style = auraLabelButtonStyle;
        this.$size = auraButtonSize;
        this.$icon = g0w;
        this.$isIconTrailing = z;
        this.$clipIconBounds = z2;
        this.$enabled = z3;
        this.$loading = z4;
        this.$useNonScaledText = z5;
        this.$interactionSource = interfaceC1072AWd;
        this.$indication = interfaceC05011Yg;
        this.$onClick = function0;
        this.$onClickLabel = str3;
        this.$onLongClick = function02;
        this.$overrideContentColor = function03;
        this.$overrideBackgroundColor = function04;
        this.$overrideTextStyle = g0v;
        this.$overrideSpacingBetweenIconAndText = function05;
        this.$overridePaddingValues = function06;
        this.$accessibility = auraButtonAccessibility;
        this.$arrangeTextVertically = z6;
        this.$maxLines = i;
        this.$cropTextIfRequired = z7;
        this.$clickHaptic = i2;
        this.$$changed = i3;
        this.$$changed1 = i4;
        this.$$changed2 = i5;
        this.$$default = i6;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        AuraButtonKt.m2408AuraButtonnL3aKkM(this.$id, this.$text, this.$textAlign, this.$modifier, this.$style, this.$size, this.$icon, this.$isIconTrailing, this.$clipIconBounds, this.$enabled, this.$loading, this.$useNonScaledText, this.$interactionSource, this.$indication, this.$onClick, this.$onClickLabel, this.$onLongClick, this.$overrideContentColor, this.$overrideBackgroundColor, this.$overrideTextStyle, this.$overrideSpacingBetweenIconAndText, this.$overridePaddingValues, this.$accessibility, this.$arrangeTextVertically, this.$maxLines, this.$cropTextIfRequired, this.$clickHaptic, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), AnonymousClass011.A01(this.$$changed2), this.$$default);
    }
}
