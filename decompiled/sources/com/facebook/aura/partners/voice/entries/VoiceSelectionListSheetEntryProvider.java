package com.facebook.aura.partners.voice.entries;

import X.AbstractC7559F3s;
import X.C3cG;
import X.C5rn;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.navigation.AuraNavEntryProvider;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.BottomSheetSceneStrategy;
import com.facebook.aura.navigation.key.VoiceSelectionListSheetKey;
import java.util.Map;

/* loaded from: classes3.dex */
public final class VoiceSelectionListSheetEntryProvider implements AuraNavEntryProvider {
    public static final int $stable = 0;
    public static final VoiceSelectionListSheetEntryProvider INSTANCE = new VoiceSelectionListSheetEntryProvider();

    /* renamed from: com.facebook.aura.partners.voice.entries.VoiceSelectionListSheetEntryProvider$provideEntry$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<VoiceSelectionListSheetKey, Object> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Object invoke(VoiceSelectionListSheetKey voiceSelectionListSheetKey) {
            VoiceSelectionListSheetKey voiceSelectionListSheetKey2 = voiceSelectionListSheetKey;
            C7384Etj.A0Y(voiceSelectionListSheetKey2, 0);
            return voiceSelectionListSheetKey2.contentKey;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(VoiceSelectionListSheetKey voiceSelectionListSheetKey) {
            C7384Etj.A0Y(voiceSelectionListSheetKey, 0);
            return voiceSelectionListSheetKey.contentKey;
        }
    }

    @Override // com.facebook.aura.navigation.AuraNavEntryProvider
    public void provideEntry(C5rn<AuraNavKey> c5rn) {
        C7384Etj.A0Y(c5rn, 0);
        final Map<String, Object> mapBottomSheet = BottomSheetSceneStrategy.Companion.bottomSheet(false, true, false);
        c5rn.A00(AnonymousClass1.INSTANCE, new G0U<VoiceSelectionListSheetKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.partners.voice.entries.VoiceSelectionListSheetEntryProvider$provideEntry$$inlined$entry$1
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(VoiceSelectionListSheetKey voiceSelectionListSheetKey) {
                return mapBottomSheet;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(VoiceSelectionListSheetKey voiceSelectionListSheetKey) {
                return mapBottomSheet;
            }
        }, ComposableSingletons$VoiceSelectionListSheetEntryProviderKt.f217lambda$80042330, C3cG.A0x(VoiceSelectionListSheetKey.class));
    }
}
