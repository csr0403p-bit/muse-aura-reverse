package com.facebook.traffic.nts.providers.radiosignal;

import X.C06H;

/* loaded from: classes3.dex */
public final class TasosCellularMetrics {
    public final Double aggregationParameter;
    public final String aggregationType;
    public final String connectionSubtype;
    public final TasosCellularIdentity identity;
    public final Boolean isConstrained;
    public final Integer linkQuality;
    public final String networkParams;
    public final String networkType;
    public final Double rsrp;
    public final Double rsrq;
    public final Double sinr;

    public TasosCellularMetrics() {
        this(null, null, null, null, null, null, null, null, null, null, null);
    }

    public final Double getAggregationParameter() {
        return this.aggregationParameter;
    }

    public final String getAggregationType() {
        return this.aggregationType;
    }

    public final String getConnectionSubtype() {
        return this.connectionSubtype;
    }

    public final TasosCellularIdentity getIdentity() {
        return this.identity;
    }

    public final Integer getLinkQuality() {
        return this.linkQuality;
    }

    public final String getNetworkParams() {
        return this.networkParams;
    }

    public final String getNetworkType() {
        return this.networkType;
    }

    public final Double getRsrp() {
        return this.rsrp;
    }

    public final Double getRsrq() {
        return this.rsrq;
    }

    public final Double getSinr() {
        return this.sinr;
    }

    public final Boolean isConstrained() {
        return this.isConstrained;
    }

    public TasosCellularMetrics(Double d, Double d2, Double d3, String str, TasosCellularIdentity tasosCellularIdentity, String str2, Double d4, String str3, Integer num, String str4, Boolean bool) {
        this.rsrp = d;
        this.rsrq = d2;
        this.sinr = d3;
        this.networkType = str;
        this.identity = tasosCellularIdentity;
        this.networkParams = str2;
        this.aggregationParameter = d4;
        this.aggregationType = str3;
        this.linkQuality = num;
        this.connectionSubtype = str4;
        this.isConstrained = bool;
    }

    public /* synthetic */ TasosCellularMetrics(Double d, Double d2, Double d3, String str, TasosCellularIdentity tasosCellularIdentity, String str2, Double d4, String str3, Integer num, String str4, Boolean bool, int i, C06H c06h) {
        this((i & 1) != 0 ? null : d, (i & 2) != 0 ? null : d2, (i & 4) != 0 ? null : d3, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : tasosCellularIdentity, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : d4, (i & 128) != 0 ? null : str3, (i & 256) != 0 ? null : num, (i & 512) != 0 ? null : str4, (i & 1024) != 0 ? null : bool);
    }
}
