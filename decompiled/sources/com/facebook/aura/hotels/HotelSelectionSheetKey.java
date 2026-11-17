package com.facebook.aura.hotels;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0KA;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import com.facebook.aura.navigation.AuraFullScreenNavKey;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class HotelSelectionSheetKey extends C06G implements AuraFullScreenNavKey {
    public static final Companion Companion = new Companion();
    public final String hotelId;
    public final String imageUrl;
    public final String offerId;
    public final boolean openedFromList;
    public final String rateId;
    public final String resultRef;
    public final String searchRef;
    public final String sessionId;

    public final class Companion {
        public final C9hr<HotelSelectionSheetKey> serializer() {
            return HotelSelectionSheetKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_hotels_impl_keys_keys(HotelSelectionSheetKey hotelSelectionSheetKey, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(hotelSelectionSheetKey.searchRef, c9iZ, 0);
        c9j5.AAV(hotelSelectionSheetKey.resultRef, c9iZ, 1);
        c9j5.AAV(hotelSelectionSheetKey.hotelId, c9iZ, 2);
        c9j5.AAV(hotelSelectionSheetKey.offerId, c9iZ, 3);
        c9j5.AAV(hotelSelectionSheetKey.rateId, c9iZ, 4);
        boolean zAfR = c9j5.AfR();
        if (zAfR || hotelSelectionSheetKey.sessionId != null) {
            c9j5.AAP(hotelSelectionSheetKey.sessionId, C07779iq.A01, c9iZ, 5);
        }
        if (zAfR || hotelSelectionSheetKey.imageUrl != null) {
            c9j5.AAP(hotelSelectionSheetKey.imageUrl, C07779iq.A01, c9iZ, 6);
        }
        if (zAfR || hotelSelectionSheetKey.openedFromList) {
            c9j5.AA7(c9iZ, 7, hotelSelectionSheetKey.openedFromList);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HotelSelectionSheetKey) {
                HotelSelectionSheetKey hotelSelectionSheetKey = (HotelSelectionSheetKey) obj;
                if (!C7384Etj.areEqual(this.searchRef, hotelSelectionSheetKey.searchRef) || !C7384Etj.areEqual(this.resultRef, hotelSelectionSheetKey.resultRef) || !C7384Etj.areEqual(this.hotelId, hotelSelectionSheetKey.hotelId) || !C7384Etj.areEqual(this.offerId, hotelSelectionSheetKey.offerId) || !C7384Etj.areEqual(this.rateId, hotelSelectionSheetKey.rateId) || !C7384Etj.areEqual(this.sessionId, hotelSelectionSheetKey.sessionId) || !C7384Etj.areEqual(this.imageUrl, hotelSelectionSheetKey.imageUrl) || this.openedFromList != hotelSelectionSheetKey.openedFromList) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HotelSelectionSheetKey copy$default(HotelSelectionSheetKey hotelSelectionSheetKey, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hotelSelectionSheetKey.searchRef;
        }
        if ((i & 2) != 0) {
            str2 = hotelSelectionSheetKey.resultRef;
        }
        if ((i & 4) != 0) {
            str3 = hotelSelectionSheetKey.hotelId;
        }
        if ((i & 8) != 0) {
            str4 = hotelSelectionSheetKey.offerId;
        }
        if ((i & 16) != 0) {
            str5 = hotelSelectionSheetKey.rateId;
        }
        if ((i & 32) != 0) {
            str6 = hotelSelectionSheetKey.sessionId;
        }
        if ((i & 64) != 0) {
            str7 = hotelSelectionSheetKey.imageUrl;
        }
        if ((i & 128) != 0) {
            z = hotelSelectionSheetKey.openedFromList;
        }
        return hotelSelectionSheetKey.copy(str, str2, str3, str4, str5, str6, str7, z);
    }

    public final String component1() {
        return this.searchRef;
    }

    public final String component2() {
        return this.resultRef;
    }

    public final String component3() {
        return this.hotelId;
    }

    public final String component4() {
        return this.offerId;
    }

    public final String component5() {
        return this.rateId;
    }

    public final String component6() {
        return this.sessionId;
    }

    public final String component7() {
        return this.imageUrl;
    }

    public final boolean component8() {
        return this.openedFromList;
    }

    public final String getHotelId() {
        return this.hotelId;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getOfferId() {
        return this.offerId;
    }

    public final boolean getOpenedFromList() {
        return this.openedFromList;
    }

    public final String getRateId() {
        return this.rateId;
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
        return C0KA.A00((((AnonymousClass005.A0I(this.rateId, AnonymousClass005.A0I(this.offerId, AnonymousClass005.A0I(this.hotelId, AnonymousClass005.A0I(this.resultRef, AnonymousClass001.A0G(this.searchRef))))) + AnonymousClass006.A0G(this.sessionId)) * 31) + AnonymousClass005.A0H(this.imageUrl)) * 31, this.openedFromList);
    }

    public HotelSelectionSheetKey(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z) {
        AnonymousClass005.A17(str, str2, str3, str4, str5);
        this.searchRef = str;
        this.resultRef = str2;
        this.hotelId = str3;
        this.offerId = str4;
        this.rateId = str5;
        this.sessionId = str6;
        this.imageUrl = str7;
        this.openedFromList = z;
    }

    public final HotelSelectionSheetKey copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z) {
        AnonymousClass005.A17(str, str2, str3, str4, str5);
        return new HotelSelectionSheetKey(str, str2, str3, str4, str5, str6, str7, z);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HotelSelectionSheetKey(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, int i, C06H c06h) {
        this(str, str2, str3, str4, str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, C3cH.A1N(i, z));
    }

    public /* synthetic */ HotelSelectionSheetKey(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, C2hx c2hx) {
        if (31 != (i & 31)) {
            C9iI.A00(HotelSelectionSheetKey$$serializer.descriptor, i, 31);
            throw F60.createAndThrow();
        }
        this.searchRef = str;
        this.resultRef = str2;
        this.hotelId = str3;
        this.offerId = str4;
        this.rateId = str5;
        if ((i & 32) == 0) {
            this.sessionId = null;
        } else {
            this.sessionId = str6;
        }
        if ((i & 64) == 0) {
            this.imageUrl = null;
        } else {
            this.imageUrl = str7;
        }
        if ((i & 128) == 0) {
            this.openedFromList = false;
        } else {
            this.openedFromList = z;
        }
    }
}
