package com.facebook.aura.storagerecovery.data;

import X.AbstractC2159Azp;
import X.C06H;
import X.C3cG;
import X.Ey9;
import com.facebook.aura.settings.HatchCredentialsViewModelKt;
import java.util.Iterator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class HatchStorageRecoveryErrorCode {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchStorageRecoveryErrorCode[] $VALUES;
    public static final Companion Companion;
    public static final HatchStorageRecoveryErrorCode DELETE_FAILED;
    public static final HatchStorageRecoveryErrorCode DIRECTORY_TOO_LARGE;
    public static final HatchStorageRecoveryErrorCode INVALID_REQUEST;
    public static final HatchStorageRecoveryErrorCode NOTARY_REQUIRED;
    public static final HatchStorageRecoveryErrorCode OPERATION_IN_PROGRESS;
    public static final HatchStorageRecoveryErrorCode PATH_NOT_ALLOWED;
    public static final HatchStorageRecoveryErrorCode RECOVERY_NOT_ACTIVE;
    public static final HatchStorageRecoveryErrorCode RECOVERY_UNAVAILABLE;
    public static final HatchStorageRecoveryErrorCode SELECTION_EXPIRED;
    public static final HatchStorageRecoveryErrorCode SELECTION_STALE;
    public static final HatchStorageRecoveryErrorCode STORAGE_READ_ONLY;
    public static final HatchStorageRecoveryErrorCode STORAGE_STATE_UNKNOWN;
    public static final HatchStorageRecoveryErrorCode STORAGE_UNAVAILABLE;
    public static final HatchStorageRecoveryErrorCode UNAUTHORIZED;
    public final String wire;

    static {
        HatchStorageRecoveryErrorCode hatchStorageRecoveryErrorCode = new HatchStorageRecoveryErrorCode("INVALID_REQUEST", 0, HatchCredentialsViewModelKt.SECURE_STORAGE_FAILURE_INVALID_REQUEST);
        INVALID_REQUEST = hatchStorageRecoveryErrorCode;
        HatchStorageRecoveryErrorCode hatchStorageRecoveryErrorCode2 = new HatchStorageRecoveryErrorCode("UNAUTHORIZED", 1, "unauthorized");
        UNAUTHORIZED = hatchStorageRecoveryErrorCode2;
        HatchStorageRecoveryErrorCode hatchStorageRecoveryErrorCode3 = new HatchStorageRecoveryErrorCode("NOTARY_REQUIRED", 2, "notary_required");
        NOTARY_REQUIRED = hatchStorageRecoveryErrorCode3;
        HatchStorageRecoveryErrorCode hatchStorageRecoveryErrorCode4 = new HatchStorageRecoveryErrorCode("PATH_NOT_ALLOWED", 3, "path_not_allowed");
        PATH_NOT_ALLOWED = hatchStorageRecoveryErrorCode4;
        HatchStorageRecoveryErrorCode hatchStorageRecoveryErrorCode5 = new HatchStorageRecoveryErrorCode("RECOVERY_NOT_ACTIVE", 4, "recovery_not_active");
        RECOVERY_NOT_ACTIVE = hatchStorageRecoveryErrorCode5;
        HatchStorageRecoveryErrorCode hatchStorageRecoveryErrorCode6 = new HatchStorageRecoveryErrorCode("STORAGE_UNAVAILABLE", 5, "storage_unavailable");
        STORAGE_UNAVAILABLE = hatchStorageRecoveryErrorCode6;
        HatchStorageRecoveryErrorCode hatchStorageRecoveryErrorCode7 = new HatchStorageRecoveryErrorCode("STORAGE_READ_ONLY", 6, "storage_read_only");
        STORAGE_READ_ONLY = hatchStorageRecoveryErrorCode7;
        HatchStorageRecoveryErrorCode hatchStorageRecoveryErrorCode8 = new HatchStorageRecoveryErrorCode("SELECTION_EXPIRED", 7, "selection_expired");
        SELECTION_EXPIRED = hatchStorageRecoveryErrorCode8;
        HatchStorageRecoveryErrorCode hatchStorageRecoveryErrorCode9 = new HatchStorageRecoveryErrorCode("SELECTION_STALE", 8, "selection_stale");
        SELECTION_STALE = hatchStorageRecoveryErrorCode9;
        HatchStorageRecoveryErrorCode hatchStorageRecoveryErrorCode10 = new HatchStorageRecoveryErrorCode("DIRECTORY_TOO_LARGE", 9, "directory_too_large");
        DIRECTORY_TOO_LARGE = hatchStorageRecoveryErrorCode10;
        HatchStorageRecoveryErrorCode hatchStorageRecoveryErrorCode11 = new HatchStorageRecoveryErrorCode("OPERATION_IN_PROGRESS", 10, "operation_in_progress");
        OPERATION_IN_PROGRESS = hatchStorageRecoveryErrorCode11;
        HatchStorageRecoveryErrorCode hatchStorageRecoveryErrorCode12 = new HatchStorageRecoveryErrorCode("DELETE_FAILED", 11, "delete_failed");
        DELETE_FAILED = hatchStorageRecoveryErrorCode12;
        HatchStorageRecoveryErrorCode hatchStorageRecoveryErrorCode13 = new HatchStorageRecoveryErrorCode("STORAGE_STATE_UNKNOWN", 12, "storage_state_unknown");
        STORAGE_STATE_UNKNOWN = hatchStorageRecoveryErrorCode13;
        HatchStorageRecoveryErrorCode hatchStorageRecoveryErrorCode14 = new HatchStorageRecoveryErrorCode("RECOVERY_UNAVAILABLE", 13, "recovery_unavailable");
        RECOVERY_UNAVAILABLE = hatchStorageRecoveryErrorCode14;
        HatchStorageRecoveryErrorCode[] hatchStorageRecoveryErrorCodeArr = {hatchStorageRecoveryErrorCode, hatchStorageRecoveryErrorCode2, hatchStorageRecoveryErrorCode3, hatchStorageRecoveryErrorCode4, hatchStorageRecoveryErrorCode5, hatchStorageRecoveryErrorCode6, hatchStorageRecoveryErrorCode7, hatchStorageRecoveryErrorCode8, hatchStorageRecoveryErrorCode9, hatchStorageRecoveryErrorCode10, hatchStorageRecoveryErrorCode11, hatchStorageRecoveryErrorCode12, hatchStorageRecoveryErrorCode13, hatchStorageRecoveryErrorCode14};
        $VALUES = hatchStorageRecoveryErrorCodeArr;
        $ENTRIES = C3cG.A0w(hatchStorageRecoveryErrorCodeArr);
        Companion = new Companion();
    }

    public final class Companion {
        public final HatchStorageRecoveryErrorCode fromWire(String str) {
            HatchStorageRecoveryErrorCode next;
            Iterator<HatchStorageRecoveryErrorCode> it = HatchStorageRecoveryErrorCode.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (AbstractC2159Azp.A12(next.getWire(), str, true)) {
                    break;
                }
            }
            return next;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static Ey9<HatchStorageRecoveryErrorCode> getEntries() {
        return $ENTRIES;
    }

    public static HatchStorageRecoveryErrorCode valueOf(String str) {
        return (HatchStorageRecoveryErrorCode) Enum.valueOf(HatchStorageRecoveryErrorCode.class, str);
    }

    public static HatchStorageRecoveryErrorCode[] values() {
        return (HatchStorageRecoveryErrorCode[]) $VALUES.clone();
    }

    public final String getWire() {
        return this.wire;
    }

    public HatchStorageRecoveryErrorCode(String str, int i, String str2) {
        this.wire = str2;
    }
}
