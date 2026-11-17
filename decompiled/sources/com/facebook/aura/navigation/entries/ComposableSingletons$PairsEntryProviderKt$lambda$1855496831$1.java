package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass006;
import X.BFM;
import X.G0W;
import com.facebook.aura.navigation.key.ConnectionsShareStatusSheetKey;
import com.facebook.aura.pairs.ConnectionsShareStatusScreenKt;
import kotlin.Unit;

/* renamed from: com.facebook.aura.navigation.entries.ComposableSingletons$PairsEntryProviderKt$lambda$-1855496831$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$PairsEntryProviderKt$lambda$1855496831$1 extends AbstractC7559F3s implements G0W<ConnectionsShareStatusSheetKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$PairsEntryProviderKt$lambda$1855496831$1 INSTANCE = new ComposableSingletons$PairsEntryProviderKt$lambda$1855496831$1();

    public ComposableSingletons$PairsEntryProviderKt$lambda$1855496831$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(ConnectionsShareStatusSheetKey connectionsShareStatusSheetKey, BFM bfm, Integer num) {
        invoke(connectionsShareStatusSheetKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(ConnectionsShareStatusSheetKey connectionsShareStatusSheetKey, BFM bfm, int i) {
        ConnectionsShareStatusScreenKt.ConnectionsShareStatusScreen(connectionsShareStatusSheetKey, null, bfm, AnonymousClass006.A0E(connectionsShareStatusSheetKey, i), 2);
    }
}
