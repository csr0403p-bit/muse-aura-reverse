package com.facebook.aura.navigation.key;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.F60;
import com.facebook.aura.navigation.AuraBottomSheetNavKey;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class ShopifyCheckoutCartSheetKey extends C06G implements AuraBottomSheetNavKey {
    public static final Companion Companion = new Companion();
    public final String approvalId;

    public final class Companion {
        public final C9hr<ShopifyCheckoutCartSheetKey> serializer() {
            return ShopifyCheckoutCartSheetKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final ShopifyCheckoutCartSheetKey copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new ShopifyCheckoutCartSheetKey(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ShopifyCheckoutCartSheetKey) && C7384Etj.areEqual(this.approvalId, ((ShopifyCheckoutCartSheetKey) obj).approvalId));
    }

    public /* synthetic */ ShopifyCheckoutCartSheetKey(int i, String str, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(ShopifyCheckoutCartSheetKey$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.approvalId = str;
    }

    public static /* synthetic */ ShopifyCheckoutCartSheetKey copy$default(ShopifyCheckoutCartSheetKey shopifyCheckoutCartSheetKey, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shopifyCheckoutCartSheetKey.approvalId;
        }
        C7384Etj.A0Y(str, 0);
        return new ShopifyCheckoutCartSheetKey(str);
    }

    public final String component1() {
        return this.approvalId;
    }

    public final String getApprovalId() {
        return this.approvalId;
    }

    public int hashCode() {
        return this.approvalId.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public ShopifyCheckoutCartSheetKey(String str) {
        C7384Etj.A0Y(str, 0);
        this.approvalId = str;
    }
}
