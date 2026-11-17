package com.facebook.aura.identity.provider;

import X.C06G;
import X.C7384Etj;
import android.net.Uri;

/* loaded from: classes2.dex */
public interface HatchIcon {

    public final class Default implements HatchIcon {
        public static final int $stable = 0;
        public static final Default INSTANCE = new Default();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Default);
        }

        public String toString() {
            return "Default";
        }

        public int hashCode() {
            return 1285560911;
        }
    }

    public final class LocalImage extends C06G implements HatchIcon {
        public static final int $stable = 8;
        public final Uri uri;

        public LocalImage(Uri uri) {
            C7384Etj.A0Y(uri, 0);
            this.uri = uri;
        }

        public final LocalImage copy(Uri uri) {
            C7384Etj.A0Y(uri, 0);
            return new LocalImage(uri);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof LocalImage) && C7384Etj.areEqual(this.uri, ((LocalImage) obj).uri));
        }

        public static /* synthetic */ LocalImage copy$default(LocalImage localImage, Uri uri, int i, Object obj) {
            if ((i & 1) != 0) {
                uri = localImage.uri;
            }
            C7384Etj.A0Y(uri, 0);
            return new LocalImage(uri);
        }

        public final Uri component1() {
            return this.uri;
        }

        public final Uri getUri() {
            return this.uri;
        }

        public int hashCode() {
            return this.uri.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }
}
