package com.meta.maps.fancypins;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06H;
import X.C3cG;
import X.C3cJ;
import X.C7384Etj;

/* loaded from: classes6.dex */
public final class FancyPinPlacement {
    public static final Companion Companion = new Companion();
    public final LayoutAnchor anchor;
    public final int cost;
    public final String key;

    public final class Companion {
        public final FancyPinPlacement above(String str) {
            C7384Etj.A0Y(str, 0);
            return above(str, 0.0d, 0.0d, 0, null);
        }

        public final FancyPinPlacement below(String str) {
            C7384Etj.A0Y(str, 0);
            return below(str, 0.0d, 0.0d, 0, null);
        }

        public final FancyPinPlacement edge(String str, LayoutGridPoint layoutGridPoint, LayoutGridPoint layoutGridPoint2, double d) {
            AnonymousClass005.A10(str, layoutGridPoint, layoutGridPoint2);
            return edge(str, layoutGridPoint, layoutGridPoint2, d, 0.0d, 0, null);
        }

        public final FancyPinPlacement leftOf(String str) {
            C7384Etj.A0Y(str, 0);
            return leftOf(str, 0.0d, 0.0d, 0, null);
        }

        public final FancyPinPlacement pinCenter() {
            return pinCenter(LayoutGridPoint.CENTER, 0.0d, 0.0d, 0, null);
        }

        public final FancyPinPlacement rightOf(String str) {
            C7384Etj.A0Y(str, 0);
            return rightOf(str, 0.0d, 0.0d, 0, null);
        }

        public static /* synthetic */ FancyPinPlacement above$default(Companion companion, String str, double d, double d2, int i, String str2, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                d = 0.0d;
            }
            if ((i2 & 4) != 0) {
                d2 = 0.0d;
            }
            if ((i2 & 8) != 0) {
                i = 0;
            }
            if ((i2 & 16) != 0) {
                str2 = null;
            }
            return companion.above(str, d, d2, i, str2);
        }

