package com.facebook.aura.network.acs;

import com.facebook.privacy.acs.VoprfRistretto;

/* loaded from: classes4.dex */
public final class HatchAcsNativeLoader {
    public static final HatchAcsNativeLoader INSTANCE = new HatchAcsNativeLoader();
    public static volatile boolean loaded;

    public final void ensureLoaded() {
        if (loaded) {
            return;
        }
        synchronized (this) {
            if (!loaded) {
                VoprfRistretto voprfRistretto = VoprfRistretto.$redex_init_class;
                loaded = true;
            }
        }
    }
}
