package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFM;
import X.C7384Etj;
import X.G0W;
import com.facebook.aura.navigation.key.HatchConnectorCategoryScreenKey;
import com.facebook.aura.skills.view.HatchConnectorCategoryScreenKt;
import kotlin.Unit;

/* renamed from: com.facebook.aura.navigation.entries.ComposableSingletons$ConnectorCatalogEntryProviderKt$lambda$-717868686$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$ConnectorCatalogEntryProviderKt$lambda$717868686$1 extends AbstractC7559F3s implements G0W<HatchConnectorCategoryScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$ConnectorCatalogEntryProviderKt$lambda$717868686$1 INSTANCE = new ComposableSingletons$ConnectorCatalogEntryProviderKt$lambda$717868686$1();

    public ComposableSingletons$ConnectorCatalogEntryProviderKt$lambda$717868686$1() {
        super(3);
    }

    public final void invoke(HatchConnectorCategoryScreenKey hatchConnectorCategoryScreenKey, BFM bfm, int i) {
        C7384Etj.A0Y(hatchConnectorCategoryScreenKey, 0);
        HatchConnectorCategoryScreenKt.HatchConnectorCategoryScreen(hatchConnectorCategoryScreenKey.categoryId, null, bfm, 0, 2);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(HatchConnectorCategoryScreenKey hatchConnectorCategoryScreenKey, BFM bfm, Integer num) {
        invoke(hatchConnectorCategoryScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
