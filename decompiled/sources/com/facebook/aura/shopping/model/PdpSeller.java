package com.facebook.aura.shopping.model;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07729ii;
import X.C07779iq;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class PdpSeller extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final Integer joinYear;
    public final String name;
    public final String profilePicUrl;
    public final String profileUrl;
    public final PdpRating rating;
    public final String sellerId;

    public final class Companion {
        public final C9hr<PdpSeller> serializer() {
            return PdpSeller$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static /* synthetic */ PdpSeller copy$default(PdpSeller pdpSeller, String str, String str2, String str3, String str4, Integer num, PdpRating pdpRating, int i, Object obj) {
        String str5 = str;
        String str6 = str2;
        String str7 = str3;
        String str8 = str4;
        Integer num2 = num;
        PdpRating pdpRating2 = pdpRating;
        if ((i & 1) != 0) {
            str5 = pdpSeller.sellerId;
        }
        if ((i & 2) != 0) {
            str6 = pdpSeller.name;
        }
        if ((i & 4) != 0) {
            str7 = pdpSeller.profilePicUrl;
        }
        if ((i & 8) != 0) {
            str8 = pdpSeller.profileUrl;
        }
        if ((i & 16) != 0) {
            num2 = pdpSeller.joinYear;
        }
        if ((i & 32) != 0) {
            pdpRating2 = pdpSeller.rating;
        }
        return new PdpSeller(str5, str6, str7, str8, num2, pdpRating2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PdpSeller) {
                PdpSeller pdpSeller = (PdpSeller) obj;
                if (!C7384Etj.areEqual(this.sellerId, pdpSeller.sellerId) || !C7384Etj.areEqual(this.name, pdpSeller.name) || !C7384Etj.areEqual(this.profilePicUrl, pdpSeller.profilePicUrl) || !C7384Etj.areEqual(this.profileUrl, pdpSeller.profileUrl) || !C7384Etj.areEqual(this.joinYear, pdpSeller.joinYear) || !C7384Etj.areEqual(this.rating, pdpSeller.rating)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ PdpSeller(int i, String str, String str2, String str3, String str4, Integer num, PdpRating pdpRating, C2hx c2hx) {
        if (63 != (i & 63)) {
            C9iI.A00(PdpSeller$$serializer.descriptor, i, 63);
            throw F60.createAndThrow();
        }
        this.sellerId = str;
        this.name = str2;
        this.profilePicUrl = str3;
        this.profileUrl = str4;
        this.joinYear = num;
        this.rating = pdpRating;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_shopping_model_model(PdpSeller pdpSeller, C9j5 c9j5, C9iZ c9iZ) {
        C07779iq c07779iq = C07779iq.A01;
        c9j5.AAP(pdpSeller.sellerId, c07779iq, c9iZ, 0);
        c9j5.AAP(pdpSeller.name, c07779iq, c9iZ, 1);
        c9j5.AAP(pdpSeller.profilePicUrl, c07779iq, c9iZ, 2);
        c9j5.AAP(pdpSeller.profileUrl, c07779iq, c9iZ, 3);
        c9j5.AAP(pdpSeller.joinYear, C07729ii.A00, c9iZ, 4);
        c9j5.AAP(pdpSeller.rating, PdpRating$$serializer.INSTANCE, c9iZ, 5);
    }

    public final String component1() {
        return this.sellerId;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.profilePicUrl;
    }

    public final String component4() {
        return this.profileUrl;
    }

    public final Integer component5() {
        return this.joinYear;
    }

    public final PdpRating component6() {
        return this.rating;
    }

    public final PdpSeller copy(String str, String str2, String str3, String str4, Integer num, PdpRating pdpRating) {
        return new PdpSeller(str, str2, str3, str4, num, pdpRating);
    }

    public final Integer getJoinYear() {
        return this.joinYear;
    }

    public final String getName() {
        return this.name;
    }

    public final String getProfilePicUrl() {
        return this.profilePicUrl;
    }

    public final String getProfileUrl() {
        return this.profileUrl;
    }

    public final PdpRating getRating() {
        return this.rating;
    }

    public final String getSellerId() {
        return this.sellerId;
    }

    public int hashCode() {
        return (((((((((AnonymousClass006.A0G(this.sellerId) * 31) + AnonymousClass006.A0G(this.name)) * 31) + AnonymousClass006.A0G(this.profilePicUrl)) * 31) + AnonymousClass006.A0G(this.profileUrl)) * 31) + AnonymousClass006.A0D(this.joinYear)) * 31) + C3cH.A02(this.rating);
    }

    public String toString() {
        return super.toString();
    }

    public PdpSeller(String str, String str2, String str3, String str4, Integer num, PdpRating pdpRating) {
        this.sellerId = str;
        this.name = str2;
        this.profilePicUrl = str3;
        this.profileUrl = str4;
        this.joinYear = num;
        this.rating = pdpRating;
    }
}
