package com.facebook.aura.globaleffects.api;

import X.AnonymousClass005;
import com.facebook.aura.confidentialvm.view.ConfidentialVmAppGlobalEffectProvider;
import com.facebook.aura.partners.voice.impl.VoiceAppGlobalEffectProvider;

/* loaded from: classes2.dex */
public class AppGlobalEffectProviderStatic {
    public static int[] getKeys() {
        return new int[]{0, 1};
    }

    public static AppGlobalEffect effect(int i) {
        if (i == 0) {
            return ConfidentialVmAppGlobalEffectProvider.INSTANCE.effect();
        }
        if (i == 1) {
            return VoiceAppGlobalEffectProvider.INSTANCE.effect();
        }
        throw AnonymousClass005.A0c(i);
    }
}
