package com.facebook.aura.hotels;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class HotelReviewSource extends C06G {
    public static final int $stable = 0;
    public final String resultRef;
    public final String searchRef;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HotelReviewSource) {
                HotelReviewSource hotelReviewSource = (HotelReviewSource) obj;
                if (!C7384Etj.areEqual(this.searchRef, hotelReviewSource.searchRef) || !C7384Etj.areEqual(this.resultRef, hotelReviewSource.resultRef)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HotelReviewSource copy$default(HotelReviewSource hotelReviewSource, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hotelReviewSource.searchRef;
        }
        if ((i & 2) != 0) {
            str2 = hotelReviewSource.resultRef;
        }
        AnonymousClass003.A0u(str, str2);
        return new HotelReviewSource(str, str2);
    }

    public final String component1() {
        return this.searchRef;
    }

    public final String component2() {
        return this.resultRef;
    }

    public final String getResultRef() {
        return this.resultRef;
    }

    public final String getSearchRef() {
        return this.searchRef;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.resultRef, AnonymousClass001.A0G(this.searchRef));
    }

    public HotelReviewSource(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.searchRef = str;
        this.resultRef = str2;
    }

    public final HotelReviewSource copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new HotelReviewSource(str, str2);
    }

    public String toString() {
        return super.toString();
    }
}
