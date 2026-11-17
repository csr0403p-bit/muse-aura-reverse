package com.facebook.aura.hotels;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class HotelGuestReviews extends C06G {
    public static final int $stable = 0;
    public final Integer count;
    public final String scaleMax;
    public final String score;

    public HotelGuestReviews(String str, Integer num, String str2) {
        C7384Etj.A0Y(str, 0);
        this.score = str;
        this.count = num;
        this.scaleMax = str2;
    }

    public final HotelGuestReviews copy(String str, Integer num, String str2) {
        C7384Etj.A0Y(str, 0);
        return new HotelGuestReviews(str, num, str2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HotelGuestReviews) {
                HotelGuestReviews hotelGuestReviews = (HotelGuestReviews) obj;
                if (!C7384Etj.areEqual(this.score, hotelGuestReviews.score) || !C7384Etj.areEqual(this.count, hotelGuestReviews.count) || !C7384Etj.areEqual(this.scaleMax, hotelGuestReviews.scaleMax)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HotelGuestReviews copy$default(HotelGuestReviews hotelGuestReviews, String str, Integer num, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hotelGuestReviews.score;
        }
        if ((i & 2) != 0) {
            num = hotelGuestReviews.count;
        }
        if ((i & 4) != 0) {
            str2 = hotelGuestReviews.scaleMax;
        }
        return hotelGuestReviews.copy(str, num, str2);
    }

    public final String component1() {
        return this.score;
    }

    public final Integer component2() {
        return this.count;
    }

    public final String component3() {
        return this.scaleMax;
    }

    public final Integer getCount() {
        return this.count;
    }

    public final String getScaleMax() {
        return this.scaleMax;
    }

    public final String getScore() {
        return this.score;
    }

    public int hashCode() {
        return ((AnonymousClass001.A0G(this.score) + AnonymousClass006.A0D(this.count)) * 31) + AnonymousClass005.A0H(this.scaleMax);
    }

    public String toString() {
        return super.toString();
    }
}
