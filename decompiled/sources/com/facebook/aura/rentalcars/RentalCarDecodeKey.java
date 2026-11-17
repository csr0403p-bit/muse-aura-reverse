package com.facebook.aura.rentalcars;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class RentalCarDecodeKey extends C06G {
    public final String hostMessageId;
    public final String presentationId;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RentalCarDecodeKey) {
                RentalCarDecodeKey rentalCarDecodeKey = (RentalCarDecodeKey) obj;
                if (!C7384Etj.areEqual(this.hostMessageId, rentalCarDecodeKey.hostMessageId) || !C7384Etj.areEqual(this.presentationId, rentalCarDecodeKey.presentationId)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ RentalCarDecodeKey copy$default(RentalCarDecodeKey rentalCarDecodeKey, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rentalCarDecodeKey.hostMessageId;
        }
        if ((i & 2) != 0) {
            str2 = rentalCarDecodeKey.presentationId;
        }
        AnonymousClass003.A0u(str, str2);
        return new RentalCarDecodeKey(str, str2);
    }

    public final String component1() {
        return this.hostMessageId;
    }

    public final String component2() {
        return this.presentationId;
    }

    public final String getHostMessageId() {
        return this.hostMessageId;
    }

    public final String getPresentationId() {
        return this.presentationId;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.presentationId, AnonymousClass001.A0G(this.hostMessageId));
    }

    public RentalCarDecodeKey(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.hostMessageId = str;
        this.presentationId = str2;
    }

    public final RentalCarDecodeKey copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new RentalCarDecodeKey(str, str2);
    }

    public String toString() {
        return super.toString();
    }
}
