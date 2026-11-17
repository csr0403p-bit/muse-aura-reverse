package com.facebook.aura.devices.token;

/* loaded from: classes4.dex */
public abstract class LinkDeviceTokenMinterKt {
    public static final String TAG = "LinkDeviceTokenMinter";
    public static final String UNKNOWN_REVOKES_KEY = "unknown_device_token_revokes";

    public static final String normalizeLinkNodeId(String str) {
        return HatchDeviceNodeIdKt.normalizeHatchDeviceNodeId(str);
    }
}
