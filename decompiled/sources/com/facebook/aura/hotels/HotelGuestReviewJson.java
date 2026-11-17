package com.facebook.aura.hotels;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j1;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class HotelGuestReviewJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final Long count;
    public final String score;

    public final class Companion {
        public final C9hr<HotelGuestReviewJson> serializer() {
            return HotelGuestReviewJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public HotelGuestReviewJson(String str, Long l) {
        C7384Etj.A0Y(str, 0);
        this.score = str;
        this.count = l;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_hotels_impl_impl(HotelGuestReviewJson hotelGuestReviewJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cH.A1Q(hotelGuestReviewJson.score)) {
            c9j5.AAV(hotelGuestReviewJson.score, c9iZ, 0);
        }
        if (zAfR || hotelGuestReviewJson.count != null) {
            c9j5.AAP(hotelGuestReviewJson.count, C9j1.A00, c9iZ, 1);
        }
    }

    public final HotelGuestReviewJson copy(String str, Long l) {
        C7384Etj.A0Y(str, 0);
        return new HotelGuestReviewJson(str, l);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HotelGuestReviewJson) {
                HotelGuestReviewJson hotelGuestReviewJson = (HotelGuestReviewJson) obj;
                if (!C7384Etj.areEqual(this.score, hotelGuestReviewJson.score) || !C7384Etj.areEqual(this.count, hotelGuestReviewJson.count)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HotelGuestReviewJson copy$default(HotelGuestReviewJson hotelGuestReviewJson, String str, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hotelGuestReviewJson.score;
        }
        if ((i & 2) != 0) {
            l = hotelGuestReviewJson.count;
        }
        C7384Etj.A0Y(str, 0);
        return new HotelGuestReviewJson(str, l);
    }

    public final String component1() {
        return this.score;
    }

    public final Long component2() {
        return this.count;
    }

    public final Long getCount() {
        return this.count;
    }

    public final String getScore() {
        return this.score;
    }

    public int hashCode() {
        return AnonymousClass001.A0G(this.score) + AnonymousClass006.A0D(this.count);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.aura.hotels.HotelGuestReviews toDomain() {
        /*
            r7 = this;
            java.lang.String r0 = r7.score
            java.lang.String r6 = com.facebook.aura.hotels.HotelResultModelsKt.hotelNonBlank(r0)
            r5 = 0
            if (r6 == 0) goto L4c
            int r1 = r6.length()
            r0 = 32
            if (r1 > r0) goto L4c
            java.lang.Double r0 = X.C9tJ.A0v(r6)
            if (r0 == 0) goto L4c
            double r0 = r0.doubleValue()
            double r3 = java.lang.Math.abs(r0)
            r1 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L4c
            java.lang.Long r0 = r7.count
            if (r0 == 0) goto L4a
            long r3 = r0.longValue()
            r1 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 > 0) goto L4a
            r1 = 2147483648(0x80000000, double:1.0609978955E-314)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L4a
            int r0 = (int) r3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L44:
            com.facebook.aura.hotels.HotelGuestReviews r0 = new com.facebook.aura.hotels.HotelGuestReviews
            r0.<init>(r6, r1, r5)
            return r0
        L4a:
            r1 = r5
            goto L44
        L4c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.hotels.HotelGuestReviewJson.toDomain():com.facebook.aura.hotels.HotelGuestReviews");
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HotelGuestReviewJson(int i, String str, Long l, C2hx c2hx) {
        this.score = C3cG.A0Z(i, str);
        if ((i & 2) == 0) {
            this.count = null;
        } else {
            this.count = l;
        }
    }

    public /* synthetic */ HotelGuestReviewJson(String str, Long l, int i, C06H c06h) {
        this(C3cH.A0Z(i, str), (i & 2) != 0 ? null : l);
    }

    public HotelGuestReviewJson() {
        this("", null);
    }
}
