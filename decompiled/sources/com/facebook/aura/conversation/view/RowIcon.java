package com.facebook.aura.conversation.view;

import X.C06G;
import X.C7384Etj;

/* loaded from: classes.dex */
public interface RowIcon {

    public final class FileType extends C06G implements RowIcon {
        public static final int $stable = 0;
        public final int res;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof FileType) && this.res == ((FileType) obj).res);
        }

        public static /* synthetic */ FileType copy$default(FileType fileType, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = fileType.res;
            }
            return new FileType(i);
        }

        public final int component1() {
            return this.res;
        }

        public final FileType copy(int i) {
            return new FileType(i);
        }

        public final int getRes() {
            return this.res;
        }

        public int hashCode() {
            return this.res;
        }

        public FileType(int i) {
            this.res = i;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Glyph extends C06G implements RowIcon {
        public static final int $stable = 0;
        public final int res;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Glyph) && this.res == ((Glyph) obj).res);
        }

        public static /* synthetic */ Glyph copy$default(Glyph glyph, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = glyph.res;
            }
            return new Glyph(i);
        }

        public final int component1() {
            return this.res;
        }

        public final Glyph copy(int i) {
            return new Glyph(i);
        }

        public final int getRes() {
            return this.res;
        }

        public int hashCode() {
            return this.res;
        }

        public Glyph(int i) {
            this.res = i;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class IconImage extends C06G implements RowIcon {
        public static final int $stable = 0;
        public final String url;

        public IconImage(String str) {
            C7384Etj.A0Y(str, 0);
            this.url = str;
        }

        public final IconImage copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new IconImage(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof IconImage) && C7384Etj.areEqual(this.url, ((IconImage) obj).url));
        }

        public static /* synthetic */ IconImage copy$default(IconImage iconImage, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = iconImage.url;
            }
            C7384Etj.A0Y(str, 0);
            return new IconImage(str);
        }

        public final String component1() {
            return this.url;
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return this.url.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Image extends C06G implements RowIcon {
        public static final int $stable = 0;
        public final String url;

        public Image(String str) {
            C7384Etj.A0Y(str, 0);
            this.url = str;
        }

        public final Image copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new Image(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Image) && C7384Etj.areEqual(this.url, ((Image) obj).url));
        }

        public static /* synthetic */ Image copy$default(Image image, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = image.url;
            }
            C7384Etj.A0Y(str, 0);
            return new Image(str);
        }

        public final String component1() {
            return this.url;
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return this.url.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class LinkImage extends C06G implements RowIcon {
        public static final int $stable = 0;
        public final String url;

        public LinkImage(String str) {
            C7384Etj.A0Y(str, 0);
            this.url = str;
        }

        public final LinkImage copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new LinkImage(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof LinkImage) && C7384Etj.areEqual(this.url, ((LinkImage) obj).url));
        }

        public static /* synthetic */ LinkImage copy$default(LinkImage linkImage, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = linkImage.url;
            }
            C7384Etj.A0Y(str, 0);
            return new LinkImage(str);
        }

        public final String component1() {
            return this.url;
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return this.url.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Monogram extends C06G implements RowIcon {
        public static final int $stable = 0;
        public final String letter;

        public Monogram(String str) {
            C7384Etj.A0Y(str, 0);
            this.letter = str;
        }

        public final Monogram copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new Monogram(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Monogram) && C7384Etj.areEqual(this.letter, ((Monogram) obj).letter));
        }

        public static /* synthetic */ Monogram copy$default(Monogram monogram, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = monogram.letter;
            }
            C7384Etj.A0Y(str, 0);
            return new Monogram(str);
        }

        public final String component1() {
            return this.letter;
        }

        public final String getLetter() {
            return this.letter;
        }

        public int hashCode() {
            return this.letter.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }
}
