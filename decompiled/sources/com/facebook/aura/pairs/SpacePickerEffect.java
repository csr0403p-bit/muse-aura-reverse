package com.facebook.aura.pairs;

import X.C7384Etj;

/* loaded from: classes3.dex */
public interface SpacePickerEffect {

    public final class Close implements SpacePickerEffect {
        public static final int $stable = 0;
        public static final Close INSTANCE = new Close();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public String toString() {
            return "Close";
        }

        public int hashCode() {
            return -1096523702;
        }
    }

    public final class Share implements SpacePickerEffect {
        public static final int $stable = 0;
        public final String text;

        public Share(String str) {
            C7384Etj.A0Y(str, 0);
            this.text = str;
        }

        public final String getText() {
            return this.text;
        }
    }
}
