package com.facebook.aura.navigation.entries;

import X.BFM;
import X.C3cG;
import X.C5rn;
import X.G0U;
import X.G0W;
import com.facebook.aura.navigation.AuraNavEntryProvider;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.key.ConnectorPermissionsScreenKey;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class ConnectorPermissionsEntryProvider implements AuraNavEntryProvider {
    public static final int $stable = 0;
    public static final ConnectorPermissionsEntryProvider INSTANCE = new ConnectorPermissionsEntryProvider();

    @Override // com.facebook.aura.navigation.AuraNavEntryProvider
    public void provideEntry(C5rn<AuraNavKey> c5rn) {
        final Map mapA0o = C3cG.A0o(c5rn);
        G0W<ConnectorPermissionsScreenKey, BFM, Integer, Unit> g0w = ComposableSingletons$ConnectorPermissionsEntryProviderKt.lambda$1083576779;
        c5rn.A00(new G0U<ConnectorPermissionsScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.ConnectorPermissionsEntryProvider$provideEntry$$inlined$entry$default$1
            @Override // X.G0U
            public final Object invoke(ConnectorPermissionsScreenKey connectorPermissionsScreenKey) {
                return connectorPermissionsScreenKey.toString();
            }
        }, new G0U<ConnectorPermissionsScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.ConnectorPermissionsEntryProvider$provideEntry$$inlined$entry$default$2
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(ConnectorPermissionsScreenKey connectorPermissionsScreenKey) {
                return mapA0o;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(ConnectorPermissionsScreenKey connectorPermissionsScreenKey) {
                return mapA0o;
            }
        }, g0w, C3cG.A0x(ConnectorPermissionsScreenKey.class));
    }
}
