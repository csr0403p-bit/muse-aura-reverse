package com.meta.maps.fancypins;

import X.C06H;
import X.C7384Etj;

/* loaded from: classes6.dex */
public final class OwnedRect {
    public static final Companion Companion = new Companion();
    public final double height;
    public final double width;
    public final double x;
    public final double y;

    public final class Companion {
        public final OwnedRect from(LayoutRect layoutRect) {
            C7384Etj.A0Y(layoutRect, 0);
            return new OwnedRect(layoutRect.x, layoutRect.y, layoutRect.width, layoutRect.height);
        }

        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public final LayoutRect materialize() {
        return new LayoutRect(this.x, this.y, this.width, this.height);
    }

    public OwnedRect(double d, double d2, double d3, double d4) {
        this.x = d;
        this.y = d2;
        this.width = d3;
        this.height = d4;
    }
}
