package com.facebook.aura.pairs;

import X.C7384Etj;

/* loaded from: classes3.dex */
public interface PairsGuidanceSaveState {

    public final class Idle implements PairsGuidanceSaveState {
        public static final int $stable = 0;
        public static final Idle INSTANCE = new Idle();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Idle);
        }

        public String toString() {
            return "Idle";
        }

        public int hashCode() {
            return 857178746;
        }
    }

    public final class NotSaved implements PairsGuidanceSaveState {
        public static final int $stable = 0;
        public static final NotSaved INSTANCE = new NotSaved();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof NotSaved);
        }

        public String toString() {
            return "NotSaved";
        }

        public int hashCode() {
            return 1482628890;
        }
    }

    public final class Waiting implements PairsGuidanceSaveState {
        public static final int $stable = 0;
        public final String text;

        public Waiting(String str) {
            C7384Etj.A0Y(str, 0);
            this.text = str;
        }

        public final String getText() {
            return this.text;
        }
    }
}
