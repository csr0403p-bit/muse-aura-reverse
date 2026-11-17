package com.facebook.aura.login.nativeflow;

import X.C06H;
import X.C3cG;
import X.C7384Etj;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class HatchAuthLoginOptionsState {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchAuthLoginOptionsState[] $VALUES;
    public static final HatchAuthLoginOptionsState CONTACT_POINT_REQUIRED;
    public static final Companion Companion;
    public static final HatchAuthLoginOptionsState OTP_SENT;
    public static final HatchAuthLoginOptionsState PASSKEY_AVAILABLE;
    public static final HatchAuthLoginOptionsState PASSKEY_DISCOVERABLE;
    public static final HatchAuthLoginOptionsState UNKNOWN;

    static {
        HatchAuthLoginOptionsState hatchAuthLoginOptionsState = new HatchAuthLoginOptionsState("PASSKEY_AVAILABLE", 0);
        PASSKEY_AVAILABLE = hatchAuthLoginOptionsState;
        HatchAuthLoginOptionsState hatchAuthLoginOptionsState2 = new HatchAuthLoginOptionsState("PASSKEY_DISCOVERABLE", 1);
        PASSKEY_DISCOVERABLE = hatchAuthLoginOptionsState2;
        HatchAuthLoginOptionsState hatchAuthLoginOptionsState3 = new HatchAuthLoginOptionsState("CONTACT_POINT_REQUIRED", 2);
        CONTACT_POINT_REQUIRED = hatchAuthLoginOptionsState3;
        HatchAuthLoginOptionsState hatchAuthLoginOptionsState4 = new HatchAuthLoginOptionsState("OTP_SENT", 3);
        OTP_SENT = hatchAuthLoginOptionsState4;
        HatchAuthLoginOptionsState hatchAuthLoginOptionsState5 = new HatchAuthLoginOptionsState("UNKNOWN", 4);
        UNKNOWN = hatchAuthLoginOptionsState5;
        HatchAuthLoginOptionsState[] hatchAuthLoginOptionsStateArr = {hatchAuthLoginOptionsState, hatchAuthLoginOptionsState2, hatchAuthLoginOptionsState3, hatchAuthLoginOptionsState4, hatchAuthLoginOptionsState5};
        $VALUES = hatchAuthLoginOptionsStateArr;
        $ENTRIES = C3cG.A0w(hatchAuthLoginOptionsStateArr);
        Companion = new Companion();
    }

    public static Ey9<HatchAuthLoginOptionsState> getEntries() {
        return $ENTRIES;
    }

    public static HatchAuthLoginOptionsState valueOf(String str) {
        return (HatchAuthLoginOptionsState) Enum.valueOf(HatchAuthLoginOptionsState.class, str);
    }

    public static HatchAuthLoginOptionsState[] values() {
        return (HatchAuthLoginOptionsState[]) $VALUES.clone();
    }

    public final class Companion {
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final HatchAuthLoginOptionsState fromWire(String str) {
            C7384Etj.A0Y(str, 0);
            switch (str.hashCode()) {
                case -947610580:
                    if (str.equals("otp_sent")) {
                        return HatchAuthLoginOptionsState.OTP_SENT;
                    }
                    break;
                case 342257844:
                    if (str.equals("passkey_discoverable")) {
                        return HatchAuthLoginOptionsState.PASSKEY_DISCOVERABLE;
                    }
                    break;
                case 742226040:
                    if (str.equals("passkey_available")) {
                        return HatchAuthLoginOptionsState.PASSKEY_AVAILABLE;
                    }
                    break;
                case 1836830573:
                    if (str.equals("contact_point_required")) {
                        return HatchAuthLoginOptionsState.CONTACT_POINT_REQUIRED;
                    }
                    break;
            }
            return HatchAuthLoginOptionsState.UNKNOWN;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public HatchAuthLoginOptionsState(String str, int i) {
    }
}
