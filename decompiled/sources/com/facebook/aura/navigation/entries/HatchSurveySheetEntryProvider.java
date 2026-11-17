package com.facebook.aura.navigation.entries;

import X.BFM;
import X.C3cG;
import X.C5rn;
import X.C60P;
import X.G0U;
import X.G0W;
import com.facebook.aura.navigation.AuraNavEntryProvider;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.key.HatchSurveySheetKey;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class HatchSurveySheetEntryProvider implements AuraNavEntryProvider {
    public static final int $stable = 0;
    public static final HatchSurveySheetEntryProvider INSTANCE = new HatchSurveySheetEntryProvider();

    @Override // com.facebook.aura.navigation.AuraNavEntryProvider
    public void provideEntry(C5rn<AuraNavKey> c5rn) {
        final Map mapA1S = C60P.A1S(c5rn);
        G0W<HatchSurveySheetKey, BFM, Integer, Unit> g0w = ComposableSingletons$HatchSurveySheetEntryProviderKt.f137lambda$331744471;
        c5rn.A00(new G0U<HatchSurveySheetKey, Object>() { // from class: com.facebook.aura.navigation.entries.HatchSurveySheetEntryProvider$provideEntry$$inlined$entry$default$1
            @Override // X.G0U
            public final Object invoke(HatchSurveySheetKey hatchSurveySheetKey) {
                return hatchSurveySheetKey.toString();
            }
        }, new G0U<HatchSurveySheetKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.HatchSurveySheetEntryProvider$provideEntry$$inlined$entry$default$2
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(HatchSurveySheetKey hatchSurveySheetKey) {
                return mapA1S;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(HatchSurveySheetKey hatchSurveySheetKey) {
                return mapA1S;
            }
        }, g0w, C3cG.A0x(HatchSurveySheetKey.class));
    }
}
