package com.facebook.aura.navigation.entries;

import X.BFM;
import X.C3cG;
import X.C5rn;
import X.C60P;
import X.G0U;
import X.G0W;
import com.facebook.aura.navigation.AuraNavEntryProvider;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.key.AuraActivationSubscriptionScreenKey;
import com.facebook.aura.navigation.key.AuraSubscriptionSheetKey;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class AuraSubscriptionSheetEntryProvider implements AuraNavEntryProvider {
    public static final int $stable = 0;
    public static final AuraSubscriptionSheetEntryProvider INSTANCE = new AuraSubscriptionSheetEntryProvider();

    @Override // com.facebook.aura.navigation.AuraNavEntryProvider
    public void provideEntry(C5rn<AuraNavKey> c5rn) {
        final Map mapA1S = C60P.A1S(c5rn);
        G0W<AuraSubscriptionSheetKey, BFM, Integer, Unit> g0w = ComposableSingletons$AuraSubscriptionSheetEntryProviderKt.lambda$1269744697;
        c5rn.A00(new G0U<AuraSubscriptionSheetKey, Object>() { // from class: com.facebook.aura.navigation.entries.AuraSubscriptionSheetEntryProvider$provideEntry$$inlined$entry$default$1
            @Override // X.G0U
            public final Object invoke(AuraSubscriptionSheetKey auraSubscriptionSheetKey) {
                return auraSubscriptionSheetKey.toString();
            }
        }, new G0U<AuraSubscriptionSheetKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.AuraSubscriptionSheetEntryProvider$provideEntry$$inlined$entry$default$2
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(AuraSubscriptionSheetKey auraSubscriptionSheetKey) {
                return mapA1S;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(AuraSubscriptionSheetKey auraSubscriptionSheetKey) {
                return mapA1S;
            }
        }, g0w, C3cG.A0x(AuraSubscriptionSheetKey.class));
        final Map<String, Object> map = AuraTransitionsKt.pushTransitionMetadata;
        G0W<AuraActivationSubscriptionScreenKey, BFM, Integer, Unit> g0w2 = ComposableSingletons$AuraSubscriptionSheetEntryProviderKt.lambda$594398715;
        c5rn.A00(new G0U<AuraActivationSubscriptionScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.AuraSubscriptionSheetEntryProvider$provideEntry$$inlined$entry$default$3
            @Override // X.G0U
            public final Object invoke(AuraActivationSubscriptionScreenKey auraActivationSubscriptionScreenKey) {
                return auraActivationSubscriptionScreenKey.toString();
            }
        }, new G0U<AuraActivationSubscriptionScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.AuraSubscriptionSheetEntryProvider$provideEntry$$inlined$entry$default$4
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(AuraActivationSubscriptionScreenKey auraActivationSubscriptionScreenKey) {
                return map;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(AuraActivationSubscriptionScreenKey auraActivationSubscriptionScreenKey) {
                return map;
            }
        }, g0w2, C3cG.A0x(AuraActivationSubscriptionScreenKey.class));
    }
}
