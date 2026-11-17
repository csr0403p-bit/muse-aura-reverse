package com.facebook.aura.analytics.hatch;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.qpl.startup.points.HatchStartupPoints;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class HatchNotificationChannel {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchNotificationChannel[] $VALUES;
    public static final HatchNotificationChannel IN_APP_BANNER;
    public static final HatchNotificationChannel PUSH;
    public final String value;

    static {
        HatchNotificationChannel hatchNotificationChannel = new HatchNotificationChannel("PUSH", 0, HatchStartupPoints.PREFETCH_WRITER_PUSH);
        PUSH = hatchNotificationChannel;
        HatchNotificationChannel hatchNotificationChannel2 = new HatchNotificationChannel("IN_APP_BANNER", 1, "in_app_banner");
        IN_APP_BANNER = hatchNotificationChannel2;
        HatchNotificationChannel[] hatchNotificationChannelArr = {hatchNotificationChannel, hatchNotificationChannel2};
        $VALUES = hatchNotificationChannelArr;
        $ENTRIES = C3cG.A0w(hatchNotificationChannelArr);
    }

    public static Ey9<HatchNotificationChannel> getEntries() {
        return $ENTRIES;
    }

    public static HatchNotificationChannel valueOf(String str) {
        return (HatchNotificationChannel) Enum.valueOf(HatchNotificationChannel.class, str);
    }

    public static HatchNotificationChannel[] values() {
        return (HatchNotificationChannel[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public HatchNotificationChannel(String str, int i, String str2) {
        this.value = str2;
    }
}
