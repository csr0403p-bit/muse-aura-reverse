package com.meta.maps.fancypins;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06H;
import X.C3cG;
import X.C3cJ;
import X.C7384Etj;
import X.HsK;

/* loaded from: classes6.dex */
public final class LayoutAnchor {
    public static final Companion Companion = new Companion();
    public final LayoutGridPoint attachFrom;
    public final LayoutGridPoint attachTo;
    public final AnchorReference reference;
    public final String targetPartId;
    public final double xOffset;
    public final double yOffset;

    public final class Companion {
        public final LayoutAnchor edge(String str, LayoutGridPoint layoutGridPoint, LayoutGridPoint layoutGridPoint2, double d) {
            AnonymousClass005.A0x(str, layoutGridPoint, layoutGridPoint2);
            return edge(str, layoutGridPoint, layoutGridPoint2, d, 0.0d);
        }

        public final LayoutAnchor relative(String str) {
            C7384Etj.A0Y(str, 0);
            return relative(str, 0.0d, 0.0d);
        }

        public static /* synthetic */ LayoutAnchor edge$default(Companion companion, String str, LayoutGridPoint layoutGridPoint, LayoutGridPoint layoutGridPoint2, double d, double d2, int i, Object obj) {
            if ((i & 8) != 0) {
                d = 0.0d;
            }
            if ((i & 16) != 0) {
                d2 = 0.0d;
            }
            return companion.edge(str, layoutGridPoint, layoutGridPoint2, d, d2);
        }

        public static /* synthetic */ LayoutAnchor pinCenter$default(Companion companion, LayoutGridPoint layoutGridPoint, double d, double d2, int i, Object obj) {
            if ((i & 1) != 0) {
                layoutGridPoint = LayoutGridPoint.CENTER;
            }
            if ((i & 2) != 0) {
                d = 0.0d;
            }
            if ((i & 4) != 0) {
                d2 = 0.0d;
            }
            return companion.pinCenter(layoutGridPoint, d, d2);
        }

        public static /* synthetic */ LayoutAnchor relative$default(Companion companion, String str, double d, double d2, int i, Object obj) {
            if ((i & 2) != 0) {
                d = 0.0d;
            }
            if ((i & 4) != 0) {
                d2 = 0.0d;
            }
            return companion.relative(str, d, d2);
        }

        public final LayoutAnchor pinCenter() {
            return pinCenter(LayoutGridPoint.CENTER, 0.0d, 0.0d);
        }

        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public final LayoutAnchor edge(String str, LayoutGridPoint layoutGridPoint, LayoutGridPoint layoutGridPoint2) {
            AnonymousClass005.A0x(str, layoutGridPoint, layoutGridPoint2);
            return edge(str, layoutGridPoint, layoutGridPoint2, 0.0d, 0.0d);
        }

        public final LayoutAnchor pinCenter(LayoutGridPoint layoutGridPoint, double d, double d2) {
            C7384Etj.A0Y(layoutGridPoint, 0);
            return new LayoutAnchor(AnchorReference.PIN_CENTER, d, d2, null, LayoutGridPoint.CENTER, layoutGridPoint);
        }

        public final LayoutAnchor relative(String str, double d, double d2) {
            C7384Etj.A0Y(str, 0);
            AnchorReference anchorReference = AnchorReference.PART;
            LayoutGridPoint layoutGridPoint = LayoutGridPoint.CENTER;
            return new LayoutAnchor(anchorReference, d, d2, str, layoutGridPoint, layoutGridPoint);
        }

        public final LayoutAnchor edge(String str, LayoutGridPoint layoutGridPoint, LayoutGridPoint layoutGridPoint2, double d, double d2) {
            AnonymousClass005.A0x(str, layoutGridPoint, layoutGridPoint2);
            return new LayoutAnchor(AnchorReference.PART, d, d2, str, layoutGridPoint, layoutGridPoint2);
        }

        public final LayoutAnchor pinCenter(LayoutGridPoint layoutGridPoint, double d) {
            C7384Etj.A0Y(layoutGridPoint, 0);
            return pinCenter(layoutGridPoint, d, 0.0d);
        }

        public final LayoutAnchor relative(String str, double d) {
            C7384Etj.A0Y(str, 0);
            return relative(str, d, 0.0d);
        }

        public final LayoutAnchor pinCenter(LayoutGridPoint layoutGridPoint) {
            C7384Etj.A0Y(layoutGridPoint, 0);
            return pinCenter(layoutGridPoint, 0.0d, 0.0d);
        }
    }

