package com.facebook.aura.pairs;

import X.C7384Etj;

/* loaded from: classes3.dex */
public interface PairsCodeOutcome {

    public final class AlreadyConfirmed implements PairsCodeOutcome {
        public static final int $stable = 0;
        public static final AlreadyConfirmed INSTANCE = new AlreadyConfirmed();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof AlreadyConfirmed);
        }

        public String toString() {
            return "AlreadyConfirmed";
        }

        public int hashCode() {
            return -1627488860;
        }
    }

    public final class Confirmed implements PairsCodeOutcome {
        public static final int $stable = 0;
        public static final Confirmed INSTANCE = new Confirmed();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Confirmed);
        }

        public String toString() {
            return "Confirmed";
        }

        public int hashCode() {
            return -223353278;
        }
    }

    public final class Expired implements PairsCodeOutcome {
        public static final int $stable = 0;
        public static final Expired INSTANCE = new Expired();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Expired);
        }

        public String toString() {
            return "Expired";
        }

        public int hashCode() {
            return -262822200;
        }
    }

    public final class Failed implements PairsCodeOutcome {
        public static final int $stable = 0;
        public static final Failed INSTANCE = new Failed();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Failed);
        }

        public String toString() {
            return "Failed";
        }

        public int hashCode() {
            return -1386769350;
        }
    }

    public final class Gone implements PairsCodeOutcome {
        public static final int $stable = 0;
        public static final Gone INSTANCE = new Gone();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Gone);
        }

        public String toString() {
            return "Gone";
        }

        public int hashCode() {
            return 289102812;
        }
    }

    public final class NotReady implements PairsCodeOutcome {
        public static final int $stable = 0;
        public static final NotReady INSTANCE = new NotReady();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof NotReady);
        }

        public String toString() {
            return "NotReady";
        }

        public int hashCode() {
            return -356843699;
        }
    }

    public final class Ready implements PairsCodeOutcome {
        public static final int $stable = 0;
        public final PairsPairingCode code;

        public Ready(PairsPairingCode pairsPairingCode) {
            C7384Etj.A0Y(pairsPairingCode, 0);
            this.code = pairsPairingCode;
        }

        public final PairsPairingCode getCode() {
            return this.code;
        }
    }

    public final class Unavailable implements PairsCodeOutcome {
        public static final int $stable = 0;
        public static final Unavailable INSTANCE = new Unavailable();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Unavailable);
        }

        public String toString() {
            return "Unavailable";
        }

        public int hashCode() {
            return -904507789;
        }
    }
}
