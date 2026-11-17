package com.hatch.browser.protocol;

import X.AnonymousClass002;
import X.BV7;
import X.C06H;
import X.C60O;

/* loaded from: classes6.dex */
public final class Point {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public double x;
    public double y;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Point) {
                Point point = (Point) obj;
                if (Double.compare(this.x, point.x) != 0 || Double.compare(this.y, point.y) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public static /* synthetic */ Point copy$default(Point point, double d, double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = point.x;
        }
        if ((i & 2) != 0) {
            d2 = point.y;
        }
        return new Point(d, d2);
    }

    public final double component1() {
        return this.x;
    }

    public final double component2() {
        return this.y;
    }

    public final Point copy(double d, double d2) {
        return new Point(d, d2);
    }

    public final double getX() {
        return this.x;
    }

    public final double getY() {
        return this.y;
    }

    public int hashCode() {
        return (AnonymousClass002.A0A(Double.doubleToLongBits(this.x)) * 31) + AnonymousClass002.A0A(Double.doubleToLongBits(this.y));
    }

    public final void setX(double d) {
        this.x = d;
    }

    public final void setY(double d) {
        this.y = d;
    }

    public String toString() {
        double d = this.x;
        double d2 = this.y;
        StringBuilder sbA0x = C60O.A0x("Point(x=");
        sbA0x.append(d);
        sbA0x.append(", y=");
        sbA0x.append(d2);
        return BV7.A10(sbA0x);
    }

    public Point(double d, double d2) {
        this.x = d;
        this.y = d2;
    }
}
