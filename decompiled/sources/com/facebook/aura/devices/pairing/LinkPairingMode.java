package com.facebook.aura.devices.pairing;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class LinkPairingMode {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ LinkPairingMode[] $VALUES;
    public static final LinkPairingMode V4_CONFIRM_PRESS;
    public static final LinkPairingMode V5;
    public final int helloVersion;

    static {
        LinkPairingMode linkPairingMode = new LinkPairingMode("V4_CONFIRM_PRESS", 0, 4);
        V4_CONFIRM_PRESS = linkPairingMode;
        LinkPairingMode linkPairingMode2 = new LinkPairingMode("V5", 1, 5);
        V5 = linkPairingMode2;
        LinkPairingMode[] linkPairingModeArr = {linkPairingMode, linkPairingMode2};
        $VALUES = linkPairingModeArr;
        $ENTRIES = C3cG.A0w(linkPairingModeArr);
    }

    public static Ey9<LinkPairingMode> getEntries() {
        return $ENTRIES;
    }

    public static LinkPairingMode valueOf(String str) {
        return (LinkPairingMode) Enum.valueOf(LinkPairingMode.class, str);
    }

    public static LinkPairingMode[] values() {
        return (LinkPairingMode[]) $VALUES.clone();
    }

    public final int getHelloVersion() {
        return this.helloVersion;
    }

    public LinkPairingMode(String str, int i, int i2) {
        this.helloVersion = i2;
    }
}
