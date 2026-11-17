package com.facebook.aura.vds.compose.typegroup;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.C1822Arm;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AuraIconAndHeadlineKt$AuraIconAndHeadline$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ String $boxedText;
    public final /* synthetic */ long $boxedTextBackgroundColor;
    public final /* synthetic */ long $boxedTextColor;
    public final /* synthetic */ C1822Arm $boxedTextStyle;
    public final /* synthetic */ Icon $icon;
    public final /* synthetic */ boolean $isHeading;
    public final /* synthetic */ int $maxLines;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ int $overflow;
    public final /* synthetic */ AuraIconAndHeadlineStyle $style;
    public final /* synthetic */ String $text;
    public final /* synthetic */ int $textAlign;
    public final /* synthetic */ long $textColor;
    public final /* synthetic */ C1822Arm $textStyleOverride;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraIconAndHeadlineKt$AuraIconAndHeadline$2(String str, AuraIconAndHeadlineStyle auraIconAndHeadlineStyle, BRg bRg, boolean z, Icon icon, int i, long j, int i2, int i3, String str2, long j2, C1822Arm c1822Arm, long j3, C1822Arm c1822Arm2, int i4, int i5, int i6) {
        super(2);
        this.$text = str;
        this.$style = auraIconAndHeadlineStyle;
        this.$modifier = bRg;
        this.$isHeading = z;
        this.$icon = icon;
        this.$textAlign = i;
        this.$textColor = j;
        this.$maxLines = i2;
        this.$overflow = i3;
        this.$boxedText = str2;
        this.$boxedTextColor = j2;
        this.$boxedTextStyle = c1822Arm;
        this.$boxedTextBackgroundColor = j3;
        this.$textStyleOverride = c1822Arm2;
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
        AuraIconAndHeadlineKt.m3099AuraIconAndHeadline1nSa1A8(this.$text, this.$style, this.$modifier, this.$isHeading, this.$icon, this.$textAlign, this.$textColor, this.$maxLines, this.$overflow, this.$boxedText, this.$boxedTextColor, this.$boxedTextStyle, this.$boxedTextBackgroundColor, this.$textStyleOverride, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
    }
}
