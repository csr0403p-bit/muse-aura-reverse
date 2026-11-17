package com.facebook.aura.ui.adaptive;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AuraLayoutSizeKt$ProvideAuraLayoutSize$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $content;
    public final /* synthetic */ long $size;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraLayoutSizeKt$ProvideAuraLayoutSize$1(long j, G0V<? super BFM, ? super Integer, Unit> g0v, int i) {
        super(2);
        this.$size = j;
        this.$content = g0v;
        this.$$changed = i;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        AuraLayoutSizeKt.m2363ProvideAuraLayoutSizeUBP6k7g(this.$size, this.$content, bfm, AnonymousClass011.A00(this.$$changed));
    }
}
