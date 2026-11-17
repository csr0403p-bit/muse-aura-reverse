package com.facebook.aura.vds.compose.typegroup;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.ApQ;
import X.BFM;
import X.BO6;
import X.BRg;
import X.C14P;
import X.C1822Arm;
import X.C1YL;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AuraIconAndHeadlineKt$AuraIconAndHeadline$6 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ ApQ $boxedText;
    public final /* synthetic */ long $boxedTextBackgroundColor;
    public final /* synthetic */ long $boxedTextColor;
    public final /* synthetic */ C1822Arm $boxedTextStyle;
    public final /* synthetic */ Icon $icon;
    public final /* synthetic */ BO6<String, C14P> $inlineContent;
    public final /* synthetic */ boolean $isHeading;
    public final /* synthetic */ int $maxLines;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ int $overflow;
    public final /* synthetic */ AuraIconAndHeadlineStyle $style;
    public final /* synthetic */ boolean $suppressTalkbackSemantics;
    public final /* synthetic */ ApQ $text;
    public final /* synthetic */ C1YL $textAlign;
    public final /* synthetic */ long $textColor;
    public final /* synthetic */ C1822Arm $textStyleOverride;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraIconAndHeadlineKt$AuraIconAndHeadline$6(BRg bRg, ApQ apQ, AuraIconAndHeadlineStyle auraIconAndHeadlineStyle, boolean z, Icon icon, C1YL c1yl, long j, boolean z2, int i, int i2, ApQ apQ2, long j2, C1822Arm c1822Arm, long j3, BO6<String, C14P> bo6, C1822Arm c1822Arm2, int i3, int i4, int i5) {
        super(2);
        this.$modifier = bRg;
        this.$text = apQ;
        this.$style = auraIconAndHeadlineStyle;
        this.$isHeading = z;
        this.$icon = icon;
        this.$textAlign = c1yl;
        this.$textColor = j;
        this.$suppressTalkbackSemantics = z2;
        this.$maxLines = i;
        this.$overflow = i2;
        this.$boxedText = apQ2;
        this.$boxedTextColor = j2;
        this.$boxedTextStyle = c1822Arm;
        this.$boxedTextBackgroundColor = j3;
        this.$inlineContent = bo6;
        this.$textStyleOverride = c1822Arm2;
        this.$$changed = i3;
        this.$$changed1 = i4;
        this.$$default = i5;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        AuraIconAndHeadlineKt.m3100AuraIconAndHeadline8Ls536Q(this.$modifier, this.$text, this.$style, this.$isHeading, this.$icon, this.$textAlign, this.$textColor, this.$suppressTalkbackSemantics, this.$maxLines, this.$overflow, this.$boxedText, this.$boxedTextColor, this.$boxedTextStyle, this.$boxedTextBackgroundColor, this.$inlineContent, this.$textStyleOverride, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
    }
}
