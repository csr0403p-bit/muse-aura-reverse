package com.facebook.aura.gateway;

import X.C06H;
import X.C3cG;
import X.C7384Etj;
import X.Ey9;
import com.facebook.acra.constants.ReportField;
import com.facebook.aura.gateway.HatchFileOperations;
import com.facebook.aura.model.InternalLinkActionCardPresentationKt;
import java.util.Iterator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class ApprovalIconKey {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ApprovalIconKey[] $VALUES;
    public static final ApprovalIconKey BROWSER;
    public static final ApprovalIconKey CHECKOUT;
    public static final ApprovalIconKey CONNECTOR;
    public static final Companion Companion;
    public static final ApprovalIconKey DEVICE;
    public static final ApprovalIconKey MEDIA;
    public static final ApprovalIconKey NETWORK;
    public static final ApprovalIconKey TOOL;
    public static final ApprovalIconKey WARNING;
    public final String wireValue;

    static {
        ApprovalIconKey approvalIconKey = new ApprovalIconKey("NETWORK", 0, "network");
        NETWORK = approvalIconKey;
        ApprovalIconKey approvalIconKey2 = new ApprovalIconKey("WARNING", 1, "warning");
        WARNING = approvalIconKey2;
        ApprovalIconKey approvalIconKey3 = new ApprovalIconKey("CONNECTOR", 2, InternalLinkActionCardPresentationKt.INTERNAL_LINK_TYPE_CONNECTOR);
        CONNECTOR = approvalIconKey3;
        ApprovalIconKey approvalIconKey4 = new ApprovalIconKey("BROWSER", 3, "browser");
        BROWSER = approvalIconKey4;
        ApprovalIconKey approvalIconKey5 = new ApprovalIconKey("TOOL", 4, "tool");
        TOOL = approvalIconKey5;
        ApprovalIconKey approvalIconKey6 = new ApprovalIconKey("CHECKOUT", 5, "checkout");
        CHECKOUT = approvalIconKey6;
        ApprovalIconKey approvalIconKey7 = new ApprovalIconKey("MEDIA", 6, HatchFileOperations.LibraryPreset.media);
        MEDIA = approvalIconKey7;
        ApprovalIconKey approvalIconKey8 = new ApprovalIconKey(ReportField.DEVICE, 7, "device");
        DEVICE = approvalIconKey8;
        ApprovalIconKey[] approvalIconKeyArr = {approvalIconKey, approvalIconKey2, approvalIconKey3, approvalIconKey4, approvalIconKey5, approvalIconKey6, approvalIconKey7, approvalIconKey8};
        $VALUES = approvalIconKeyArr;
        $ENTRIES = C3cG.A0w(approvalIconKeyArr);
        Companion = new Companion();
    }

    public final class Companion {
        public Companion() {
        }

        public final ApprovalIconKey fromWire(String str) {
            ApprovalIconKey next;
            Iterator<ApprovalIconKey> it = ApprovalIconKey.getEntries().iterator();
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
    }

    public static Ey9<ApprovalIconKey> getEntries() {
        return $ENTRIES;
    }

    public static ApprovalIconKey valueOf(String str) {
        return (ApprovalIconKey) Enum.valueOf(ApprovalIconKey.class, str);
    }

    public static ApprovalIconKey[] values() {
        return (ApprovalIconKey[]) $VALUES.clone();
    }

    public final String getWireValue() {
        return this.wireValue;
    }

    public ApprovalIconKey(String str, int i, String str2) {
        this.wireValue = str2;
    }
}
