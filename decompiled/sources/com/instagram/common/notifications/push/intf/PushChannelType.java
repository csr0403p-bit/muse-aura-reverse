package com.instagram.common.notifications.push.intf;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.conversation.offline.HatchPersistedMessageJson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class PushChannelType {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ PushChannelType[] A01;
    public final String type;

    static {
        PushChannelType[] pushChannelTypeArr = {new PushChannelType(HatchPersistedMessageJson.UNSEND_STATUS_NONE, 0, "none"), new PushChannelType("AMAZON", 1, "android_adm"), new PushChannelType("GCM", 2, "android_gcm"), new PushChannelType("FBNS", 3, "android_mqtt"), new PushChannelType("NOKIA", 4, "android_nokia"), new PushChannelType("FCM", 5, "android_fcm"), new PushChannelType("MSYS", 6, "msys"), new PushChannelType("LOCAL", 7, "local"), new PushChannelType("REALTIME_LOCAL_NOTIFICATION", 8, "realtime_local_notification"), new PushChannelType("SYNC", 9, "sync"), new PushChannelType("MEM", 10, "mem"), new PushChannelType("IRIS", 11, "iris")};
        A01 = pushChannelTypeArr;
        A00 = C3cG.A0w(pushChannelTypeArr);
    }

    public static PushChannelType valueOf(String str) {
        return (PushChannelType) Enum.valueOf(PushChannelType.class, str);
    }

    public static PushChannelType[] values() {
        return (PushChannelType[]) A01.clone();
    }

    public PushChannelType(String str, int i, String str2) {
        this.type = str2;
    }
}
