package com.facebook.aura.devices.token;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class LinkDeviceKeyRole {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ LinkDeviceKeyRole[] $VALUES;
    public static final LinkDeviceKeyRole GADGET;
    public static final LinkDeviceKeyRole MUSE_HOME_LINK;
    public final String wireValue;

    static {
        LinkDeviceKeyRole linkDeviceKeyRole = new LinkDeviceKeyRole("MUSE_HOME_LINK", 0, "muse_home_link");
        MUSE_HOME_LINK = linkDeviceKeyRole;
        LinkDeviceKeyRole linkDeviceKeyRole2 = new LinkDeviceKeyRole("GADGET", 1, LinkPairedNodes.GADGET_FAMILY);
        GADGET = linkDeviceKeyRole2;
        LinkDeviceKeyRole[] linkDeviceKeyRoleArr = {linkDeviceKeyRole, linkDeviceKeyRole2};
        $VALUES = linkDeviceKeyRoleArr;
        $ENTRIES = C3cG.A0w(linkDeviceKeyRoleArr);
    }

    public static Ey9<LinkDeviceKeyRole> getEntries() {
        return $ENTRIES;
    }

    public static LinkDeviceKeyRole valueOf(String str) {
        return (LinkDeviceKeyRole) Enum.valueOf(LinkDeviceKeyRole.class, str);
    }

    public static LinkDeviceKeyRole[] values() {
        return (LinkDeviceKeyRole[]) $VALUES.clone();
    }

    public final String getWireValue() {
        return this.wireValue;
    }

    public LinkDeviceKeyRole(String str, int i, String str2) {
        this.wireValue = str2;
    }
}
