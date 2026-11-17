package com.facebook.aura.devices.token;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class LinkDeviceApp {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ LinkDeviceApp[] $VALUES;
    public static final LinkDeviceApp MUSE_GADGET__DANGEROUSLY_HAS_FULL_CHAT_ACCESS;
    public static final LinkDeviceApp MUSE_HOME_LINK__NO_CHAT_ACCESS;
    public final long abraAppFbid;

    static {
        LinkDeviceApp linkDeviceApp = new LinkDeviceApp("MUSE_HOME_LINK__NO_CHAT_ACCESS", 0, 1082956221170756L);
        MUSE_HOME_LINK__NO_CHAT_ACCESS = linkDeviceApp;
        LinkDeviceApp linkDeviceApp2 = new LinkDeviceApp("MUSE_GADGET__DANGEROUSLY_HAS_FULL_CHAT_ACCESS", 1, 1503079994796347L);
        MUSE_GADGET__DANGEROUSLY_HAS_FULL_CHAT_ACCESS = linkDeviceApp2;
        LinkDeviceApp[] linkDeviceAppArr = {linkDeviceApp, linkDeviceApp2};
        $VALUES = linkDeviceAppArr;
        $ENTRIES = C3cG.A0w(linkDeviceAppArr);
    }

    public static Ey9<LinkDeviceApp> getEntries() {
        return $ENTRIES;
    }

    public static LinkDeviceApp valueOf(String str) {
        return (LinkDeviceApp) Enum.valueOf(LinkDeviceApp.class, str);
    }

    public static LinkDeviceApp[] values() {
        return (LinkDeviceApp[]) $VALUES.clone();
    }

    public final long getAbraAppFbid() {
        return this.abraAppFbid;
    }

    public LinkDeviceApp(String str, int i, long j) {
        this.abraAppFbid = j;
    }
}
