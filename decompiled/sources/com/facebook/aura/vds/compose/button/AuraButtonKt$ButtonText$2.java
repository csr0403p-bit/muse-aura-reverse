package com.facebook.aura.vds.compose.button;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.B6A;
import X.BFM;
import X.BRg;
import X.C1822Arm;
import X.C1YL;
import X.G0V;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraButtonKt$ButtonText$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ AuraButtonAccessibility $accessibility;
    public final /* synthetic */ int $maxLines;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ Function0<B6A> $overrideContentColor;
    public final /* synthetic */ G0V<BFM, Integer, C1822Arm> $overrideTextStyle;
    public final /* synthetic */ AuraButtonSize $size;
    public final /* synthetic */ AuraLabelButtonStyle $style;
    public final /* synthetic */ String $text;
    public final /* synthetic */ C1YL $textAlign;
    public final /* synthetic */ boolean $useNonScaledText;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraButtonKt$ButtonText$2(String str, boolean z, AuraLabelButtonStyle auraLabelButtonStyle, AuraButtonSize auraButtonSize, G0V<? super BFM, ? super Integer, C1822Arm> g0v, Function0<B6A> function0, AuraButtonAccessibility auraButtonAccessibility, C1YL c1yl, int i, BRg bRg, int i2) {
        super(2);
        this.$text = str;
        this.$useNonScaledText = z;
        this.$style = auraLabelButtonStyle;
        this.$size = auraButtonSize;
        this.$overrideTextStyle = g0v;
        this.$overrideContentColor = function0;
        this.$accessibility = auraButtonAccessibility;
        this.$textAlign = c1yl;
        this.$maxLines = i;
        this.$modifier = bRg;
        this.$$changed = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        AuraButtonKt.m2409ButtonTextVGr5R5M(this.$text, this.$useNonScaledText, this.$style, this.$size, this.$overrideTextStyle, this.$overrideContentColor, this.$accessibility, this.$textAlign, this.$maxLines, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed));
    }
}
