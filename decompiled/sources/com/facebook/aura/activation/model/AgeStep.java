package com.facebook.aura.activation.model;

import X.AHD;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;
import com.facebook.aura.user.provider.AgeCheckMethod;

/* loaded from: classes2.dex */
public interface AgeStep {

    public final class Card implements AgeStep {
        public static final Card INSTANCE = new Card();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Card);
        }

        public String toString() {
            return "Card";
        }

        public int hashCode() {
            return -992613024;
        }
    }

    public final class Methods extends C06G implements AgeStep {
        public final AHD<AgeCheckMethod> accounts;
        public final AHD<AgeCheckMethod> primary;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Methods) {
                    Methods methods = (Methods) obj;
                    if (!C7384Etj.areEqual(this.primary, methods.primary) || !C7384Etj.areEqual(this.accounts, methods.accounts)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Methods copy$default(Methods methods, AHD ahd, AHD ahd2, int i, Object obj) {
            if ((i & 1) != 0) {
                ahd = methods.primary;
            }
            if ((i & 2) != 0) {
                ahd2 = methods.accounts;
            }
            AnonymousClass003.A0u(ahd, ahd2);
            return new Methods(ahd, ahd2);
        }

        public final AHD<AgeCheckMethod> component1() {
            return this.primary;
        }

        public final AHD<AgeCheckMethod> component2() {
            return this.accounts;
        }

        public final AHD<AgeCheckMethod> getAccounts() {
            return this.accounts;
        }

        public final AHD<AgeCheckMethod> getPrimary() {
            return this.primary;
        }

        public int hashCode() {
            return AnonymousClass005.A0G(this.accounts, AnonymousClass005.A0E(this.primary));
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Methods(AHD<? extends AgeCheckMethod> ahd, AHD<? extends AgeCheckMethod> ahd2) {
            AnonymousClass003.A0u(ahd, ahd2);
            this.primary = ahd;
            this.accounts = ahd2;
        }

        public final Methods copy(AHD<? extends AgeCheckMethod> ahd, AHD<? extends AgeCheckMethod> ahd2) {
            AnonymousClass003.A0u(ahd, ahd2);
            return new Methods(ahd, ahd2);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Selfie extends C06G implements AgeStep {
        public final boolean picked;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Selfie) && this.picked == ((Selfie) obj).picked);
        }

        public static /* synthetic */ Selfie copy$default(Selfie selfie, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = selfie.picked;
            }
            return new Selfie(z);
        }

        public final boolean component1() {
            return this.picked;
        }

        public final Selfie copy(boolean z) {
            return new Selfie(z);
        }

        public final boolean getPicked() {
            return this.picked;
        }

        public int hashCode() {
            return this.picked ? 1231 : 1237;
        }

        public Selfie(boolean z) {
            this.picked = z;
        }

        public String toString() {
            return super.toString();
        }
    }
}
