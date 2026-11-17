package com.meta.maps.fancypins;

import X.AnonymousClass005;
import X.C3cJ;
import X.C60O;
import X.C7384Etj;

/* loaded from: classes6.dex */
public final class AccessiblePin {
    public final FancyPinHullView hull;
    public final String label;
    public final String pinId;
    public final int virtualId;

    public AccessiblePin(int i, String str, String str2, FancyPinHullView fancyPinHullView) {
        AnonymousClass005.A11(str, str2, fancyPinHullView, 1);
        this.virtualId = i;
        this.pinId = str;
        this.label = str2;
        this.hull = fancyPinHullView;
    }

    public final AccessiblePin copy(int i, String str, String str2, FancyPinHullView fancyPinHullView) {
        AnonymousClass005.A11(str, str2, fancyPinHullView, 1);
        return new AccessiblePin(i, str, str2, fancyPinHullView);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AccessiblePin) {
                AccessiblePin accessiblePin = (AccessiblePin) obj;
                if (this.virtualId != accessiblePin.virtualId || !C7384Etj.areEqual(this.pinId, accessiblePin.pinId) || !C7384Etj.areEqual(this.label, accessiblePin.label) || !C7384Etj.areEqual(this.hull, accessiblePin.hull)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ AccessiblePin copy$default(AccessiblePin accessiblePin, int i, String str, String str2, FancyPinHullView fancyPinHullView, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = accessiblePin.virtualId;
        }
        if ((i2 & 2) != 0) {
            str = accessiblePin.pinId;
        }
        if ((i2 & 4) != 0) {
            str2 = accessiblePin.label;
        }
        if ((i2 & 8) != 0) {
            fancyPinHullView = accessiblePin.hull;
        }
        return accessiblePin.copy(i, str, str2, fancyPinHullView);
    }

    public final int component1() {
        return this.virtualId;
    }

    public final String component2() {
        return this.pinId;
    }

    public final String component3() {
        return this.label;
    }

    public final FancyPinHullView component4() {
        return this.hull;
    }

    public final FancyPinHullView getHull() {
        return this.hull;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getPinId() {
        return this.pinId;
    }

    public final int getVirtualId() {
        return this.virtualId;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.hull, AnonymousClass005.A0I(this.label, AnonymousClass005.A0I(this.pinId, this.virtualId * 31)));
    }

    public String toString() {
        int i = this.virtualId;
        String str = this.pinId;
        String str2 = this.label;
        FancyPinHullView fancyPinHullView = this.hull;
        StringBuilder sbA0y = C60O.A0y("AccessiblePin(virtualId=", i);
        sbA0y.append(", pinId=");
        sbA0y.append(str);
        sbA0y.append(", label=");
        sbA0y.append(str2);
        return C3cJ.A0L(fancyPinHullView, ", hull=", sbA0y);
    }
}
