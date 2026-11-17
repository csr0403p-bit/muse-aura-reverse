package com.facebook.aura.login.nativeflow;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes2.dex */
public interface NativeLoginIdentifier {

    public final class Email extends C06G implements NativeLoginIdentifier {
        public static final int $stable = 0;
        public final String address;

        public Email(String str) {
            C7384Etj.A0Y(str, 0);
            this.address = str;
        }

        public final Email copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new Email(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Email) && C7384Etj.areEqual(this.address, ((Email) obj).address));
        }

        public static /* synthetic */ Email copy$default(Email email, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = email.address;
            }
            C7384Etj.A0Y(str, 0);
            return new Email(str);
        }

        public final String component1() {
            return this.address;
        }

        public final String getAddress() {
            return this.address;
        }

        public int hashCode() {
            return this.address.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Phone extends C06G implements NativeLoginIdentifier {
        public static final int $stable = 0;
        public final String e164;
        public final String region;

        public Phone(String str, String str2) {
            C7384Etj.A0Y(str, 0);
            this.e164 = str;
            this.region = str2;
        }

        public final Phone copy(String str, String str2) {
            C7384Etj.A0Y(str, 0);
            return new Phone(str, str2);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Phone) {
                    Phone phone = (Phone) obj;
                    if (!C7384Etj.areEqual(this.e164, phone.e164) || !C7384Etj.areEqual(this.region, phone.region)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Phone copy$default(Phone phone, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = phone.e164;
            }
            if ((i & 2) != 0) {
                str2 = phone.region;
            }
            C7384Etj.A0Y(str, 0);
            return new Phone(str, str2);
        }

        public final String component1() {
            return this.e164;
        }

        public final String component2() {
            return this.region;
        }

        public final String getE164() {
            return this.e164;
        }

        public final String getRegion() {
            return this.region;
        }

        public int hashCode() {
            return AnonymousClass001.A0G(this.e164) + AnonymousClass006.A0G(this.region);
        }

        public String toString() {
            return super.toString();
        }
    }
}
