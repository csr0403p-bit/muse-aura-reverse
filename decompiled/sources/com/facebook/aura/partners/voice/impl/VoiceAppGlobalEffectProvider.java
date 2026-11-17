package com.facebook.aura.partners.voice.impl;

import com.facebook.aura.globaleffects.api.AppGlobalEffect;
import com.facebook.aura.globaleffects.api.AppGlobalEffectProvider;

/* loaded from: classes2.dex */
public final class VoiceAppGlobalEffectProvider implements AppGlobalEffectProvider {
    public static final int $stable = 0;
    public static final VoiceAppGlobalEffectProvider INSTANCE = new VoiceAppGlobalEffectProvider();

    @Override // com.facebook.aura.globaleffects.api.AppGlobalEffectProvider
    public AppGlobalEffect effect() {
        return VoiceAppGlobalEffect.INSTANCE;
    }
}
