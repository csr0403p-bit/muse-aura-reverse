package com.facebook.aura.conversation.view.richcontent;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class HatchMathContentKt$HatchMathContent$3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ boolean $displayMode;
    public final /* synthetic */ String $expression;
    public final /* synthetic */ int $fontSizeSp;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ float $outerVerticalPadding;
    public final /* synthetic */ long $textColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchMathContentKt$HatchMathContent$3(String str, boolean z, BRg bRg, float f, int i, long j, int i2, int i3) {
        super(2);
        this.$expression = str;
        this.$displayMode = z;
        this.$modifier = bRg;
        this.$outerVerticalPadding = f;
        this.$fontSizeSp = i;
        this.$textColor = j;
        this.$$changed = i2;
        this.$$default = i3;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        HatchMathContentKt.m682HatchMathContentw0dp6WY(this.$expression, this.$displayMode, this.$modifier, this.$outerVerticalPadding, this.$fontSizeSp, this.$textColor, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
