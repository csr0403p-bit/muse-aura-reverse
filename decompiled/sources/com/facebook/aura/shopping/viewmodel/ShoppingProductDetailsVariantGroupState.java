package com.facebook.aura.shopping.viewmodel;

import X.AHD;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BQI;
import X.C06G;
import X.C7384Etj;
import com.facebook.aura.shopping.model.PdpVariantDimensionKind;

/* loaded from: classes4.dex */
public final class ShoppingProductDetailsVariantGroupState extends C06G {
    public static final int $stable = 0;
    public final BQI<String> availableOptionIds;
    public final String dimension;
    public final String displayName;
    public final PdpVariantDimensionKind kind;
    public final AHD<ShoppingProductDetailsVariantOptionState> options;
    public final String selectedOptionId;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShoppingProductDetailsVariantGroupState) {
                ShoppingProductDetailsVariantGroupState shoppingProductDetailsVariantGroupState = (ShoppingProductDetailsVariantGroupState) obj;
                if (!C7384Etj.areEqual(this.dimension, shoppingProductDetailsVariantGroupState.dimension) || !C7384Etj.areEqual(this.displayName, shoppingProductDetailsVariantGroupState.displayName) || this.kind != shoppingProductDetailsVariantGroupState.kind || !C7384Etj.areEqual(this.options, shoppingProductDetailsVariantGroupState.options) || !C7384Etj.areEqual(this.selectedOptionId, shoppingProductDetailsVariantGroupState.selectedOptionId) || !C7384Etj.areEqual(this.availableOptionIds, shoppingProductDetailsVariantGroupState.availableOptionIds)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ShoppingProductDetailsVariantGroupState copy$default(ShoppingProductDetailsVariantGroupState shoppingProductDetailsVariantGroupState, String str, String str2, PdpVariantDimensionKind pdpVariantDimensionKind, AHD ahd, String str3, BQI bqi, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shoppingProductDetailsVariantGroupState.dimension;
        }
        if ((i & 2) != 0) {
            str2 = shoppingProductDetailsVariantGroupState.displayName;
        }
        if ((i & 4) != 0) {
            pdpVariantDimensionKind = shoppingProductDetailsVariantGroupState.kind;
        }
        if ((i & 8) != 0) {
            ahd = shoppingProductDetailsVariantGroupState.options;
        }
        if ((i & 16) != 0) {
            str3 = shoppingProductDetailsVariantGroupState.selectedOptionId;
        }
        if ((i & 32) != 0) {
            bqi = shoppingProductDetailsVariantGroupState.availableOptionIds;
        }
        return shoppingProductDetailsVariantGroupState.copy(str, str2, pdpVariantDimensionKind, ahd, str3, bqi);
    }

    public final String component1() {
        return this.dimension;
    }

    public final String component2() {
        return this.displayName;
    }

    public final PdpVariantDimensionKind component3() {
        return this.kind;
    }

    public final AHD<ShoppingProductDetailsVariantOptionState> component4() {
        return this.options;
    }

    public final String component5() {
        return this.selectedOptionId;
    }

    public final BQI<String> component6() {
        return this.availableOptionIds;
    }

    public final BQI<String> getAvailableOptionIds() {
        return this.availableOptionIds;
    }

    public final String getDimension() {
        return this.dimension;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final PdpVariantDimensionKind getKind() {
        return this.kind;
    }

    public final AHD<ShoppingProductDetailsVariantOptionState> getOptions() {
        return this.options;
    }

    public final String getSelectedOptionId() {
        return this.selectedOptionId;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.availableOptionIds, (AnonymousClass005.A0F(this.options, (AnonymousClass005.A0I(this.displayName, AnonymousClass001.A0G(this.dimension)) + AnonymousClass006.A0D(this.kind)) * 31) + AnonymousClass005.A0H(this.selectedOptionId)) * 31);
    }

    public ShoppingProductDetailsVariantGroupState(String str, String str2, PdpVariantDimensionKind pdpVariantDimensionKind, AHD<ShoppingProductDetailsVariantOptionState> ahd, String str3, BQI<String> bqi) {
        AnonymousClass005.A0y(str, str2, ahd);
        C7384Etj.A0Y(bqi, 5);
        this.dimension = str;
        this.displayName = str2;
        this.kind = pdpVariantDimensionKind;
        this.options = ahd;
        this.selectedOptionId = str3;
        this.availableOptionIds = bqi;
    }

    public final ShoppingProductDetailsVariantGroupState copy(String str, String str2, PdpVariantDimensionKind pdpVariantDimensionKind, AHD<ShoppingProductDetailsVariantOptionState> ahd, String str3, BQI<String> bqi) {
        AnonymousClass005.A0y(str, str2, ahd);
        C7384Etj.A0Y(bqi, 5);
        return new ShoppingProductDetailsVariantGroupState(str, str2, pdpVariantDimensionKind, ahd, str3, bqi);
    }

    public String toString() {
        return super.toString();
    }
}
