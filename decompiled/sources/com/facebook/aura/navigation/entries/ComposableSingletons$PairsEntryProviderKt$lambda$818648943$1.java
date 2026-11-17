package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.G0W;
import com.facebook.aura.navigation.key.ConnectionsAddSheetKey;
import com.facebook.aura.pairs.ConnectionsAddScreenKt;
import kotlin.Unit;

/* renamed from: com.facebook.aura.navigation.entries.ComposableSingletons$PairsEntryProviderKt$lambda$-818648943$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$PairsEntryProviderKt$lambda$818648943$1 extends AbstractC7559F3s implements G0W<ConnectionsAddSheetKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$PairsEntryProviderKt$lambda$818648943$1 INSTANCE = new ComposableSingletons$PairsEntryProviderKt$lambda$818648943$1();

    public ComposableSingletons$PairsEntryProviderKt$lambda$818648943$1() {
        super(3);
    }

    public final void invoke(ConnectionsAddSheetKey connectionsAddSheetKey, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
            ConnectionsAddScreenKt.ConnectionsAddScreen(null, bfm, 0, 1);
        } else {
            bfm.Afo();
        }
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(ConnectionsAddSheetKey connectionsAddSheetKey, BFM bfm, Integer num) {
        invoke(connectionsAddSheetKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
