package com.facebook.tigon.iface;

import java.util.Map;

/* loaded from: classes5.dex */
public interface TigonAuthHandler {
    Map<String, String> getAllHeaders(String str);

    Map<String, String> getEmptyHeaders(String str);

    void update(String str, Map<String, String> map);
}
