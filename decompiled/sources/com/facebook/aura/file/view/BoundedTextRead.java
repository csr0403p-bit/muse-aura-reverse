package com.facebook.aura.file.view;

import X.C7384Etj;

/* loaded from: classes3.dex */
public interface BoundedTextRead {

    public final class Failed implements BoundedTextRead {
        public static final int $stable = 0;
        public static final Failed INSTANCE = new Failed();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Failed);
        }

        public String toString() {
            return "Failed";
        }

        public int hashCode() {
            return -768840174;
        }
    }

    public final class Success implements BoundedTextRead {
        public static final int $stable = 0;
        public final String content;

        public Success(String str) {
            C7384Etj.A0Y(str, 0);
            this.content = str;
        }

        public final String getContent() {
            return this.content;
        }
    }

    public final class TooLarge implements BoundedTextRead {
        public static final int $stable = 0;
        public static final TooLarge INSTANCE = new TooLarge();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof TooLarge);
        }

        public String toString() {
            return "TooLarge";
        }

        public int hashCode() {
            return -1809221924;
        }
    }
}
