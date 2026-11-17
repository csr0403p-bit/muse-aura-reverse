package com.facebook.aura.composer.view;

/* loaded from: classes.dex */
public interface ComposerMode {

    public final class HoldDictation implements ComposerMode {
        public static final int $stable = 0;
        public static final HoldDictation INSTANCE = new HoldDictation();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof HoldDictation);
        }

        public String toString() {
            return "HoldDictation";
        }

        public int hashCode() {
            return -454663840;
        }
    }

    public final class TapDictation implements ComposerMode {
        public static final int $stable = 0;
        public static final TapDictation INSTANCE = new TapDictation();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof TapDictation);
        }

        public String toString() {
            return "TapDictation";
        }

        public int hashCode() {
            return -1547710916;
        }
    }

    public final class TextInput implements ComposerMode {
        public static final int $stable = 0;
        public static final TextInput INSTANCE = new TextInput();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof TextInput);
        }

        public String toString() {
            return "TextInput";
        }

        public int hashCode() {
            return 1324729597;
        }
    }
}
