package com.facebook.aura.partners.accountlinking.nativeauthlogging;

import com.facebook.aura.network.api.StefiHatchPath;

/* loaded from: classes5.dex */
public final class NativeAuthAppStartDataPath implements StefiHatchPath.Extension {
    public static final NativeAuthAppStartDataPath INSTANCE = new NativeAuthAppStartDataPath();
    public static final String value = "/hatch/native-auth/app-start-data";

    public boolean equals(Object obj) {
        return this == obj || (obj instanceof NativeAuthAppStartDataPath);
    }

    @Override // com.facebook.aura.network.api.StefiPath
    public String getValue() {
        return value;
    }

    public String toString() {
        return "NativeAuthAppStartDataPath";
    }

    public int hashCode() {
        return -1767144611;
    }
}
