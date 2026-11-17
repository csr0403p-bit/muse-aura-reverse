package com.facebook.aura.hotels;

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
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class HotelBrowseEntryProvider implements AuraNavEntryProvider {
    public static final int $stable = 0;
    public static final HotelBrowseEntryProvider INSTANCE = new HotelBrowseEntryProvider();

    @Override // com.facebook.aura.navigation.AuraNavEntryProvider
    public void provideEntry(C5rn<AuraNavKey> c5rn) {
        C7384Etj.A0Y(c5rn, 0);
        final Map<String, Object> map = AuraTransitionsKt.pushTransitionMetadata;
        G0W<HotelResultsScreenKey, BFM, Integer, Unit> g0w = ComposableSingletons$HotelBrowseEntryProviderKt.lambda$481864149;
        c5rn.A00(new G0U<HotelResultsScreenKey, Object>() { // from class: com.facebook.aura.hotels.HotelBrowseEntryProvider$provideEntry$$inlined$entry$default$1
            @Override // X.G0U
            public final Object invoke(HotelResultsScreenKey hotelResultsScreenKey) {
                return hotelResultsScreenKey.toString();
            }
        }, new G0U<HotelResultsScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.hotels.HotelBrowseEntryProvider$provideEntry$$inlined$entry$default$2
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(HotelResultsScreenKey hotelResultsScreenKey) {
                return map;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(HotelResultsScreenKey hotelResultsScreenKey) {
                return map;
            }
        }, g0w, C3cG.A0x(HotelResultsScreenKey.class));
        final Map<String, Object> map2 = AuraTransitionsKt.cardMorphTransitionMetadata;
        G0W<HotelSelectionSheetKey, BFM, Integer, Unit> g0w2 = ComposableSingletons$HotelBrowseEntryProviderKt.f66lambda$1800816511;
        c5rn.A00(new G0U<HotelSelectionSheetKey, Object>() { // from class: com.facebook.aura.hotels.HotelBrowseEntryProvider$provideEntry$$inlined$entry$default$3
            @Override // X.G0U
            public final Object invoke(HotelSelectionSheetKey hotelSelectionSheetKey) {
                return hotelSelectionSheetKey.toString();
            }
        }, new G0U<HotelSelectionSheetKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.hotels.HotelBrowseEntryProvider$provideEntry$$inlined$entry$default$4
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(HotelSelectionSheetKey hotelSelectionSheetKey) {
                return map2;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(HotelSelectionSheetKey hotelSelectionSheetKey) {
                return map2;
            }
        }, g0w2, C3cG.A0x(HotelSelectionSheetKey.class));
        final Map<String, Object> mapBottomSheet = BottomSheetSceneStrategy.Companion.bottomSheet(true, true, false);
        G0W<HotelPolicySheetKey, BFM, Integer, Unit> g0w3 = ComposableSingletons$HotelBrowseEntryProviderKt.f67lambda$1989849688;
        c5rn.A00(new G0U<HotelPolicySheetKey, Object>() { // from class: com.facebook.aura.hotels.HotelBrowseEntryProvider$provideEntry$$inlined$entry$default$5
            @Override // X.G0U
            public final Object invoke(HotelPolicySheetKey hotelPolicySheetKey) {
                return hotelPolicySheetKey.toString();
            }
        }, new G0U<HotelPolicySheetKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.hotels.HotelBrowseEntryProvider$provideEntry$$inlined$entry$default$6
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(HotelPolicySheetKey hotelPolicySheetKey) {
                return mapBottomSheet;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(HotelPolicySheetKey hotelPolicySheetKey) {
                return mapBottomSheet;
            }
        }, g0w3, C3cG.A0x(HotelPolicySheetKey.class));
    }
}
