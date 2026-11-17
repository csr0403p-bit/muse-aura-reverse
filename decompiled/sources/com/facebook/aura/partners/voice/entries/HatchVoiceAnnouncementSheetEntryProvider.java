package com.facebook.aura.partners.voice.entries;

import X.BFM;
import X.C3cG;
import X.C5rn;
import X.C7384Etj;
import X.G0U;
import X.G0W;
import com.facebook.aura.navigation.AuraNavEntryProvider;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.BottomSheetSceneStrategy;
import com.facebook.aura.navigation.key.HatchVoiceAnnouncementSheetKey;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class HatchVoiceAnnouncementSheetEntryProvider implements AuraNavEntryProvider {
    public static final int $stable = 0;
    public static final HatchVoiceAnnouncementSheetEntryProvider INSTANCE = new HatchVoiceAnnouncementSheetEntryProvider();

    @Override // com.facebook.aura.navigation.AuraNavEntryProvider
    public void provideEntry(C5rn<AuraNavKey> c5rn) {
        C7384Etj.A0Y(c5rn, 0);
        final Map<String, Object> mapBottomSheet = BottomSheetSceneStrategy.Companion.bottomSheet(true, true, false);
        G0W<HatchVoiceAnnouncementSheetKey, BFM, Integer, Unit> g0w = ComposableSingletons$HatchVoiceAnnouncementSheetEntryProviderKt.f213lambda$644308507;
        c5rn.A00(new G0U<HatchVoiceAnnouncementSheetKey, Object>() { // from class: com.facebook.aura.partners.voice.entries.HatchVoiceAnnouncementSheetEntryProvider$provideEntry$$inlined$entry$default$1
            @Override // X.G0U
            public final Object invoke(HatchVoiceAnnouncementSheetKey hatchVoiceAnnouncementSheetKey) {
                return hatchVoiceAnnouncementSheetKey.toString();
            }
        }, new G0U<HatchVoiceAnnouncementSheetKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.partners.voice.entries.HatchVoiceAnnouncementSheetEntryProvider$provideEntry$$inlined$entry$default$2
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(HatchVoiceAnnouncementSheetKey hatchVoiceAnnouncementSheetKey) {
                return mapBottomSheet;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(HatchVoiceAnnouncementSheetKey hatchVoiceAnnouncementSheetKey) {
                return mapBottomSheet;
            }
        }, g0w, C3cG.A0x(HatchVoiceAnnouncementSheetKey.class));
    }
}
