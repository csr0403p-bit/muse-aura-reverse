package com.facebook.aura.partners.wearables.entries;

import X.BFM;
import X.C3cG;
import X.C5rn;
import X.C7384Etj;
import X.G0U;
import X.G0W;
import com.facebook.aura.navigation.AuraNavEntryProvider;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.BottomSheetSceneStrategy;
import com.facebook.aura.navigation.entries.AuraTransitionsKt;
import com.facebook.aura.navigation.key.WearablesLinkingBottomSheetKey;
import com.facebook.aura.navigation.key.WearablesLinkingFullScreenKey;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class WearablesLinkingEntryProvider implements AuraNavEntryProvider {
    public static final int $stable = 0;
    public static final WearablesLinkingEntryProvider INSTANCE = new WearablesLinkingEntryProvider();

    @Override // com.facebook.aura.navigation.AuraNavEntryProvider
    public void provideEntry(C5rn<AuraNavKey> c5rn) {
        C7384Etj.A0Y(c5rn, 0);
        final Map<String, Object> map = AuraTransitionsKt.pushTransitionMetadata;
        G0W<WearablesLinkingFullScreenKey, BFM, Integer, Unit> g0w = ComposableSingletons$WearablesLinkingEntryProviderKt.f222lambda$1371265886;
        c5rn.A00(new G0U<WearablesLinkingFullScreenKey, Object>() { // from class: com.facebook.aura.partners.wearables.entries.WearablesLinkingEntryProvider$provideEntry$$inlined$entry$default$1
            @Override // X.G0U
            public final Object invoke(WearablesLinkingFullScreenKey wearablesLinkingFullScreenKey) {
                return wearablesLinkingFullScreenKey.toString();
            }
        }, new G0U<WearablesLinkingFullScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.partners.wearables.entries.WearablesLinkingEntryProvider$provideEntry$$inlined$entry$default$2
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(WearablesLinkingFullScreenKey wearablesLinkingFullScreenKey) {
                return map;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(WearablesLinkingFullScreenKey wearablesLinkingFullScreenKey) {
                return map;
            }
        }, g0w, C3cG.A0x(WearablesLinkingFullScreenKey.class));
        final Map<String, Object> mapBottomSheet = BottomSheetSceneStrategy.Companion.bottomSheet(true, true, false);
        G0W<WearablesLinkingBottomSheetKey, BFM, Integer, Unit> g0w2 = ComposableSingletons$WearablesLinkingEntryProviderKt.f223lambda$827504462;
        c5rn.A00(new G0U<WearablesLinkingBottomSheetKey, Object>() { // from class: com.facebook.aura.partners.wearables.entries.WearablesLinkingEntryProvider$provideEntry$$inlined$entry$default$3
            @Override // X.G0U
            public final Object invoke(WearablesLinkingBottomSheetKey wearablesLinkingBottomSheetKey) {
                return wearablesLinkingBottomSheetKey.toString();
            }
        }, new G0U<WearablesLinkingBottomSheetKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.partners.wearables.entries.WearablesLinkingEntryProvider$provideEntry$$inlined$entry$default$4
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(WearablesLinkingBottomSheetKey wearablesLinkingBottomSheetKey) {
                return mapBottomSheet;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(WearablesLinkingBottomSheetKey wearablesLinkingBottomSheetKey) {
                return mapBottomSheet;
            }
        }, g0w2, C3cG.A0x(WearablesLinkingBottomSheetKey.class));
    }
}
