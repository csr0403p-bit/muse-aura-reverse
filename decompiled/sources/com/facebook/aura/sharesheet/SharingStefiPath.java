package com.facebook.aura.sharesheet;

import com.facebook.aura.network.api.StefiHatchPath;

/* loaded from: classes4.dex */
public interface SharingStefiPath extends StefiHatchPath.Extension {

    public final class SharingSend implements SharingStefiPath {
        public static final int $stable = 0;
        public static final SharingSend INSTANCE = new SharingSend();
        public static final String value = "/hatch/sharing/send";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof SharingSend);
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "SharingSend";
        }

        public int hashCode() {
            return -835071740;
        }
    }

    public final class SharingUpload implements SharingStefiPath {
        public static final int $stable = 0;
        public static final SharingUpload INSTANCE = new SharingUpload();
        public static final String value = "/hatch/sharing/upload";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof SharingUpload);
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "SharingUpload";
        }

        public int hashCode() {
            return 722313341;
        }
    }
}
