package com.facebook.aura.pairs;

import X.C7384Etj;

/* loaded from: classes3.dex */
public interface PairsCodeProgress {

    public final class CodeReady implements PairsCodeProgress {
        public static final int $stable = PairsPairingCode.$stable;
        public final PairsPairingCode code;

        public CodeReady(PairsPairingCode pairsPairingCode) {
            C7384Etj.A0Y(pairsPairingCode, 0);
            this.code = pairsPairingCode;
        }

        public final PairsPairingCode getCode() {
            return this.code;
        }
    }

    public final class Confirming implements PairsCodeProgress {
        public static final int $stable = PairsPairingCode.$stable;
        public final PairsPairingCode code;

        public Confirming(PairsPairingCode pairsPairingCode) {
            C7384Etj.A0Y(pairsPairingCode, 0);
            this.code = pairsPairingCode;
        }

        public final PairsPairingCode getCode() {
            return this.code;
        }
    }

    public final class Expired implements PairsCodeProgress {
        public static final int $stable = 0;
        public static final Expired INSTANCE = new Expired();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Expired);
        }

        public String toString() {
            return "Expired";
        }

        public int hashCode() {
            return 812129733;
        }
    }

    public final class Gone implements PairsCodeProgress {
        public static final int $stable = 0;
        public static final Gone INSTANCE = new Gone();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Gone);
        }

        public String toString() {
            return "Gone";
        }

        public int hashCode() {
            return -1393324545;
        }
    }

    public final class Idle implements PairsCodeProgress {
        public static final int $stable = 0;
        public static final Idle INSTANCE = new Idle();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Idle);
        }

        public String toString() {
            return "Idle";
        }

        public int hashCode() {
            return -1393275596;
        }
    }

    public final class ReadFailed implements PairsCodeProgress {
        public static final int $stable = 0;
        public static final ReadFailed INSTANCE = new ReadFailed();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ReadFailed);
        }

        public String toString() {
            return "ReadFailed";
        }

        public int hashCode() {
            return 550262483;
        }
    }

    public final class ReadingCode implements PairsCodeProgress {
        public static final int $stable = 0;
        public static final ReadingCode INSTANCE = new ReadingCode();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ReadingCode);
        }

        public String toString() {
            return "ReadingCode";
        }

        public int hashCode() {
            return 1245245753;
        }
    }

    public final class Unreachable implements PairsCodeProgress {
        public static final int $stable = 0;
        public static final Unreachable INSTANCE = new Unreachable();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Unreachable);
        }

        public String toString() {
            return "Unreachable";
        }

        public int hashCode() {
            return 638382452;
        }
    }
}
