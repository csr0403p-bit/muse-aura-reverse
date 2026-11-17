package com.facebook.traffic.nts.providers.radiosignal;

import X.C06H;

/* loaded from: classes5.dex */
public final class TasosWifiMetrics {
    public final String bssid;
    public final Integer channelWidth;
    public final Integer frequencyMhz;
    public final Boolean isConstrained;
    public final Integer linkQuality;
    public final String networkParams;
    public final Double rssiDbm;
    public final Double rxLinkSpeedMbps;
    public final Double txLinkSpeedMbps;
    public final String wifiStandard;

    public TasosWifiMetrics() {
        this(null, null, null, null, null, null, null, null, null, null);
    }

    public final String getBssid() {
        return this.bssid;
    }

    public final Integer getChannelWidth() {
        return this.channelWidth;
    }

    public final Integer getFrequencyMhz() {
        return this.frequencyMhz;
    }

    public final Integer getLinkQuality() {
        return this.linkQuality;
    }

    public final String getNetworkParams() {
        return this.networkParams;
    }

    public final Double getRssiDbm() {
        return this.rssiDbm;
    }

    public final Double getRxLinkSpeedMbps() {
        return this.rxLinkSpeedMbps;
    }

    public final Double getTxLinkSpeedMbps() {
        return this.txLinkSpeedMbps;
    }

    public final String getWifiStandard() {
        return this.wifiStandard;
    }

    public final Boolean isConstrained() {
        return this.isConstrained;
    }

    public TasosWifiMetrics(Double d, Integer num, String str, Double d2, Double d3, Integer num2, Integer num3, Boolean bool, String str2, String str3) {
        this.rssiDbm = d;
        this.frequencyMhz = num;
        this.wifiStandard = str;
        this.txLinkSpeedMbps = d2;
        this.rxLinkSpeedMbps = d3;
        this.channelWidth = num2;
        this.linkQuality = num3;
        this.isConstrained = bool;
        this.bssid = str2;
        this.networkParams = str3;
    }

    public /* synthetic */ TasosWifiMetrics(Double d, Integer num, String str, Double d2, Double d3, Integer num2, Integer num3, Boolean bool, String str2, String str3, int i, C06H c06h) {
        this((i & 1) != 0 ? null : d, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : d2, (i & 16) != 0 ? null : d3, (i & 32) != 0 ? null : num2, (i & 64) != 0 ? null : num3, (i & 128) != 0 ? null : bool, (i & 256) != 0 ? null : str2, (i & 512) != 0 ? null : str3);
    }
}
