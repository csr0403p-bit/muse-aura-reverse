package com.hatch.browser.protocol;

import X.C06H;
import X.C3cJ;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class PageImageLoads {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();

    public final class Sampled extends PageImageLoads {
        public static final int $stable = 8;
        public static final Companion Companion = new Companion();
        public final List<PageImageLoad> images;

        public Sampled(List<PageImageLoad> list) {
            C7384Etj.A0Y(list, 0);
            this.images = list;
        }

        public final Sampled copy(List<PageImageLoad> list) {
            C7384Etj.A0Y(list, 0);
            return new Sampled(list);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Sampled) && C7384Etj.areEqual(this.images, ((Sampled) obj).images));
        }

        public final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(C06H c06h) {
            }
        }

        public static /* synthetic */ Sampled copy$default(Sampled sampled, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = sampled.images;
            }
            C7384Etj.A0Y(list, 0);
            return new Sampled(list);
        }

        public final List<PageImageLoad> component1() {
            return this.images;
        }

        public final List<PageImageLoad> getImages() {
            return this.images;
        }

        public int hashCode() {
            return this.images.hashCode();
        }

        public String toString() {
            return C3cJ.A0M("Sampled(images=", this.images);
        }
    }

    public final class Unavailable extends PageImageLoads {
        public static final int $stable = 0;
        public static final Unavailable INSTANCE = new Unavailable();
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public PageImageLoads() {
    }

    public /* synthetic */ PageImageLoads(C06H c06h) {
    }
}
