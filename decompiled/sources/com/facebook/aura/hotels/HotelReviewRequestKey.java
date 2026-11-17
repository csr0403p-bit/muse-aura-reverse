package com.facebook.aura.hotels;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class HotelReviewRequestKey extends C06G {
    public final HotelEventKind kind;
    public final String resultRef;
    public final String searchRef;
    public final String sessionId;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HotelReviewRequestKey) {
                HotelReviewRequestKey hotelReviewRequestKey = (HotelReviewRequestKey) obj;
                if (this.kind != hotelReviewRequestKey.kind || !C7384Etj.areEqual(this.searchRef, hotelReviewRequestKey.searchRef) || !C7384Etj.areEqual(this.resultRef, hotelReviewRequestKey.resultRef) || !C7384Etj.areEqual(this.sessionId, hotelReviewRequestKey.sessionId)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HotelReviewRequestKey copy$default(HotelReviewRequestKey hotelReviewRequestKey, HotelEventKind hotelEventKind, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            hotelEventKind = hotelReviewRequestKey.kind;
        }
        if ((i & 2) != 0) {
            str = hotelReviewRequestKey.searchRef;
        }
        if ((i & 4) != 0) {
            str2 = hotelReviewRequestKey.resultRef;
        }
        if ((i & 8) != 0) {
            str3 = hotelReviewRequestKey.sessionId;
        }
        AnonymousClass005.A0x(hotelEventKind, str, str2);
        return new HotelReviewRequestKey(hotelEventKind, str, str2, str3);
    }

    public final HotelEventKind component1() {
        return this.kind;
    }

    public final String component2() {
        return this.searchRef;
    }

    public final String component3() {
        return this.resultRef;
    }

    public final String component4() {
        return this.sessionId;
    }

    public final HotelEventKind getKind() {
        return this.kind;
    }

    public final String getResultRef() {
        return this.resultRef;
    }

    public final String getSearchRef() {
        return this.searchRef;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        return AnonymousClass005.A0I(this.resultRef, AnonymousClass005.A0I(this.searchRef, AnonymousClass005.A0E(this.kind))) + AnonymousClass006.A0G(this.sessionId);
    }

    public HotelReviewRequestKey(HotelEventKind hotelEventKind, String str, String str2, String str3) {
        AnonymousClass005.A0x(hotelEventKind, str, str2);
        this.kind = hotelEventKind;
        this.searchRef = str;
        this.resultRef = str2;
        this.sessionId = str3;
    }

    public final HotelReviewRequestKey copy(HotelEventKind hotelEventKind, String str, String str2, String str3) {
        AnonymousClass005.A0x(hotelEventKind, str, str2);
        return new HotelReviewRequestKey(hotelEventKind, str, str2, str3);
    }

    public String toString() {
        return super.toString();
    }
}
