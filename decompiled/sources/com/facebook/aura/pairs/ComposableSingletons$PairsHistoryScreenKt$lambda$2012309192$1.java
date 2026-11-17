package com.facebook.aura.pairs;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.AnonymousClass037;
import X.BFM;
import X.G0W;
import kotlin.Unit;

/* renamed from: com.facebook.aura.pairs.ComposableSingletons$PairsHistoryScreenKt$lambda$-2012309192$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$PairsHistoryScreenKt$lambda$2012309192$1 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
    public static final ComposableSingletons$PairsHistoryScreenKt$lambda$2012309192$1 INSTANCE = new ComposableSingletons$PairsHistoryScreenKt$lambda$2012309192$1();

    public ComposableSingletons$PairsHistoryScreenKt$lambda$2012309192$1() {
        super(3);
    }

    public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
            PairsHistoryScreenKt.PairsHistoryEnd(null, bfm, 0, 1);
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
