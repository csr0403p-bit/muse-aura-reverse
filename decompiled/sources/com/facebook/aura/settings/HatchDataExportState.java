package com.facebook.aura.settings;

/* loaded from: classes.dex */
public interface HatchDataExportState {

    public final class Error implements HatchDataExportState {
        public static final int $stable = 0;
        public static final Error INSTANCE = new Error();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Error);
        }

        public String toString() {
            return "Error";
        }

        public int hashCode() {
            return -903886904;
        }
    }

    public final class Idle implements HatchDataExportState {
        public static final int $stable = 0;
        public static final Idle INSTANCE = new Idle();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Idle);
        }

        public String toString() {
            return "Idle";
        }

        public int hashCode() {
            return -306146796;
        }
    }

    public final class Running implements HatchDataExportState {
        public static final int $stable = 0;
        public static final Running INSTANCE = new Running();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Running);
        }

        public String toString() {
            return "Running";
        }

        public int hashCode() {
            return 1977850751;
        }
    }
}
