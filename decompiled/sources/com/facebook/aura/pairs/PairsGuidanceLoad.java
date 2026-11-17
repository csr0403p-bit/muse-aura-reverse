package com.facebook.aura.pairs;

import X.C7384Etj;

/* loaded from: classes3.dex */
public interface PairsGuidanceLoad {

    public final class Failed implements PairsGuidanceLoad {
        public static final int $stable = 0;
        public static final Failed INSTANCE = new Failed();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Failed);
        }

        public String toString() {
            return "Failed";
        }

        public int hashCode() {
            return -534915079;
        }
    }

    public final class Loaded implements PairsGuidanceLoad {
        public static final int $stable = PairsDiscretionDocument.$stable;
        public final PairsDiscretionDocument document;

        public Loaded(PairsDiscretionDocument pairsDiscretionDocument) {
            C7384Etj.A0Y(pairsDiscretionDocument, 0);
            this.document = pairsDiscretionDocument;
        }

        public final PairsDiscretionDocument getDocument() {
            return this.document;
        }
    }

    public final class Loading implements PairsGuidanceLoad {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public String toString() {
            return "Loading";
        }

        public int hashCode() {
            return 2020742400;
        }
    }
}
