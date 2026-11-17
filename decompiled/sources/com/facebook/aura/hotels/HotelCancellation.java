package com.facebook.aura.hotels;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class HotelCancellation extends C06G {
    public static final int $stable = 0;
    public final String description;
    public final Boolean freeCancellation;
    public final String freeCancellationUntil;
    public final boolean hasPenalties;
    public final String policyText;
    public final Boolean refundable;

    public static /* synthetic */ HotelCancellation copy$default(HotelCancellation hotelCancellation, Boolean bool, Boolean bool2, String str, String str2, boolean z, String str3, int i, Object obj) {
        Boolean bool3 = bool;
        Boolean bool4 = bool2;
        String str4 = str;
        String str5 = str2;
        boolean z2 = z;
        String str6 = str3;
        if ((i & 1) != 0) {
            bool3 = hotelCancellation.refundable;
        }
        if ((i & 2) != 0) {
            bool4 = hotelCancellation.freeCancellation;
        }
        if ((i & 4) != 0) {
            str4 = hotelCancellation.freeCancellationUntil;
        }
        if ((i & 8) != 0) {
            str5 = hotelCancellation.policyText;
        }
        if ((i & 16) != 0) {
            z2 = hotelCancellation.hasPenalties;
        }
        if ((i & 32) != 0) {
            str6 = hotelCancellation.description;
        }
        return new HotelCancellation(bool3, bool4, str4, str5, z2, str6);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HotelCancellation) {
                HotelCancellation hotelCancellation = (HotelCancellation) obj;
                if (!C7384Etj.areEqual(this.refundable, hotelCancellation.refundable) || !C7384Etj.areEqual(this.freeCancellation, hotelCancellation.freeCancellation) || !C7384Etj.areEqual(this.freeCancellationUntil, hotelCancellation.freeCancellationUntil) || !C7384Etj.areEqual(this.policyText, hotelCancellation.policyText) || this.hasPenalties != hotelCancellation.hasPenalties || !C7384Etj.areEqual(this.description, hotelCancellation.description)) {
                }
            }
            return false;
        }
        return true;
    }

    public final Boolean component1() {
        return this.refundable;
    }

    public final Boolean component2() {
        return this.freeCancellation;
    }

    public final String component3() {
        return this.freeCancellationUntil;
    }

    public final String component4() {
        return this.policyText;
    }

    public final boolean component5() {
        return this.hasPenalties;
    }

    public final String component6() {
        return this.description;
    }

    public final HotelCancellation copy(Boolean bool, Boolean bool2, String str, String str2, boolean z, String str3) {
        return new HotelCancellation(bool, bool2, str, str2, z, str3);
    }

    public final String getDescription() {
        return this.description;
    }

    public final Boolean getFreeCancellation() {
        return this.freeCancellation;
    }

    public final String getFreeCancellationUntil() {
        return this.freeCancellationUntil;
    }

    public final boolean getHasPenalties() {
        return this.hasPenalties;
    }

    public final String getPolicyText() {
        return this.policyText;
    }

    public final Boolean getRefundable() {
        return this.refundable;
    }

    public int hashCode() {
        return C0KA.A01(((((((AnonymousClass006.A0D(this.refundable) * 31) + AnonymousClass006.A0D(this.freeCancellation)) * 31) + AnonymousClass006.A0G(this.freeCancellationUntil)) * 31) + AnonymousClass006.A0G(this.policyText)) * 31, this.hasPenalties) + AnonymousClass005.A0H(this.description);
    }

    public HotelCancellation(Boolean bool, Boolean bool2, String str, String str2, boolean z, String str3) {
        this.refundable = bool;
        this.freeCancellation = bool2;
        this.freeCancellationUntil = str;
        this.policyText = str2;
        this.hasPenalties = z;
        this.description = str3;
    }

    public String toString() {
        return super.toString();
    }
}
