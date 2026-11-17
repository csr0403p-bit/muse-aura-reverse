package com.facebook.aura.rentalcars;

import X.AnonymousClass003;
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
/* loaded from: classes3.dex */
public final class RentalCarDetailsScreenKey extends C06G implements AuraFullScreenNavKey {
    public static final Companion Companion = new Companion();
    public final String hostMessageId;
    public final String imageUrl;
    public final boolean openedFromList;
    public final String presentationId;
    public final String rateId;
    public final int rateIndex;
    public final String sessionId;

    public final class Companion {
        public final C9hr<RentalCarDetailsScreenKey> serializer() {
            return RentalCarDetailsScreenKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RentalCarDetailsScreenKey) {
                RentalCarDetailsScreenKey rentalCarDetailsScreenKey = (RentalCarDetailsScreenKey) obj;
                if (!C7384Etj.areEqual(this.sessionId, rentalCarDetailsScreenKey.sessionId) || !C7384Etj.areEqual(this.hostMessageId, rentalCarDetailsScreenKey.hostMessageId) || !C7384Etj.areEqual(this.presentationId, rentalCarDetailsScreenKey.presentationId) || this.rateIndex != rentalCarDetailsScreenKey.rateIndex || !C7384Etj.areEqual(this.rateId, rentalCarDetailsScreenKey.rateId) || !C7384Etj.areEqual(this.imageUrl, rentalCarDetailsScreenKey.imageUrl) || this.openedFromList != rentalCarDetailsScreenKey.openedFromList) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ RentalCarDetailsScreenKey(int i, String str, String str2, String str3, int i2, String str4, String str5, boolean z, C2hx c2hx) {
        if (31 != (i & 31)) {
            C9iI.A00(RentalCarDetailsScreenKey$$serializer.descriptor, i, 31);
            throw F60.createAndThrow();
        }
        this.sessionId = str;
        this.hostMessageId = str2;
        this.presentationId = str3;
        this.rateIndex = i2;
        this.rateId = str4;
        this.imageUrl = (i & 32) == 0 ? null : str5;
        if ((i & 64) == 0) {
            this.openedFromList = false;
        } else {
            this.openedFromList = z;
        }
    }

    public static /* synthetic */ RentalCarDetailsScreenKey copy$default(RentalCarDetailsScreenKey rentalCarDetailsScreenKey, String str, String str2, String str3, int i, String str4, String str5, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = rentalCarDetailsScreenKey.sessionId;
        }
        if ((i2 & 2) != 0) {
            str2 = rentalCarDetailsScreenKey.hostMessageId;
        }
        if ((i2 & 4) != 0) {
            str3 = rentalCarDetailsScreenKey.presentationId;
        }
        if ((i2 & 8) != 0) {
            i = rentalCarDetailsScreenKey.rateIndex;
        }
        if ((i2 & 16) != 0) {
            str4 = rentalCarDetailsScreenKey.rateId;
        }
        if ((i2 & 32) != 0) {
            str5 = rentalCarDetailsScreenKey.imageUrl;
        }
        if ((i2 & 64) != 0) {
            z = rentalCarDetailsScreenKey.openedFromList;
        }
        return rentalCarDetailsScreenKey.copy(str, str2, str3, i, str4, str5, z);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_rentalcars_impl_keys_keys(RentalCarDetailsScreenKey rentalCarDetailsScreenKey, C9j5 c9j5, C9iZ c9iZ) {
        C07779iq c07779iq = C07779iq.A01;
        c9j5.AAP(rentalCarDetailsScreenKey.sessionId, c07779iq, c9iZ, 0);
        c9j5.AAV(rentalCarDetailsScreenKey.hostMessageId, c9iZ, 1);
        c9j5.AAV(rentalCarDetailsScreenKey.presentationId, c9iZ, 2);
        c9j5.AAK(c9iZ, 3, rentalCarDetailsScreenKey.rateIndex);
        c9j5.AAV(rentalCarDetailsScreenKey.rateId, c9iZ, 4);
        boolean zAfR = c9j5.AfR();
        if (zAfR || rentalCarDetailsScreenKey.imageUrl != null) {
            c9j5.AAP(rentalCarDetailsScreenKey.imageUrl, c07779iq, c9iZ, 5);
        }
        if (zAfR || rentalCarDetailsScreenKey.openedFromList) {
            c9j5.AA7(c9iZ, 6, rentalCarDetailsScreenKey.openedFromList);
        }
    }

    public final String component1() {
        return this.sessionId;
    }

    public final String component2() {
        return this.hostMessageId;
    }

    public final String component3() {
        return this.presentationId;
    }

    public final int component4() {
        return this.rateIndex;
    }

    public final String component5() {
        return this.rateId;
    }

    public final String component6() {
        return this.imageUrl;
    }

    public final boolean component7() {
        return this.openedFromList;
    }

    public final String getHostMessageId() {
        return this.hostMessageId;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final boolean getOpenedFromList() {
        return this.openedFromList;
    }

    public final String getPresentationId() {
        return this.presentationId;
    }

    public final String getRateId() {
        return this.rateId;
    }

    public final int getRateIndex() {
        return this.rateIndex;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        return C0KA.A00((AnonymousClass005.A0I(this.rateId, (AnonymousClass005.A0I(this.presentationId, AnonymousClass005.A0I(this.hostMessageId, AnonymousClass006.A0G(this.sessionId) * 31)) + this.rateIndex) * 31) + AnonymousClass005.A0H(this.imageUrl)) * 31, this.openedFromList);
    }

    public final RentalCarDetailsScreenKey copy(String str, String str2, String str3, int i, String str4, String str5, boolean z) {
        AnonymousClass003.A0x(str2, str3);
        C7384Etj.A0Y(str4, 4);
        return new RentalCarDetailsScreenKey(str, str2, str3, i, str4, str5, z);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ RentalCarDetailsScreenKey(String str, String str2, String str3, int i, String str4, String str5, boolean z, int i2, C06H c06h) {
        this(str, str2, str3, i, str4, (i2 & 32) != 0 ? null : str5, C3cH.A1M(i2, z));
    }

    public RentalCarDetailsScreenKey(String str, String str2, String str3, int i, String str4, String str5, boolean z) {
        AnonymousClass003.A0x(str2, str3);
        C7384Etj.A0Y(str4, 4);
        this.sessionId = str;
        this.hostMessageId = str2;
        this.presentationId = str3;
        this.rateIndex = i;
        this.rateId = str4;
        this.imageUrl = str5;
        this.openedFromList = z;
    }
}
