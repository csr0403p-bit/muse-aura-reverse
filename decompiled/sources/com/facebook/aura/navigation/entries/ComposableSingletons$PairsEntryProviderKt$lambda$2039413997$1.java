package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass006;
import X.BFM;
import X.G0W;
import com.facebook.aura.navigation.key.ConnectionsShareSheetKey;
import com.facebook.aura.pairs.ConnectionsShareScreenKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class ComposableSingletons$PairsEntryProviderKt$lambda$2039413997$1 extends AbstractC7559F3s implements G0W<ConnectionsShareSheetKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$PairsEntryProviderKt$lambda$2039413997$1 INSTANCE = new ComposableSingletons$PairsEntryProviderKt$lambda$2039413997$1();

    public ComposableSingletons$PairsEntryProviderKt$lambda$2039413997$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(ConnectionsShareSheetKey connectionsShareSheetKey, BFM bfm, Integer num) {
        invoke(connectionsShareSheetKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(ConnectionsShareSheetKey connectionsShareSheetKey, BFM bfm, int i) {
        ConnectionsShareScreenKt.ConnectionsShareScreen(connectionsShareSheetKey, null, bfm, AnonymousClass006.A0E(connectionsShareSheetKey, i), 2);
    }
}
