package com.facebook.aura.vds.compose.tag;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AuraStatusTagKt$AuraStatusTag$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ long $backgroundColor;
    public final /* synthetic */ long $contentColor;
    public final /* synthetic */ String $label;
    public final /* synthetic */ BRg $modifier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraStatusTagKt$AuraStatusTag$2(String str, long j, BRg bRg, long j2, int i, int i2) {
        super(2);
        this.$label = str;
        this.$contentColor = j;
        this.$modifier = bRg;
        this.$backgroundColor = j2;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        AuraStatusTagKt.m2637AuraStatusTagRWsq2U(this.$label, this.$contentColor, this.$modifier, this.$backgroundColor, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
