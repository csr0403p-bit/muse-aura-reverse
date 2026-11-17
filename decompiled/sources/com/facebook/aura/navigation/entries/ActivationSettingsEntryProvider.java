package com.facebook.aura.navigation.entries;

import X.BFM;
import X.C3cG;
import X.C5rn;
import X.G0U;
import X.G0W;
import com.facebook.aura.navigation.AuraNavEntryProvider;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.key.ActivationDataPrivacySettingsScreenKey;
import com.facebook.aura.navigation.key.ActivationHelpSupportSettingsScreenKey;
import com.facebook.aura.navigation.key.ActivationLegalSafetySettingsScreenKey;
import com.facebook.aura.navigation.key.ActivationSettingsScreenKey;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class ActivationSettingsEntryProvider implements AuraNavEntryProvider {
    public static final int $stable = 0;
    public static final ActivationSettingsEntryProvider INSTANCE = new ActivationSettingsEntryProvider();

    @Override // com.facebook.aura.navigation.AuraNavEntryProvider
    public void provideEntry(C5rn<AuraNavKey> c5rn) {
        final Map mapA0o = C3cG.A0o(c5rn);
        G0W<ActivationSettingsScreenKey, BFM, Integer, Unit> g0w = ComposableSingletons$ActivationSettingsEntryProviderKt.lambda$357074481;
        c5rn.A00(new G0U<ActivationSettingsScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.ActivationSettingsEntryProvider$provideEntry$$inlined$entry$default$1
            @Override // X.G0U
            public final Object invoke(ActivationSettingsScreenKey activationSettingsScreenKey) {
                return activationSettingsScreenKey.toString();
            }
        }, new G0U<ActivationSettingsScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.ActivationSettingsEntryProvider$provideEntry$$inlined$entry$default$2
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(ActivationSettingsScreenKey activationSettingsScreenKey) {
                return mapA0o;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(ActivationSettingsScreenKey activationSettingsScreenKey) {
                return mapA0o;
            }
        }, g0w, C3cG.A0x(ActivationSettingsScreenKey.class));
        G0W<ActivationHelpSupportSettingsScreenKey, BFM, Integer, Unit> g0w2 = ComposableSingletons$ActivationSettingsEntryProviderKt.f86lambda$1118111418;
        c5rn.A00(new G0U<ActivationHelpSupportSettingsScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.ActivationSettingsEntryProvider$provideEntry$$inlined$entry$default$3
            @Override // X.G0U
            public final Object invoke(ActivationHelpSupportSettingsScreenKey activationHelpSupportSettingsScreenKey) {
                return activationHelpSupportSettingsScreenKey.toString();
            }
        }, new G0U<ActivationHelpSupportSettingsScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.ActivationSettingsEntryProvider$provideEntry$$inlined$entry$default$4
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(ActivationHelpSupportSettingsScreenKey activationHelpSupportSettingsScreenKey) {
                return mapA0o;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(ActivationHelpSupportSettingsScreenKey activationHelpSupportSettingsScreenKey) {
                return mapA0o;
            }
        }, g0w2, C3cG.A0x(ActivationHelpSupportSettingsScreenKey.class));
        G0W<ActivationDataPrivacySettingsScreenKey, BFM, Integer, Unit> g0w3 = ComposableSingletons$ActivationSettingsEntryProviderKt.lambda$1885666453;
        c5rn.A00(new G0U<ActivationDataPrivacySettingsScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.ActivationSettingsEntryProvider$provideEntry$$inlined$entry$default$5
            @Override // X.G0U
            public final Object invoke(ActivationDataPrivacySettingsScreenKey activationDataPrivacySettingsScreenKey) {
                return activationDataPrivacySettingsScreenKey.toString();
            }
        }, new G0U<ActivationDataPrivacySettingsScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.ActivationSettingsEntryProvider$provideEntry$$inlined$entry$default$6
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(ActivationDataPrivacySettingsScreenKey activationDataPrivacySettingsScreenKey) {
                return mapA0o;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(ActivationDataPrivacySettingsScreenKey activationDataPrivacySettingsScreenKey) {
                return mapA0o;
            }
        }, g0w3, C3cG.A0x(ActivationDataPrivacySettingsScreenKey.class));
        G0W<ActivationLegalSafetySettingsScreenKey, BFM, Integer, Unit> g0w4 = ComposableSingletons$ActivationSettingsEntryProviderKt.lambda$1285470945;
        c5rn.A00(new G0U<ActivationLegalSafetySettingsScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.ActivationSettingsEntryProvider$provideEntry$$inlined$entry$default$7
            @Override // X.G0U
            public final Object invoke(ActivationLegalSafetySettingsScreenKey activationLegalSafetySettingsScreenKey) {
                return activationLegalSafetySettingsScreenKey.toString();
            }
        }, new G0U<ActivationLegalSafetySettingsScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.ActivationSettingsEntryProvider$provideEntry$$inlined$entry$default$8
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(ActivationLegalSafetySettingsScreenKey activationLegalSafetySettingsScreenKey) {
                return mapA0o;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(ActivationLegalSafetySettingsScreenKey activationLegalSafetySettingsScreenKey) {
                return mapA0o;
            }
        }, g0w4, C3cG.A0x(ActivationLegalSafetySettingsScreenKey.class));
    }
}
