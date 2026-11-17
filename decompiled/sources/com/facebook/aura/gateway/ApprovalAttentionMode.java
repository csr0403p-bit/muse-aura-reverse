package com.facebook.aura.gateway;

import X.C06H;
import X.C3cG;
import X.C7384Etj;
import X.Ey9;
import java.util.Iterator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class ApprovalAttentionMode {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ApprovalAttentionMode[] $VALUES;
    public static final ApprovalAttentionMode BACKGROUND;
    public static final Companion Companion;
    public static final ApprovalAttentionMode FOREGROUND;
    public final String wireValue;

    static {
        ApprovalAttentionMode approvalAttentionMode = new ApprovalAttentionMode("FOREGROUND", 0, "foreground");
        FOREGROUND = approvalAttentionMode;
        ApprovalAttentionMode approvalAttentionMode2 = new ApprovalAttentionMode("BACKGROUND", 1, "background");
        BACKGROUND = approvalAttentionMode2;
        ApprovalAttentionMode[] approvalAttentionModeArr = {approvalAttentionMode, approvalAttentionMode2};
        $VALUES = approvalAttentionModeArr;
        $ENTRIES = C3cG.A0w(approvalAttentionModeArr);
        Companion = new Companion();
    }

    public final class Companion {
        public final ApprovalAttentionMode fromWire(String str) {
            ApprovalAttentionMode next;
            Iterator<ApprovalAttentionMode> it = ApprovalAttentionMode.getEntries().iterator();
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
            ApprovalAttentionMode approvalAttentionMode = next;
            return approvalAttentionMode == null ? ApprovalAttentionMode.FOREGROUND : approvalAttentionMode;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static Ey9<ApprovalAttentionMode> getEntries() {
        return $ENTRIES;
    }

    public static ApprovalAttentionMode valueOf(String str) {
        return (ApprovalAttentionMode) Enum.valueOf(ApprovalAttentionMode.class, str);
    }

    public static ApprovalAttentionMode[] values() {
        return (ApprovalAttentionMode[]) $VALUES.clone();
    }

    public final String getWireValue() {
        return this.wireValue;
    }

    public ApprovalAttentionMode(String str, int i, String str2) {
        this.wireValue = str2;
    }
}
