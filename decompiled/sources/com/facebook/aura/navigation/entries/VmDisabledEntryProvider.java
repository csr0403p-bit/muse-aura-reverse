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
import com.facebook.aura.navigation.OverlaySceneStrategy;
import com.facebook.aura.navigation.key.VmDisabledOverlayScreenKey;
import com.facebook.aura.navigation.key.VmLearnMoreSheetKey;
import com.facebook.aura.navigation.key.VmReconnectConfirmSheetKey;
import com.facebook.aura.navigation.key.VmRecoveryFlowPreviewScreenKey;
import com.facebook.aura.navigation.key.VmResetConfirmSheetKey;
import com.facebook.aura.overlay.api.OverlayPriority;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class VmDisabledEntryProvider implements AuraNavEntryProvider {
    public static final int $stable = 0;
    public static final VmDisabledEntryProvider INSTANCE = new VmDisabledEntryProvider();

    @Override // com.facebook.aura.navigation.AuraNavEntryProvider
    public void provideEntry(C5rn<AuraNavKey> c5rn) {
        C7384Etj.A0Y(c5rn, 0);
        final Map<String, Object> mapOverlay = OverlaySceneStrategy.Companion.overlay(OverlayPriority.VM_DISABLED.ordinal());
        G0W<VmDisabledOverlayScreenKey, BFM, Integer, Unit> g0w = ComposableSingletons$VmDisabledEntryProviderKt.lambda$182106739;
        c5rn.A00(new G0U<VmDisabledOverlayScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.VmDisabledEntryProvider$provideEntry$$inlined$entry$default$1
            @Override // X.G0U
            public final Object invoke(VmDisabledOverlayScreenKey vmDisabledOverlayScreenKey) {
                return vmDisabledOverlayScreenKey.toString();
            }
        }, new G0U<VmDisabledOverlayScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.VmDisabledEntryProvider$provideEntry$$inlined$entry$default$2
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(VmDisabledOverlayScreenKey vmDisabledOverlayScreenKey) {
                return mapOverlay;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(VmDisabledOverlayScreenKey vmDisabledOverlayScreenKey) {
                return mapOverlay;
            }
        }, g0w, C3cG.A0x(VmDisabledOverlayScreenKey.class));
        BottomSheetSceneStrategy.Companion companion = BottomSheetSceneStrategy.Companion;
        final Map<String, Object> mapBottomSheet = companion.bottomSheet(true, true, false);
        G0W<VmLearnMoreSheetKey, BFM, Integer, Unit> g0w2 = ComposableSingletons$VmDisabledEntryProviderKt.f191lambda$158484506;
        c5rn.A00(new G0U<VmLearnMoreSheetKey, Object>() { // from class: com.facebook.aura.navigation.entries.VmDisabledEntryProvider$provideEntry$$inlined$entry$default$3
            @Override // X.G0U
            public final Object invoke(VmLearnMoreSheetKey vmLearnMoreSheetKey) {
                return vmLearnMoreSheetKey.toString();
            }
        }, new G0U<VmLearnMoreSheetKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.VmDisabledEntryProvider$provideEntry$$inlined$entry$default$4
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(VmLearnMoreSheetKey vmLearnMoreSheetKey) {
                return mapBottomSheet;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(VmLearnMoreSheetKey vmLearnMoreSheetKey) {
                return mapBottomSheet;
            }
        }, g0w2, C3cG.A0x(VmLearnMoreSheetKey.class));
        final Map<String, Object> mapBottomSheet2 = companion.bottomSheet(true, true, false);
        G0W<VmReconnectConfirmSheetKey, BFM, Integer, Unit> g0w3 = ComposableSingletons$VmDisabledEntryProviderKt.lambda$345039729;
        c5rn.A00(new G0U<VmReconnectConfirmSheetKey, Object>() { // from class: com.facebook.aura.navigation.entries.VmDisabledEntryProvider$provideEntry$$inlined$entry$default$5
            @Override // X.G0U
            public final Object invoke(VmReconnectConfirmSheetKey vmReconnectConfirmSheetKey) {
                return vmReconnectConfirmSheetKey.toString();
            }
        }, new G0U<VmReconnectConfirmSheetKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.VmDisabledEntryProvider$provideEntry$$inlined$entry$default$6
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(VmReconnectConfirmSheetKey vmReconnectConfirmSheetKey) {
                return mapBottomSheet2;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(VmReconnectConfirmSheetKey vmReconnectConfirmSheetKey) {
                return mapBottomSheet2;
            }
        }, g0w3, C3cG.A0x(VmReconnectConfirmSheetKey.class));
        final Map<String, Object> mapBottomSheet3 = companion.bottomSheet(true, true, false);
        G0W<VmResetConfirmSheetKey, BFM, Integer, Unit> g0w4 = ComposableSingletons$VmDisabledEntryProviderKt.f192lambda$2006616440;
        c5rn.A00(new G0U<VmResetConfirmSheetKey, Object>() { // from class: com.facebook.aura.navigation.entries.VmDisabledEntryProvider$provideEntry$$inlined$entry$default$7
            @Override // X.G0U
            public final Object invoke(VmResetConfirmSheetKey vmResetConfirmSheetKey) {
                return vmResetConfirmSheetKey.toString();
            }
        }, new G0U<VmResetConfirmSheetKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.VmDisabledEntryProvider$provideEntry$$inlined$entry$default$8
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(VmResetConfirmSheetKey vmResetConfirmSheetKey) {
                return mapBottomSheet3;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(VmResetConfirmSheetKey vmResetConfirmSheetKey) {
                return mapBottomSheet3;
            }
        }, g0w4, C3cG.A0x(VmResetConfirmSheetKey.class));
        final Map<String, Object> map = AuraTransitionsKt.pushTransitionMetadata;
        G0W<VmRecoveryFlowPreviewScreenKey, BFM, Integer, Unit> g0w5 = ComposableSingletons$VmDisabledEntryProviderKt.f193lambda$629833366;
        c5rn.A00(new G0U<VmRecoveryFlowPreviewScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.VmDisabledEntryProvider$provideEntry$$inlined$entry$default$9
            @Override // X.G0U
            public final Object invoke(VmRecoveryFlowPreviewScreenKey vmRecoveryFlowPreviewScreenKey) {
                return vmRecoveryFlowPreviewScreenKey.toString();
            }
        }, new G0U<VmRecoveryFlowPreviewScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.VmDisabledEntryProvider$provideEntry$$inlined$entry$default$10
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(VmRecoveryFlowPreviewScreenKey vmRecoveryFlowPreviewScreenKey) {
                return map;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(VmRecoveryFlowPreviewScreenKey vmRecoveryFlowPreviewScreenKey) {
                return map;
            }
        }, g0w5, C3cG.A0x(VmRecoveryFlowPreviewScreenKey.class));
    }
}
