package com.facebook.aura.vds.compose.typegroup;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.ApQ;
import X.BFM;
import X.BRg;
import X.C1822Arm;
import X.C1YL;
import X.G0U;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AuraIconAndBodyKt$AuraIconAndBody$3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ long $color;
    public final /* synthetic */ Icon $icon;
    public final /* synthetic */ int $maxLines;
    public final /* synthetic */ int $minLines;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ AuraIconAndBodyStyle $style;
    public final /* synthetic */ ApQ $text;
    public final /* synthetic */ C1YL $textAlign;
    public final /* synthetic */ G0U<String, Unit> $textOnUrlClick;
    public final /* synthetic */ int $textOverflow;
    public final /* synthetic */ C1822Arm $textStyleOverride;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraIconAndBodyKt$AuraIconAndBody$3(ApQ apQ, AuraIconAndBodyStyle auraIconAndBodyStyle, BRg bRg, G0U<? super String, Unit> g0u, long j, Icon icon, C1YL c1yl, int i, int i2, int i3, C1822Arm c1822Arm, int i4, int i5, int i6) {
        super(2);
        this.$text = apQ;
        this.$style = auraIconAndBodyStyle;
        this.$modifier = bRg;
        this.$textOnUrlClick = g0u;
        this.$color = j;
        this.$icon = icon;
        this.$textAlign = c1yl;
        this.$maxLines = i;
        this.$minLines = i2;
        this.$textOverflow = i3;
        this.$textStyleOverride = c1822Arm;
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
        AuraIconAndBodyKt.m3098AuraIconAndBodyJMRm4Jw(this.$text, this.$style, this.$modifier, this.$textOnUrlClick, this.$color, this.$icon, this.$textAlign, this.$maxLines, this.$minLines, this.$textOverflow, this.$textStyleOverride, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
    }
}
