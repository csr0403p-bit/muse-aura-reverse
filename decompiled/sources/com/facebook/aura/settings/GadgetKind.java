package com.facebook.aura.settings;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class GadgetKind {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ GadgetKind[] $VALUES;
    public static final GadgetKind GLASSES;
    public static final GadgetKind HOME_LINK;
    public static final GadgetKind LINUX_GADGET;
    public static final GadgetKind WIFI_GADGET;

    static {
        GadgetKind gadgetKind = new GadgetKind("HOME_LINK", 0);
        HOME_LINK = gadgetKind;
        GadgetKind gadgetKind2 = new GadgetKind("WIFI_GADGET", 1);
        WIFI_GADGET = gadgetKind2;
        GadgetKind gadgetKind3 = new GadgetKind("LINUX_GADGET", 2);
        LINUX_GADGET = gadgetKind3;
        GadgetKind gadgetKind4 = new GadgetKind("GLASSES", 3);
        GLASSES = gadgetKind4;
        GadgetKind[] gadgetKindArr = {gadgetKind, gadgetKind2, gadgetKind3, gadgetKind4};
        $VALUES = gadgetKindArr;
        $ENTRIES = new F3w(gadgetKindArr);
    }

    public static Ey9<GadgetKind> getEntries() {
        return $ENTRIES;
    }

    public static GadgetKind valueOf(String str) {
        return (GadgetKind) Enum.valueOf(GadgetKind.class, str);
    }

    public static GadgetKind[] values() {
        return (GadgetKind[]) $VALUES.clone();
    }

    public GadgetKind(String str, int i) {
    }
}
