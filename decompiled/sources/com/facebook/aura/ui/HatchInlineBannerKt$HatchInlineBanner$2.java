package com.facebook.aura.ui;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.C1822Arm;
import X.C1DM;
import X.C3TQ;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchInlineBannerKt$HatchInlineBanner$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ long $backgroundColor;
    public final /* synthetic */ C3TQ $contentPadding;
    public final /* synthetic */ float $elevation;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $leadingContent;
    public final /* synthetic */ float $leadingSpacing;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ C1DM $shape;
    public final /* synthetic */ String $subtitle;
    public final /* synthetic */ long $subtitleColor;
    public final /* synthetic */ int $subtitleMaxLines;
    public final /* synthetic */ C1822Arm $subtitleStyle;
    public final /* synthetic */ String $title;
    public final /* synthetic */ long $titleColor;
    public final /* synthetic */ int $titleMaxLines;
    public final /* synthetic */ C1822Arm $titleStyle;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $trailingContent;
    public final /* synthetic */ float $trailingSpacing;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchInlineBannerKt$HatchInlineBanner$2(String str, G0V<? super BFM, ? super Integer, Unit> g0v, BRg bRg, String str2, G0V<? super BFM, ? super Integer, Unit> g0v2, C1DM c1dm, long j, float f, C3TQ c3tq, float f2, float f3, C1822Arm c1822Arm, long j2, int i, C1822Arm c1822Arm2, long j3, int i2, int i3, int i4, int i5) {
        super(2);
        this.$title = str;
        this.$leadingContent = g0v;
        this.$modifier = bRg;
        this.$subtitle = str2;
        this.$trailingContent = g0v2;
        this.$shape = c1dm;
        this.$backgroundColor = j;
        this.$elevation = f;
        this.$contentPadding = c3tq;
        this.$leadingSpacing = f2;
        this.$trailingSpacing = f3;
        this.$titleStyle = c1822Arm;
        this.$titleColor = j2;
        this.$titleMaxLines = i;
        this.$subtitleStyle = c1822Arm2;
        this.$subtitleColor = j3;
        this.$subtitleMaxLines = i2;
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
        HatchInlineBannerKt.m2318HatchInlineBannerKBbEK2Q(this.$title, this.$leadingContent, this.$modifier, this.$subtitle, this.$trailingContent, this.$shape, this.$backgroundColor, this.$elevation, this.$contentPadding, this.$leadingSpacing, this.$trailingSpacing, this.$titleStyle, this.$titleColor, this.$titleMaxLines, this.$subtitleStyle, this.$subtitleColor, this.$subtitleMaxLines, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
    }
}
