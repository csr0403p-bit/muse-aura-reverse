package com.facebook.aura.analytics.hatch;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.settings.HatchDataExportRepositoryKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class HatchNotificationOrigin {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchNotificationOrigin[] $VALUES;
    public static final HatchNotificationOrigin LOCAL;
    public static final HatchNotificationOrigin SERVER;
    public final String value;

    static {
        HatchNotificationOrigin hatchNotificationOrigin = new HatchNotificationOrigin("SERVER", 0, HatchDataExportRepositoryKt.FAILURE_SERVER);
        SERVER = hatchNotificationOrigin;
        HatchNotificationOrigin hatchNotificationOrigin2 = new HatchNotificationOrigin("LOCAL", 1, "local");
        LOCAL = hatchNotificationOrigin2;
        HatchNotificationOrigin[] hatchNotificationOriginArr = {hatchNotificationOrigin, hatchNotificationOrigin2};
        $VALUES = hatchNotificationOriginArr;
        $ENTRIES = C3cG.A0w(hatchNotificationOriginArr);
    }

    public static Ey9<HatchNotificationOrigin> getEntries() {
        return $ENTRIES;
    }

    public static HatchNotificationOrigin valueOf(String str) {
        return (HatchNotificationOrigin) Enum.valueOf(HatchNotificationOrigin.class, str);
    }

    public static HatchNotificationOrigin[] values() {
        return (HatchNotificationOrigin[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public HatchNotificationOrigin(String str, int i, String str2) {
        this.value = str2;
    }
}
