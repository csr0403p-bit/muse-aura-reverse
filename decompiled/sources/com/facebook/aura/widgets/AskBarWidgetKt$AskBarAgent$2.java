package com.facebook.aura.widgets;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.C71K;
import X.C76B;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class AskBarWidgetKt$AskBarAgent$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ C71K $avatar;
    public final /* synthetic */ float $maxNameWidth;
    public final /* synthetic */ C76B $modifier;
    public final /* synthetic */ String $name;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AskBarWidgetKt$AskBarAgent$2(String str, C71K c71k, float f, C76B c76b, int i, int i2) {
        super(2);
        this.$name = str;
        this.$avatar = c71k;
        this.$maxNameWidth = f;
        this.$modifier = c76b;
        this.$$changed = i;
        this.$$default = i2;
    }

    public final void invoke(BFM bfm, int i) {
        AskBarWidgetKt.m3156AskBarAgent942rkJo(this.$name, this.$avatar, this.$maxNameWidth, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
