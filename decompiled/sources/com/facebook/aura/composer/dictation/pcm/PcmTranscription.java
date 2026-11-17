package com.facebook.aura.composer.dictation.pcm;

import X.C7384Etj;

/* loaded from: classes2.dex */
public interface PcmTranscription {

    public final class Failed implements PcmTranscription {
        public static final Failed INSTANCE = new Failed();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Failed);
        }

        public String toString() {
            return "Failed";
        }

        public int hashCode() {
            return -72098990;
        }
    }

    public final class Text implements PcmTranscription {
        public final String text;

        public Text(String str) {
            C7384Etj.A0Y(str, 0);
            this.text = str;
        }

        public final String getText() {
            return this.text;
        }
    }

    public final class Unavailable implements PcmTranscription {
        public static final Unavailable INSTANCE = new Unavailable();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Unavailable);
        }

        public String toString() {
            return "Unavailable";
        }

        public int hashCode() {
            return 1715648091;
        }
    }
}
