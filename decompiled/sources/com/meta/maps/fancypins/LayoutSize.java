package com.meta.maps.fancypins;

import X.AnonymousClass002;
import X.AnonymousClass005;
import X.BV7;
import X.C06H;
import X.C3cG;
import X.C7384Etj;
import X.HsK;

/* loaded from: classes6.dex */
public final class LayoutSize {
    public static final Companion Companion = new Companion();
    public final SizeConstraint constraint;
    public final double height;
    public final double width;

    public final class Companion {
        public final LayoutSize fitContent(double d, double d2) {
            return new LayoutSize(SizeConstraint.AUTO, d, d2);
        }

        public final LayoutSize fixed(double d, double d2) {
            return new LayoutSize(SizeConstraint.FIXED, d, d2);
        }

        public final LayoutSize flexible() {
            return fitContent(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
        }

        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public LayoutSize(SizeConstraint sizeConstraint, double d, double d2) {
        C7384Etj.A0Y(sizeConstraint, 0);
        this.constraint = sizeConstraint;
        this.width = d;
        this.height = d2;
    }

    public final LayoutSize copy(SizeConstraint sizeConstraint, double d, double d2) {
        C7384Etj.A0Y(sizeConstraint, 0);
        return new LayoutSize(sizeConstraint, d, d2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LayoutSize) {
                LayoutSize layoutSize = (LayoutSize) obj;
                if (this.constraint != layoutSize.constraint || Double.compare(this.width, layoutSize.width) != 0 || Double.compare(this.height, layoutSize.height) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ LayoutSize copy$default(LayoutSize layoutSize, SizeConstraint sizeConstraint, double d, double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            sizeConstraint = layoutSize.constraint;
        }
        if ((i & 2) != 0) {
            d = layoutSize.width;
        }
        if ((i & 4) != 0) {
            d2 = layoutSize.height;
        }
        return layoutSize.copy(sizeConstraint, d, d2);
    }

    public static final LayoutSize fitContent(double d, double d2) {
        return Companion.fitContent(d, d2);
    }

    public static final LayoutSize fixed(double d, double d2) {
        return Companion.fixed(d, d2);
    }

    public static final LayoutSize flexible() {
        return Companion.flexible();
    }

    public final SizeConstraint component1() {
        return this.constraint;
    }

    public final double component2() {
        return this.width;
    }

    public final double component3() {
        return this.height;
    }

    public final SizeConstraint getConstraint() {
        return this.constraint;
    }

    public final double getHeight() {
        return this.height;
    }

    public final double getWidth() {
        return this.width;
    }

    public int hashCode() {
        return HsK.A01(this.width, AnonymousClass005.A0E(this.constraint)) + AnonymousClass002.A0A(Double.doubleToLongBits(this.height));
    }

    public String toString() {
        SizeConstraint sizeConstraint = this.constraint;
        double d = this.width;
        double d2 = this.height;
        StringBuilder sbA0f = C3cG.A0f(sizeConstraint, "LayoutSize(constraint=");
        sbA0f.append(", width=");
        sbA0f.append(d);
        sbA0f.append(", height=");
        sbA0f.append(d2);
        return BV7.A10(sbA0f);
    }
}
