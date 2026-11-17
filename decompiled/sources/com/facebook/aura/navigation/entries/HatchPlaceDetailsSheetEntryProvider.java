package com.facebook.aura.navigation.entries;

import X.BFM;
import X.C3cG;
import X.C5rn;
import X.C7384Etj;
import X.G0U;
import X.G0W;
import com.facebook.aura.navigation.AuraNavEntryProvider;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.BottomSheetSceneStrategy;
import com.facebook.aura.navigation.key.HatchPlaceDetailsSheetKey;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class HatchPlaceDetailsSheetEntryProvider implements AuraNavEntryProvider {
    public static final int $stable = 0;
    public static final HatchPlaceDetailsSheetEntryProvider INSTANCE = new HatchPlaceDetailsSheetEntryProvider();

    @Override // com.facebook.aura.navigation.AuraNavEntryProvider
    public void provideEntry(C5rn<AuraNavKey> c5rn) {
        C7384Etj.A0Y(c5rn, 0);
        final Map<String, Object> mapBottomSheet = BottomSheetSceneStrategy.Companion.bottomSheet(true, false, false);
        G0W<HatchPlaceDetailsSheetKey, BFM, Integer, Unit> g0w = ComposableSingletons$HatchPlaceDetailsSheetEntryProviderKt.lambda$354320166;
        c5rn.A00(new G0U<HatchPlaceDetailsSheetKey, Object>() { // from class: com.facebook.aura.navigation.entries.HatchPlaceDetailsSheetEntryProvider$provideEntry$$inlined$entry$default$1
            @Override // X.G0U
            public final Object invoke(HatchPlaceDetailsSheetKey hatchPlaceDetailsSheetKey) {
                return hatchPlaceDetailsSheetKey.toString();
            }
        }, new G0U<HatchPlaceDetailsSheetKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.HatchPlaceDetailsSheetEntryProvider$provideEntry$$inlined$entry$default$2
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(HatchPlaceDetailsSheetKey hatchPlaceDetailsSheetKey) {
                return mapBottomSheet;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(HatchPlaceDetailsSheetKey hatchPlaceDetailsSheetKey) {
                return mapBottomSheet;
            }
        }, g0w, C3cG.A0x(HatchPlaceDetailsSheetKey.class));
    }
}
