package com.facebook.aura.agentpermission;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes2.dex */
public interface CheckoutLegalPresentation {

    public final class Booking extends C06G implements CheckoutLegalPresentation {
        public static final int $stable = 0;
        public final String privacyUrl;
        public final String propertyUrl;
        public final String termsUrl;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Booking) {
                    Booking booking = (Booking) obj;
                    if (!C7384Etj.areEqual(this.privacyUrl, booking.privacyUrl) || !C7384Etj.areEqual(this.termsUrl, booking.termsUrl) || !C7384Etj.areEqual(this.propertyUrl, booking.propertyUrl)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Booking copy$default(Booking booking, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = booking.privacyUrl;
            }
            if ((i & 2) != 0) {
                str2 = booking.termsUrl;
            }
            if ((i & 4) != 0) {
                str3 = booking.propertyUrl;
            }
            return booking.copy(str, str2, str3);
        }

        public final String component1() {
            return this.privacyUrl;
        }

        public final String component2() {
            return this.termsUrl;
        }

        public final String component3() {
            return this.propertyUrl;
        }

        public final String getPrivacyUrl() {
            return this.privacyUrl;
        }

        public final String getPropertyUrl() {
            return this.propertyUrl;
        }

        public final String getTermsUrl() {
            return this.termsUrl;
        }

        public int hashCode() {
            return AnonymousClass001.A0H(this.propertyUrl, AnonymousClass005.A0I(this.termsUrl, AnonymousClass001.A0G(this.privacyUrl)));
        }

        public Booking(String str, String str2, String str3) {
            AnonymousClass005.A0x(str, str2, str3);
            this.privacyUrl = str;
            this.termsUrl = str2;
            this.propertyUrl = str3;
        }

        public final Booking copy(String str, String str2, String str3) {
            AnonymousClass005.A0x(str, str2, str3);
            return new Booking(str, str2, str3);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Merchant extends C06G implements CheckoutLegalPresentation {
        public static final int $stable = 8;
        public final List<LegalLink> links;
        public final String name;

        public Merchant(String str, List<LegalLink> list) {
            C7384Etj.A0Y(list, 1);
            this.name = str;
            this.links = list;
        }

        public final Merchant copy(String str, List<LegalLink> list) {
            C7384Etj.A0Y(list, 1);
            return new Merchant(str, list);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Merchant) {
                    Merchant merchant = (Merchant) obj;
                    if (!C7384Etj.areEqual(this.name, merchant.name) || !C7384Etj.areEqual(this.links, merchant.links)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Merchant copy$default(Merchant merchant, String str, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = merchant.name;
            }
            if ((i & 2) != 0) {
                list = merchant.links;
            }
            C7384Etj.A0Y(list, 1);
            return new Merchant(str, list);
        }

        public final String component1() {
            return this.name;
        }

        public final List<LegalLink> component2() {
            return this.links;
        }

        public final List<LegalLink> getLinks() {
            return this.links;
        }

        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            return AnonymousClass005.A0G(this.links, AnonymousClass006.A0G(this.name) * 31);
        }

        public String toString() {
            return super.toString();
        }
    }
}
