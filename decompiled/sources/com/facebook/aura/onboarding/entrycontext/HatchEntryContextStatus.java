package com.facebook.aura.onboarding.entrycontext;

import X.C06H;
import X.C3cG;
import X.C7384Etj;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class HatchEntryContextStatus {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchEntryContextStatus[] $VALUES;
    public static final HatchEntryContextStatus ALREADY_ACCEPTED;
    public static final Companion Companion;
    public static final HatchEntryContextStatus FALLBACK_ORGANIC;
    public static final HatchEntryContextStatus NOT_REQUESTED;
    public static final HatchEntryContextStatus RESOLVED;
    public static final HatchEntryContextStatus RETRYABLE;
    public static final HatchEntryContextStatus TERMINAL_MISS;
    public static final HatchEntryContextStatus UNRECOGNIZED;
    public final String loggingName;
    public final HatchEntryContextSettlement settlement;

    public final class Companion {
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final HatchEntryContextStatus fromServerValue(String str) {
            C7384Etj.A0Y(str, 0);
            switch (str.hashCode()) {
                case -1453688609:
                    if (str.equals("terminal_miss")) {
                        return HatchEntryContextStatus.TERMINAL_MISS;
                    }
                    break;
                case -1006492670:
                    if (str.equals("retryable")) {
                        return HatchEntryContextStatus.RETRYABLE;
                    }
                    break;
                case -410473842:
                    if (str.equals("fallback_organic")) {
                        return HatchEntryContextStatus.FALLBACK_ORGANIC;
                    }
                    break;
                case -341328904:
                    if (str.equals("resolved")) {
                        return HatchEntryContextStatus.RESOLVED;
                    }
                    break;
                case 445780226:
                    if (str.equals("not_requested")) {
                        return HatchEntryContextStatus.NOT_REQUESTED;
                    }
                    break;
                case 521864110:
                    if (str.equals("already_accepted")) {
                        return HatchEntryContextStatus.ALREADY_ACCEPTED;
                    }
                    break;
            }
            return HatchEntryContextStatus.UNRECOGNIZED;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        HatchEntryContextStatus hatchEntryContextStatus = new HatchEntryContextStatus("NOT_REQUESTED", 0, "not_requested", HatchEntryContextSettlement.CONTRACT_VIOLATION);
        NOT_REQUESTED = hatchEntryContextStatus;
        HatchEntryContextSettlement hatchEntryContextSettlement = HatchEntryContextSettlement.SETTLED;
        HatchEntryContextStatus hatchEntryContextStatus2 = new HatchEntryContextStatus("RESOLVED", 1, "resolved", hatchEntryContextSettlement);
        RESOLVED = hatchEntryContextStatus2;
        HatchEntryContextStatus hatchEntryContextStatus3 = new HatchEntryContextStatus("ALREADY_ACCEPTED", 2, "already_accepted", hatchEntryContextSettlement);
        ALREADY_ACCEPTED = hatchEntryContextStatus3;
        HatchEntryContextStatus hatchEntryContextStatus4 = new HatchEntryContextStatus("TERMINAL_MISS", 3, "terminal_miss", hatchEntryContextSettlement);
        TERMINAL_MISS = hatchEntryContextStatus4;
        HatchEntryContextSettlement hatchEntryContextSettlement2 = HatchEntryContextSettlement.RETRY;
        HatchEntryContextStatus hatchEntryContextStatus5 = new HatchEntryContextStatus("RETRYABLE", 4, "retryable", hatchEntryContextSettlement2);
        RETRYABLE = hatchEntryContextStatus5;
        HatchEntryContextStatus hatchEntryContextStatus6 = new HatchEntryContextStatus("FALLBACK_ORGANIC", 5, "fallback_organic", hatchEntryContextSettlement);
        FALLBACK_ORGANIC = hatchEntryContextStatus6;
        HatchEntryContextStatus hatchEntryContextStatus7 = new HatchEntryContextStatus("UNRECOGNIZED", 6, "unrecognized", hatchEntryContextSettlement2);
        UNRECOGNIZED = hatchEntryContextStatus7;
        HatchEntryContextStatus[] hatchEntryContextStatusArr = {hatchEntryContextStatus, hatchEntryContextStatus2, hatchEntryContextStatus3, hatchEntryContextStatus4, hatchEntryContextStatus5, hatchEntryContextStatus6, hatchEntryContextStatus7};
        $VALUES = hatchEntryContextStatusArr;
        $ENTRIES = C3cG.A0w(hatchEntryContextStatusArr);
        Companion = new Companion();
    }

    public static Ey9<HatchEntryContextStatus> getEntries() {
        return $ENTRIES;
    }

    public static HatchEntryContextStatus valueOf(String str) {
        return (HatchEntryContextStatus) Enum.valueOf(HatchEntryContextStatus.class, str);
    }

    public static HatchEntryContextStatus[] values() {
        return (HatchEntryContextStatus[]) $VALUES.clone();
    }

    public final String getLoggingName() {
        return this.loggingName;
    }

    public final HatchEntryContextSettlement getSettlement() {
        return this.settlement;
    }

    public HatchEntryContextStatus(String str, int i, String str2, HatchEntryContextSettlement hatchEntryContextSettlement) {
        this.loggingName = str2;
        this.settlement = hatchEntryContextSettlement;
    }
}
