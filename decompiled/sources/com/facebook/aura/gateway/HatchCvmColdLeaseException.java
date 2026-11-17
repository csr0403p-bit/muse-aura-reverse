package com.facebook.aura.gateway;

import X.AnonymousClass000;
import X.C3cG;
import X.C3cJ;
import X.C7384Etj;
import X.Ey9;
import com.facebook.aura.browsertask.control.BrowserTaskStopKt;
import com.facebook.aura.json.NetworkException;
import com.facebook.aura.network.api.StefiHatchPath;
import com.facebook.aura.settings.HatchCredentialsViewModelKt;

/* loaded from: classes4.dex */
public final class HatchCvmColdLeaseException extends NetworkException {
    public static final int $stable = 8;
    public final Reason reason;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Reason {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ Reason[] $VALUES;
        public static final Reason ACCESS_DENIED;
        public static final Reason CAPACITY_UNAVAILABLE;
        public static final Reason COLD_LEASE_DISABLED;
        public static final Reason CONFLICT;
        public static final Reason INVALID_REQUEST;
        public static final Reason VM_LIMIT;
        public final int httpResponseCode;
        public final String type;

        static {
            Reason reason = new Reason("INVALID_REQUEST", 0, HatchCredentialsViewModelKt.SECURE_STORAGE_FAILURE_INVALID_REQUEST, 400);
            INVALID_REQUEST = reason;
            Reason reason2 = new Reason("ACCESS_DENIED", 1, "access_denied", 403);
            ACCESS_DENIED = reason2;
            Reason reason3 = new Reason("COLD_LEASE_DISABLED", 2, "cold_lease_disabled", 403);
            COLD_LEASE_DISABLED = reason3;
            Reason reason4 = new Reason("CONFLICT", 3, "conflict", 409);
            CONFLICT = reason4;
            Reason reason5 = new Reason("VM_LIMIT", 4, "vm_limit", 409);
            VM_LIMIT = reason5;
            Reason reason6 = new Reason("CAPACITY_UNAVAILABLE", 5, "capacity_unavailable", BrowserTaskStopKt.HTTP_SERVICE_UNAVAILABLE);
            CAPACITY_UNAVAILABLE = reason6;
            Reason[] reasonArr = {reason, reason2, reason3, reason4, reason5, reason6};
            $VALUES = reasonArr;
            $ENTRIES = C3cG.A0w(reasonArr);
        }

        public static Ey9<Reason> getEntries() {
            return $ENTRIES;
        }

        public static Reason valueOf(String str) {
            return (Reason) Enum.valueOf(Reason.class, str);
        }

        public static Reason[] values() {
            return (Reason[]) $VALUES.clone();
        }

        public final int getHttpResponseCode() {
            return this.httpResponseCode;
        }

        public final String getType() {
            return this.type;
        }

        public Reason(String str, int i, String str2, int i2) {
            this.type = str2;
            this.httpResponseCode = i2;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public HatchCvmColdLeaseException(Reason reason) {
        C7384Etj.A0Y(reason, 0);
        String value = StefiHatchPath.ColdLeaseCvm.INSTANCE.getValue();
        int httpResponseCode = reason.getHttpResponseCode();
        String type = reason.getType();
        StringBuilder sbA0g = C3cG.A0g(value);
        sbA0g.append(AnonymousClass000.A00(8));
        sbA0g.append(httpResponseCode);
        super(C3cJ.A0N(" (", type, sbA0g), httpResponseCode, type, null, null, null, null);
        this.reason = reason;
    }

    public final Reason getReason() {
        return this.reason;
    }
}
