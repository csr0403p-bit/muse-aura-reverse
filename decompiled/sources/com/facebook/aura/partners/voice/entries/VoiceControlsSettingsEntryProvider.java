package com.facebook.aura.partners.voice.entries;

import X.BFM;
import X.C3cG;
import X.C5rn;
import X.G0U;
import X.G0W;
import com.facebook.aura.navigation.AuraNavEntryProvider;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.key.VoiceControlsSettingsScreenKey;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class VoiceControlsSettingsEntryProvider implements AuraNavEntryProvider {
    public static final int $stable = 0;
    public static final VoiceControlsSettingsEntryProvider INSTANCE = new VoiceControlsSettingsEntryProvider();

    @Override // com.facebook.aura.navigation.AuraNavEntryProvider
    public void provideEntry(C5rn<AuraNavKey> c5rn) {
        final Map mapA0o = C3cG.A0o(c5rn);
        G0W<VoiceControlsSettingsScreenKey, BFM, Integer, Unit> g0w = ComposableSingletons$VoiceControlsSettingsEntryProviderKt.f215lambda$1428326282;
        c5rn.A00(new G0U<VoiceControlsSettingsScreenKey, Object>() { // from class: com.facebook.aura.partners.voice.entries.VoiceControlsSettingsEntryProvider$provideEntry$$inlined$entry$default$1
            @Override // X.G0U
            public final Object invoke(VoiceControlsSettingsScreenKey voiceControlsSettingsScreenKey) {
                return voiceControlsSettingsScreenKey.toString();
            }
        }, new G0U<VoiceControlsSettingsScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.partners.voice.entries.VoiceControlsSettingsEntryProvider$provideEntry$$inlined$entry$default$2
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(VoiceControlsSettingsScreenKey voiceControlsSettingsScreenKey) {
                return mapA0o;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(VoiceControlsSettingsScreenKey voiceControlsSettingsScreenKey) {
                return mapA0o;
            }
        }, g0w, C3cG.A0x(VoiceControlsSettingsScreenKey.class));
    }
}
