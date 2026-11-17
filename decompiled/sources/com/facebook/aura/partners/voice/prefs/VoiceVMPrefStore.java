package com.facebook.aura.partners.voice.prefs;

import com.facebook.aura.common.prefs.AuraVMPrefStoreKey;

/* loaded from: classes2.dex */
public final class VoiceVMPrefStore implements AuraVMPrefStoreKey {
    public static final VoiceVMPrefStore INSTANCE = new VoiceVMPrefStore();
    public static final String key = "voice";

    @Override // com.facebook.aura.common.prefs.AuraVMPrefStoreKey
    public String getKey() {
        return key;
    }
}
