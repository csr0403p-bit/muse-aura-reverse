package com.facebook.aura.vds.compose.icons;

import X.ARL;
import X.AVy;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AuraIconKt$AuraIcon$4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ String $contentDescription;
    public final /* synthetic */ ARL $contentScale;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ AVy $painter;
    public final /* synthetic */ float $size;
    public final /* synthetic */ long $tint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraIconKt$AuraIcon$4(BRg bRg, AVy aVy, float f, String str, long j, ARL arl, int i, int i2) {
        super(2);
        this.$modifier = bRg;
        this.$painter = aVy;
        this.$size = f;
        this.$contentDescription = str;
        this.$tint = j;
        this.$contentScale = arl;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        AuraIconKt.m2568AuraIconFyETyZw(this.$modifier, this.$painter, this.$size, this.$contentDescription, this.$tint, this.$contentScale, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
