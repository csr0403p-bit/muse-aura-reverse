package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFM;
import X.C7384Etj;
import X.G0W;
import com.facebook.aura.navigation.key.HatchConnectorSearchScreenKey;
import com.facebook.aura.skills.view.HatchConnectorSearchScreenKt;
import kotlin.Unit;

/* renamed from: com.facebook.aura.navigation.entries.ComposableSingletons$ConnectorCatalogEntryProviderKt$lambda$-1640953285$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$ConnectorCatalogEntryProviderKt$lambda$1640953285$1 extends AbstractC7559F3s implements G0W<HatchConnectorSearchScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$ConnectorCatalogEntryProviderKt$lambda$1640953285$1 INSTANCE = new ComposableSingletons$ConnectorCatalogEntryProviderKt$lambda$1640953285$1();

    public ComposableSingletons$ConnectorCatalogEntryProviderKt$lambda$1640953285$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(HatchConnectorSearchScreenKey hatchConnectorSearchScreenKey, BFM bfm, Integer num) {
        invoke(hatchConnectorSearchScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(HatchConnectorSearchScreenKey hatchConnectorSearchScreenKey, BFM bfm, int i) {
        C7384Etj.A0Y(hatchConnectorSearchScreenKey, 0);
        HatchConnectorSearchScreenKt.HatchConnectorSearchScreen(hatchConnectorSearchScreenKey.categoryId, hatchConnectorSearchScreenKey.deviceOnly, null, bfm, 0, 4);
    }
}
