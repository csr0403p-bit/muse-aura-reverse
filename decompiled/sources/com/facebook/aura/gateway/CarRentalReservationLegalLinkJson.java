package com.facebook.aura.gateway;

import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class CarRentalReservationLegalLinkJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String title;
    public final String url;

    public final class Companion {
        public final C9hr<CarRentalReservationLegalLinkJson> serializer() {
            return CarRentalReservationLegalLinkJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(CarRentalReservationLegalLinkJson carRentalReservationLegalLinkJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || carRentalReservationLegalLinkJson.title != null) {
            c9j5.AAP(carRentalReservationLegalLinkJson.title, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || carRentalReservationLegalLinkJson.url != null) {
            c9j5.AAP(carRentalReservationLegalLinkJson.url, C07779iq.A01, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CarRentalReservationLegalLinkJson) {
                CarRentalReservationLegalLinkJson carRentalReservationLegalLinkJson = (CarRentalReservationLegalLinkJson) obj;
                if (!C7384Etj.areEqual(this.title, carRentalReservationLegalLinkJson.title) || !C7384Etj.areEqual(this.url, carRentalReservationLegalLinkJson.url)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ CarRentalReservationLegalLinkJson copy$default(CarRentalReservationLegalLinkJson carRentalReservationLegalLinkJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = carRentalReservationLegalLinkJson.title;
        }
        if ((i & 2) != 0) {
            str2 = carRentalReservationLegalLinkJson.url;
        }
        return new CarRentalReservationLegalLinkJson(str, str2);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.url;
    }

    public final CarRentalReservationLegalLinkJson copy(String str, String str2) {
        return new CarRentalReservationLegalLinkJson(str, str2);
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return (AnonymousClass006.A0G(this.title) * 31) + AnonymousClass005.A0H(this.url);
    }

    public final HatchAgentPermissionsRepository.CarRentalReservationLegalLink toDomainOrNull() {
        String strTrimToNonEmpty;
        String str;
        String strA0l;
        String str2 = this.title;
        if (str2 == null || (strTrimToNonEmpty = HatchAgentPermissionsRepositoryJsonKt.trimToNonEmpty(str2)) == null || (str = this.url) == null || (strA0l = AnonymousClass002.A0l(str)) == null || !strA0l.startsWith("https://")) {
            return null;
        }
        return new HatchAgentPermissionsRepository.CarRentalReservationLegalLink(strTrimToNonEmpty, strA0l);
    }

    public CarRentalReservationLegalLinkJson(String str, String str2) {
        this.title = str;
        this.url = str2;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ CarRentalReservationLegalLinkJson(int i, String str, String str2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.title = null;
        } else {
            this.title = str;
        }
        if ((i & 2) == 0) {
            this.url = null;
        } else {
            this.url = str2;
        }
    }

    public /* synthetic */ CarRentalReservationLegalLinkJson(String str, String str2, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }

    public CarRentalReservationLegalLinkJson() {
        this(null, null);
    }
}
