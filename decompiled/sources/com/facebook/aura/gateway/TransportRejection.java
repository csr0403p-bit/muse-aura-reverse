package com.facebook.aura.gateway;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class TransportRejection extends C06G {
    public static final int $stable = 0;
    public final String errorCode;
    public final String errorMessage;
    public final String requestId;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TransportRejection) {
                TransportRejection transportRejection = (TransportRejection) obj;
                if (!C7384Etj.areEqual(this.requestId, transportRejection.requestId) || !C7384Etj.areEqual(this.errorCode, transportRejection.errorCode) || !C7384Etj.areEqual(this.errorMessage, transportRejection.errorMessage)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ TransportRejection copy$default(TransportRejection transportRejection, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = transportRejection.requestId;
        }
        if ((i & 2) != 0) {
            str2 = transportRejection.errorCode;
        }
        if ((i & 4) != 0) {
            str3 = transportRejection.errorMessage;
        }
        return transportRejection.copy(str, str2, str3);
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
        return AnonymousClass001.A0H(this.errorMessage, AnonymousClass005.A0I(this.errorCode, AnonymousClass006.A0G(this.requestId) * 31));
    }

    public TransportRejection(String str, String str2, String str3) {
        AnonymousClass003.A0x(str2, str3);
        this.requestId = str;
        this.errorCode = str2;
        this.errorMessage = str3;
    }

    public final TransportRejection copy(String str, String str2, String str3) {
        AnonymousClass003.A0x(str2, str3);
        return new TransportRejection(str, str2, str3);
    }

    public String toString() {
        return super.toString();
    }
}
