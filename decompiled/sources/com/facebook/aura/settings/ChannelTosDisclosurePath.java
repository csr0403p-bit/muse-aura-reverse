package com.facebook.aura.settings;

import com.facebook.aura.network.api.StefiHatchPath;

/* loaded from: classes4.dex */
public final class ChannelTosDisclosurePath implements StefiHatchPath.Extension {
    public static final ChannelTosDisclosurePath INSTANCE = new ChannelTosDisclosurePath();
    public static final String value = "/hatch/channel-tos-disclosure";

    public boolean equals(Object obj) {
        return this == obj || (obj instanceof ChannelTosDisclosurePath);
    }

    @Override // com.facebook.aura.network.api.StefiPath
    public String getValue() {
        return value;
    }

    public String toString() {
        return "ChannelTosDisclosurePath";
    }

    public int hashCode() {
        return -1812328478;
    }
}
