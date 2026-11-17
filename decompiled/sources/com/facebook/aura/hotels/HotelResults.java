package com.facebook.aura.hotels;

import X.AHD;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C60O;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class HotelResults extends C06G {
    public static final int $stable = 0;
    public final boolean canSeeAll;
    public final String capturedAt;
    public final Boolean hasMore;
    public final AHD<HotelResult> hotels;
    public final String location;
    public final String providerIcon;
    public final String providerIconUrl;
    public final String providerName;
    public final String providerSubtitle;
    public final Integer resultLimit;
    public final Integer returnedCount;
    public final String searchRef;
    public final String seeAllLabel;
    public final String title;
    public final HotelTrip trip;

    public final HotelResults copy(String str, String str2, String str3, String str4, String str5, String str6, HotelTrip hotelTrip, AHD<HotelResult> ahd, String str7, boolean z, String str8, Integer num, Integer num2, Boolean bool, String str9) {
        C60O.A1M(str, 0, ahd);
        return new HotelResults(str, str2, str3, str4, str5, str6, hotelTrip, ahd, str7, z, str8, num, num2, bool, str9);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HotelResults) {
                HotelResults hotelResults = (HotelResults) obj;
                if (!C7384Etj.areEqual(this.searchRef, hotelResults.searchRef) || !C7384Etj.areEqual(this.title, hotelResults.title) || !C7384Etj.areEqual(this.providerName, hotelResults.providerName) || !C7384Etj.areEqual(this.providerIcon, hotelResults.providerIcon) || !C7384Etj.areEqual(this.providerSubtitle, hotelResults.providerSubtitle) || !C7384Etj.areEqual(this.providerIconUrl, hotelResults.providerIconUrl) || !C7384Etj.areEqual(this.trip, hotelResults.trip) || !C7384Etj.areEqual(this.hotels, hotelResults.hotels) || !C7384Etj.areEqual(this.seeAllLabel, hotelResults.seeAllLabel) || this.canSeeAll != hotelResults.canSeeAll || !C7384Etj.areEqual(this.capturedAt, hotelResults.capturedAt) || !C7384Etj.areEqual(this.returnedCount, hotelResults.returnedCount) || !C7384Etj.areEqual(this.resultLimit, hotelResults.resultLimit) || !C7384Etj.areEqual(this.hasMore, hotelResults.hasMore) || !C7384Etj.areEqual(this.location, hotelResults.location)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ HotelResults(String str, String str2, String str3, String str4, String str5, String str6, HotelTrip hotelTrip, AHD ahd, String str7, boolean z, String str8, Integer num, Integer num2, Boolean bool, String str9, int i, C06H c06h) {
        this(str, str2, str3, str4, str5, str6, hotelTrip, ahd, str7, z, str8, num, num2, bool, (i & 16384) != 0 ? null : str9);
    }

    public static /* synthetic */ HotelResults copy$default(HotelResults hotelResults, String str, String str2, String str3, String str4, String str5, String str6, HotelTrip hotelTrip, AHD ahd, String str7, boolean z, String str8, Integer num, Integer num2, Boolean bool, String str9, int i, Object obj) {
        String str10 = str3;
        String str11 = str4;
        String str12 = str5;
        String str13 = str6;
        HotelTrip hotelTrip2 = hotelTrip;
        AHD ahd2 = ahd;
        String str14 = str7;
        boolean z2 = z;
        String str15 = str8;
        Integer num3 = num;
        Integer num4 = num2;
        Boolean bool2 = bool;
        String str16 = str9;
        if ((i & 1) != 0) {
            str = hotelResults.searchRef;
        }
        if ((i & 2) != 0) {
            str2 = hotelResults.title;
        }
        if ((i & 4) != 0) {
            str10 = hotelResults.providerName;
        }
        if ((i & 8) != 0) {
            str11 = hotelResults.providerIcon;
        }
        if ((i & 16) != 0) {
            str12 = hotelResults.providerSubtitle;
        }
        if ((i & 32) != 0) {
            str13 = hotelResults.providerIconUrl;
        }
        if ((i & 64) != 0) {
            hotelTrip2 = hotelResults.trip;
        }
        if ((i & 128) != 0) {
            ahd2 = hotelResults.hotels;
        }
        if ((i & 256) != 0) {
            str14 = hotelResults.seeAllLabel;
        }
        if ((i & 512) != 0) {
            z2 = hotelResults.canSeeAll;
        }
        if ((i & 1024) != 0) {
            str15 = hotelResults.capturedAt;
        }
        if ((i & 2048) != 0) {
            num3 = hotelResults.returnedCount;
        }
        if ((i & 4096) != 0) {
            num4 = hotelResults.resultLimit;
        }
        if ((i & 8192) != 0) {
            bool2 = hotelResults.hasMore;
        }
        if ((i & 16384) != 0) {
            str16 = hotelResults.location;
        }
        return hotelResults.copy(str, str2, str10, str11, str12, str13, hotelTrip2, ahd2, str14, z2, str15, num3, num4, bool2, str16);
    }

    public final String component1() {
        return this.searchRef;
    }

    public final boolean component10() {
        return this.canSeeAll;
    }

    public final String component11() {
        return this.capturedAt;
    }

    public final Integer component12() {
        return this.returnedCount;
    }

    public final Integer component13() {
        return this.resultLimit;
    }

    public final Boolean component14() {
        return this.hasMore;
    }

    public final String component15() {
        return this.location;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.providerName;
    }

    public final String component4() {
        return this.providerIcon;
    }

    public final String component5() {
        return this.providerSubtitle;
    }

    public final String component6() {
        return this.providerIconUrl;
    }

    public final HotelTrip component7() {
        return this.trip;
    }

    public final AHD<HotelResult> component8() {
        return this.hotels;
    }

    public final String component9() {
        return this.seeAllLabel;
    }

    public final boolean getCanSeeAll() {
        return this.canSeeAll;
    }

    public final String getCapturedAt() {
        return this.capturedAt;
    }

    public final Boolean getHasMore() {
        return this.hasMore;
    }

    public final AHD<HotelResult> getHotels() {
        return this.hotels;
    }

    public final String getLocation() {
        return this.location;
    }

    public final String getProviderIcon() {
        return this.providerIcon;
    }

    public final String getProviderIconUrl() {
        return this.providerIconUrl;
    }

    public final String getProviderName() {
        return this.providerName;
    }

    public final String getProviderSubtitle() {
        return this.providerSubtitle;
    }

    public final Integer getResultLimit() {
        return this.resultLimit;
    }

    public final Integer getReturnedCount() {
        return this.returnedCount;
    }

    public final String getSearchRef() {
        return this.searchRef;
    }

    public final String getSeeAllLabel() {
        return this.seeAllLabel;
    }

    public final String getTitle() {
        return this.title;
    }

    public final HotelTrip getTrip() {
        return this.trip;
    }

    public int hashCode() {
        return ((((((((C0KA.A01((AnonymousClass005.A0F(this.hotels, (((((((((((AnonymousClass001.A0G(this.searchRef) + AnonymousClass006.A0G(this.title)) * 31) + AnonymousClass006.A0G(this.providerName)) * 31) + AnonymousClass006.A0G(this.providerIcon)) * 31) + AnonymousClass006.A0G(this.providerSubtitle)) * 31) + AnonymousClass006.A0G(this.providerIconUrl)) * 31) + AnonymousClass006.A0D(this.trip)) * 31) + AnonymousClass006.A0G(this.seeAllLabel)) * 31, this.canSeeAll) + AnonymousClass006.A0G(this.capturedAt)) * 31) + AnonymousClass006.A0D(this.returnedCount)) * 31) + AnonymousClass006.A0D(this.resultLimit)) * 31) + AnonymousClass006.A0D(this.hasMore)) * 31) + AnonymousClass005.A0H(this.location);
    }

    public String toString() {
        return super.toString();
    }

    public HotelResults(String str, String str2, String str3, String str4, String str5, String str6, HotelTrip hotelTrip, AHD<HotelResult> ahd, String str7, boolean z, String str8, Integer num, Integer num2, Boolean bool, String str9) {
        C60O.A1M(str, 0, ahd);
        this.searchRef = str;
        this.title = str2;
        this.providerName = str3;
        this.providerIcon = str4;
        this.providerSubtitle = str5;
        this.providerIconUrl = str6;
        this.trip = hotelTrip;
        this.hotels = ahd;
        this.seeAllLabel = str7;
        this.canSeeAll = z;
        this.capturedAt = str8;
        this.returnedCount = num;
        this.resultLimit = num2;
        this.hasMore = bool;
        this.location = str9;
    }
}
