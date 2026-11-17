package com.facebook.aura.commands.photos;

import X.AbstractC2159Azp;

/* loaded from: classes3.dex */
public abstract class DeviceMediaStoreReaderKt {
    public static final String EFFECTIVE_DATE_MS = "COALESCE(datetaken, date_modified * 1000)";
    public static final String LIKE_ESCAPE_CHAR = "\\";
    public static final String TAG = "DeviceMediaStoreReader";

    public static final String escapeLikeLiteral(String str) {
        return AbstractC2159Azp.A0z(AbstractC2159Azp.A0z(AbstractC2159Azp.A0z(str, LIKE_ESCAPE_CHAR, "\\\\"), "%", "\\%"), "_", "\\_");
    }
}
