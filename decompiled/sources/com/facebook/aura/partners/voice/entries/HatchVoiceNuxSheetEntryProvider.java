package com.facebook.aura.partners.voice.entries;

import X.BFM;
import X.C3cG;
import X.C5rn;
import X.C60P;
import X.G0U;
import X.G0W;
import com.facebook.aura.navigation.AuraNavEntryProvider;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.key.HatchVoiceNuxSheetKey;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class HatchVoiceNuxSheetEntryProvider implements AuraNavEntryProvider {
    public static final int $stable = 0;
    public static final HatchVoiceNuxSheetEntryProvider INSTANCE = new HatchVoiceNuxSheetEntryProvider();

    @Override // com.facebook.aura.navigation.AuraNavEntryProvider
    public void provideEntry(C5rn<AuraNavKey> c5rn) {
        final Map mapA1S = C60P.A1S(c5rn);
        G0W<HatchVoiceNuxSheetKey, BFM, Integer, Unit> g0w = ComposableSingletons$HatchVoiceNuxSheetEntryProviderKt.f214lambda$2038425739;
        c5rn.A00(new G0U<HatchVoiceNuxSheetKey, Object>() { // from class: com.facebook.aura.partners.voice.entries.HatchVoiceNuxSheetEntryProvider$provideEntry$$inlined$entry$default$1
            @Override // X.G0U
            public final Object invoke(HatchVoiceNuxSheetKey hatchVoiceNuxSheetKey) {
                return hatchVoiceNuxSheetKey.toString();
            }
        }, new G0U<HatchVoiceNuxSheetKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.partners.voice.entries.HatchVoiceNuxSheetEntryProvider$provideEntry$$inlined$entry$default$2
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(HatchVoiceNuxSheetKey hatchVoiceNuxSheetKey) {
                return mapA1S;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(HatchVoiceNuxSheetKey hatchVoiceNuxSheetKey) {
                return mapA1S;
            }
        }, g0w, C3cG.A0x(HatchVoiceNuxSheetKey.class));
    }
}
