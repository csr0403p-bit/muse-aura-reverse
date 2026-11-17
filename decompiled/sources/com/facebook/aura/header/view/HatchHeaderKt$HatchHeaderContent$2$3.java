package com.facebook.aura.header.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchHeaderKt$HatchHeaderContent$2$3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ G0V<BFM, Integer, Unit> $actions;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchHeaderKt$HatchHeaderContent$2$3(G0V<? super BFM, ? super Integer, Unit> g0v) {
        super(2);
        this.$actions = g0v;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
            AnonymousClass001.A1H(bfm, this.$actions, 0);
        } else {
            bfm.Afo();
        }
    }
}
