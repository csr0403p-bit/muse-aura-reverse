package com.hatch.browser.protocol;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06H;
import X.C0KA;
import X.C3cJ;
import X.C60O;
import X.C7384Etj;
import X.HsK;

/* loaded from: classes6.dex */
public final class VisualButtonEvent {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public double acknowledgedMs;
    public Double heldMs;
    public Point position;
    public boolean pressed;

    public VisualButtonEvent(boolean z, Point point, double d, Double d2) {
        C7384Etj.A0Y(point, 1);
        this.pressed = z;
        this.position = point;
        this.acknowledgedMs = d;
        this.heldMs = d2;
    }

    public static /* synthetic */ VisualButtonEvent copy$default(VisualButtonEvent visualButtonEvent, boolean z, Point point, double d, Double d2, int i, Object obj) {
        boolean z2 = z;
        Point point2 = point;
        double d3 = d;
        Double d4 = d2;
        if ((i & 1) != 0) {
            z2 = visualButtonEvent.pressed;
        }
        if ((i & 2) != 0) {
            point2 = visualButtonEvent.position;
        }
        if ((i & 4) != 0) {
            d3 = visualButtonEvent.acknowledgedMs;
        }
        if ((i & 8) != 0) {
            d4 = visualButtonEvent.heldMs;
        }
        C7384Etj.A0Y(point2, 1);
        return new VisualButtonEvent(z2, point2, d3, d4);
    }

    public final VisualButtonEvent copy(boolean z, Point point, double d, Double d2) {
        C7384Etj.A0Y(point, 1);
        return new VisualButtonEvent(z, point, d, d2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VisualButtonEvent) {
                VisualButtonEvent visualButtonEvent = (VisualButtonEvent) obj;
                if (this.pressed != visualButtonEvent.pressed || !C7384Etj.areEqual(this.position, visualButtonEvent.position) || Double.compare(this.acknowledgedMs, visualButtonEvent.acknowledgedMs) != 0 || !C7384Etj.areEqual(this.heldMs, visualButtonEvent.heldMs)) {
                }
            }
            return false;
        }
        return true;
    }

    public final void setPosition(Point point) {
        C7384Etj.A0Y(point, 0);
        this.position = point;
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public final boolean component1() {
        return this.pressed;
    }

    public final Point component2() {
        return this.position;
    }

    public final double component3() {
        return this.acknowledgedMs;
    }

    public final Double component4() {
        return this.heldMs;
    }

    public final double getAcknowledgedMs() {
        return this.acknowledgedMs;
    }

    public final Double getHeldMs() {
        return this.heldMs;
    }

    public final Point getPosition() {
        return this.position;
    }

    public final boolean getPressed() {
        return this.pressed;
    }

    public int hashCode() {
        return HsK.A01(this.acknowledgedMs, AnonymousClass005.A0F(this.position, C0KA.A02(this.pressed))) + AnonymousClass006.A0D(this.heldMs);
    }

    public final void setAcknowledgedMs(double d) {
        this.acknowledgedMs = d;
    }

    public final void setHeldMs(Double d) {
        this.heldMs = d;
    }

    public final void setPressed(boolean z) {
        this.pressed = z;
    }

    public String toString() {
        boolean z = this.pressed;
        Point point = this.position;
        double d = this.acknowledgedMs;
        Double d2 = this.heldMs;
        StringBuilder sbA10 = C60O.A10("VisualButtonEvent(pressed=", z);
        sbA10.append(", position=");
        sbA10.append(point);
        sbA10.append(", acknowledgedMs=");
        sbA10.append(d);
        return C3cJ.A0L(d2, ", heldMs=", sbA10);
    }
}
