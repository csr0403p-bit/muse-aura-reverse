package com.facebook.aura.ageverification;

import X.BFM;
import X.C3cG;
import X.C5rn;
import X.C7384Etj;
import X.G0U;
import X.G0W;
import com.facebook.aura.navigation.AuraNavEntryProvider;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.BottomSheetSceneStrategy;
import com.facebook.aura.navigation.key.AgeVerificationHowSelfiesWorkSheetKey;
import com.facebook.aura.navigation.key.AgeVerificationWhyConfirmSheetKey;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class AgeStepInfoSheetEntryProvider implements AuraNavEntryProvider {
    public static final int $stable = 0;
    public static final AgeStepInfoSheetEntryProvider INSTANCE = new AgeStepInfoSheetEntryProvider();

    @Override // com.facebook.aura.navigation.AuraNavEntryProvider
    public void provideEntry(C5rn<AuraNavKey> c5rn) {
        C7384Etj.A0Y(c5rn, 0);
        BottomSheetSceneStrategy.Companion companion = BottomSheetSceneStrategy.Companion;
        final Map<String, Object> mapBottomSheet = companion.bottomSheet(true, true, false);
        G0W<AgeVerificationHowSelfiesWorkSheetKey, BFM, Integer, Unit> g0w = ComposableSingletons$AgeStepInfoSheetKt.f6lambda$1308156254;
        c5rn.A00(new G0U<AgeVerificationHowSelfiesWorkSheetKey, Object>() { // from class: com.facebook.aura.ageverification.AgeStepInfoSheetEntryProvider$provideEntry$$inlined$entry$default$1
            @Override // X.G0U
            public final Object invoke(AgeVerificationHowSelfiesWorkSheetKey ageVerificationHowSelfiesWorkSheetKey) {
                return ageVerificationHowSelfiesWorkSheetKey.toString();
            }
        }, new G0U<AgeVerificationHowSelfiesWorkSheetKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.ageverification.AgeStepInfoSheetEntryProvider$provideEntry$$inlined$entry$default$2
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(AgeVerificationHowSelfiesWorkSheetKey ageVerificationHowSelfiesWorkSheetKey) {
                return mapBottomSheet;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(AgeVerificationHowSelfiesWorkSheetKey ageVerificationHowSelfiesWorkSheetKey) {
                return mapBottomSheet;
            }
        }, g0w, C3cG.A0x(AgeVerificationHowSelfiesWorkSheetKey.class));
        final Map<String, Object> mapBottomSheet2 = companion.bottomSheet(true, true, false);
        G0W<AgeVerificationWhyConfirmSheetKey, BFM, Integer, Unit> g0w2 = ComposableSingletons$AgeStepInfoSheetKt.f5lambda$1182685377;
        c5rn.A00(new G0U<AgeVerificationWhyConfirmSheetKey, Object>() { // from class: com.facebook.aura.ageverification.AgeStepInfoSheetEntryProvider$provideEntry$$inlined$entry$default$3
            @Override // X.G0U
            public final Object invoke(AgeVerificationWhyConfirmSheetKey ageVerificationWhyConfirmSheetKey) {
                return ageVerificationWhyConfirmSheetKey.toString();
            }
        }, new G0U<AgeVerificationWhyConfirmSheetKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.ageverification.AgeStepInfoSheetEntryProvider$provideEntry$$inlined$entry$default$4
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(AgeVerificationWhyConfirmSheetKey ageVerificationWhyConfirmSheetKey) {
                return mapBottomSheet2;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(AgeVerificationWhyConfirmSheetKey ageVerificationWhyConfirmSheetKey) {
                return mapBottomSheet2;
            }
        }, g0w2, C3cG.A0x(AgeVerificationWhyConfirmSheetKey.class));
    }
}
