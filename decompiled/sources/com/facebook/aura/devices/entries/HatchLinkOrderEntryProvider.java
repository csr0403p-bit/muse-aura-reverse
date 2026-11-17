package com.facebook.aura.devices.entries;

import X.BFM;
import X.C3cG;
import X.C5rn;
import X.C7384Etj;
import X.G0U;
import X.G0W;
import com.facebook.aura.navigation.AuraNavEntryProvider;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.BottomSheetSceneStrategy;
import com.facebook.aura.navigation.OverlaySceneStrategy;
import com.facebook.aura.navigation.key.HatchLinkActivationDelayedDialogKey;
import com.facebook.aura.navigation.key.HatchLinkOrderSheetKey;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class HatchLinkOrderEntryProvider implements AuraNavEntryProvider {
    public static final int $stable = 0;
    public static final HatchLinkOrderEntryProvider INSTANCE = new HatchLinkOrderEntryProvider();

    @Override // com.facebook.aura.navigation.AuraNavEntryProvider
    public void provideEntry(C5rn<AuraNavKey> c5rn) {
        C7384Etj.A0Y(c5rn, 0);
        final Map<String, Object> mapBottomSheet = BottomSheetSceneStrategy.Companion.bottomSheet(false, true, false);
        G0W<HatchLinkOrderSheetKey, BFM, Integer, Unit> g0w = ComposableSingletons$HatchLinkOrderEntryProviderKt.f35lambda$961613358;
        c5rn.A00(new G0U<HatchLinkOrderSheetKey, Object>() { // from class: com.facebook.aura.devices.entries.HatchLinkOrderEntryProvider$provideEntry$$inlined$entry$default$1
            @Override // X.G0U
            public final Object invoke(HatchLinkOrderSheetKey hatchLinkOrderSheetKey) {
                return hatchLinkOrderSheetKey.toString();
            }
        }, new G0U<HatchLinkOrderSheetKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.devices.entries.HatchLinkOrderEntryProvider$provideEntry$$inlined$entry$default$2
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(HatchLinkOrderSheetKey hatchLinkOrderSheetKey) {
                return mapBottomSheet;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(HatchLinkOrderSheetKey hatchLinkOrderSheetKey) {
                return mapBottomSheet;
            }
        }, g0w, C3cG.A0x(HatchLinkOrderSheetKey.class));
        final Map<String, Object> mapOverlay = OverlaySceneStrategy.Companion.overlay(Integer.MAX_VALUE);
        G0W<HatchLinkActivationDelayedDialogKey, BFM, Integer, Unit> g0w2 = ComposableSingletons$HatchLinkOrderEntryProviderKt.lambda$1124987300;
        c5rn.A00(new G0U<HatchLinkActivationDelayedDialogKey, Object>() { // from class: com.facebook.aura.devices.entries.HatchLinkOrderEntryProvider$provideEntry$$inlined$entry$default$3
            @Override // X.G0U
            public final Object invoke(HatchLinkActivationDelayedDialogKey hatchLinkActivationDelayedDialogKey) {
                return hatchLinkActivationDelayedDialogKey.toString();
            }
        }, new G0U<HatchLinkActivationDelayedDialogKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.devices.entries.HatchLinkOrderEntryProvider$provideEntry$$inlined$entry$default$4
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(HatchLinkActivationDelayedDialogKey hatchLinkActivationDelayedDialogKey) {
                return mapOverlay;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(HatchLinkActivationDelayedDialogKey hatchLinkActivationDelayedDialogKey) {
                return mapOverlay;
            }
        }, g0w2, C3cG.A0x(HatchLinkActivationDelayedDialogKey.class));
    }
}
