package com.facebook.aura.navigation.entries;

import X.BFM;
import X.C3cG;
import X.C5rn;
import X.C60P;
import X.G0U;
import X.G0W;
import com.facebook.aura.navigation.AuraNavEntryProvider;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.key.LocalConnectorConsentSheetKey;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class LocalConnectorConsentEntryProvider implements AuraNavEntryProvider {
    public static final int $stable = 0;
    public static final LocalConnectorConsentEntryProvider INSTANCE = new LocalConnectorConsentEntryProvider();

    @Override // com.facebook.aura.navigation.AuraNavEntryProvider
    public void provideEntry(C5rn<AuraNavKey> c5rn) {
        final Map mapA1S = C60P.A1S(c5rn);
        G0W<LocalConnectorConsentSheetKey, BFM, Integer, Unit> g0w = ComposableSingletons$LocalConnectorConsentEntryProviderKt.f146lambda$475916105;
        c5rn.A00(new G0U<LocalConnectorConsentSheetKey, Object>() { // from class: com.facebook.aura.navigation.entries.LocalConnectorConsentEntryProvider$provideEntry$$inlined$entry$default$1
            @Override // X.G0U
            public final Object invoke(LocalConnectorConsentSheetKey localConnectorConsentSheetKey) {
                return localConnectorConsentSheetKey.toString();
            }
        }, new G0U<LocalConnectorConsentSheetKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.LocalConnectorConsentEntryProvider$provideEntry$$inlined$entry$default$2
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(LocalConnectorConsentSheetKey localConnectorConsentSheetKey) {
                return mapA1S;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(LocalConnectorConsentSheetKey localConnectorConsentSheetKey) {
                return mapA1S;
            }
        }, g0w, C3cG.A0x(LocalConnectorConsentSheetKey.class));
    }
}
