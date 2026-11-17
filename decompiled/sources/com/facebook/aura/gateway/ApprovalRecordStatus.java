package com.facebook.aura.gateway;

import X.C06H;
import X.C3cG;
import X.C7384Etj;
import X.Ey9;
import com.facebook.aura.ccv.nativeflow.HatchCheckoutClientKt;
import com.facebook.aura.pairs.PairsPendingLevelStoreKt;
import java.util.Iterator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class ApprovalRecordStatus {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ApprovalRecordStatus[] $VALUES;
    public static final ApprovalRecordStatus APPROVED;
    public static final Companion Companion;
    public static final ApprovalRecordStatus DENIED;
    public static final ApprovalRecordStatus PENDING;
    public static final ApprovalRecordStatus TIMED_OUT;
    public final String wireValue;

    static {
        ApprovalRecordStatus approvalRecordStatus = new ApprovalRecordStatus(HatchCheckoutClientKt.CHECKOUT_STATUS_PENDING, 0, PairsPendingLevelStoreKt.STATE_PENDING);
        PENDING = approvalRecordStatus;
        ApprovalRecordStatus approvalRecordStatus2 = new ApprovalRecordStatus("APPROVED", 1, "approved");
        APPROVED = approvalRecordStatus2;
        ApprovalRecordStatus approvalRecordStatus3 = new ApprovalRecordStatus("DENIED", 2, "denied");
        DENIED = approvalRecordStatus3;
        ApprovalRecordStatus approvalRecordStatus4 = new ApprovalRecordStatus("TIMED_OUT", 3, "timed_out");
        TIMED_OUT = approvalRecordStatus4;
        ApprovalRecordStatus[] approvalRecordStatusArr = {approvalRecordStatus, approvalRecordStatus2, approvalRecordStatus3, approvalRecordStatus4};
        $VALUES = approvalRecordStatusArr;
        $ENTRIES = C3cG.A0w(approvalRecordStatusArr);
        Companion = new Companion();
    }

    public final class Companion {
        public final ApprovalRecordStatus fromWire(String str) {
            ApprovalRecordStatus next;
            Iterator<ApprovalRecordStatus> it = ApprovalRecordStatus.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (C7384Etj.areEqual(next.getWireValue(), str)) {
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

    public static Ey9<ApprovalRecordStatus> getEntries() {
        return $ENTRIES;
    }

    public static ApprovalRecordStatus valueOf(String str) {
        return (ApprovalRecordStatus) Enum.valueOf(ApprovalRecordStatus.class, str);
    }

    public static ApprovalRecordStatus[] values() {
        return (ApprovalRecordStatus[]) $VALUES.clone();
    }

    public final String getWireValue() {
        return this.wireValue;
    }

    public ApprovalRecordStatus(String str, int i, String str2) {
        this.wireValue = str2;
    }
}
