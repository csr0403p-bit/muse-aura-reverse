package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass006;
import X.BFM;
import X.G0W;
import com.facebook.aura.navigation.key.PairsHistoryScreenKey;
import com.facebook.aura.pairs.PairsHistoryScreenKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class ComposableSingletons$PairsEntryProviderKt$lambda$749601822$1 extends AbstractC7559F3s implements G0W<PairsHistoryScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$PairsEntryProviderKt$lambda$749601822$1 INSTANCE = new ComposableSingletons$PairsEntryProviderKt$lambda$749601822$1();

    public ComposableSingletons$PairsEntryProviderKt$lambda$749601822$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(PairsHistoryScreenKey pairsHistoryScreenKey, BFM bfm, Integer num) {
        invoke(pairsHistoryScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(PairsHistoryScreenKey pairsHistoryScreenKey, BFM bfm, int i) {
        PairsHistoryScreenKt.PairsHistoryScreen(pairsHistoryScreenKey, null, bfm, AnonymousClass006.A0E(pairsHistoryScreenKey, i), 2);
    }
}
