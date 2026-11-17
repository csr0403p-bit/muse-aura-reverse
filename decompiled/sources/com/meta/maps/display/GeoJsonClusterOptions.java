package com.meta.maps.display;

/* loaded from: classes4.dex */
public final class GeoJsonClusterOptions {
    public boolean cluster;
    public int clusterMaxZoom;
    public int clusterRadius;

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof GeoJsonClusterOptions) {
                GeoJsonClusterOptions geoJsonClusterOptions = (GeoJsonClusterOptions) obj;
                if (this.cluster != geoJsonClusterOptions.cluster || this.clusterRadius != geoJsonClusterOptions.clusterRadius || this.clusterMaxZoom != geoJsonClusterOptions.clusterMaxZoom) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((217 + (this.cluster ? 79 : 97)) * 31) + this.clusterRadius) * 31) + this.clusterMaxZoom;
    }

    public GeoJsonClusterOptions(boolean z, int i, int i2) {
        this.cluster = z;
        this.clusterRadius = i;
        this.clusterMaxZoom = i2;
    }

    public GeoJsonClusterOptions() {
        this.cluster = false;
        this.clusterRadius = 50;
        this.clusterMaxZoom = 14;
    }
}