        public static /* synthetic */ FancyPinPlacement below$default(Companion companion, String str, double d, double d2, int i, String str2, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                d = 0.0d;
            }
            if ((i2 & 4) != 0) {
                d2 = 0.0d;
            }
            if ((i2 & 8) != 0) {
                i = 0;
            }
            if ((i2 & 16) != 0) {
                str2 = null;
            }
            return companion.below(str, d, d2, i, str2);
        }

        public static /* synthetic */ FancyPinPlacement edge$default(Companion companion, String str, LayoutGridPoint layoutGridPoint, LayoutGridPoint layoutGridPoint2, double d, double d2, int i, String str2, int i2, Object obj) {
            if ((i2 & 8) != 0) {
                d = 0.0d;
            }
            if ((i2 & 16) != 0) {
                d2 = 0.0d;
            }
            if ((i2 & 32) != 0) {
                i = 0;
            }
            if ((i2 & 64) != 0) {
                str2 = null;
            }
            return companion.edge(str, layoutGridPoint, layoutGridPoint2, d, d2, i, str2);
        }

        public static /* synthetic */ FancyPinPlacement leftOf$default(Companion companion, String str, double d, double d2, int i, String str2, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                d = 0.0d;
            }
            if ((i2 & 4) != 0) {
                d2 = 0.0d;
            }
            if ((i2 & 8) != 0) {
                i = 0;
            }
            if ((i2 & 16) != 0) {
                str2 = null;
            }
            return companion.leftOf(str, d, d2, i, str2);
        }

        public static /* synthetic */ FancyPinPlacement pinCenter$default(Companion companion, LayoutGridPoint layoutGridPoint, double d, double d2, int i, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                layoutGridPoint = LayoutGridPoint.CENTER;
            }
            if ((i2 & 2) != 0) {
                d = 0.0d;
            }
            if ((i2 & 4) != 0) {
                d2 = 0.0d;
            }
            if ((i2 & 8) != 0) {
                i = 0;
            }
            if ((i2 & 16) != 0) {
                str = null;
            }
            return companion.pinCenter(layoutGridPoint, d, d2, i, str);
        }

        public static /* synthetic */ FancyPinPlacement rightOf$default(Companion companion, String str, double d, double d2, int i, String str2, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                d = 0.0d;
            }
            if ((i2 & 4) != 0) {
                d2 = 0.0d;
            }
            if ((i2 & 8) != 0) {
                i = 0;
            }
            if ((i2 & 16) != 0) {
                str2 = null;
            }
            return companion.rightOf(str, d, d2, i, str2);
        }

        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public final FancyPinPlacement above(String str, double d, double d2) {
            C7384Etj.A0Y(str, 0);
            return above(str, d, d2, 0, null);
        }

        public final FancyPinPlacement below(String str, double d, double d2) {
            C7384Etj.A0Y(str, 0);
            return below(str, d, d2, 0, null);
        }

        public final FancyPinPlacement edge(String str, LayoutGridPoint layoutGridPoint, LayoutGridPoint layoutGridPoint2) {
            AnonymousClass005.A10(str, layoutGridPoint, layoutGridPoint2);
            return edge(str, layoutGridPoint, layoutGridPoint2, 0.0d, 0.0d, 0, null);
        }

        public final FancyPinPlacement leftOf(String str, double d, double d2) {
            C7384Etj.A0Y(str, 0);
            return leftOf(str, d, d2, 0, null);
        }

        public final FancyPinPlacement pinCenter(LayoutGridPoint layoutGridPoint, double d, double d2) {
            C7384Etj.A0Y(layoutGridPoint, 0);
            return pinCenter(layoutGridPoint, d, d2, 0, null);
        }

        public final FancyPinPlacement rightOf(String str, double d, double d2) {
            C7384Etj.A0Y(str, 0);
            return rightOf(str, d, d2, 0, null);
        }

        public final FancyPinPlacement above(String str, double d, double d2, int i, String str2) {
            C7384Etj.A0Y(str, 0);
            return edge(str, LayoutGridPoint.TOP_CENTER, LayoutGridPoint.BOTTOM_CENTER, d2, -d, i, str2);
        }

        public final FancyPinPlacement below(String str, double d, double d2, int i, String str2) {
            C7384Etj.A0Y(str, 0);
            return edge(str, LayoutGridPoint.BOTTOM_CENTER, LayoutGridPoint.TOP_CENTER, d2, d, i, str2);
        }

        public final FancyPinPlacement edge(String str, LayoutGridPoint layoutGridPoint, LayoutGridPoint layoutGridPoint2, double d, double d2) {
            AnonymousClass005.A10(str, layoutGridPoint, layoutGridPoint2);
            return edge(str, layoutGridPoint, layoutGridPoint2, d, d2, 0, null);
        }

        public final FancyPinPlacement leftOf(String str, double d, double d2, int i, String str2) {
            C7384Etj.A0Y(str, 0);
            return edge(str, LayoutGridPoint.CENTER_LEFT, LayoutGridPoint.CENTER_RIGHT, -d, d2, i, str2);
        }

        public final FancyPinPlacement pinCenter(LayoutGridPoint layoutGridPoint, double d, double d2, int i, String str) {
            C7384Etj.A0Y(layoutGridPoint, 0);
            return new FancyPinPlacement(LayoutAnchor.Companion.pinCenter(layoutGridPoint, d, d2), i, str);
        }

        public final FancyPinPlacement rightOf(String str, double d, double d2, int i, String str2) {
            C7384Etj.A0Y(str, 0);
            return edge(str, LayoutGridPoint.CENTER_RIGHT, LayoutGridPoint.CENTER_LEFT, d, d2, i, str2);
        }

        public final FancyPinPlacement above(String str, double d) {
            C7384Etj.A0Y(str, 0);
            return above(str, d, 0.0d, 0, null);
        }

        public final FancyPinPlacement below(String str, double d) {
            C7384Etj.A0Y(str, 0);
            return below(str, d, 0.0d, 0, null);
        }

        public final FancyPinPlacement edge(String str, LayoutGridPoint layoutGridPoint, LayoutGridPoint layoutGridPoint2, double d, double d2, int i, String str2) {
            AnonymousClass005.A0x(str, layoutGridPoint, layoutGridPoint2);
            return new FancyPinPlacement(LayoutAnchor.Companion.edge(str, layoutGridPoint, layoutGridPoint2, d, d2), i, str2);
        }

        public final FancyPinPlacement leftOf(String str, double d) {
            C7384Etj.A0Y(str, 0);
            return leftOf(str, d, 0.0d, 0, null);
        }

        public final FancyPinPlacement pinCenter(LayoutGridPoint layoutGridPoint, double d) {
            C7384Etj.A0Y(layoutGridPoint, 0);
            return pinCenter(layoutGridPoint, d, 0.0d, 0, null);
        }

        public final FancyPinPlacement rightOf(String str, double d) {
            C7384Etj.A0Y(str, 0);
            return rightOf(str, d, 0.0d, 0, null);
        }

        public final FancyPinPlacement above(String str, double d, double d2, int i) {
            C7384Etj.A0Y(str, 0);
            return above(str, d, d2, i, null);
        }

        public final FancyPinPlacement below(String str, double d, double d2, int i) {
            C7384Etj.A0Y(str, 0);
            return below(str, d, d2, i, null);
        }

        public final FancyPinPlacement edge(String str, LayoutGridPoint layoutGridPoint, LayoutGridPoint layoutGridPoint2, double d, double d2, int i) {
            AnonymousClass005.A0x(str, layoutGridPoint, layoutGridPoint2);
            return edge(str, layoutGridPoint, layoutGridPoint2, d, d2, i, null);
        }

        public final FancyPinPlacement leftOf(String str, double d, double d2, int i) {
            C7384Etj.A0Y(str, 0);
            return leftOf(str, d, d2, i, null);
        }

        public final FancyPinPlacement pinCenter(LayoutGridPoint layoutGridPoint, double d, double d2, int i) {
            C7384Etj.A0Y(layoutGridPoint, 0);
            return pinCenter(layoutGridPoint, d, d2, i, null);
        }

        public final FancyPinPlacement rightOf(String str, double d, double d2, int i) {
            C7384Etj.A0Y(str, 0);
            return rightOf(str, d, d2, i, null);
        }

        public final FancyPinPlacement pinCenter(LayoutGridPoint layoutGridPoint) {
            C7384Etj.A0Y(layoutGridPoint, 0);
            return pinCenter(layoutGridPoint, 0.0d, 0.0d, 0, null);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FancyPinPlacement(LayoutAnchor layoutAnchor, int i) {
        this(layoutAnchor, i, null);
        C7384Etj.A0Y(layoutAnchor, 0);
    }

    public final FancyPinPlacement copy(LayoutAnchor layoutAnchor, int i, String str) {
        C7384Etj.A0Y(layoutAnchor, 0);
        return new FancyPinPlacement(layoutAnchor, i, str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FancyPinPlacement) {
                FancyPinPlacement fancyPinPlacement = (FancyPinPlacement) obj;
                if (!C7384Etj.areEqual(this.anchor, fancyPinPlacement.anchor) || this.cost != fancyPinPlacement.cost || !C7384Etj.areEqual(this.key, fancyPinPlacement.key)) {
                }
            }
            return false;
        }
        return true;
    }

    public static final FancyPinPlacement above(String str) {
        return Companion.above(str);
    }

    public static final FancyPinPlacement below(String str) {
        return Companion.below(str);
    }

    public static /* synthetic */ FancyPinPlacement copy$default(FancyPinPlacement fancyPinPlacement, LayoutAnchor layoutAnchor, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            layoutAnchor = fancyPinPlacement.anchor;
        }
        if ((i2 & 2) != 0) {
            i = fancyPinPlacement.cost;
        }
        if ((i2 & 4) != 0) {
            str = fancyPinPlacement.key;
        }
        return fancyPinPlacement.copy(layoutAnchor, i, str);
    }

    public static final FancyPinPlacement edge(String str, LayoutGridPoint layoutGridPoint, LayoutGridPoint layoutGridPoint2, double d) {
        return Companion.edge(str, layoutGridPoint, layoutGridPoint2, d);
    }

    public static final FancyPinPlacement leftOf(String str) {
        return Companion.leftOf(str);
    }

    public static final FancyPinPlacement pinCenter() {
        return Companion.pinCenter();
    }

    public static final FancyPinPlacement rightOf(String str) {
        return Companion.rightOf(str);
    }

    public final LayoutAnchor component1() {
        return this.anchor;
    }

    public final int component2() {
        return this.cost;
    }

    public final String component3() {
        return this.key;
    }

    public final LayoutAnchor getAnchor() {
        return this.anchor;
    }

    public final int getCost() {
        return this.cost;
    }

    public final String getKey() {
        return this.key;
    }

    public int hashCode() {
        return ((AnonymousClass005.A0E(this.anchor) + this.cost) * 31) + AnonymousClass006.A0G(this.key);
    }

    public String toString() {
        LayoutAnchor layoutAnchor = this.anchor;
        int i = this.cost;
        String str = this.key;
        StringBuilder sbA0f = C3cG.A0f(layoutAnchor, "FancyPinPlacement(anchor=");
        sbA0f.append(", cost=");
        sbA0f.append(i);
        return C3cJ.A0N(", key=", str, sbA0f);
    }

    public FancyPinPlacement(LayoutAnchor layoutAnchor, int i, String str) {
        C7384Etj.A0Y(layoutAnchor, 0);
        this.anchor = layoutAnchor;
        this.cost = i;
        this.key = str;
    }

    public static final FancyPinPlacement above(String str, double d, double d2) {
        return Companion.above(str, d, d2);
    }

    public static final FancyPinPlacement below(String str, double d, double d2) {
        return Companion.below(str, d, d2);
    }

    public static final FancyPinPlacement edge(String str, LayoutGridPoint layoutGridPoint, LayoutGridPoint layoutGridPoint2) {
        return Companion.edge(str, layoutGridPoint, layoutGridPoint2);
    }

    public static final FancyPinPlacement leftOf(String str, double d, double d2) {
        return Companion.leftOf(str, d, d2);
    }

    public static final FancyPinPlacement pinCenter(LayoutGridPoint layoutGridPoint, double d, double d2) {
        return Companion.pinCenter(layoutGridPoint, d, d2);
    }

    public static final FancyPinPlacement rightOf(String str, double d, double d2) {
        return Companion.rightOf(str, d, d2);
    }

    public /* synthetic */ FancyPinPlacement(LayoutAnchor layoutAnchor, int i, String str, int i2, C06H c06h) {
        this(layoutAnchor, i, (i2 & 4) != 0 ? null : str);
    }

    public static final FancyPinPlacement above(String str, double d, double d2, int i, String str2) {
        return Companion.above(str, d, d2, i, str2);
    }

    public static final FancyPinPlacement below(String str, double d, double d2, int i, String str2) {
        return Companion.below(str, d, d2, i, str2);
    }

    public static final FancyPinPlacement edge(String str, LayoutGridPoint layoutGridPoint, LayoutGridPoint layoutGridPoint2, double d, double d2) {
        return Companion.edge(str, layoutGridPoint, layoutGridPoint2, d, d2);
    }

    public static final FancyPinPlacement leftOf(String str, double d, double d2, int i, String str2) {
        return Companion.leftOf(str, d, d2, i, str2);
    }

    public static final FancyPinPlacement pinCenter(LayoutGridPoint layoutGridPoint, double d, double d2, int i, String str) {
        return Companion.pinCenter(layoutGridPoint, d, d2, i, str);
    }

    public static final FancyPinPlacement rightOf(String str, double d, double d2, int i, String str2) {
        return Companion.rightOf(str, d, d2, i, str2);
    }

    public static final FancyPinPlacement above(String str, double d) {
        return Companion.above(str, d);
    }

    public static final FancyPinPlacement below(String str, double d) {
        return Companion.below(str, d);
    }

    public static final FancyPinPlacement edge(String str, LayoutGridPoint layoutGridPoint, LayoutGridPoint layoutGridPoint2, double d, double d2, int i, String str2) {
        return Companion.edge(str, layoutGridPoint, layoutGridPoint2, d, d2, i, str2);
    }

    public static final FancyPinPlacement leftOf(String str, double d) {
        return Companion.leftOf(str, d);
    }

    public static final FancyPinPlacement pinCenter(LayoutGridPoint layoutGridPoint, double d) {
        return Companion.pinCenter(layoutGridPoint, d);
    }

    public static final FancyPinPlacement rightOf(String str, double d) {
        return Companion.rightOf(str, d);
    }

    public static final FancyPinPlacement above(String str, double d, double d2, int i) {
        return Companion.above(str, d, d2, i);
    }

    public static final FancyPinPlacement below(String str, double d, double d2, int i) {
        return Companion.below(str, d, d2, i);
    }

    public static final FancyPinPlacement edge(String str, LayoutGridPoint layoutGridPoint, LayoutGridPoint layoutGridPoint2, double d, double d2, int i) {
        return Companion.edge(str, layoutGridPoint, layoutGridPoint2, d, d2, i);
    }

    public static final FancyPinPlacement leftOf(String str, double d, double d2, int i) {
        return Companion.leftOf(str, d, d2, i);
    }

    public static final FancyPinPlacement pinCenter(LayoutGridPoint layoutGridPoint, double d, double d2, int i) {
        return Companion.pinCenter(layoutGridPoint, d, d2, i);
    }

    public static final FancyPinPlacement rightOf(String str, double d, double d2, int i) {
        return Companion.rightOf(str, d, d2, i);
    }

    public static final FancyPinPlacement pinCenter(LayoutGridPoint layoutGridPoint) {
        return Companion.pinCenter(layoutGridPoint);
    }
}
