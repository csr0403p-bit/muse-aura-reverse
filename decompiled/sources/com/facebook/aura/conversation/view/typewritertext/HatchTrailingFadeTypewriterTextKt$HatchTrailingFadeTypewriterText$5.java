package com.facebook.aura.conversation.view.typewritertext;

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
import X.C3UX;
import X.G0U;
import X.G0V;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchTrailingFadeTypewriterTextKt$HatchTrailingFadeTypewriterText$5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$changed2;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ boolean $enableSelection;
    public final /* synthetic */ int $fadeInDuration;
    public final /* synthetic */ B0A $fontStyle;
    public final /* synthetic */ C1736ApY $fontWeight;
    public final /* synthetic */ ApQ $formattedFullText;
    public final /* synthetic */ String $fullText;
    public final /* synthetic */ int $initialVisibleCharacterCount;
    public final /* synthetic */ BO6<String, C14P> $inlineContent;
    public final /* synthetic */ long $lineHeight;
    public final /* synthetic */ int $maxLines;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ Function0<Unit> $onAnimationCompleted;
    public final /* synthetic */ G0U<Integer, Unit> $onClick;
    public final /* synthetic */ G0U<Integer, Unit> $onDoubleClick;
    public final /* synthetic */ G0U<Integer, Unit> $onLongClick;
    public final /* synthetic */ G0U<C1958Aux, Unit> $onTextLayout;
    public final /* synthetic */ int $overflow;
    public final /* synthetic */ C3UX $scope;
    public final /* synthetic */ boolean $shouldAnimate;
    public final /* synthetic */ boolean $softWrap;
    public final /* synthetic */ int $textAlign;
    public final /* synthetic */ long $textColor;
    public final /* synthetic */ C1810ArU $textIndent;
    public final /* synthetic */ C1822Arm $textStyle;
    public final /* synthetic */ long $typingSpeed;

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchTrailingFadeTypewriterTextKt$HatchTrailingFadeTypewriterText$5(String str, ApQ apQ, int i, BRg bRg, int i2, boolean z, long j, int i3, int i4, C3UX c3ux, C1822Arm c1822Arm, long j2, G0U<? super Integer, Unit> g0u, G0U<? super Integer, Unit> g0u2, G0U<? super Integer, Unit> g0u3, B0A b0a, C1736ApY c1736ApY, long j3, boolean z2, int i5, G0U<? super C1958Aux, Unit> g0u4, C1810ArU c1810ArU, BO6<String, C14P> bo6, Function0<Unit> function0, boolean z3, int i6, int i7, int i8, int i9) {
        super(2);
        this.$fullText = str;
        this.$formattedFullText = apQ;
        this.$textAlign = i;
        this.$modifier = bRg;
        this.$initialVisibleCharacterCount = i2;
        this.$shouldAnimate = z;
        this.$typingSpeed = j;
        this.$fadeInDuration = i3;
        this.$maxLines = i4;
        this.$scope = c3ux;
        this.$textStyle = c1822Arm;
        this.$textColor = j2;
        this.$onClick = g0u;
        this.$onLongClick = g0u2;
        this.$onDoubleClick = g0u3;
        this.$fontStyle = b0a;
        this.$fontWeight = c1736ApY;
        this.$lineHeight = j3;
        this.$softWrap = z2;
        this.$overflow = i5;
        this.$onTextLayout = g0u4;
        this.$textIndent = c1810ArU;
        this.$inlineContent = bo6;
        this.$onAnimationCompleted = function0;
        this.$enableSelection = z3;
        this.$$changed = i6;
        this.$$changed1 = i7;
        this.$$changed2 = i8;
        this.$$default = i9;
    }

    public final void invoke(BFM bfm, int i) {
        HatchTrailingFadeTypewriterTextKt.m698HatchTrailingFadeTypewriterTextYXPlkAI(this.$fullText, this.$formattedFullText, this.$textAlign, this.$modifier, this.$initialVisibleCharacterCount, this.$shouldAnimate, this.$typingSpeed, this.$fadeInDuration, this.$maxLines, this.$scope, this.$textStyle, this.$textColor, this.$onClick, this.$onLongClick, this.$onDoubleClick, this.$fontStyle, this.$fontWeight, this.$lineHeight, this.$softWrap, this.$overflow, this.$onTextLayout, this.$textIndent, this.$inlineContent, this.$onAnimationCompleted, this.$enableSelection, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), AnonymousClass011.A01(this.$$changed2), this.$$default);
    }
}
