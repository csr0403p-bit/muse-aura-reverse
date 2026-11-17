package com.facebook.aura.partners.voice.entries;

import X.BFM;
import X.C3cG;
import X.C5rn;
import X.G0U;
import X.G0W;
import com.facebook.aura.navigation.AuraNavEntryProvider;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.key.VoiceInternalSettingsScreenKey;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class VoiceInternalSettingsEntryProvider implements AuraNavEntryProvider {
    public static final int $stable = 0;
    public static final VoiceInternalSettingsEntryProvider INSTANCE = new VoiceInternalSettingsEntryProvider();

    @Override // com.facebook.aura.navigation.AuraNavEntryProvider
    public void provideEntry(C5rn<AuraNavKey> c5rn) {
        final Map mapA0o = C3cG.A0o(c5rn);
        G0W<VoiceInternalSettingsScreenKey, BFM, Integer, Unit> g0w = ComposableSingletons$VoiceInternalSettingsEntryProviderKt.lambda$610217757;
        c5rn.A00(new G0U<VoiceInternalSettingsScreenKey, Object>() { // from class: com.facebook.aura.partners.voice.entries.VoiceInternalSettingsEntryProvider$provideEntry$$inlined$entry$default$1
            @Override // X.G0U
            public final Object invoke(VoiceInternalSettingsScreenKey voiceInternalSettingsScreenKey) {
                return voiceInternalSettingsScreenKey.toString();
            }
        }, new G0U<VoiceInternalSettingsScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.partners.voice.entries.VoiceInternalSettingsEntryProvider$provideEntry$$inlined$entry$default$2
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(VoiceInternalSettingsScreenKey voiceInternalSettingsScreenKey) {
                return mapA0o;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(VoiceInternalSettingsScreenKey voiceInternalSettingsScreenKey) {
                return mapA0o;
            }
        }, g0w, C3cG.A0x(VoiceInternalSettingsScreenKey.class));
    }
}
