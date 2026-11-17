package com.facebook.aura.navigation.entries;

import X.BFM;
import X.C3cG;
import X.C5rn;
import X.G0U;
import X.G0W;
import com.facebook.aura.navigation.AuraNavEntryProvider;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.key.WalletSettingsScreenKey;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class WalletSettingsEntryProvider implements AuraNavEntryProvider {
    public static final int $stable = 0;
    public static final WalletSettingsEntryProvider INSTANCE = new WalletSettingsEntryProvider();

    @Override // com.facebook.aura.navigation.AuraNavEntryProvider
    public void provideEntry(C5rn<AuraNavKey> c5rn) {
        final Map mapA0o = C3cG.A0o(c5rn);
        G0W<WalletSettingsScreenKey, BFM, Integer, Unit> g0w = ComposableSingletons$WalletSettingsEntryProviderKt.f195lambda$1938767974;
        c5rn.A00(new G0U<WalletSettingsScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.WalletSettingsEntryProvider$provideEntry$$inlined$entry$default$1
            @Override // X.G0U
            public final Object invoke(WalletSettingsScreenKey walletSettingsScreenKey) {
                return walletSettingsScreenKey.toString();
            }
        }, new G0U<WalletSettingsScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.WalletSettingsEntryProvider$provideEntry$$inlined$entry$default$2
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(WalletSettingsScreenKey walletSettingsScreenKey) {
                return mapA0o;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(WalletSettingsScreenKey walletSettingsScreenKey) {
                return mapA0o;
            }
        }, g0w, C3cG.A0x(WalletSettingsScreenKey.class));
    }
}
