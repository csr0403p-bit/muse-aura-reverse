package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass006;
import X.BFM;
import X.G0W;
import com.facebook.aura.navigation.key.ConnectionsReceivedItemSheetKey;
import com.facebook.aura.pairs.ConnectionsReceivedItemScreenKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class ComposableSingletons$PairsEntryProviderKt$lambda$261713529$1 extends AbstractC7559F3s implements G0W<ConnectionsReceivedItemSheetKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$PairsEntryProviderKt$lambda$261713529$1 INSTANCE = new ComposableSingletons$PairsEntryProviderKt$lambda$261713529$1();

    public ComposableSingletons$PairsEntryProviderKt$lambda$261713529$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(ConnectionsReceivedItemSheetKey connectionsReceivedItemSheetKey, BFM bfm, Integer num) {
        invoke(connectionsReceivedItemSheetKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(ConnectionsReceivedItemSheetKey connectionsReceivedItemSheetKey, BFM bfm, int i) {
        ConnectionsReceivedItemScreenKt.ConnectionsReceivedItemScreen(connectionsReceivedItemSheetKey, null, bfm, AnonymousClass006.A0E(connectionsReceivedItemSheetKey, i), 2);
    }
}
