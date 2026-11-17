package com.facebook.mobileconfig.factory;

/* loaded from: classes5.dex */
public interface MobileConfigUpdateConfigsCallback {
    void onNetworkComplete(boolean z);

    void onNetworkCompleteWithMessage(boolean z, String str);

    void onNetworkCompleteWithResult(boolean z, String str, Integer num);
}
