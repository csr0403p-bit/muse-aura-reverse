package com.facebook.aura.conversation.view.richcontent;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class HatchInlineMathKt$HatchInlineMath$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ String $expression;
    public final /* synthetic */ int $fontSizeSp;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ long $textColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchInlineMathKt$HatchInlineMath$1(String str, BRg bRg, int i, long j, int i2, int i3) {
        super(2);
        this.$expression = str;
        this.$modifier = bRg;
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
        HatchInlineMathKt.m680HatchInlineMathww6aTOc(this.$expression, this.$modifier, this.$fontSizeSp, this.$textColor, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
