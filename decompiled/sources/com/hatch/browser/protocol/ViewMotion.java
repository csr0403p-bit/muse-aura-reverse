package com.hatch.browser.protocol;

import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06H;
import X.C3cJ;
import X.C60O;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes6.dex */
public final class ViewMotion {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public ViewEdge edge;
    public List<ViewLanding> landing;
    public double scrolledY;

    public ViewMotion(double d, ViewEdge viewEdge, List<ViewLanding> list) {
        C7384Etj.A0Y(list, 2);
        this.scrolledY = d;
        this.edge = viewEdge;
        this.landing = list;
    }

    public final ViewMotion copy(double d, ViewEdge viewEdge, List<ViewLanding> list) {
        C7384Etj.A0Y(list, 2);
        return new ViewMotion(d, viewEdge, list);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ViewMotion) {
                ViewMotion viewMotion = (ViewMotion) obj;
                if (Double.compare(this.scrolledY, viewMotion.scrolledY) != 0 || this.edge != viewMotion.edge || !C7384Etj.areEqual(this.landing, viewMotion.landing)) {
                }
            }
            return false;
        }
        return true;
    }

    public final void setLanding(List<ViewLanding> list) {
        C7384Etj.A0Y(list, 0);
        this.landing = list;
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ViewMotion copy$default(ViewMotion viewMotion, double d, ViewEdge viewEdge, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            d = viewMotion.scrolledY;
        }
        if ((i & 2) != 0) {
            viewEdge = viewMotion.edge;
        }
        if ((i & 4) != 0) {
            list = viewMotion.landing;
        }
        return viewMotion.copy(d, viewEdge, list);
    }

    public final double component1() {
        return this.scrolledY;
    }

    public final ViewEdge component2() {
        return this.edge;
    }

    public final List<ViewLanding> component3() {
        return this.landing;
    }

    public final ViewEdge getEdge() {
        return this.edge;
    }

    public final List<ViewLanding> getLanding() {
        return this.landing;
    }

    public final double getScrolledY() {
        return this.scrolledY;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.landing, ((AnonymousClass002.A0A(Double.doubleToLongBits(this.scrolledY)) * 31) + AnonymousClass006.A0D(this.edge)) * 31);
    }

    public final void setEdge(ViewEdge viewEdge) {
        this.edge = viewEdge;
    }

    public final void setScrolledY(double d) {
        this.scrolledY = d;
    }

    public String toString() {
        double d = this.scrolledY;
        ViewEdge viewEdge = this.edge;
        List<ViewLanding> list = this.landing;
        StringBuilder sbA0x = C60O.A0x("ViewMotion(scrolledY=");
        sbA0x.append(d);
        sbA0x.append(", edge=");
        sbA0x.append(viewEdge);
        return C3cJ.A0L(list, ", landing=", sbA0x);
    }
}
