package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass006;
import X.BFM;
import X.G0W;
import com.facebook.aura.navigation.key.ConnectionsSheetKey;
import com.facebook.aura.pairs.ConnectionsSheetScreenKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class ComposableSingletons$PairsEntryProviderKt$lambda$1556410011$1 extends AbstractC7559F3s implements G0W<ConnectionsSheetKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$PairsEntryProviderKt$lambda$1556410011$1 INSTANCE = new ComposableSingletons$PairsEntryProviderKt$lambda$1556410011$1();

    public ComposableSingletons$PairsEntryProviderKt$lambda$1556410011$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(ConnectionsSheetKey connectionsSheetKey, BFM bfm, Integer num) {
        invoke(connectionsSheetKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(ConnectionsSheetKey connectionsSheetKey, BFM bfm, int i) {
        ConnectionsSheetScreenKt.ConnectionsSheetScreen(connectionsSheetKey, null, bfm, AnonymousClass006.A0E(connectionsSheetKey, i), 2);
    }
}
