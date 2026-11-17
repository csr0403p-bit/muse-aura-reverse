package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.G0W;
import com.facebook.aura.navigation.key.ConnectionsModalScreenKey;
import com.facebook.aura.pairs.ConnectionsTabScreenKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class ComposableSingletons$PairsEntryProviderKt$lambda$306242617$1 extends AbstractC7559F3s implements G0W<ConnectionsModalScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$PairsEntryProviderKt$lambda$306242617$1 INSTANCE = new ComposableSingletons$PairsEntryProviderKt$lambda$306242617$1();

    public ComposableSingletons$PairsEntryProviderKt$lambda$306242617$1() {
        super(3);
    }

    public final void invoke(ConnectionsModalScreenKey connectionsModalScreenKey, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
            ConnectionsTabScreenKt.ConnectionsTabScreen(null, false, bfm, 48, 1);
        } else {
            bfm.Afo();
        }
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(ConnectionsModalScreenKey connectionsModalScreenKey, BFM bfm, Integer num) {
        invoke(connectionsModalScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