    public final LayoutAnchor copy(AnchorReference anchorReference, double d, double d2, String str, LayoutGridPoint layoutGridPoint, LayoutGridPoint layoutGridPoint2) {
        C7384Etj.A0Y(anchorReference, 0);
        AnonymousClass003.A0y(layoutGridPoint, layoutGridPoint2);
        return new LayoutAnchor(anchorReference, d, d2, str, layoutGridPoint, layoutGridPoint2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LayoutAnchor) {
                LayoutAnchor layoutAnchor = (LayoutAnchor) obj;
                if (this.reference != layoutAnchor.reference || Double.compare(this.xOffset, layoutAnchor.xOffset) != 0 || Double.compare(this.yOffset, layoutAnchor.yOffset) != 0 || !C7384Etj.areEqual(this.targetPartId, layoutAnchor.targetPartId) || this.attachTo != layoutAnchor.attachTo || this.attachFrom != layoutAnchor.attachFrom) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ LayoutAnchor(AnchorReference anchorReference, double d, double d2, String str, LayoutGridPoint layoutGridPoint, LayoutGridPoint layoutGridPoint2, int i, C06H c06h) {
        this(anchorReference, d, d2, (i & 8) != 0 ? null : str, layoutGridPoint, layoutGridPoint2);
    }

    public static /* synthetic */ LayoutAnchor copy$default(LayoutAnchor layoutAnchor, AnchorReference anchorReference, double d, double d2, String str, LayoutGridPoint layoutGridPoint, LayoutGridPoint layoutGridPoint2, int i, Object obj) {
        if ((i & 1) != 0) {
            anchorReference = layoutAnchor.reference;
        }
        if ((i & 2) != 0) {
            d = layoutAnchor.xOffset;
        }
        if ((i & 4) != 0) {
            d2 = layoutAnchor.yOffset;
        }
        if ((i & 8) != 0) {
            str = layoutAnchor.targetPartId;
        }
        if ((i & 16) != 0) {
            layoutGridPoint = layoutAnchor.attachTo;
        }
        if ((i & 32) != 0) {
            layoutGridPoint2 = layoutAnchor.attachFrom;
        }
        return layoutAnchor.copy(anchorReference, d, d2, str, layoutGridPoint, layoutGridPoint2);
    }

    public static final LayoutAnchor edge(String str, LayoutGridPoint layoutGridPoint, LayoutGridPoint layoutGridPoint2, double d) {
        return Companion.edge(str, layoutGridPoint, layoutGridPoint2, d);
    }

    public static final LayoutAnchor pinCenter() {
        return Companion.pinCenter();
    }

    public static final LayoutAnchor relative(String str) {
        return Companion.relative(str);
    }

    public final AnchorReference component1() {
        return this.reference;
    }

    public final double component2() {
        return this.xOffset;
    }

    public final double component3() {
        return this.yOffset;
    }

    public final String component4() {
        return this.targetPartId;
    }

    public final LayoutGridPoint component5() {
        return this.attachTo;
    }

    public final LayoutGridPoint component6() {
        return this.attachFrom;
    }

    public final LayoutGridPoint getAttachFrom() {
        return this.attachFrom;
    }

    public final LayoutGridPoint getAttachTo() {
        return this.attachTo;
    }

    public final AnchorReference getReference() {
        return this.reference;
    }

    public final String getTargetPartId() {
        return this.targetPartId;
    }

    public final double getXOffset() {
        return this.xOffset;
    }

    public final double getYOffset() {
        return this.yOffset;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.attachFrom, AnonymousClass005.A0F(this.attachTo, (HsK.A01(this.yOffset, HsK.A01(this.xOffset, AnonymousClass005.A0E(this.reference))) + AnonymousClass006.A0G(this.targetPartId)) * 31));
    }

    public String toString() {
        AnchorReference anchorReference = this.reference;
        double d = this.xOffset;
        double d2 = this.yOffset;
        String str = this.targetPartId;
        LayoutGridPoint layoutGridPoint = this.attachTo;
        LayoutGridPoint layoutGridPoint2 = this.attachFrom;
        StringBuilder sbA0f = C3cG.A0f(anchorReference, "LayoutAnchor(reference=");
        sbA0f.append(", xOffset=");
        sbA0f.append(d);
        sbA0f.append(", yOffset=");
        sbA0f.append(d2);
        sbA0f.append(", targetPartId=");
        sbA0f.append(str);
        sbA0f.append(", attachTo=");
        sbA0f.append(layoutGridPoint);
        return C3cJ.A0L(layoutGridPoint2, ", attachFrom=", sbA0f);
    }

    public LayoutAnchor(AnchorReference anchorReference, double d, double d2, String str, LayoutGridPoint layoutGridPoint, LayoutGridPoint layoutGridPoint2) {
        C7384Etj.A0Y(anchorReference, 0);
        AnonymousClass003.A0y(layoutGridPoint, layoutGridPoint2);
        this.reference = anchorReference;
        this.xOffset = d;
        this.yOffset = d2;
        this.targetPartId = str;
        this.attachTo = layoutGridPoint;
        this.attachFrom = layoutGridPoint2;
    }

    public static final LayoutAnchor edge(String str, LayoutGridPoint layoutGridPoint, LayoutGridPoint layoutGridPoint2) {
        return Companion.edge(str, layoutGridPoint, layoutGridPoint2);
    }

    public static final LayoutAnchor pinCenter(LayoutGridPoint layoutGridPoint, double d, double d2) {
        return Companion.pinCenter(layoutGridPoint, d, d2);
    }

    public static final LayoutAnchor relative(String str, double d, double d2) {
        return Companion.relative(str, d, d2);
    }

    public static final LayoutAnchor edge(String str, LayoutGridPoint layoutGridPoint, LayoutGridPoint layoutGridPoint2, double d, double d2) {
        return Companion.edge(str, layoutGridPoint, layoutGridPoint2, d, d2);
    }

    public static final LayoutAnchor pinCenter(LayoutGridPoint layoutGridPoint, double d) {
        return Companion.pinCenter(layoutGridPoint, d);
    }

    public static final LayoutAnchor relative(String str, double d) {
        return Companion.relative(str, d);
    }

    public static final LayoutAnchor pinCenter(LayoutGridPoint layoutGridPoint) {
        return Companion.pinCenter(layoutGridPoint);
    }
}
