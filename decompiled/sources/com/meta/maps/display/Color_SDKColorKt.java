package com.meta.maps.display;

import java.util.Arrays;

/* loaded from: classes3.dex */
public abstract class Color_SDKColorKt {
    public static final int CHANNEL_MASK = 255;
    public static final float CHANNEL_MAX = 255.0f;

    public static final SDKColor toSdkColor(int i) {
        return new SDKColor(((i >> 16) & 255) / 255.0f, ((i >> 8) & 255) / 255.0f, (i & 255) / 255.0f, ((i >>> 24) & 255) / 255.0f);
    }

    public static final String toStyleColorString(int i) {
        return String.format("#%02X%02X%02X", Arrays.copyOf(new Object[]{Integer.valueOf((i >> 16) & 255), Integer.valueOf((i >> 8) & 255), Integer.valueOf(i & 255)}, 3));
    }
}
