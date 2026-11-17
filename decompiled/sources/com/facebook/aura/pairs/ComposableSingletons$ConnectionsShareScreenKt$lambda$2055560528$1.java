package com.facebook.aura.pairs;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass037;
import X.BFM;
import X.BRg;
import X.C10G;
import X.G0W;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class ComposableSingletons$ConnectionsShareScreenKt$lambda$2055560528$1 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
    public static final ComposableSingletons$ConnectionsShareScreenKt$lambda$2055560528$1 INSTANCE = new ComposableSingletons$ConnectionsShareScreenKt$lambda$2055560528$1();

    public ComposableSingletons$ConnectionsShareScreenKt$lambda$2055560528$1() {
        super(3);
    }

    public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
            PairsComponentsKt.PairsLoading(C10G.A04(BRg.A00, 56.0f), bfm, 6, 0);
        } else {
            bfm.Afo();
        }
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
        invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
