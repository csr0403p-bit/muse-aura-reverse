package com.facebook.aura.attribution;

/* loaded from: classes5.dex */
public final class HatchAttributionDeviceProperties {
    public final String adid;

    public String getAdvertisingId() {
        return this.adid;
    }

    public String getFamilyDeviceId() {
        return null;
    }

    public String getSideLoadingId() {
        return null;
    }

    public HatchAttributionDeviceProperties(String str) {
        this.adid = str;
    }
}
