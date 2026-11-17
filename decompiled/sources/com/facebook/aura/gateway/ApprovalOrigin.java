package com.facebook.aura.gateway;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class ApprovalOrigin {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ApprovalOrigin[] $VALUES;
    public static final ApprovalOrigin LOCAL_HITL;
    public static final ApprovalOrigin SERVER;

    static {
        ApprovalOrigin approvalOrigin = new ApprovalOrigin("LOCAL_HITL", 0);
        LOCAL_HITL = approvalOrigin;
        ApprovalOrigin approvalOrigin2 = new ApprovalOrigin("SERVER", 1);
        SERVER = approvalOrigin2;
        ApprovalOrigin[] approvalOriginArr = {approvalOrigin, approvalOrigin2};
        $VALUES = approvalOriginArr;
        $ENTRIES = C3cG.A0w(approvalOriginArr);
    }

    public static Ey9<ApprovalOrigin> getEntries() {
        return $ENTRIES;
    }

    public static ApprovalOrigin valueOf(String str) {
        return (ApprovalOrigin) Enum.valueOf(ApprovalOrigin.class, str);
    }

    public static ApprovalOrigin[] values() {
        return (ApprovalOrigin[]) $VALUES.clone();
    }

    public ApprovalOrigin(String str, int i) {
    }
}
