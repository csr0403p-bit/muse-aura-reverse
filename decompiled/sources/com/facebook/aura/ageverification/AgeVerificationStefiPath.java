package com.facebook.aura.ageverification;

import com.facebook.aura.network.api.StefiHatchPath;

/* loaded from: classes6.dex */
public interface AgeVerificationStefiPath extends StefiHatchPath.Extension {

    public final class Start implements AgeVerificationStefiPath {
        public static final int $stable = 0;
        public static final Start INSTANCE = new Start();
        public static final String value = "/hatch/age_verification/start";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Start);
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "Start";
        }

        public int hashCode() {
            return -1308246934;
        }
    }

    public final class Status implements AgeVerificationStefiPath {
        public static final int $stable = 0;
        public static final Status INSTANCE = new Status();
        public static final String value = "/hatch/age_verification/status";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Status);
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "Status";
        }

        public int hashCode() {
            return -1900947222;
        }
    }

    public final class Submit implements AgeVerificationStefiPath {
        public static final int $stable = 0;
        public static final Submit INSTANCE = new Submit();
        public static final String value = "/hatch/age_verification/submit";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Submit);
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "Submit";
        }

        public int hashCode() {
            return -1900001008;
        }
    }

    public final class Upload implements AgeVerificationStefiPath {
        public static final int $stable = 0;
        public static final Upload INSTANCE = new Upload();
        public static final String value = "/hatch/age_verification/upload";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Upload);
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "Upload";
        }

        public int hashCode() {
            return -1847060743;
        }
    }
}
