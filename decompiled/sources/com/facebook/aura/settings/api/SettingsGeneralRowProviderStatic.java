package com.facebook.aura.settings.api;

import X.AnonymousClass005;
import com.facebook.aura.partners.voice.impl.VoiceControlsSettingsRowProvider;

/* loaded from: classes.dex */
public class SettingsGeneralRowProviderStatic {
    public static SettingsGeneralRowContributor contributor(int i) {
        if (i == 0) {
            return VoiceControlsSettingsRowProvider.INSTANCE.contributor();
        }
        throw AnonymousClass005.A0c(i);
    }

    public static int[] getKeys() {
        return AnonymousClass005.A1b();
    }
}
