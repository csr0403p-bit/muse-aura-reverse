package com.facebook.aura.devices.entries;

import X.AGH;
import X.AnonymousClass006;
import X.BFM;
import X.C3cG;
import X.C5rn;
import X.C7384Etj;
import X.G0U;
import X.G0W;
import com.facebook.aura.navigation.AuraNavEntryProvider;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.BottomSheetSceneStrategy;
import com.facebook.aura.navigation.SharedViewModelStoreNavEntryDecorator;
import com.facebook.aura.navigation.entries.ConnectedDevicesEntryProviderKt;
import com.facebook.aura.navigation.key.HatchLinkActivePairingSheetKey;
import com.facebook.aura.navigation.key.HatchLinkPairingSheetKey;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class HatchLinkPairingSheetEntryProvider implements AuraNavEntryProvider {
    public static final int $stable = 0;
    public static final HatchLinkPairingSheetEntryProvider INSTANCE = new HatchLinkPairingSheetEntryProvider();

    @Override // com.facebook.aura.navigation.AuraNavEntryProvider
    public void provideEntry(C5rn<AuraNavKey> c5rn) {
        C7384Etj.A0Y(c5rn, 0);
        BottomSheetSceneStrategy.Companion companion = BottomSheetSceneStrategy.Companion;
        final LinkedHashMap linkedHashMapA02 = AGH.A02(companion.bottomSheet(true, true, false), AnonymousClass006.A10(SharedViewModelStoreNavEntryDecorator.PARENT_CONTENT_KEY, ConnectedDevicesEntryProviderKt.CONNECTED_DEVICES_CONTENT_KEY));
        G0W<HatchLinkPairingSheetKey, BFM, Integer, Unit> g0w = ComposableSingletons$HatchLinkPairingSheetEntryProviderKt.f37lambda$734349018;
        c5rn.A00(new G0U<HatchLinkPairingSheetKey, Object>() { // from class: com.facebook.aura.devices.entries.HatchLinkPairingSheetEntryProvider$provideEntry$$inlined$entry$default$1
            @Override // X.G0U
            public final Object invoke(HatchLinkPairingSheetKey hatchLinkPairingSheetKey) {
                return hatchLinkPairingSheetKey.toString();
            }
        }, new G0U<HatchLinkPairingSheetKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.devices.entries.HatchLinkPairingSheetEntryProvider$provideEntry$$inlined$entry$default$2
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(HatchLinkPairingSheetKey hatchLinkPairingSheetKey) {
                return linkedHashMapA02;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(HatchLinkPairingSheetKey hatchLinkPairingSheetKey) {
                return linkedHashMapA02;
            }
        }, g0w, C3cG.A0x(HatchLinkPairingSheetKey.class));
        final LinkedHashMap linkedHashMapA022 = AGH.A02(companion.bottomSheet(false, true, false), AnonymousClass006.A10(SharedViewModelStoreNavEntryDecorator.PARENT_CONTENT_KEY, ConnectedDevicesEntryProviderKt.CONNECTED_DEVICES_CONTENT_KEY));
        G0W<HatchLinkActivePairingSheetKey, BFM, Integer, Unit> g0w2 = ComposableSingletons$HatchLinkPairingSheetEntryProviderKt.f36lambda$536560457;
        c5rn.A00(new G0U<HatchLinkActivePairingSheetKey, Object>() { // from class: com.facebook.aura.devices.entries.HatchLinkPairingSheetEntryProvider$provideEntry$$inlined$entry$default$3
            @Override // X.G0U
            public final Object invoke(HatchLinkActivePairingSheetKey hatchLinkActivePairingSheetKey) {
                return hatchLinkActivePairingSheetKey.toString();
            }
        }, new G0U<HatchLinkActivePairingSheetKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.devices.entries.HatchLinkPairingSheetEntryProvider$provideEntry$$inlined$entry$default$4
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(HatchLinkActivePairingSheetKey hatchLinkActivePairingSheetKey) {
                return linkedHashMapA022;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(HatchLinkActivePairingSheetKey hatchLinkActivePairingSheetKey) {
                return linkedHashMapA022;
            }
        }, g0w2, C3cG.A0x(HatchLinkActivePairingSheetKey.class));
    }
}
