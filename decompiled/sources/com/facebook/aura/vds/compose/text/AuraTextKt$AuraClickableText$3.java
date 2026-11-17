package com.facebook.aura.vds.compose.text;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.ApQ;
import X.B0A;
import X.BFM;
import X.BO6;
import X.BRg;
import X.C14P;
import X.C1736ApY;
import X.C1810ArU;
import X.C1822Arm;
import X.C1958Aux;
import X.C1YL;
import X.G0U;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AuraTextKt$AuraClickableText$3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ long $color;
    public final /* synthetic */ B0A $fontStyle;
    public final /* synthetic */ C1736ApY $fontWeight;
    public final /* synthetic */ boolean $fullTextClickable;
    public final /* synthetic */ BO6<String, C14P> $inlineContent;
    public final /* synthetic */ long $lineHeight;
    public final /* synthetic */ BRg $loggingModifier;
    public final /* synthetic */ int $maxLines;
    public final /* synthetic */ int $minLines;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ G0U<Integer, Unit> $onClick;
    public final /* synthetic */ G0U<Integer, Unit> $onDoubleClick;
    public final /* synthetic */ G0U<Integer, Unit> $onLongClick;
    public final /* synthetic */ G0U<C1958Aux, Unit> $onTextLayout;
    public final /* synthetic */ int $overflow;
    public final /* synthetic */ boolean $softWrap;
    public final /* synthetic */ C1822Arm $style;
    public final /* synthetic */ ApQ $text;
    public final /* synthetic */ C1YL $textAlign;
    public final /* synthetic */ C1810ArU $textIndent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraTextKt$AuraClickableText$3(ApQ apQ, BRg bRg, G0U<? super Integer, Unit> g0u, BRg bRg2, G0U<? super Integer, Unit> g0u2, G0U<? super Integer, Unit> g0u3, boolean z, long j, C1822Arm c1822Arm, B0A b0a, C1736ApY c1736ApY, C1YL c1yl, long j2, boolean z2, int i, int i2, int i3, G0U<? super C1958Aux, Unit> g0u4, C1810ArU c1810ArU, BO6<String, C14P> bo6, int i4, int i5, int i6) {
        super(2);
        this.$text = apQ;
        this.$modifier = bRg;
        this.$onClick = g0u;
        this.$loggingModifier = bRg2;
        this.$onLongClick = g0u2;
        this.$onDoubleClick = g0u3;
        this.$fullTextClickable = z;
        this.$color = j;
        this.$style = c1822Arm;
        this.$fontStyle = b0a;
        this.$fontWeight = c1736ApY;
        this.$textAlign = c1yl;
        this.$lineHeight = j2;
        this.$softWrap = z2;
        this.$maxLines = i;
        this.$minLines = i2;
        this.$overflow = i3;
        this.$onTextLayout = g0u4;
        this.$textIndent = c1810ArU;
        this.$inlineContent = bo6;
        this.$$changed = i4;
        this.$$changed1 = i5;
        this.$$default = i6;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        AuraTextKt.m2638AuraClickableTextZsD2BWI(this.$text, this.$modifier, this.$onClick, this.$loggingModifier, this.$onLongClick, this.$onDoubleClick, this.$fullTextClickable, this.$color, this.$style, this.$fontStyle, this.$fontWeight, this.$textAlign, this.$lineHeight, this.$softWrap, this.$maxLines, this.$minLines, this.$overflow, this.$onTextLayout, this.$textIndent, this.$inlineContent, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
    }
}
