package com.facebook.aura.gateway.service;

import com.facebook.aura.lifecycle.AppBackgroundedListener;

/* loaded from: classes3.dex */
public final class HatchGatewayBackgroundedListener implements AppBackgroundedListener {
    public static final HatchGatewayBackgroundedListener INSTANCE = new HatchGatewayBackgroundedListener();

    @Override // com.facebook.aura.lifecycle.AppBackgroundedListener
    public void onAppBackgrounded() {
        HatchGatewayServiceManager.INSTANCE.onAppBackgrounded$fbandroid_express_aura_java_com_facebook_aura_gateway_service_service();
    }
}
