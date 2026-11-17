package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass006;
import X.BFM;
import X.G0W;
import com.facebook.aura.navigation.key.ConnectionsAddPermissionSheetKey;
import com.facebook.aura.pairs.ConnectionsAddPermissionScreenKt;
import kotlin.Unit;

/* renamed from: com.facebook.aura.navigation.entries.ComposableSingletons$PairsEntryProviderKt$lambda$-1862129917$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$PairsEntryProviderKt$lambda$1862129917$1 extends AbstractC7559F3s implements G0W<ConnectionsAddPermissionSheetKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$PairsEntryProviderKt$lambda$1862129917$1 INSTANCE = new ComposableSingletons$PairsEntryProviderKt$lambda$1862129917$1();

    public ComposableSingletons$PairsEntryProviderKt$lambda$1862129917$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(ConnectionsAddPermissionSheetKey connectionsAddPermissionSheetKey, BFM bfm, Integer num) {
        invoke(connectionsAddPermissionSheetKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(ConnectionsAddPermissionSheetKey connectionsAddPermissionSheetKey, BFM bfm, int i) {
        ConnectionsAddPermissionScreenKt.ConnectionsAddPermissionScreen(connectionsAddPermissionSheetKey, null, bfm, AnonymousClass006.A0E(connectionsAddPermissionSheetKey, i), 2);
    }
}
