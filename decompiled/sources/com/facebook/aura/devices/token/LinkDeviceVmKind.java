package com.facebook.aura.devices.token;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class LinkDeviceVmKind {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ LinkDeviceVmKind[] $VALUES;
    public static final LinkDeviceVmKind CVM;
    public static final LinkDeviceVmKind SVM;
    public final String wireValue;

    static {
        LinkDeviceVmKind linkDeviceVmKind = new LinkDeviceVmKind("SVM", 0, "svm");
        SVM = linkDeviceVmKind;
        LinkDeviceVmKind linkDeviceVmKind2 = new LinkDeviceVmKind("CVM", 1, "cvm");
        CVM = linkDeviceVmKind2;
        LinkDeviceVmKind[] linkDeviceVmKindArr = {linkDeviceVmKind, linkDeviceVmKind2};
        $VALUES = linkDeviceVmKindArr;
        $ENTRIES = C3cG.A0w(linkDeviceVmKindArr);
    }

    public static Ey9<LinkDeviceVmKind> getEntries() {
        return $ENTRIES;
    }

    public static LinkDeviceVmKind valueOf(String str) {
        return (LinkDeviceVmKind) Enum.valueOf(LinkDeviceVmKind.class, str);
    }

    public static LinkDeviceVmKind[] values() {
        return (LinkDeviceVmKind[]) $VALUES.clone();
    }

    public final String getWireValue() {
        return this.wireValue;
    }

    public LinkDeviceVmKind(String str, int i, String str2) {
        this.wireValue = str2;
    }
}
