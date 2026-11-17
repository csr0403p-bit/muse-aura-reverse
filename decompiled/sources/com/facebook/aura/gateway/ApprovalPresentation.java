package com.facebook.aura.gateway;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ApprovalPresentation {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ApprovalPresentation[] $VALUES;
    public static final ApprovalPresentation BLOCKING;
    public static final ApprovalPresentation NONBLOCKING;

    static {
        ApprovalPresentation approvalPresentation = new ApprovalPresentation("BLOCKING", 0);
        BLOCKING = approvalPresentation;
        ApprovalPresentation approvalPresentation2 = new ApprovalPresentation("NONBLOCKING", 1);
        NONBLOCKING = approvalPresentation2;
        ApprovalPresentation[] approvalPresentationArr = {approvalPresentation, approvalPresentation2};
        $VALUES = approvalPresentationArr;
        $ENTRIES = new F3w(approvalPresentationArr);
    }

    public static Ey9<ApprovalPresentation> getEntries() {
        return $ENTRIES;
    }

    public static ApprovalPresentation valueOf(String str) {
        return (ApprovalPresentation) Enum.valueOf(ApprovalPresentation.class, str);
    }

    public static ApprovalPresentation[] values() {
        return (ApprovalPresentation[]) $VALUES.clone();
    }

    public ApprovalPresentation(String str, int i) {
    }
}
