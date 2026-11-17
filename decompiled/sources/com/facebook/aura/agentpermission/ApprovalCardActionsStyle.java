package com.facebook.aura.agentpermission;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class ApprovalCardActionsStyle {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ApprovalCardActionsStyle[] $VALUES;
    public static final ApprovalCardActionsStyle CHECKOUT;
    public static final ApprovalCardActionsStyle PERMISSION;

    static {
        ApprovalCardActionsStyle approvalCardActionsStyle = new ApprovalCardActionsStyle("CHECKOUT", 0);
        CHECKOUT = approvalCardActionsStyle;
        ApprovalCardActionsStyle approvalCardActionsStyle2 = new ApprovalCardActionsStyle("PERMISSION", 1);
        PERMISSION = approvalCardActionsStyle2;
        ApprovalCardActionsStyle[] approvalCardActionsStyleArr = {approvalCardActionsStyle, approvalCardActionsStyle2};
        $VALUES = approvalCardActionsStyleArr;
        $ENTRIES = C3cG.A0w(approvalCardActionsStyleArr);
    }

    public static Ey9<ApprovalCardActionsStyle> getEntries() {
        return $ENTRIES;
    }

    public static ApprovalCardActionsStyle valueOf(String str) {
        return (ApprovalCardActionsStyle) Enum.valueOf(ApprovalCardActionsStyle.class, str);
    }

    public static ApprovalCardActionsStyle[] values() {
        return (ApprovalCardActionsStyle[]) $VALUES.clone();
    }

    public ApprovalCardActionsStyle(String str, int i) {
    }
}
