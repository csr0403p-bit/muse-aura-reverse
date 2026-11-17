package com.meta.maps.display;

import java.util.Map;

/* loaded from: classes4.dex */
public interface FeatureController {
    Map<String, String> getFeatureProperties(String str);

    String getFeatureProperty(String str, String str2);

    void removeFeatureProperty(String str, String str2);

    void setFeatureProperties(String str, Map<String, String> map);

    void setFeatureProperty(String str, String str2, String str3);
}
