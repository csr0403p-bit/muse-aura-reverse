package com.facebook.aura.analytics.hatch.passkey;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.qpl.startup.points.HatchStartupPoints;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class HatchPasskeyEvent {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchPasskeyEvent[] $VALUES;
    public static final HatchPasskeyEvent ASSERTION_CANCEL;
    public static final HatchPasskeyEvent ASSERTION_DISCARDED;
    public static final HatchPasskeyEvent ASSERTION_FAILURE;
    public static final HatchPasskeyEvent ASSERTION_SUCCESS;
    public static final HatchPasskeyEvent ASSERTION_TRIGGERED;
    public static final HatchPasskeyEvent CHALLENGE_AVAILABLE;
    public static final HatchPasskeyEvent DEVICE_ELIGIBLE;
    public static final HatchPasskeyEvent FETCH_CHALLENGE_ERROR;
    public static final HatchPasskeyEvent LOGIN_DEFERRED;
    public static final HatchPasskeyEvent LOGIN_FAILURE;
    public static final HatchPasskeyEvent LOGIN_SUCCESS;
    public static final HatchPasskeyEvent OFFER_ABANDONED;
    public final String flow;
    public final String value;

    static {
        HatchPasskeyEvent hatchPasskeyEvent = new HatchPasskeyEvent("DEVICE_ELIGIBLE", 0, "passkey_device_eligibility_eligible", "entry_point");
        DEVICE_ELIGIBLE = hatchPasskeyEvent;
        HatchPasskeyEvent hatchPasskeyEvent2 = new HatchPasskeyEvent("CHALLENGE_AVAILABLE", 1, "passkey_client_challenge_available", "entry_point");
        CHALLENGE_AVAILABLE = hatchPasskeyEvent2;
        HatchPasskeyEvent hatchPasskeyEvent3 = new HatchPasskeyEvent("FETCH_CHALLENGE_ERROR", 2, "passkey_client_fetch_challenge_error", "entry_point");
        FETCH_CHALLENGE_ERROR = hatchPasskeyEvent3;
        HatchPasskeyEvent hatchPasskeyEvent4 = new HatchPasskeyEvent("ASSERTION_TRIGGERED", 3, "passkey_os_assertion_triggered", "assertion");
        ASSERTION_TRIGGERED = hatchPasskeyEvent4;
        HatchPasskeyEvent hatchPasskeyEvent5 = new HatchPasskeyEvent("ASSERTION_SUCCESS", 4, "passkey_os_assertion_success", "assertion");
        ASSERTION_SUCCESS = hatchPasskeyEvent5;
        HatchPasskeyEvent hatchPasskeyEvent6 = new HatchPasskeyEvent("ASSERTION_CANCEL", 5, "passkey_os_assertion_cancel", "assertion");
        ASSERTION_CANCEL = hatchPasskeyEvent6;
        HatchPasskeyEvent hatchPasskeyEvent7 = new HatchPasskeyEvent("ASSERTION_FAILURE", 6, "passkey_os_assertion_failure", "assertion");
        ASSERTION_FAILURE = hatchPasskeyEvent7;
        HatchPasskeyEvent hatchPasskeyEvent8 = new HatchPasskeyEvent("OFFER_ABANDONED", 7, "passkey_offer_abandoned", "entry_point");
        OFFER_ABANDONED = hatchPasskeyEvent8;
        HatchPasskeyEvent hatchPasskeyEvent9 = new HatchPasskeyEvent("ASSERTION_DISCARDED", 8, "passkey_assertion_discarded", "assertion");
        ASSERTION_DISCARDED = hatchPasskeyEvent9;
        HatchPasskeyEvent hatchPasskeyEvent10 = new HatchPasskeyEvent("LOGIN_SUCCESS", 9, "passkey_login_success", HatchStartupPoints.SURFACE_LOGIN);
        LOGIN_SUCCESS = hatchPasskeyEvent10;
        HatchPasskeyEvent hatchPasskeyEvent11 = new HatchPasskeyEvent("LOGIN_FAILURE", 10, "passkey_login_failure", HatchStartupPoints.SURFACE_LOGIN);
        LOGIN_FAILURE = hatchPasskeyEvent11;
        HatchPasskeyEvent hatchPasskeyEvent12 = new HatchPasskeyEvent("LOGIN_DEFERRED", 11, "passkey_login_deferred", HatchStartupPoints.SURFACE_LOGIN);
        LOGIN_DEFERRED = hatchPasskeyEvent12;
        HatchPasskeyEvent[] hatchPasskeyEventArr = {hatchPasskeyEvent, hatchPasskeyEvent2, hatchPasskeyEvent3, hatchPasskeyEvent4, hatchPasskeyEvent5, hatchPasskeyEvent6, hatchPasskeyEvent7, hatchPasskeyEvent8, hatchPasskeyEvent9, hatchPasskeyEvent10, hatchPasskeyEvent11, hatchPasskeyEvent12};
        $VALUES = hatchPasskeyEventArr;
        $ENTRIES = C3cG.A0w(hatchPasskeyEventArr);
    }

    public static Ey9<HatchPasskeyEvent> getEntries() {
        return $ENTRIES;
    }

    public static HatchPasskeyEvent valueOf(String str) {
        return (HatchPasskeyEvent) Enum.valueOf(HatchPasskeyEvent.class, str);
    }

    public static HatchPasskeyEvent[] values() {
        return (HatchPasskeyEvent[]) $VALUES.clone();
    }

    public final String getFlow() {
        return this.flow;
    }

    public final String getValue() {
        return this.value;
    }

    public HatchPasskeyEvent(String str, int i, String str2, String str3) {
        this.value = str2;
        this.flow = str3;
    }
}
