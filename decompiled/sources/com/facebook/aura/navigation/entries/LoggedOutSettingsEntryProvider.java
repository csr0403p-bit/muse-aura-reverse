package com.facebook.aura.navigation.entries;

import X.BFM;
import X.C3cG;
import X.C5rn;
import X.G0U;
import X.G0W;
import com.facebook.aura.navigation.AuraLoggedOutNavEntryProvider;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.key.AuraMCDebugScreenKey;
import com.facebook.aura.navigation.key.LoggedOutContactSupportScreenKey;
import com.facebook.aura.navigation.key.LoggedOutHelpSupportScreenKey;
import com.facebook.aura.navigation.key.LoggedOutInternalSettingsScreenKey;
import com.facebook.aura.navigation.key.LoggedOutLegalSafetyScreenKey;
import com.facebook.aura.navigation.key.LoggedOutLegalWebPageScreenKey;
import com.facebook.aura.navigation.key.LoggedOutSettingsListScreenKey;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class LoggedOutSettingsEntryProvider implements AuraLoggedOutNavEntryProvider {
    public static final int $stable = 0;
    public static final LoggedOutSettingsEntryProvider INSTANCE = new LoggedOutSettingsEntryProvider();

    @Override // com.facebook.aura.navigation.AuraLoggedOutNavEntryProvider
    public void provideEntry(C5rn<AuraNavKey> c5rn) {
        final Map mapA0o = C3cG.A0o(c5rn);
        G0W<LoggedOutSettingsListScreenKey, BFM, Integer, Unit> g0w = ComposableSingletons$LoggedOutSettingsEntryProviderKt.f149lambda$99991533;
        c5rn.A00(new G0U<LoggedOutSettingsListScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.LoggedOutSettingsEntryProvider$provideEntry$$inlined$entry$default$1
            @Override // X.G0U
            public final Object invoke(LoggedOutSettingsListScreenKey loggedOutSettingsListScreenKey) {
                return loggedOutSettingsListScreenKey.toString();
            }
        }, new G0U<LoggedOutSettingsListScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.LoggedOutSettingsEntryProvider$provideEntry$$inlined$entry$default$2
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(LoggedOutSettingsListScreenKey loggedOutSettingsListScreenKey) {
                return mapA0o;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(LoggedOutSettingsListScreenKey loggedOutSettingsListScreenKey) {
                return mapA0o;
            }
        }, g0w, C3cG.A0x(LoggedOutSettingsListScreenKey.class));
        G0W<LoggedOutInternalSettingsScreenKey, BFM, Integer, Unit> g0w2 = ComposableSingletons$LoggedOutSettingsEntryProviderKt.lambda$1644143259;
        c5rn.A00(new G0U<LoggedOutInternalSettingsScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.LoggedOutSettingsEntryProvider$provideEntry$$inlined$entry$default$3
            @Override // X.G0U
            public final Object invoke(LoggedOutInternalSettingsScreenKey loggedOutInternalSettingsScreenKey) {
                return loggedOutInternalSettingsScreenKey.toString();
            }
        }, new G0U<LoggedOutInternalSettingsScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.LoggedOutSettingsEntryProvider$provideEntry$$inlined$entry$default$4
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(LoggedOutInternalSettingsScreenKey loggedOutInternalSettingsScreenKey) {
                return mapA0o;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(LoggedOutInternalSettingsScreenKey loggedOutInternalSettingsScreenKey) {
                return mapA0o;
            }
        }, g0w2, C3cG.A0x(LoggedOutInternalSettingsScreenKey.class));
        G0W<AuraMCDebugScreenKey, BFM, Integer, Unit> g0w3 = ComposableSingletons$LoggedOutSettingsEntryProviderKt.f148lambda$1560363448;
        c5rn.A00(new G0U<AuraMCDebugScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.LoggedOutSettingsEntryProvider$provideEntry$$inlined$entry$default$5
            @Override // X.G0U
            public final Object invoke(AuraMCDebugScreenKey auraMCDebugScreenKey) {
                return auraMCDebugScreenKey.toString();
            }
        }, new G0U<AuraMCDebugScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.LoggedOutSettingsEntryProvider$provideEntry$$inlined$entry$default$6
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(AuraMCDebugScreenKey auraMCDebugScreenKey) {
                return mapA0o;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(AuraMCDebugScreenKey auraMCDebugScreenKey) {
                return mapA0o;
            }
        }, g0w3, C3cG.A0x(AuraMCDebugScreenKey.class));
        G0W<LoggedOutHelpSupportScreenKey, BFM, Integer, Unit> g0w4 = ComposableSingletons$LoggedOutSettingsEntryProviderKt.lambda$275457701;
        c5rn.A00(new G0U<LoggedOutHelpSupportScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.LoggedOutSettingsEntryProvider$provideEntry$$inlined$entry$default$7
            @Override // X.G0U
            public final Object invoke(LoggedOutHelpSupportScreenKey loggedOutHelpSupportScreenKey) {
                return loggedOutHelpSupportScreenKey.toString();
            }
        }, new G0U<LoggedOutHelpSupportScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.LoggedOutSettingsEntryProvider$provideEntry$$inlined$entry$default$8
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(LoggedOutHelpSupportScreenKey loggedOutHelpSupportScreenKey) {
                return mapA0o;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(LoggedOutHelpSupportScreenKey loggedOutHelpSupportScreenKey) {
                return mapA0o;
            }
        }, g0w4, C3cG.A0x(LoggedOutHelpSupportScreenKey.class));
        G0W<LoggedOutContactSupportScreenKey, BFM, Integer, Unit> g0w5 = ComposableSingletons$LoggedOutSettingsEntryProviderKt.lambda$1776465927;
        c5rn.A00(new G0U<LoggedOutContactSupportScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.LoggedOutSettingsEntryProvider$provideEntry$$inlined$entry$default$9
            @Override // X.G0U
            public final Object invoke(LoggedOutContactSupportScreenKey loggedOutContactSupportScreenKey) {
                return loggedOutContactSupportScreenKey.toString();
            }
        }, new G0U<LoggedOutContactSupportScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.LoggedOutSettingsEntryProvider$provideEntry$$inlined$entry$default$10
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(LoggedOutContactSupportScreenKey loggedOutContactSupportScreenKey) {
                return mapA0o;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(LoggedOutContactSupportScreenKey loggedOutContactSupportScreenKey) {
                return mapA0o;
            }
        }, g0w5, C3cG.A0x(LoggedOutContactSupportScreenKey.class));
        G0W<LoggedOutLegalSafetyScreenKey, BFM, Integer, Unit> g0w6 = ComposableSingletons$LoggedOutSettingsEntryProviderKt.lambda$1244233728;
        c5rn.A00(new G0U<LoggedOutLegalSafetyScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.LoggedOutSettingsEntryProvider$provideEntry$$inlined$entry$default$11
            @Override // X.G0U
            public final Object invoke(LoggedOutLegalSafetyScreenKey loggedOutLegalSafetyScreenKey) {
                return loggedOutLegalSafetyScreenKey.toString();
            }
        }, new G0U<LoggedOutLegalSafetyScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.LoggedOutSettingsEntryProvider$provideEntry$$inlined$entry$default$12
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(LoggedOutLegalSafetyScreenKey loggedOutLegalSafetyScreenKey) {
                return mapA0o;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(LoggedOutLegalSafetyScreenKey loggedOutLegalSafetyScreenKey) {
                return mapA0o;
            }
        }, g0w6, C3cG.A0x(LoggedOutLegalSafetyScreenKey.class));
        G0W<LoggedOutLegalWebPageScreenKey, BFM, Integer, Unit> g0w7 = ComposableSingletons$LoggedOutSettingsEntryProviderKt.lambda$2106483584;
        c5rn.A00(new G0U<LoggedOutLegalWebPageScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.LoggedOutSettingsEntryProvider$provideEntry$$inlined$entry$default$13
            @Override // X.G0U
            public final Object invoke(LoggedOutLegalWebPageScreenKey loggedOutLegalWebPageScreenKey) {
                return loggedOutLegalWebPageScreenKey.toString();
            }
        }, new G0U<LoggedOutLegalWebPageScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.LoggedOutSettingsEntryProvider$provideEntry$$inlined$entry$default$14
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(LoggedOutLegalWebPageScreenKey loggedOutLegalWebPageScreenKey) {
                return mapA0o;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(LoggedOutLegalWebPageScreenKey loggedOutLegalWebPageScreenKey) {
                return mapA0o;
            }
        }, g0w7, C3cG.A0x(LoggedOutLegalWebPageScreenKey.class));
    }
}
