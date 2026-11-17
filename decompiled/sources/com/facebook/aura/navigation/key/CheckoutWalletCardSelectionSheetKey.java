package com.facebook.aura.navigation.key;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import com.facebook.aura.navigation.AuraBottomSheetNavKey;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class CheckoutWalletCardSelectionSheetKey extends C06G implements AuraBottomSheetNavKey {
    public static final Companion Companion = new Companion();
    public final String approvalId;
    public final String paymentMethod;

    public final class Companion {
        public final C9hr<CheckoutWalletCardSelectionSheetKey> serializer() {
            return CheckoutWalletCardSelectionSheetKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_navigation_key_key(CheckoutWalletCardSelectionSheetKey checkoutWalletCardSelectionSheetKey, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(checkoutWalletCardSelectionSheetKey.approvalId, c9iZ, 0);
        c9j5.AAV(checkoutWalletCardSelectionSheetKey.paymentMethod, c9iZ, 1);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CheckoutWalletCardSelectionSheetKey) {
                CheckoutWalletCardSelectionSheetKey checkoutWalletCardSelectionSheetKey = (CheckoutWalletCardSelectionSheetKey) obj;
                if (!C7384Etj.areEqual(this.approvalId, checkoutWalletCardSelectionSheetKey.approvalId) || !C7384Etj.areEqual(this.paymentMethod, checkoutWalletCardSelectionSheetKey.paymentMethod)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ CheckoutWalletCardSelectionSheetKey copy$default(CheckoutWalletCardSelectionSheetKey checkoutWalletCardSelectionSheetKey, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = checkoutWalletCardSelectionSheetKey.approvalId;
        }
        if ((i & 2) != 0) {
            str2 = checkoutWalletCardSelectionSheetKey.paymentMethod;
        }
        AnonymousClass003.A0u(str, str2);
        return new CheckoutWalletCardSelectionSheetKey(str, str2);
    }

    public final String component1() {
        return this.approvalId;
    }

    public final String component2() {
        return this.paymentMethod;
    }

    public final String getApprovalId() {
        return this.approvalId;
    }

    public final String getPaymentMethod() {
        return this.paymentMethod;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.paymentMethod, AnonymousClass001.A0G(this.approvalId));
    }

    public CheckoutWalletCardSelectionSheetKey(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.approvalId = str;
        this.paymentMethod = str2;
    }

    public final CheckoutWalletCardSelectionSheetKey copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new CheckoutWalletCardSelectionSheetKey(str, str2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ CheckoutWalletCardSelectionSheetKey(int i, String str, String str2, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(CheckoutWalletCardSelectionSheetKey$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.approvalId = str;
        this.paymentMethod = str2;
    }
}
