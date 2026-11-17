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
import com.facebook.aura.navigation.key.ConfidentialVmLoginScreenKey;
import com.facebook.aura.navigation.key.ConfidentialVmPinHelpBottomSheetKey;
import com.facebook.aura.navigation.key.ConfidentialVmPinReminderBottomSheetKey;
import com.facebook.aura.navigation.key.ConfidentialVmRegisterPinScreenKey;
import com.facebook.aura.navigation.key.ConfidentialVmResetConfirmationBottomSheetKey;
import com.facebook.aura.navigation.key.ConfidentialVmSetupLoginScreenKey;
import com.facebook.aura.navigation.key.ConfidentialVmTemporaryAccessBottomSheetKey;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes6.dex */
public final class ConfidentialVmRegisterPinEntryProvider implements AuraNavEntryProvider {
    public static final int $stable = 0;
    public static final ConfidentialVmRegisterPinEntryProvider INSTANCE = new ConfidentialVmRegisterPinEntryProvider();

    @Override // com.facebook.aura.navigation.AuraNavEntryProvider
    public void provideEntry(C5rn<AuraNavKey> c5rn) {
        C7384Etj.A0Y(c5rn, 0);
        final Map<String, Object> map = AuraTransitionsKt.pushTransitionMetadata;
        G0W<ConfidentialVmRegisterPinScreenKey, BFM, Integer, Unit> g0w = ComposableSingletons$ConfidentialVmRegisterPinEntryProviderKt.f110lambda$812809799;
        c5rn.A00(new G0U<ConfidentialVmRegisterPinScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.ConfidentialVmRegisterPinEntryProvider$provideEntry$$inlined$entry$default$1
            @Override // X.G0U
            public final Object invoke(ConfidentialVmRegisterPinScreenKey confidentialVmRegisterPinScreenKey) {
                return confidentialVmRegisterPinScreenKey.toString();
            }
        }, new G0U<ConfidentialVmRegisterPinScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.ConfidentialVmRegisterPinEntryProvider$provideEntry$$inlined$entry$default$2
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(ConfidentialVmRegisterPinScreenKey confidentialVmRegisterPinScreenKey) {
                return map;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(ConfidentialVmRegisterPinScreenKey confidentialVmRegisterPinScreenKey) {
                return map;
            }
        }, g0w, C3cG.A0x(ConfidentialVmRegisterPinScreenKey.class));
        BottomSheetSceneStrategy.Companion companion = BottomSheetSceneStrategy.Companion;
        final Map<String, Object> mapBottomSheet = companion.bottomSheet(true, true, false);
        G0W<ConfidentialVmPinReminderBottomSheetKey, BFM, Integer, Unit> g0w2 = ComposableSingletons$ConfidentialVmRegisterPinEntryProviderKt.lambda$142108517;
        c5rn.A00(new G0U<ConfidentialVmPinReminderBottomSheetKey, Object>() { // from class: com.facebook.aura.navigation.entries.ConfidentialVmRegisterPinEntryProvider$provideEntry$$inlined$entry$default$3
            @Override // X.G0U
            public final Object invoke(ConfidentialVmPinReminderBottomSheetKey confidentialVmPinReminderBottomSheetKey) {
                return confidentialVmPinReminderBottomSheetKey.toString();
            }
        }, new G0U<ConfidentialVmPinReminderBottomSheetKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.ConfidentialVmRegisterPinEntryProvider$provideEntry$$inlined$entry$default$4
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(ConfidentialVmPinReminderBottomSheetKey confidentialVmPinReminderBottomSheetKey) {
                return mapBottomSheet;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(ConfidentialVmPinReminderBottomSheetKey confidentialVmPinReminderBottomSheetKey) {
                return mapBottomSheet;
            }
        }, g0w2, C3cG.A0x(ConfidentialVmPinReminderBottomSheetKey.class));
        final Map<String, Object> mapBottomSheet2 = companion.bottomSheet(true, true, false);
        G0W<ConfidentialVmPinHelpBottomSheetKey, BFM, Integer, Unit> g0w3 = ComposableSingletons$ConfidentialVmRegisterPinEntryProviderKt.f108lambda$1653959595;
        c5rn.A00(new G0U<ConfidentialVmPinHelpBottomSheetKey, Object>() { // from class: com.facebook.aura.navigation.entries.ConfidentialVmRegisterPinEntryProvider$provideEntry$$inlined$entry$default$5
            @Override // X.G0U
            public final Object invoke(ConfidentialVmPinHelpBottomSheetKey confidentialVmPinHelpBottomSheetKey) {
                return confidentialVmPinHelpBottomSheetKey.toString();
            }
        }, new G0U<ConfidentialVmPinHelpBottomSheetKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.ConfidentialVmRegisterPinEntryProvider$provideEntry$$inlined$entry$default$6
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(ConfidentialVmPinHelpBottomSheetKey confidentialVmPinHelpBottomSheetKey) {
                return mapBottomSheet2;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(ConfidentialVmPinHelpBottomSheetKey confidentialVmPinHelpBottomSheetKey) {
                return mapBottomSheet2;
            }
        }, g0w3, C3cG.A0x(ConfidentialVmPinHelpBottomSheetKey.class));
        final Map<String, Object> mapBottomSheet3 = companion.bottomSheet(true, true, false);
        G0W<ConfidentialVmTemporaryAccessBottomSheetKey, BFM, Integer, Unit> g0w4 = ComposableSingletons$ConfidentialVmRegisterPinEntryProviderKt.f107lambda$1513013003;
        c5rn.A00(new G0U<ConfidentialVmTemporaryAccessBottomSheetKey, Object>() { // from class: com.facebook.aura.navigation.entries.ConfidentialVmRegisterPinEntryProvider$provideEntry$$inlined$entry$default$7
            @Override // X.G0U
            public final Object invoke(ConfidentialVmTemporaryAccessBottomSheetKey confidentialVmTemporaryAccessBottomSheetKey) {
                return confidentialVmTemporaryAccessBottomSheetKey.toString();
            }
        }, new G0U<ConfidentialVmTemporaryAccessBottomSheetKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.ConfidentialVmRegisterPinEntryProvider$provideEntry$$inlined$entry$default$8
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(ConfidentialVmTemporaryAccessBottomSheetKey confidentialVmTemporaryAccessBottomSheetKey) {
                return mapBottomSheet3;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(ConfidentialVmTemporaryAccessBottomSheetKey confidentialVmTemporaryAccessBottomSheetKey) {
                return mapBottomSheet3;
            }
        }, g0w4, C3cG.A0x(ConfidentialVmTemporaryAccessBottomSheetKey.class));
        final Map<String, Object> mapBottomSheet4 = companion.bottomSheet(true, true, false);
        G0W<ConfidentialVmResetConfirmationBottomSheetKey, BFM, Integer, Unit> g0w5 = ComposableSingletons$ConfidentialVmRegisterPinEntryProviderKt.lambda$726324133;
        c5rn.A00(new G0U<ConfidentialVmResetConfirmationBottomSheetKey, Object>() { // from class: com.facebook.aura.navigation.entries.ConfidentialVmRegisterPinEntryProvider$provideEntry$$inlined$entry$default$9
            @Override // X.G0U
            public final Object invoke(ConfidentialVmResetConfirmationBottomSheetKey confidentialVmResetConfirmationBottomSheetKey) {
                return confidentialVmResetConfirmationBottomSheetKey.toString();
            }
        }, new G0U<ConfidentialVmResetConfirmationBottomSheetKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.ConfidentialVmRegisterPinEntryProvider$provideEntry$$inlined$entry$default$10
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(ConfidentialVmResetConfirmationBottomSheetKey confidentialVmResetConfirmationBottomSheetKey) {
                return mapBottomSheet4;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(ConfidentialVmResetConfirmationBottomSheetKey confidentialVmResetConfirmationBottomSheetKey) {
                return mapBottomSheet4;
            }
        }, g0w5, C3cG.A0x(ConfidentialVmResetConfirmationBottomSheetKey.class));
        G0W<ConfidentialVmLoginScreenKey, BFM, Integer, Unit> g0w6 = ComposableSingletons$ConfidentialVmRegisterPinEntryProviderKt.f109lambda$1866870763;
        c5rn.A00(new G0U<ConfidentialVmLoginScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.ConfidentialVmRegisterPinEntryProvider$provideEntry$$inlined$entry$default$11
            @Override // X.G0U
            public final Object invoke(ConfidentialVmLoginScreenKey confidentialVmLoginScreenKey) {
                return confidentialVmLoginScreenKey.toString();
            }
        }, new G0U<ConfidentialVmLoginScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.ConfidentialVmRegisterPinEntryProvider$provideEntry$$inlined$entry$default$12
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(ConfidentialVmLoginScreenKey confidentialVmLoginScreenKey) {
                return map;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(ConfidentialVmLoginScreenKey confidentialVmLoginScreenKey) {
                return map;
            }
        }, g0w6, C3cG.A0x(ConfidentialVmLoginScreenKey.class));
        G0W<ConfidentialVmSetupLoginScreenKey, BFM, Integer, Unit> g0w7 = ComposableSingletons$ConfidentialVmRegisterPinEntryProviderKt.lambda$919517867;
        c5rn.A00(new G0U<ConfidentialVmSetupLoginScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.ConfidentialVmRegisterPinEntryProvider$provideEntry$$inlined$entry$default$13
            @Override // X.G0U
            public final Object invoke(ConfidentialVmSetupLoginScreenKey confidentialVmSetupLoginScreenKey) {
                return confidentialVmSetupLoginScreenKey.toString();
            }
        }, new G0U<ConfidentialVmSetupLoginScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.ConfidentialVmRegisterPinEntryProvider$provideEntry$$inlined$entry$default$14
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(ConfidentialVmSetupLoginScreenKey confidentialVmSetupLoginScreenKey) {
                return map;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(ConfidentialVmSetupLoginScreenKey confidentialVmSetupLoginScreenKey) {
                return map;
            }
        }, g0w7, C3cG.A0x(ConfidentialVmSetupLoginScreenKey.class));
    }
}
