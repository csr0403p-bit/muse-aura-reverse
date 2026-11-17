package com.facebook.aura.navigation.key;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import X.F60;
import com.facebook.aura.navigation.AuraBottomSheetNavKey;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class CheckoutLodgingPolicySheetKey extends C06G implements AuraBottomSheetNavKey {
    public final String approvalId;
    public final CheckoutLodgingPolicy policy;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cG.A1W(C79.A01, null, CheckoutLodgingPolicySheetKey$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<CheckoutLodgingPolicySheetKey> serializer() {
            return CheckoutLodgingPolicySheetKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CheckoutLodgingPolicySheetKey) {
                CheckoutLodgingPolicySheetKey checkoutLodgingPolicySheetKey = (CheckoutLodgingPolicySheetKey) obj;
                if (!C7384Etj.areEqual(this.approvalId, checkoutLodgingPolicySheetKey.approvalId) || this.policy != checkoutLodgingPolicySheetKey.policy) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ CheckoutLodgingPolicySheetKey copy$default(CheckoutLodgingPolicySheetKey checkoutLodgingPolicySheetKey, String str, CheckoutLodgingPolicy checkoutLodgingPolicy, int i, Object obj) {
        if ((i & 1) != 0) {
            str = checkoutLodgingPolicySheetKey.approvalId;
        }
        if ((i & 2) != 0) {
            checkoutLodgingPolicy = checkoutLodgingPolicySheetKey.policy;
        }
        AnonymousClass003.A0u(str, checkoutLodgingPolicy);
        return new CheckoutLodgingPolicySheetKey(str, checkoutLodgingPolicy);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_navigation_key_key(CheckoutLodgingPolicySheetKey checkoutLodgingPolicySheetKey, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        c9j5.AAV(checkoutLodgingPolicySheetKey.approvalId, c9iZ, 0);
        c9j5.AAQ(checkoutLodgingPolicySheetKey.policy, C3cH.A15(f0cArr, 1), c9iZ, 1);
    }

    public final String component1() {
        return this.approvalId;
    }

    public final CheckoutLodgingPolicy component2() {
        return this.policy;
    }

    public final String getApprovalId() {
        return this.approvalId;
    }

    public final CheckoutLodgingPolicy getPolicy() {
        return this.policy;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.policy, AnonymousClass001.A0G(this.approvalId));
    }

    public CheckoutLodgingPolicySheetKey(String str, CheckoutLodgingPolicy checkoutLodgingPolicy) {
        AnonymousClass003.A0u(str, checkoutLodgingPolicy);
        this.approvalId = str;
        this.policy = checkoutLodgingPolicy;
    }

    public final CheckoutLodgingPolicySheetKey copy(String str, CheckoutLodgingPolicy checkoutLodgingPolicy) {
        AnonymousClass003.A0u(str, checkoutLodgingPolicy);
        return new CheckoutLodgingPolicySheetKey(str, checkoutLodgingPolicy);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ CheckoutLodgingPolicySheetKey(int i, String str, CheckoutLodgingPolicy checkoutLodgingPolicy, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(CheckoutLodgingPolicySheetKey$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.approvalId = str;
        this.policy = checkoutLodgingPolicy;
    }
}
