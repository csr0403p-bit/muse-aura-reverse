package com.facebook.aura.activation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.AnonymousClass007;
import X.BFM;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ComposableSingletons$AuraGatingScreenKt$lambda$2064355886$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public static final ComposableSingletons$AuraGatingScreenKt$lambda$2064355886$1 INSTANCE = new ComposableSingletons$AuraGatingScreenKt$lambda$2064355886$1();

    public ComposableSingletons$AuraGatingScreenKt$lambda$2064355886$1() {
        super(2);
    }

    public final void invoke(BFM bfm, int i) {
        AnonymousClass007.A1D(AnonymousClass004.A1E(i), bfm, i);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
