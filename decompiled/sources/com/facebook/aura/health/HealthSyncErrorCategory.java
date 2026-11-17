package com.facebook.aura.health;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.settings.HatchCredentialsViewModelKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class HealthSyncErrorCategory {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HealthSyncErrorCategory[] $VALUES;
    public static final HealthSyncErrorCategory API;
    public static final HealthSyncErrorCategory AUTH;
    public static final HealthSyncErrorCategory CANCELLED;
    public static final HealthSyncErrorCategory DEVICE_LOCKED;
    public static final HealthSyncErrorCategory NETWORK;
    public static final HealthSyncErrorCategory PERSISTENCE;
    public static final HealthSyncErrorCategory RATE_LIMIT;
    public static final HealthSyncErrorCategory UNKNOWN;
    public static final HealthSyncErrorCategory VALIDATION;
    public final String wireValue;

    static {
        HealthSyncErrorCategory healthSyncErrorCategory = new HealthSyncErrorCategory("AUTH", 0, "auth");
        AUTH = healthSyncErrorCategory;
        HealthSyncErrorCategory healthSyncErrorCategory2 = new HealthSyncErrorCategory("API", 1, "api");
        API = healthSyncErrorCategory2;
        HealthSyncErrorCategory healthSyncErrorCategory3 = new HealthSyncErrorCategory("NETWORK", 2, "network");
        NETWORK = healthSyncErrorCategory3;
        HealthSyncErrorCategory healthSyncErrorCategory4 = new HealthSyncErrorCategory("RATE_LIMIT", 3, "rate_limit");
        RATE_LIMIT = healthSyncErrorCategory4;
        HealthSyncErrorCategory healthSyncErrorCategory5 = new HealthSyncErrorCategory("VALIDATION", 4, HatchCredentialsViewModelKt.SECURE_STORAGE_FAILURE_VALIDATION);
        VALIDATION = healthSyncErrorCategory5;
        HealthSyncErrorCategory healthSyncErrorCategory6 = new HealthSyncErrorCategory("PERSISTENCE", 5, "persistence");
        PERSISTENCE = healthSyncErrorCategory6;
        HealthSyncErrorCategory healthSyncErrorCategory7 = new HealthSyncErrorCategory("DEVICE_LOCKED", 6, "device_locked");
        DEVICE_LOCKED = healthSyncErrorCategory7;
        HealthSyncErrorCategory healthSyncErrorCategory8 = new HealthSyncErrorCategory("CANCELLED", 7, "cancelled");
        CANCELLED = healthSyncErrorCategory8;
        HealthSyncErrorCategory healthSyncErrorCategory9 = new HealthSyncErrorCategory("UNKNOWN", 8, "unknown");
        UNKNOWN = healthSyncErrorCategory9;
        HealthSyncErrorCategory[] healthSyncErrorCategoryArr = {healthSyncErrorCategory, healthSyncErrorCategory2, healthSyncErrorCategory3, healthSyncErrorCategory4, healthSyncErrorCategory5, healthSyncErrorCategory6, healthSyncErrorCategory7, healthSyncErrorCategory8, healthSyncErrorCategory9};
        $VALUES = healthSyncErrorCategoryArr;
        $ENTRIES = C3cG.A0w(healthSyncErrorCategoryArr);
    }

    public static Ey9<HealthSyncErrorCategory> getEntries() {
        return $ENTRIES;
    }

    public static HealthSyncErrorCategory valueOf(String str) {
        return (HealthSyncErrorCategory) Enum.valueOf(HealthSyncErrorCategory.class, str);
    }

    public static HealthSyncErrorCategory[] values() {
        return (HealthSyncErrorCategory[]) $VALUES.clone();
    }

    public final String getWireValue() {
        return this.wireValue;
    }

    public HealthSyncErrorCategory(String str, int i, String str2) {
        this.wireValue = str2;
    }
}
