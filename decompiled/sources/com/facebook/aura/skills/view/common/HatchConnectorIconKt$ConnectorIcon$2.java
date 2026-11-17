package com.facebook.aura.skills.view.common;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.B6A;
import X.BFM;
import X.BRg;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchConnectorIconKt$ConnectorIcon$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ float $cornerRadius;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $fallbackContent;
    public final /* synthetic */ int $fallbackIconRes;
    public final /* synthetic */ float $fallbackIconSize;
    public final /* synthetic */ B6A $fallbackTint;
    public final /* synthetic */ Integer $iconRes;
    public final /* synthetic */ String $iconUrl;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ float $size;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchConnectorIconKt$ConnectorIcon$2(String str, Integer num, BRg bRg, float f, float f2, int i, float f3, B6A b6a, G0V<? super BFM, ? super Integer, Unit> g0v, int i2, int i3) {
        super(2);
        this.$iconUrl = str;
        this.$iconRes = num;
        this.$modifier = bRg;
        this.$size = f;
        this.$cornerRadius = f2;
        this.$fallbackIconRes = i;
        this.$fallbackIconSize = f3;
        this.$fallbackTint = b6a;
        this.$fallbackContent = g0v;
        this.$$changed = i2;
        this.$$default = i3;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        HatchConnectorIconKt.m2169ConnectorIconVRRgpyE(this.$iconUrl, this.$iconRes, this.$modifier, this.$size, this.$cornerRadius, this.$fallbackIconRes, this.$fallbackIconSize, this.$fallbackTint, this.$fallbackContent, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
