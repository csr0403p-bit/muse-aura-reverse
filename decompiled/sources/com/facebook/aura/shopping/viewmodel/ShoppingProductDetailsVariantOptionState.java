package com.facebook.aura.shopping.viewmodel;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;
import com.facebook.aura.shopping.model.PdpVariantSwatch;

/* loaded from: classes4.dex */
public final class ShoppingProductDetailsVariantOptionState extends C06G {
    public static final int $stable = 0;
    public final String id;
    public final String label;
    public final PdpVariantSwatch swatch;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShoppingProductDetailsVariantOptionState) {
                ShoppingProductDetailsVariantOptionState shoppingProductDetailsVariantOptionState = (ShoppingProductDetailsVariantOptionState) obj;
                if (!C7384Etj.areEqual(this.id, shoppingProductDetailsVariantOptionState.id) || !C7384Etj.areEqual(this.label, shoppingProductDetailsVariantOptionState.label) || !C7384Etj.areEqual(this.swatch, shoppingProductDetailsVariantOptionState.swatch)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ShoppingProductDetailsVariantOptionState copy$default(ShoppingProductDetailsVariantOptionState shoppingProductDetailsVariantOptionState, String str, String str2, PdpVariantSwatch pdpVariantSwatch, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shoppingProductDetailsVariantOptionState.id;
        }
        if ((i & 2) != 0) {
            str2 = shoppingProductDetailsVariantOptionState.label;
        }
        if ((i & 4) != 0) {
            pdpVariantSwatch = shoppingProductDetailsVariantOptionState.swatch;
        }
        return shoppingProductDetailsVariantOptionState.copy(str, str2, pdpVariantSwatch);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.label;
    }

    public final PdpVariantSwatch component3() {
        return this.swatch;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLabel() {
        return this.label;
    }

    public final PdpVariantSwatch getSwatch() {
        return this.swatch;
    }

    public int hashCode() {
        return AnonymousClass005.A0I(this.label, AnonymousClass001.A0G(this.id)) + AnonymousClass006.A0D(this.swatch);
    }

    public ShoppingProductDetailsVariantOptionState(String str, String str2, PdpVariantSwatch pdpVariantSwatch) {
        AnonymousClass003.A0u(str, str2);
        this.id = str;
        this.label = str2;
        this.swatch = pdpVariantSwatch;
    }

    public final ShoppingProductDetailsVariantOptionState copy(String str, String str2, PdpVariantSwatch pdpVariantSwatch) {
        AnonymousClass003.A0u(str, str2);
        return new ShoppingProductDetailsVariantOptionState(str, str2, pdpVariantSwatch);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ShoppingProductDetailsVariantOptionState(String str, String str2, PdpVariantSwatch pdpVariantSwatch, int i, C06H c06h) {
        this(str, str2, (i & 4) != 0 ? null : pdpVariantSwatch);
    }
}
