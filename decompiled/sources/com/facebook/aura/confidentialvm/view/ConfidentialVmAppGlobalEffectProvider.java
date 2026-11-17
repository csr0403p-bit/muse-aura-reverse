package com.facebook.aura.confidentialvm.view;

import com.facebook.aura.globaleffects.api.AppGlobalEffect;
import com.facebook.aura.globaleffects.api.AppGlobalEffectProvider;

/* loaded from: classes2.dex */
public final class ConfidentialVmAppGlobalEffectProvider implements AppGlobalEffectProvider {
    public static final int $stable = 0;
    public static final ConfidentialVmAppGlobalEffectProvider INSTANCE = new ConfidentialVmAppGlobalEffectProvider();

    @Override // com.facebook.aura.globaleffects.api.AppGlobalEffectProvider
    public AppGlobalEffect effect() {
        return ConfidentialVmAppGlobalEffect.INSTANCE;
    }
}
