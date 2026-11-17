package com.facebook.aura.network.tigon;

import com.facebook.aura.network.AuraHttpResponse;

/* loaded from: classes5.dex */
public interface AuraTigonCallback {
    void onFailure(AuraHttpResponse auraHttpResponse, String str);

    void onResponse(AuraHttpResponse auraHttpResponse);
}
