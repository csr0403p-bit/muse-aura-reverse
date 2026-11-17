package com.facebook.aura.gateway;

import X.C06H;
import X.C3cG;
import X.C7384Etj;
import X.Ey9;
import com.facebook.aura.browsertask.conversation.BrowserSignInPushPresenterKt;
import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;
import java.util.Iterator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class PurchasePreapprovalRowKind {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ PurchasePreapprovalRowKind[] $VALUES;
    public static final Companion Companion;
    public static final PurchasePreapprovalRowKind EXPIRY;
    public static final PurchasePreapprovalRowKind PAYMENT;
    public static final PurchasePreapprovalRowKind SIGN_IN;
    public static final PurchasePreapprovalRowKind UNKNOWN;
    public final String wireValue;

    static {
        PurchasePreapprovalRowKind purchasePreapprovalRowKind = new PurchasePreapprovalRowKind("SIGN_IN", 0, BrowserSignInPushPresenterKt.SIGN_IN_REASON);
        SIGN_IN = purchasePreapprovalRowKind;
        PurchasePreapprovalRowKind purchasePreapprovalRowKind2 = new PurchasePreapprovalRowKind("PAYMENT", 1, "payment");
        PAYMENT = purchasePreapprovalRowKind2;
        PurchasePreapprovalRowKind purchasePreapprovalRowKind3 = new PurchasePreapprovalRowKind("EXPIRY", 2, HatchCcvLoggingKt.FIELD_EXPIRY);
        EXPIRY = purchasePreapprovalRowKind3;
        PurchasePreapprovalRowKind purchasePreapprovalRowKind4 = new PurchasePreapprovalRowKind("UNKNOWN", 3, null);
        UNKNOWN = purchasePreapprovalRowKind4;
        PurchasePreapprovalRowKind[] purchasePreapprovalRowKindArr = {purchasePreapprovalRowKind, purchasePreapprovalRowKind2, purchasePreapprovalRowKind3, purchasePreapprovalRowKind4};
        $VALUES = purchasePreapprovalRowKindArr;
        $ENTRIES = C3cG.A0w(purchasePreapprovalRowKindArr);
        Companion = new Companion();
    }

    public final class Companion {
        public final PurchasePreapprovalRowKind fromWire(String str) {
            PurchasePreapprovalRowKind next;
            Iterator<PurchasePreapprovalRowKind> it = PurchasePreapprovalRowKind.getEntries().iterator();
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
            PurchasePreapprovalRowKind purchasePreapprovalRowKind = next;
            return purchasePreapprovalRowKind == null ? PurchasePreapprovalRowKind.UNKNOWN : purchasePreapprovalRowKind;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static Ey9<PurchasePreapprovalRowKind> getEntries() {
        return $ENTRIES;
    }

    public static PurchasePreapprovalRowKind valueOf(String str) {
        return (PurchasePreapprovalRowKind) Enum.valueOf(PurchasePreapprovalRowKind.class, str);
    }

    public static PurchasePreapprovalRowKind[] values() {
        return (PurchasePreapprovalRowKind[]) $VALUES.clone();
    }

    public final String getWireValue() {
        return this.wireValue;
    }

    public PurchasePreapprovalRowKind(String str, int i, String str2) {
        this.wireValue = str2;
    }
}
