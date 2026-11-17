package com.facebook.aura.partners.voice.prefs;

import com.facebook.aura.common.prefs.AuraUserPrefStoreKey;

/* loaded from: classes2.dex */
public final class VoiceUserPrefStore implements AuraUserPrefStoreKey {
    public static final VoiceUserPrefStore INSTANCE = new VoiceUserPrefStore();
    public static final String key = "voice";

    @Override // com.facebook.aura.common.prefs.AuraUserPrefStoreKey
    public String getKey() {
        return key;
    }
}
