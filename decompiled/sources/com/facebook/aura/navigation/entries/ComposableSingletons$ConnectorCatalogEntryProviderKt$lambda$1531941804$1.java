package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.G0W;
import com.facebook.aura.navigation.key.HatchConnectorCatalogScreenKey;
import com.facebook.aura.skills.view.HatchConnectorCatalogScreenKt;
import kotlin.Unit;

/* renamed from: com.facebook.aura.navigation.entries.ComposableSingletons$ConnectorCatalogEntryProviderKt$lambda$-1531941804$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$ConnectorCatalogEntryProviderKt$lambda$1531941804$1 extends AbstractC7559F3s implements G0W<HatchConnectorCatalogScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$ConnectorCatalogEntryProviderKt$lambda$1531941804$1 INSTANCE = new ComposableSingletons$ConnectorCatalogEntryProviderKt$lambda$1531941804$1();

    public ComposableSingletons$ConnectorCatalogEntryProviderKt$lambda$1531941804$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(HatchConnectorCatalogScreenKey hatchConnectorCatalogScreenKey, BFM bfm, Integer num) {
        invoke(hatchConnectorCatalogScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(HatchConnectorCatalogScreenKey hatchConnectorCatalogScreenKey, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
            HatchConnectorCatalogScreenKt.HatchConnectorCatalogScreen(null, bfm, 0, 1);
        } else {
            bfm.Afo();
        }
    }
}
