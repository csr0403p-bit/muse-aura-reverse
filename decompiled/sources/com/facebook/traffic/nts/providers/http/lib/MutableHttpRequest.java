package com.facebook.traffic.nts.providers.http.lib;

/* loaded from: classes6.dex */
public interface MutableHttpRequest {
    String getHostNameOrThrow();

    String getUrlOrThrow();

    void setHeader(String str, String str2);
}
