package com.facebook.aura.shopping.model;

import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes4.dex */
public interface PdpVariantSwatch {

    public final class Hex extends C06G implements PdpVariantSwatch {
        public static final int $stable = 0;
        public final int rgb;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Hex) && this.rgb == ((Hex) obj).rgb);
        }

        public static /* synthetic */ Hex copy$default(Hex hex, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = hex.rgb;
            }
            return new Hex(i);
        }

        public final int component1() {
            return this.rgb;
        }

        public final Hex copy(int i) {
            return new Hex(i);
        }

        public final int getRgb() {
            return this.rgb;
        }

        public int hashCode() {
            return this.rgb;
        }

        public Hex(int i) {
            this.rgb = i;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Photo extends C06G implements PdpVariantSwatch {
        public static final int $stable = 0;
        public final String url;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Photo) && C7384Etj.areEqual(this.url, ((Photo) obj).url));
        }

        public static /* synthetic */ Photo copy$default(Photo photo, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = photo.url;
            }
            return new Photo(str);
        }

        public final String component1() {
            return this.url;
        }

        public final Photo copy(String str) {
            return new Photo(str);
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return AnonymousClass006.A0G(this.url);
        }

        public Photo(String str) {
            this.url = str;
        }

        public String toString() {
            return super.toString();
        }
    }
}
