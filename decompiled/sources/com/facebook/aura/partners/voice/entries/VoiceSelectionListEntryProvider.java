package com.facebook.aura.partners.voice.entries;

import X.AGH;
import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.C3cG;
import X.C5rn;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.navigation.AuraNavEntryProvider;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.BottomSheetSceneStrategy;
import com.facebook.aura.navigation.SharedViewModelStoreNavEntryDecorator;
import com.facebook.aura.navigation.key.VoiceCatalogFilterSheetKey;
import com.facebook.aura.navigation.key.VoiceEntryPoint;
import com.facebook.aura.navigation.key.VoiceSelectionListScreenKey;
import java.util.Map;

/* loaded from: classes4.dex */
public final class VoiceSelectionListEntryProvider implements AuraNavEntryProvider {
    public static final int $stable = 0;
    public static final VoiceSelectionListEntryProvider INSTANCE = new VoiceSelectionListEntryProvider();

    /* renamed from: com.facebook.aura.partners.voice.entries.VoiceSelectionListEntryProvider$provideEntry$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<VoiceSelectionListScreenKey, Object> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Object invoke(VoiceSelectionListScreenKey voiceSelectionListScreenKey) {
            VoiceSelectionListScreenKey voiceSelectionListScreenKey2 = voiceSelectionListScreenKey;
            C7384Etj.A0Y(voiceSelectionListScreenKey2, 0);
            return voiceSelectionListScreenKey2.contentKey;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(VoiceSelectionListScreenKey voiceSelectionListScreenKey) {
            C7384Etj.A0Y(voiceSelectionListScreenKey, 0);
            return voiceSelectionListScreenKey.contentKey;
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.entries.VoiceSelectionListEntryProvider$provideEntry$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0U<VoiceCatalogFilterSheetKey, Map<String, ? extends Object>> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(1);
        }

        @Override // X.G0U
        public final Map<String, Object> invoke(VoiceCatalogFilterSheetKey voiceCatalogFilterSheetKey) {
            C7384Etj.A0Y(voiceCatalogFilterSheetKey, 0);
            return AGH.A02(BottomSheetSceneStrategy.Companion.bottomSheet(AnonymousClass002.A1Z(voiceCatalogFilterSheetKey.entryPoint, VoiceEntryPoint.SETTINGS), true, false), SharedViewModelStoreNavEntryDecorator.Companion.parent(voiceCatalogFilterSheetKey.parentContentKey));
        }
    }

    @Override // com.facebook.aura.navigation.AuraNavEntryProvider
    public void provideEntry(C5rn<AuraNavKey> c5rn) {
        final Map mapA0o = C3cG.A0o(c5rn);
        c5rn.A00(AnonymousClass1.INSTANCE, new G0U<VoiceSelectionListScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.partners.voice.entries.VoiceSelectionListEntryProvider$provideEntry$$inlined$entry$1
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(VoiceSelectionListScreenKey voiceSelectionListScreenKey) {
                return mapA0o;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(VoiceSelectionListScreenKey voiceSelectionListScreenKey) {
                return mapA0o;
            }
        }, ComposableSingletons$VoiceSelectionListEntryProviderKt.f216lambda$526642263, C3cG.A0x(VoiceSelectionListScreenKey.class));
        c5rn.A00(new G0U<VoiceCatalogFilterSheetKey, Object>() { // from class: com.facebook.aura.partners.voice.entries.VoiceSelectionListEntryProvider$provideEntry$$inlined$entry$default$1
            @Override // X.G0U
            public final Object invoke(VoiceCatalogFilterSheetKey voiceCatalogFilterSheetKey) {
                return voiceCatalogFilterSheetKey.toString();
            }
        }, AnonymousClass2.INSTANCE, ComposableSingletons$VoiceSelectionListEntryProviderKt.lambda$538785592, C3cG.A0x(VoiceCatalogFilterSheetKey.class));
    }
}
