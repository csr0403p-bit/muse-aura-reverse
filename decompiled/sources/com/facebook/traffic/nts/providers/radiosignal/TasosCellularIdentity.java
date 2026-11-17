package com.facebook.traffic.nts.providers.radiosignal;

import X.C06H;

/* loaded from: classes3.dex */
public final class TasosCellularIdentity {
    public final Long cellId;
    public final String mobileCountryCode;
    public final String mobileNetworkCode;
    public final Integer physicalCellId;

    public /* synthetic */ TasosCellularIdentity(Long l, Integer num, String str, String str2, int i, C06H c06h) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2);
    }

    public final Long getCellId() {
        return this.cellId;
    }

    public final String getMobileCountryCode() {
        return this.mobileCountryCode;
    }

    public final String getMobileNetworkCode() {
        return this.mobileNetworkCode;
    }

    public final Integer getPhysicalCellId() {
        return this.physicalCellId;
    }

    public TasosCellularIdentity(Long l, Integer num, String str, String str2) {
        this.cellId = l;
        this.physicalCellId = num;
        this.mobileCountryCode = str;
        this.mobileNetworkCode = str2;
    }

    public TasosCellularIdentity() {
        this(null, null, null, null);
    }
}
