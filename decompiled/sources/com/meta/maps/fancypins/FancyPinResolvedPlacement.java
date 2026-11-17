package com.meta.maps.fancypins;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06H;
import X.C3cJ;
import X.C60O;
import X.C7384Etj;

/* loaded from: classes6.dex */
public final class FancyPinResolvedPlacement {
    public final LayoutAnchor anchor;
    public final int index;
    public final String key;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FancyPinResolvedPlacement(int i, LayoutAnchor layoutAnchor) {
        this(i, layoutAnchor, null);
        C7384Etj.A0Y(layoutAnchor, 1);
    }

    public final FancyPinResolvedPlacement copy(int i, LayoutAnchor layoutAnchor, String str) {
        C7384Etj.A0Y(layoutAnchor, 1);
        return new FancyPinResolvedPlacement(i, layoutAnchor, str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FancyPinResolvedPlacement) {
                FancyPinResolvedPlacement fancyPinResolvedPlacement = (FancyPinResolvedPlacement) obj;
                if (this.index != fancyPinResolvedPlacement.index || !C7384Etj.areEqual(this.anchor, fancyPinResolvedPlacement.anchor) || !C7384Etj.areEqual(this.key, fancyPinResolvedPlacement.key)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ FancyPinResolvedPlacement copy$default(FancyPinResolvedPlacement fancyPinResolvedPlacement, int i, LayoutAnchor layoutAnchor, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = fancyPinResolvedPlacement.index;
        }
        if ((i2 & 2) != 0) {
            layoutAnchor = fancyPinResolvedPlacement.anchor;
        }
        if ((i2 & 4) != 0) {
            str = fancyPinResolvedPlacement.key;
        }
        return fancyPinResolvedPlacement.copy(i, layoutAnchor, str);
    }

    public final int component1() {
        return this.index;
    }

    public final LayoutAnchor component2() {
        return this.anchor;
    }

    public final String component3() {
        return this.key;
    }

    public final LayoutAnchor getAnchor() {
        return this.anchor;
    }

    public final int getIndex() {
        return this.index;
    }

    public final String getKey() {
        return this.key;
    }

    public int hashCode() {
        return AnonymousClass005.A0F(this.anchor, this.index * 31) + AnonymousClass006.A0G(this.key);
    }

    public String toString() {
        int i = this.index;
        LayoutAnchor layoutAnchor = this.anchor;
        String str = this.key;
        StringBuilder sbA0y = C60O.A0y("FancyPinResolvedPlacement(index=", i);
        sbA0y.append(", anchor=");
        sbA0y.append(layoutAnchor);
        return C3cJ.A0N(", key=", str, sbA0y);
    }

    public FancyPinResolvedPlacement(int i, LayoutAnchor layoutAnchor, String str) {
        C7384Etj.A0Y(layoutAnchor, 1);
        this.index = i;
        this.anchor = layoutAnchor;
        this.key = str;
    }

    public /* synthetic */ FancyPinResolvedPlacement(int i, LayoutAnchor layoutAnchor, String str, int i2, C06H c06h) {
        this(i, layoutAnchor, (i2 & 4) != 0 ? null : str);
    }
}
