package com.facebook.aura.navigation.entries;

import X.BFM;
import X.C3cG;
import X.C5rn;
import X.C7384Etj;
import X.G0U;
import X.G0W;
import com.facebook.aura.navigation.AuraNavEntryProvider;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.key.LocalBrowserScreenKey;
import com.facebook.aura.navigation.key.LocalBrowserSettingsScreenKey;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes6.dex */
public final class LocalBrowserEntryProvider implements AuraNavEntryProvider {
    public static final int $stable = 0;
    public static final LocalBrowserEntryProvider INSTANCE = new LocalBrowserEntryProvider();

    @Override // com.facebook.aura.navigation.AuraNavEntryProvider
    public void provideEntry(C5rn<AuraNavKey> c5rn) {
        C7384Etj.A0Y(c5rn, 0);
        final Map<String, Object> map = LocalBrowserEntryProviderKt.localBrowserMetadata;
        G0W<LocalBrowserScreenKey, BFM, Integer, Unit> g0w = ComposableSingletons$LocalBrowserEntryProviderKt.f145lambda$750974563;
        c5rn.A00(new G0U<LocalBrowserScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.LocalBrowserEntryProvider$provideEntry$$inlined$entry$default$1
            @Override // X.G0U
            public final Object invoke(LocalBrowserScreenKey localBrowserScreenKey) {
                return localBrowserScreenKey.toString();
            }
        }, new G0U<LocalBrowserScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.LocalBrowserEntryProvider$provideEntry$$inlined$entry$default$2
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(LocalBrowserScreenKey localBrowserScreenKey) {
                return map;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(LocalBrowserScreenKey localBrowserScreenKey) {
                return map;
            }
        }, g0w, C3cG.A0x(LocalBrowserScreenKey.class));
        final Map<String, Object> map2 = AuraTransitionsKt.pushTransitionMetadata;
        G0W<LocalBrowserSettingsScreenKey, BFM, Integer, Unit> g0w2 = ComposableSingletons$LocalBrowserEntryProviderKt.f144lambda$451061815;
        c5rn.A00(new G0U<LocalBrowserSettingsScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.LocalBrowserEntryProvider$provideEntry$$inlined$entry$default$3
            @Override // X.G0U
            public final Object invoke(LocalBrowserSettingsScreenKey localBrowserSettingsScreenKey) {
                return localBrowserSettingsScreenKey.toString();
            }
        }, new G0U<LocalBrowserSettingsScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.LocalBrowserEntryProvider$provideEntry$$inlined$entry$default$4
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(LocalBrowserSettingsScreenKey localBrowserSettingsScreenKey) {
                return map2;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(LocalBrowserSettingsScreenKey localBrowserSettingsScreenKey) {
                return map2;
            }
        }, g0w2, C3cG.A0x(LocalBrowserSettingsScreenKey.class));
    }
}
