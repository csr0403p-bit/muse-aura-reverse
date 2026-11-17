package com.facebook.aura.partners.accountlinking.nativeauthlogging;

import android.content.Context;
import com.facebook.aura.lifecycle.AppOpenedListener;

/* loaded from: classes5.dex */
public final class MAHatchNativeAuthAppOpenedListener implements AppOpenedListener {
    public static final MAHatchNativeAuthAppOpenedListener INSTANCE = new MAHatchNativeAuthAppOpenedListener();

    @Override // com.facebook.aura.lifecycle.AppOpenedListener
    public void onAppOpened(Context context) {
        if (MAHatchNativeAuthAppStartLogger.INSTANCE.isExposureEligible$fbandroid_express_aura_java_com_facebook_aura_partners_accountlinking_nativeauthlogging_nativeauthlogging()) {
            MAHatchNativeAuthAppStartLoggerKt.isLoggingEnabled();
        }
    }
}
