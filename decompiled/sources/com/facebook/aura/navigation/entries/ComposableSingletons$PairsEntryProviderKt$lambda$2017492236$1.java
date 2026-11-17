package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass006;
import X.BFM;
import X.G0W;
import com.facebook.aura.navigation.key.PeerGoalScreenKey;
import com.facebook.aura.pairs.SharedGoalScreenKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class ComposableSingletons$PairsEntryProviderKt$lambda$2017492236$1 extends AbstractC7559F3s implements G0W<PeerGoalScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$PairsEntryProviderKt$lambda$2017492236$1 INSTANCE = new ComposableSingletons$PairsEntryProviderKt$lambda$2017492236$1();

    public ComposableSingletons$PairsEntryProviderKt$lambda$2017492236$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(PeerGoalScreenKey peerGoalScreenKey, BFM bfm, Integer num) {
        invoke(peerGoalScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(PeerGoalScreenKey peerGoalScreenKey, BFM bfm, int i) {
        SharedGoalScreenKt.SharedGoalScreen(peerGoalScreenKey, null, bfm, AnonymousClass006.A0E(peerGoalScreenKey, i), 2);
    }
}
