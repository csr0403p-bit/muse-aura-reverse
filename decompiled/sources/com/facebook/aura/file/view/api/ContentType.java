package com.facebook.aura.file.view.api;

import X.C06H;
import com.facebook.aura.deeplink.AuraDeeplinkRouteMapper;

/* loaded from: classes3.dex */
public abstract class ContentType {
    public static final int $stable = 0;

    public final class Audio extends ContentType {
        public static final int $stable = 0;
        public static final Audio INSTANCE = new Audio();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Audio);
        }

        public String toString() {
            return "Audio";
        }

        public int hashCode() {
            return -1837595776;
        }
    }

    public final class Code extends ContentType {
        public static final int $stable = 0;
        public static final Code INSTANCE = new Code();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Code);
        }

        public String toString() {
            return "Code";
        }

        public int hashCode() {
            return 1741891843;
        }
    }

    public final class Html extends ContentType {
        public static final int $stable = 0;
        public static final Html INSTANCE = new Html();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Html);
        }

        public String toString() {
            return "Html";
        }

        public int hashCode() {
            return 1742045889;
        }
    }

    /* loaded from: classes.dex */
    public final class Image extends ContentType {
        public static final int $stable = 0;
        public static final Image INSTANCE = new Image();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Image);
        }

        public String toString() {
            return "Image";
        }

        public int hashCode() {
            return -1830448891;
        }
    }

    public final class Pdf extends ContentType {
        public static final int $stable = 0;
        public static final Pdf INSTANCE = new Pdf();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Pdf);
        }

        public String toString() {
            return "Pdf";
        }

        public int hashCode() {
            return 1995864860;
        }
    }

    /* loaded from: classes.dex */
    public final class Slides extends ContentType {
        public static final int $stable = 0;
        public static final Slides INSTANCE = new Slides();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Slides);
        }

        public String toString() {
            return "Slides";
        }

        public int hashCode() {
            return -623737224;
        }
    }

    public final class Text extends ContentType {
        public static final int $stable = 0;
        public static final Text INSTANCE = new Text();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Text);
        }

        public String toString() {
            return "Text";
        }

        public int hashCode() {
            return 1742389315;
        }
    }

    public final class Unknown extends ContentType {
        public static final int $stable = 0;
        public static final Unknown INSTANCE = new Unknown();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Unknown);
        }

        public String toString() {
            return "Unknown";
        }

        public int hashCode() {
            return -321564300;
        }
    }

    /* loaded from: classes.dex */
    public final class Video extends ContentType {
        public static final int $stable = 0;
        public static final Video INSTANCE = new Video();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Video);
        }

        public String toString() {
            return "Video";
        }

        public int hashCode() {
            return -1818559451;
        }
    }

    public final String artifactTypeString() {
        return this instanceof Code ? AuraDeeplinkRouteMapper.CODE_PARAM : this instanceof Html ? "canvas" : "document";
    }

    public final boolean isMedia() {
        return (this instanceof Image) || (this instanceof Video) || (this instanceof Audio);
    }

    public /* synthetic */ ContentType(C06H c06h) {
    }

    public ContentType() {
    }
}
