package com.meta.maps.display;

/* loaded from: classes4.dex */
public interface SelectableContent {
    String getFeatureGeoJson(String str);

    String getIdentifier();

    String getLayerForFeature(String str);

    void onSelectionChanged(String str, boolean z);

    boolean ownsFeature(String str);

    boolean ownsSource(String str);
}
