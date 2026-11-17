package com.facebook.aura.gateway;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;
import com.facebook.aura.model.HatchSendErrorCategory;

/* loaded from: classes3.dex */
public final class DeliveryError extends C06G {
    public static final int $stable = 0;
    public final HatchSendErrorCategory category;
    public final String errorCode;
    public final String errorMessage;
    public final String requestId;

    public final DeliveryError copy(String str, String str2, String str3, HatchSendErrorCategory hatchSendErrorCategory) {
        AnonymousClass005.A11(str2, str3, hatchSendErrorCategory, 1);
        return new DeliveryError(str, str2, str3, hatchSendErrorCategory);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DeliveryError) {
                DeliveryError deliveryError = (DeliveryError) obj;
                if (!C7384Etj.areEqual(this.requestId, deliveryError.requestId) || !C7384Etj.areEqual(this.errorCode, deliveryError.errorCode) || !C7384Etj.areEqual(this.errorMessage, deliveryError.errorMessage) || this.category != deliveryError.category) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ DeliveryError(String str, String str2, String str3, HatchSendErrorCategory hatchSendErrorCategory, int i, C06H c06h) {
        this(str, str2, str3, (i & 8) != 0 ? HatchSendErrorCategory.NON_TRANSPORT : hatchSendErrorCategory);
    }

    public static /* synthetic */ DeliveryError copy$default(DeliveryError deliveryError, String str, String str2, String str3, HatchSendErrorCategory hatchSendErrorCategory, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deliveryError.requestId;
        }
        if ((i & 2) != 0) {
            str2 = deliveryError.errorCode;
        }
        if ((i & 4) != 0) {
            str3 = deliveryError.errorMessage;
        }
        if ((i & 8) != 0) {
            hatchSendErrorCategory = deliveryError.category;
        }
        return deliveryError.copy(str, str2, str3, hatchSendErrorCategory);
    }

    public final String component1() {
        return this.requestId;
    }

    public final String component2() {
        return this.errorCode;
    }

    public final String component3() {
        return this.errorMessage;
    }

    public final HatchSendErrorCategory component4() {
        return this.category;
    }

    public final HatchSendErrorCategory getCategory() {
        return this.category;
    }

    public final String getErrorCode() {
        return this.errorCode;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.category, AnonymousClass005.A0I(this.errorMessage, AnonymousClass005.A0I(this.errorCode, AnonymousClass006.A0G(this.requestId) * 31)));
    }

    public String toString() {
        return super.toString();
    }

    public DeliveryError(String str, String str2, String str3, HatchSendErrorCategory hatchSendErrorCategory) {
        AnonymousClass005.A11(str2, str3, hatchSendErrorCategory, 1);
        this.requestId = str;
        this.errorCode = str2;
        this.errorMessage = str3;
        this.category = hatchSendErrorCategory;
    }
}
