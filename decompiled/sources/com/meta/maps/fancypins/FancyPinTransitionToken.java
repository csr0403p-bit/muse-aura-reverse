package com.meta.maps.fancypins;

import X.AbstractC7610F5x;
import X.AnonymousClass005;
import X.C0KA;
import X.C60O;
import X.C7384Etj;

/* loaded from: classes6.dex */
public final class FancyPinTransitionToken {
    public final FancyPinPartAnimationHint animationHint;
    public final boolean isVisible;
    public final int ordinal;
    public final String partId;
    public final String pinId;
    public final int placementIndex;
    public final int variantIndex;

    public FancyPinTransitionToken(int i, String str, String str2, FancyPinPartAnimationHint fancyPinPartAnimationHint, boolean z, int i2, int i3) {
        AnonymousClass005.A11(str, str2, fancyPinPartAnimationHint, 1);
        this.ordinal = i;
        this.pinId = str;
        this.partId = str2;
        this.animationHint = fancyPinPartAnimationHint;
        this.isVisible = z;
        this.placementIndex = i2;
        this.variantIndex = i3;
    }

    public final FancyPinTransitionToken copy(int i, String str, String str2, FancyPinPartAnimationHint fancyPinPartAnimationHint, boolean z, int i2, int i3) {
        AnonymousClass005.A11(str, str2, fancyPinPartAnimationHint, 1);
        return new FancyPinTransitionToken(i, str, str2, fancyPinPartAnimationHint, z, i2, i3);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FancyPinTransitionToken) {
                FancyPinTransitionToken fancyPinTransitionToken = (FancyPinTransitionToken) obj;
                if (this.ordinal != fancyPinTransitionToken.ordinal || !C7384Etj.areEqual(this.pinId, fancyPinTransitionToken.pinId) || !C7384Etj.areEqual(this.partId, fancyPinTransitionToken.partId) || !C7384Etj.areEqual(this.animationHint, fancyPinTransitionToken.animationHint) || this.isVisible != fancyPinTransitionToken.isVisible || this.placementIndex != fancyPinTransitionToken.placementIndex || this.variantIndex != fancyPinTransitionToken.variantIndex) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ FancyPinTransitionToken copy$default(FancyPinTransitionToken fancyPinTransitionToken, int i, String str, String str2, FancyPinPartAnimationHint fancyPinPartAnimationHint, boolean z, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = fancyPinTransitionToken.ordinal;
        }
        if ((i4 & 2) != 0) {
            str = fancyPinTransitionToken.pinId;
        }
        if ((i4 & 4) != 0) {
            str2 = fancyPinTransitionToken.partId;
        }
        if ((i4 & 8) != 0) {
            fancyPinPartAnimationHint = fancyPinTransitionToken.animationHint;
        }
        if ((i4 & 16) != 0) {
            z = fancyPinTransitionToken.isVisible;
        }
        if ((i4 & 32) != 0) {
            i2 = fancyPinTransitionToken.placementIndex;
        }
        if ((i4 & 64) != 0) {
            i3 = fancyPinTransitionToken.variantIndex;
        }
        return fancyPinTransitionToken.copy(i, str, str2, fancyPinPartAnimationHint, z, i2, i3);
    }

    public final int component1() {
        return this.ordinal;
    }

    public final String component2() {
        return this.pinId;
    }

    public final String component3() {
        return this.partId;
    }

    public final FancyPinPartAnimationHint component4() {
        return this.animationHint;
    }

    public final boolean component5() {
        return this.isVisible;
    }

    public final int component6() {
        return this.placementIndex;
    }

    public final int component7() {
        return this.variantIndex;
    }

    public final FancyPinPartAnimationHint getAnimationHint() {
        return this.animationHint;
    }

    public final int getOrdinal() {
        return this.ordinal;
    }

    public final String getPartId() {
        return this.partId;
    }

    public final String getPinId() {
        return this.pinId;
    }

    public final int getPlacementIndex() {
        return this.placementIndex;
    }

    public final int getVariantIndex() {
        return this.variantIndex;
    }

    public int hashCode() {
        return ((C0KA.A01(AnonymousClass005.A0F(this.animationHint, AnonymousClass005.A0I(this.partId, AnonymousClass005.A0I(this.pinId, this.ordinal * 31))), this.isVisible) + this.placementIndex) * 31) + this.variantIndex;
    }

    public final boolean isVisible() {
        return this.isVisible;
    }

    public String toString() {
        int i = this.ordinal;
        String str = this.pinId;
        String str2 = this.partId;
        FancyPinPartAnimationHint fancyPinPartAnimationHint = this.animationHint;
        boolean z = this.isVisible;
        int i2 = this.placementIndex;
        int i3 = this.variantIndex;
        StringBuilder sbA0y = C60O.A0y("FancyPinTransitionToken(ordinal=", i);
        sbA0y.append(", pinId=");
        sbA0y.append(str);
        sbA0y.append(", partId=");
        sbA0y.append(str2);
        sbA0y.append(", animationHint=");
        sbA0y.append(fancyPinPartAnimationHint);
        sbA0y.append(", isVisible=");
        sbA0y.append(z);
        sbA0y.append(", placementIndex=");
        sbA0y.append(i2);
        return AbstractC7610F5x.A0x(", variantIndex=", sbA0y, i3);
    }
}
