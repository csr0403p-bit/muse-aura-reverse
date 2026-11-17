package com.facebook.aura.feed.repo;

import X.AHD;
import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes.dex */
public interface FeedAttachment {

    public final class Carousel extends C06G implements FeedAttachment {
        public static final int $stable = 0;
        public final AHD<FeedCarouselItem> items;

        public Carousel(AHD<FeedCarouselItem> ahd) {
            C7384Etj.A0Y(ahd, 0);
            this.items = ahd;
        }

        public final Carousel copy(AHD<FeedCarouselItem> ahd) {
            C7384Etj.A0Y(ahd, 0);
            return new Carousel(ahd);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Carousel) && C7384Etj.areEqual(this.items, ((Carousel) obj).items));
        }

        public static /* synthetic */ Carousel copy$default(Carousel carousel, AHD ahd, int i, Object obj) {
            if ((i & 1) != 0) {
                ahd = carousel.items;
            }
            C7384Etj.A0Y(ahd, 0);
            return new Carousel(ahd);
        }

        public final AHD<FeedCarouselItem> component1() {
            return this.items;
        }

        public final AHD<FeedCarouselItem> getItems() {
            return this.items;
        }

        public int hashCode() {
            return this.items.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class HeroImage extends C06G implements FeedAttachment {
        public static final int $stable = 0;
        public final Float aspectRatio;
        public final String url;

        public HeroImage(String str, Float f) {
            C7384Etj.A0Y(str, 0);
            this.url = str;
            this.aspectRatio = f;
        }

        public final HeroImage copy(String str, Float f) {
            C7384Etj.A0Y(str, 0);
            return new HeroImage(str, f);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof HeroImage) {
                    HeroImage heroImage = (HeroImage) obj;
                    if (!C7384Etj.areEqual(this.url, heroImage.url) || !C7384Etj.areEqual(this.aspectRatio, heroImage.aspectRatio)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ HeroImage copy$default(HeroImage heroImage, String str, Float f, int i, Object obj) {
            if ((i & 1) != 0) {
                str = heroImage.url;
            }
            if ((i & 2) != 0) {
                f = heroImage.aspectRatio;
            }
            C7384Etj.A0Y(str, 0);
            return new HeroImage(str, f);
        }

        public final String component1() {
            return this.url;
        }

        public final Float component2() {
            return this.aspectRatio;
        }

        public final Float getAspectRatio() {
            return this.aspectRatio;
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return AnonymousClass001.A0G(this.url) + AnonymousClass006.A0D(this.aspectRatio);
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ HeroImage(String str, Float f, int i, C06H c06h) {
            this(str, (i & 2) != 0 ? null : f);
        }
    }

    public final class None implements FeedAttachment {
        public static final int $stable = 0;
        public static final None INSTANCE = new None();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof None);
        }

        public String toString() {
            return "None";
        }

        public int hashCode() {
            return 112675177;
        }
    }

    public final class Widget extends C06G implements FeedAttachment {
        public static final int $stable = 0;
        public final String html;

        public Widget(String str) {
            C7384Etj.A0Y(str, 0);
            this.html = str;
        }

        public final Widget copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new Widget(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Widget) && C7384Etj.areEqual(this.html, ((Widget) obj).html));
        }

        public static /* synthetic */ Widget copy$default(Widget widget, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = widget.html;
            }
            C7384Etj.A0Y(str, 0);
            return new Widget(str);
        }

        public final String component1() {
            return this.html;
        }

        public final String getHtml() {
            return this.html;
        }

        public int hashCode() {
            return this.html.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }
}
