package com.facebook.aura.shopping.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass007;
import X.BFM;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ComposableSingletons$HatchProductDetailsHeroKt$lambda$1413561677$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public static final ComposableSingletons$HatchProductDetailsHeroKt$lambda$1413561677$1 INSTANCE = new ComposableSingletons$HatchProductDetailsHeroKt$lambda$1413561677$1();

    public ComposableSingletons$HatchProductDetailsHeroKt$lambda$1413561677$1() {
        super(2);
    }

    public final void invoke(BFM bfm, int i) {
        AnonymousClass007.A1C(AnonymousClass002.A1P(i & 3, 2), bfm, i);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
