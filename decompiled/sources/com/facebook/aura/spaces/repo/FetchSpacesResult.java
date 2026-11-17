package com.facebook.aura.spaces.repo;

import X.AHD;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes3.dex */
public interface FetchSpacesResult {

    public final class Failure extends C06G implements FetchSpacesResult {
        public final String errorMessage;
        public final String errorType;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Failure) {
                    Failure failure = (Failure) obj;
                    if (!C7384Etj.areEqual(this.errorType, failure.errorType) || !C7384Etj.areEqual(this.errorMessage, failure.errorMessage)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Failure copy$default(Failure failure, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = failure.errorType;
            }
            if ((i & 2) != 0) {
                str2 = failure.errorMessage;
            }
            AnonymousClass003.A0u(str, str2);
            return new Failure(str, str2);
        }

        public final String component1() {
            return this.errorType;
        }

        public final String component2() {
            return this.errorMessage;
        }

        public final String getErrorMessage() {
            return this.errorMessage;
        }

        public final String getErrorType() {
            return this.errorType;
        }

        public int hashCode() {
            return AnonymousClass001.A0H(this.errorMessage, AnonymousClass001.A0G(this.errorType));
        }

        public Failure(String str, String str2) {
            AnonymousClass003.A0u(str, str2);
            this.errorType = str;
            this.errorMessage = str2;
        }

        public final Failure copy(String str, String str2) {
            AnonymousClass003.A0u(str, str2);
            return new Failure(str, str2);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Success extends C06G implements FetchSpacesResult {
        public final AHD<SpaceCard> cards;

        public Success(AHD<SpaceCard> ahd) {
            C7384Etj.A0Y(ahd, 0);
            this.cards = ahd;
        }

        public final Success copy(AHD<SpaceCard> ahd) {
            C7384Etj.A0Y(ahd, 0);
            return new Success(ahd);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Success) && C7384Etj.areEqual(this.cards, ((Success) obj).cards));
        }

        public static /* synthetic */ Success copy$default(Success success, AHD ahd, int i, Object obj) {
            if ((i & 1) != 0) {
                ahd = success.cards;
            }
            C7384Etj.A0Y(ahd, 0);
            return new Success(ahd);
        }

        public final AHD<SpaceCard> component1() {
            return this.cards;
        }

        public final AHD<SpaceCard> getCards() {
            return this.cards;
        }

        public int hashCode() {
            return this.cards.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }
}
