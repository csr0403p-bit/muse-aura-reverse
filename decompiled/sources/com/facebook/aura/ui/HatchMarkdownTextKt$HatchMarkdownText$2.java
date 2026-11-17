package com.facebook.aura.ui;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.C1822Arm;
import X.G0U;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchMarkdownTextKt$HatchMarkdownText$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ G0U<Integer, Unit> $onClick;
    public final /* synthetic */ String $text;
    public final /* synthetic */ long $textColor;
    public final /* synthetic */ C1822Arm $textStyle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchMarkdownTextKt$HatchMarkdownText$2(String str, BRg bRg, long j, C1822Arm c1822Arm, G0U<? super Integer, Unit> g0u, int i, int i2) {
        super(2);
        this.$text = str;
        this.$modifier = bRg;
        this.$textColor = j;
        this.$textStyle = c1822Arm;
        this.$onClick = g0u;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        HatchMarkdownTextKt.m2319HatchMarkdownTextT042LqI(this.$text, this.$modifier, this.$textColor, this.$textStyle, this.$onClick, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
