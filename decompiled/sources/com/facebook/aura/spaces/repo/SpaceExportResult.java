package com.facebook.aura.spaces.repo;

import X.C7384Etj;
import android.net.Uri;

/* loaded from: classes3.dex */
public interface SpaceExportResult {

    public final class Failed implements SpaceExportResult {
        public static final Failed INSTANCE = new Failed();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Failed);
        }

        public String toString() {
            return "Failed";
        }

        public int hashCode() {
            return -609430465;
        }
    }

    public final class NotBuilt implements SpaceExportResult {
        public static final NotBuilt INSTANCE = new NotBuilt();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof NotBuilt);
        }

        public String toString() {
            return "NotBuilt";
        }

        public int hashCode() {
            return -672776467;
        }
    }

    public final class NotExportable implements SpaceExportResult {
        public static final NotExportable INSTANCE = new NotExportable();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof NotExportable);
        }

        public String toString() {
            return "NotExportable";
        }

        public int hashCode() {
            return -1687673857;
        }
    }

    public final class SaveFailed implements SpaceExportResult {
        public static final SaveFailed INSTANCE = new SaveFailed();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof SaveFailed);
        }

        public String toString() {
            return "SaveFailed";
        }

        public int hashCode() {
            return -610672868;
        }
    }

    public final class Saved implements SpaceExportResult {
        public final Uri uri;

        public Saved(Uri uri) {
            C7384Etj.A0Y(uri, 0);
            this.uri = uri;
        }

        public final Uri getUri() {
            return this.uri;
        }
    }
}
