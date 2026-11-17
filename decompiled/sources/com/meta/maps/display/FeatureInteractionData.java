package com.meta.maps.display;

import X.AnonymousClass005;
import X.C60R;
import X.C6xC;
import java.util.Map;

/* loaded from: classes4.dex */
public final class FeatureInteractionData {
    public String featureId;
    public String geoJson;
    public Geometry geometry;
    public String layerId;
    public Map<String, String> properties;
    public String sourceId;
    public String sourceLayerId;

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof FeatureInteractionData) {
                FeatureInteractionData featureInteractionData = (FeatureInteractionData) obj;
                if (!C6xC.A00(this.featureId, featureInteractionData.featureId) || !C6xC.A00(this.sourceId, featureInteractionData.sourceId) || !C6xC.A00(this.sourceLayerId, featureInteractionData.sourceLayerId) || !C6xC.A00(this.layerId, featureInteractionData.layerId) || !C6xC.A00(this.properties, featureInteractionData.properties) || !C6xC.A00(this.geometry, featureInteractionData.geometry) || !C6xC.A00(this.geoJson, featureInteractionData.geoJson)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int iA0F = (AnonymousClass005.A0F(this.properties, AnonymousClass005.A0I(this.layerId, AnonymousClass005.A0I(this.sourceLayerId, AnonymousClass005.A0I(this.sourceId, (217 + this.featureId.hashCode()) * 31)))) + C60R.A01(this.geometry)) * 31;
        String str = this.geoJson;
        return iA0F + (str != null ? str.hashCode() : 0);
    }

    public FeatureInteractionData(String str, String str2, String str3, String str4, Map<String, String> map) {
        AnonymousClass005.A17(str, str2, str3, str4, map);
        this.featureId = str;
        this.sourceId = str2;
        this.sourceLayerId = str3;
        this.layerId = str4;
        this.properties = map;
        this.geometry = null;
        this.geoJson = null;
    }
}
