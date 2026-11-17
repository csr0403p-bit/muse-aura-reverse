package com.facebook.aura.globaleffects.api;

import X.BFM;

/* loaded from: classes2.dex */
public interface AppGlobalEffect {

    /* renamed from: com.facebook.aura.globaleffects.api.AppGlobalEffect$-CC, reason: invalid class name */
    public abstract /* synthetic */ class CC {
        public static boolean $default$getRunsUnderBlockingOverlay(AppGlobalEffect appGlobalEffect) {
            return false;
        }

        public static /* synthetic */ boolean access$getRunsUnderBlockingOverlay$jd(AppGlobalEffect appGlobalEffect) {
            return false;
        }
    }

    public abstract class DefaultImpls {
        @Deprecated
        public static boolean getRunsUnderBlockingOverlay(AppGlobalEffect appGlobalEffect) {
            return false;
        }
    }

    void Effect(BFM bfm, int i);

    boolean getRunsUnderBlockingOverlay();
}
