package com.facebook.aura.subscription.repo;

import X.C06H;
import X.C3cG;
import X.Ey9;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class HatchSubscriptionStatus {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchSubscriptionStatus[] $VALUES;
    public static final HatchSubscriptionStatus ACTIVE;
    public static final HatchSubscriptionStatus CANCELED;
    public static final Companion Companion;
    public static final HatchSubscriptionStatus EXPIRED;
    public static final HatchSubscriptionStatus IN_GRACE_PERIOD;
    public static final HatchSubscriptionStatus ON_HOLD;
    public static final HatchSubscriptionStatus PAUSED;
    public static final HatchSubscriptionStatus PROVISIONING;
    public final String serverValue;

    static {
        HatchSubscriptionStatus hatchSubscriptionStatus = new HatchSubscriptionStatus(AuraSubscriptionRepositoryJsonKt.PROVISIONING_STATUS, 0, AuraSubscriptionRepositoryJsonKt.PROVISIONING_STATUS);
        PROVISIONING = hatchSubscriptionStatus;
        HatchSubscriptionStatus hatchSubscriptionStatus2 = new HatchSubscriptionStatus("ACTIVE", 1, "ACTIVE");
        ACTIVE = hatchSubscriptionStatus2;
        HatchSubscriptionStatus hatchSubscriptionStatus3 = new HatchSubscriptionStatus("IN_GRACE_PERIOD", 2, "IN_GRACE_PERIOD");
        IN_GRACE_PERIOD = hatchSubscriptionStatus3;
        HatchSubscriptionStatus hatchSubscriptionStatus4 = new HatchSubscriptionStatus("ON_HOLD", 3, "ON_HOLD");
        ON_HOLD = hatchSubscriptionStatus4;
        HatchSubscriptionStatus hatchSubscriptionStatus5 = new HatchSubscriptionStatus("PAUSED", 4, "PAUSED");
        PAUSED = hatchSubscriptionStatus5;
        HatchSubscriptionStatus hatchSubscriptionStatus6 = new HatchSubscriptionStatus("CANCELED", 5, "CANCELED");
        CANCELED = hatchSubscriptionStatus6;
        HatchSubscriptionStatus hatchSubscriptionStatus7 = new HatchSubscriptionStatus("EXPIRED", 6, "EXPIRED");
        EXPIRED = hatchSubscriptionStatus7;
        HatchSubscriptionStatus[] hatchSubscriptionStatusArr = {hatchSubscriptionStatus, hatchSubscriptionStatus2, hatchSubscriptionStatus3, hatchSubscriptionStatus4, hatchSubscriptionStatus5, hatchSubscriptionStatus6, hatchSubscriptionStatus7};
        $VALUES = hatchSubscriptionStatusArr;
        $ENTRIES = C3cG.A0w(hatchSubscriptionStatusArr);
        Companion = new Companion();
    }

    public static Ey9<HatchSubscriptionStatus> getEntries() {
        return $ENTRIES;
    }

    public static HatchSubscriptionStatus valueOf(String str) {
        return (HatchSubscriptionStatus) Enum.valueOf(HatchSubscriptionStatus.class, str);
    }

    public static HatchSubscriptionStatus[] values() {
        return (HatchSubscriptionStatus[]) $VALUES.clone();
    }

    public final String getServerValue() {
        return this.serverValue;
    }

    public final class Companion {
        public final HatchSubscriptionStatus fromServerValue(String str) {
            if (str != null) {
                String upperCase = str.toUpperCase(Locale.ROOT);
                for (HatchSubscriptionStatus hatchSubscriptionStatus : HatchSubscriptionStatus.values()) {
                    if (upperCase.equals(hatchSubscriptionStatus.getServerValue())) {
                        return hatchSubscriptionStatus;
                    }
                }
            }
            return null;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public HatchSubscriptionStatus(String str, int i, String str2) {
        this.serverValue = str2;
    }
}
